package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }

    public static class Cat {

        private boolean tired = false;
        private boolean hungry = false;
        private double weight;

        // The biological family for all cat species
        private String family = "Felidae";


        public Cat (double aWeight) {
            weight = aWeight;
        }

        public Cat () {
            weight = 13;
        }

        /**** Getters and Setters ****/

        public boolean isTired() {
            return tired;
        }

        public void setTired(boolean aTired) {
            tired = aTired;
        }

        public boolean isHungry() {
            return hungry;
        }

        public void setHungry(boolean aHungry) {
            hungry = aHungry;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double aWeight) {
            weight = aWeight;
        }

        public String getFamily() {
            return family;
        }

        /**** Instance Methods ****/

        // A cat is rested and hungry after it sleeps
        public void sleep() {
            tired = false;
            hungry = true;
        }

        // Eating makes a cat not hungry
        public void eat() {

            // eating when not hungry makes a cat sleepy
            if (!hungry) {
                tired = true;
            }

            hungry = false;
        }

        public String noise () {
            return "Meeeeeeooooowww!";
        }
    }
}
