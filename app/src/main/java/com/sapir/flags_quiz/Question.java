package com.sapir.flags_quiz;

import java.util.ArrayList;

public class Question {
    private int id;
    private String question;
    private int image;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;
    private int score;

    // Private constructor to force the use of the builder
    private Question() {}

    public int getId() {
        return id;
    }

    // Other getter and setter methods...

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Builder pattern implementation
    public static class Builder {
        private Question questionInstance;

        public Builder() {
            questionInstance = new Question();
        }

        public Builder setId(int id) {
            questionInstance.id = id;
            return this;
        }

        public Builder setQuestion(String question) {
            questionInstance.question = question;
            return this;
        }

        public Builder setImageRes(int image) {
            questionInstance.image = image;
            return this;
        }

        public Builder setOption1(String option1) {
            questionInstance.option1 = option1;
            return this;
        }

        public Builder setOption2(String option2) {
            questionInstance.option2 = option2;
            return this;
        }

        public Builder setOption3(String option3) {
            questionInstance.option3 = option3;
            return this;
        }

        public Builder setOption4(String option4) {
            questionInstance.option4 = option4;
            return this;
        }

        public Builder setAnswer(String answer) {
            questionInstance.answer = answer;
            return this;
        }

        public Builder setScore(int score) {
            questionInstance.score = score;
            return this;
        }

        public Question build() {
            return questionInstance;
        }
    }

}
