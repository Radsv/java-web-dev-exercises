package org.launchcode.java.Studio.FunWithQuizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question{

    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;
    public Checkbox(int pointValue, String text, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
        super(pointValue, text);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
        setPointValue(this.correctAnswers.size());
    }

    @Override
    public void displayAnswers() {
        for ( int i = 0; i < possibleAnswers.size(); i++){
            System.out.println(possibleAnswers.get(i));
        }

    }

    public int checkAnswers(ArrayList<Integer> check){
        int answersCorrect = 0;
        for(int i = 0; i < check.size(); i++){
            if (correctAnswers.contains(check.get(i))){
                answersCorrect++;
            }

        }
        return answersCorrect;
    }
    @Override
    public int getAnswers() {
        ArrayList<Integer> userAnswers = new ArrayList<>();
        System.out.println("For this question there are multiple answers. Choose at least one");
        Scanner userContinue = new Scanner(System.in);
        String goingToContinue = userContinue.nextLine();
        while(goingToContinue.indexOf('Y') >= 0 && userAnswers.size() <= possibleAnswers.size()){
            System.out.println("What is your answer? Enter number");
            Scanner userAnswer = new Scanner(System.in);
            String answer = userContinue.nextLine();
            int option = Integer.parseInt(answer);
            userAnswers.add(option);

            System.out.println("For this question there are multiple answers. Choose at least one");
            goingToContinue = userContinue.nextLine();

        }


        return checkAnswers(userAnswers);
    }
}
