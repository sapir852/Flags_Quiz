package com.sapir.flags_quiz;

import java.util.ArrayList;

public class GameManager {

    private int score = 0;
    private int index = 0;
    private int wrong = 0;
    private int life;
    private long start;
    private  long end ;



    private ArrayList<Question> questions ;

    public GameManager(int life) {
        runTimer();
        this.life = life;
        questions = Data_Manager.getQuestions();


    }
    public void runTimer(){
        start = System.currentTimeMillis();

    }

    public long getTimePassed(){

        long difference = System.currentTimeMillis() - start;
        return difference/1000;

    }

    public int getScore() {
        return score;
    }

    public int getWrong() {
        return wrong;
    }

    private Question  current () {
        return questions.get(index);
    }

    public void checkAnswer(String answer) {
        if(current().getAnswer().equals(answer)){
            score += current().getScore();
        }else {
            wrong++;
        }
        //next question
        index++;

    }

    public boolean isEndGame() {
        return index == questions.size();
    }

    public boolean isLose() {
        return wrong == life;
    }

    public int getCurrentFlag() {
        return current().getImage();
    }

    public String getCurrentName() {
        return current().getAnswer();
    }
}
