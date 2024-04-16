package com.sapir.flags_quiz;

import static androidx.core.content.ContentProviderCompat.requireContext;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {
    CountDownTimer timer;
    RewardedAd rewardedAd;
    private ArrayList<TextView> optionTextViews;
    public static final String KEY_NAMES = "KEY_NAME";
    private ArrayList<Question> questions;
    private int currentQuestionIndex = 0;
    private int successQuestionIndex = 0;
    private int scor =0;

    private TextView timerTextView;
    private TextView questionCounterTextView;
    private ImageView flagImageView;
    private TextView option1TextView;
    private TextView option2TextView;
    private TextView option3TextView;
    private TextView option4TextView;
    private Button fiftytiftyButton;
    private Button quitButton;
    private int quationUse=0;
    private FrameLayout bannerFrame;
    String name ="";

    private FirebaseAnalytics firebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        firebaseAnalytics = FirebaseAnalytics.getInstance(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activityGames), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        initViews();
        Intent previousIntent = getIntent();
         name = previousIntent.getStringExtra(KEY_NAMES);

        questions = Data_Manager.getQuestions();

        // Shuffle the questions for a random order
        Collections.shuffle(questions);

        // Initialize the timer
        resetTimer();

        // Display the first question
        displayQuestion();

        // Set onClickListeners for answer buttons
        option1TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(option1TextView.getText().toString());
            }
        });

        option2TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(option2TextView.getText().toString());
            }
        });

        option3TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(option3TextView.getText().toString());
            }
        });

        option4TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(option4TextView.getText().toString());
            }
        });

        // Set onClickListener for the next button
        fiftytiftyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle params = new Bundle();
                params.putString("button_clicked", "fiftytifty_button_clicked");
                firebaseAnalytics.logEvent("fiftytifty_button_clicked", params);

                showRewardedVideoAdvertisment();
                loadRewardedVideoAdvertisment();

                removeTwoIncorrectAnswers();

            }
        });
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this, "ca-app-pub-3940256099942544/5224354917",
                adRequest, new RewardedAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {

                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd ad) {
                        rewardedAd = ad;
                    }
                });

        loadRewardedVideoAdvertisment();


        // Set onClickListener for the quit button
        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // throw new RuntimeException("Test Crash");

                Bundle params = new Bundle();
                params.putString("game", "click_on_quit");
                firebaseAnalytics.logEvent("click_on_quit", params);

                Intent intent = new Intent(GameActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }



    private void removeTwoIncorrectAnswers() {
        int count =0;
        Question tempQuestion = questions.get(currentQuestionIndex - 1);

        if (tempQuestion.getOption1().equals(tempQuestion.getAnswer())) {
            option1TextView.setText(tempQuestion.getOption1());
            option2TextView.setText("");
            option3TextView.setText("");
            option4TextView.setText(tempQuestion.getOption4());
        }else if(tempQuestion.getOption2().equals(tempQuestion.getAnswer())) {
            option1TextView.setText(tempQuestion.getOption1());
            option2TextView.setText(tempQuestion.getOption2());
            option3TextView.setText("");
            option4TextView.setText("");
        }else if(tempQuestion.getOption3().equals(tempQuestion.getAnswer())) {
            option1TextView.setText(tempQuestion.getOption1());
            option2TextView.setText("");
            option3TextView.setText(tempQuestion.getOption3());
            option4TextView.setText("");
        }else if(tempQuestion.getOption4().equals(tempQuestion.getAnswer())) {
            option1TextView.setText("");
            option2TextView.setText(tempQuestion.getOption2());
            option3TextView.setText("");
            option4TextView.setText(tempQuestion.getOption4());;
        }

        // Disable the 50/50 button after using it
      //  fiftytiftyButton.setEnabled(false);
    }




    private void displayQuestion() {
        quationUse++;
        if (currentQuestionIndex < 15) {
            Question currentQuestion = questions.get(currentQuestionIndex);

            // Update UI elements with the current question
            timerTextView.setText(String.valueOf(currentQuestion.getId()));
            questionCounterTextView.setText(quationUse + "/" + questions.size());
            flagImageView.setImageResource(currentQuestion.getImage());
            option1TextView.setText(currentQuestion.getOption1());
            option2TextView.setText(currentQuestion.getOption2());
            option3TextView.setText(currentQuestion.getOption3());
            option4TextView.setText(currentQuestion.getOption4());



            // Update remaining questions count
            int questionsLeft = questions.size() - currentQuestionIndex;
            questionCounterTextView.setText(String.format("%d/%d", (quationUse), 15));

            // Start/reset the timer
            timer.start();

            currentQuestionIndex++;

        } else {
            // Display a message or handle end of the game
            Intent intent = new Intent(this, ScoreActivity.class);
            intent.putExtra(ScoreActivity.KEY_STATUS, successQuestionIndex);
            intent.putExtra(ScoreActivity.KEY_SCORE, scor);
            intent.putExtra(ScoreActivity.KEY_NAME, name);
            startActivity(intent);
            finish();
        }
    }

    private void checkAnswer(String selectedOption) {
        Question currentQuestion = questions.get(currentQuestionIndex - 1);

        // Disable click events on options to prevent changing the answer after selection
        disableOptionClicks();

        if (selectedOption.toLowerCase().equals(currentQuestion.getAnswer().toLowerCase())) {
            // Correct answer, change background color to green
            highlightAnswer(option1TextView, currentQuestion.getAnswer(),currentQuestion.getScore());
            highlightAnswer(option2TextView, currentQuestion.getAnswer(),currentQuestion.getScore());
            highlightAnswer(option3TextView, currentQuestion.getAnswer(),currentQuestion.getScore());
            highlightAnswer(option4TextView, currentQuestion.getAnswer(),currentQuestion.getScore());

            // Handle other actions for a correct answer (e.g., increase score)
        } else {
            // Incorrect answer, change background color to red
            highlightIncorrectAnswer(selectedOption);
        }

        // Move to the next question after a delay (you can adjust the delay as needed)
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Reset background colors and move to the next question
                resetOptionColors();
                displayQuestion();

                // Re-enable click events on options
                enableOptionClicks();
            }
        }, 1000); // 1000 milliseconds (1 second) delay
    }

    private void disableOptionClicks() {
        option1TextView.setClickable(false);
        option2TextView.setClickable(false);
        option3TextView.setClickable(false);
        option4TextView.setClickable(false);
    }

    private void enableOptionClicks() {
        option1TextView.setClickable(true);
        option2TextView.setClickable(true);
        option3TextView.setClickable(true);
        option4TextView.setClickable(true);
    }

    private void highlightAnswer(TextView textView, String correctAnswer,int gamScor) {
        String selectedAnswer = textView.getText().toString();
        Log.d("ttt", "Selected Answer: " + selectedAnswer + ", Correct Answer: " + correctAnswer);

        if (selectedAnswer.equals(correctAnswer)) {

            textView.setBackgroundResource(R.drawable.option_right);
            successQuestionIndex++;
            scor +=gamScor;

        } else {
            Log.d("ttt", "Setting background to option_wrong");
            textView.setBackgroundResource(R.drawable.option_unselected);
        }
    }


    private void highlightIncorrectAnswer(String selectedOption) {
        if (option1TextView.getText().toString().equals(selectedOption)) {
            option1TextView.setBackgroundResource(R.drawable.option_wrong);
        } else if (option2TextView.getText().toString().equals(selectedOption)) {
            option2TextView.setBackgroundResource(R.drawable.option_wrong);
        } else if (option3TextView.getText().toString().equals(selectedOption)) {
            option3TextView.setBackgroundResource(R.drawable.option_wrong);
        } else if (option4TextView.getText().toString().equals(selectedOption)) {
            option4TextView.setBackgroundResource(R.drawable.option_wrong);
        }
    }

    private void resetOptionColors() {
        option1TextView.setBackgroundResource(R.drawable.option_unselected);
        option2TextView.setBackgroundResource(R.drawable.option_unselected);
        option3TextView.setBackgroundResource(R.drawable.option_unselected);
        option4TextView.setBackgroundResource(R.drawable.option_unselected);
    }

    void resetTimer() {
        timer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timerTextView.setText(String.valueOf(millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                // Handle when the timer finishes (e.g., change question)
                resetOptionColors();
                // Avoid starting the timer again immediately
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        displayQuestion();
                    }
                }, 1000); // 1000 milliseconds (1 second) delay before displaying the next question
            }
        };
    }

    private void initViews() {
        timerTextView = findViewById(R.id.timer);
        questionCounterTextView = findViewById(R.id.questionCounter);
        flagImageView = findViewById(R.id.game_IMG_flag);
        option1TextView = findViewById(R.id.option_1);
        option2TextView = findViewById(R.id.option_2);
        option3TextView = findViewById(R.id.option_3);
        option4TextView = findViewById(R.id.option_4);

        optionTextViews = new ArrayList<>();
        optionTextViews.add(option1TextView);
        optionTextViews.add(option2TextView);
        optionTextViews.add(option3TextView);
        optionTextViews.add(option4TextView);

        fiftytiftyButton = findViewById(R.id.game_5050);
        quitButton = findViewById(R.id.game_quit);
        fiftytiftyButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBlue));
        quitButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBlue));
        
        
    }
    private void showRewardedVideoAdvertisment() {
        if (rewardedAd != null) {
            Activity activityContext = GameActivity.this;
            rewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    // Handle the reward.
                    int rewardAmount = rewardItem.getAmount();
                    String rewardType = rewardItem.getType();
                }
            });
        } else {
        }
    }
    private void loadRewardedVideoAdvertisment() {
        RewardedAd.load(GameActivity.this, "ca-app-pub-3940256099942544/5354046379",
                new AdRequest.Builder().build(), new RewardedAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        super.onAdFailedToLoad(loadAdError);
                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd _rewardedAd) {
                        super.onAdLoaded(rewardedAd);
                        rewardedAd = _rewardedAd;
                    }
                });
    }


}
