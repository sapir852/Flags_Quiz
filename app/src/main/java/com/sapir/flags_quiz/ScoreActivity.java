package com.sapir.flags_quiz;

import static androidx.core.content.ContentProviderCompat.requireContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.analytics.FirebaseAnalytics;

public class ScoreActivity extends AppCompatActivity {

    public static final String KEY_STATUS = "KEY_STATUS";
    public static final String KEY_SCORE = "KEY_SCORE";
    public static final String KEY_NAME = "KEY_NAME";
    private TextView score;
    private TextView earnedCoins;
    private AppCompatButton restartBtn;
    private AppCompatButton scor_share;
    private TextView NamePlyer_textView;
    private FirebaseAnalytics firebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        findViews();
        initViews();

        Intent previousIntent = getIntent();
        int numOfS = previousIntent.getIntExtra(KEY_STATUS, 0);
        int scoreT = previousIntent.getIntExtra(KEY_SCORE, 0);
        String  name = previousIntent.getStringExtra(KEY_NAME);

// Assuming you have defined the TextViews for score and earnedCoins
        score.setText(String.format("%d/%d", numOfS, 15));
        earnedCoins.setText(String.valueOf(scoreT));
        NamePlyer_textView.setText(String.format("Congratulations " + name ));
    }

    private void findViews() {
        score = findViewById(R.id.score);
        earnedCoins = findViewById(R.id.earnedCoins);
        restartBtn = findViewById(R.id.restartBtn);
        scor_share = findViewById(R.id.scor_share);
        NamePlyer_textView = findViewById(R.id.NamePlyer_textView);


    }

    private void initViews() {
        restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle params = new Bundle();
                params.putString("button_clicked", "restart_button_clicked");
                firebaseAnalytics.logEvent("restart_button_clicked", params);

                Intent intent = new Intent(ScoreActivity.this, GameActivity.class);
                startActivity(intent);
                finish();
            }
        });

        scor_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle params = new Bundle();
                params.putString("button_clicked", "share_button_clicked");
                firebaseAnalytics.logEvent("share_button_clicked", params);

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Share App");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Share the app with your friends so they can enjoy it too!");
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
            }

}