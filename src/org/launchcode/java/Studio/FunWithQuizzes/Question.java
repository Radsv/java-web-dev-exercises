package org.launchcode.java.Studio.FunWithQuizzes;

public abstract class Question {
    private int pointValue;
    private String text;

    public Question(int pointValue, String text){
        this.pointValue = pointValue;
        this.text = text;
    }

    public void displayQuestion(){
        System.out.println(text);
    }
    public abstract void displayAnswers();
    public abstract int getAnswers();
    public int getPointValue() {
        return this.pointValue;
    }

    public void setPointValue(int x) {
        this.pointValue = x;
    }
}
