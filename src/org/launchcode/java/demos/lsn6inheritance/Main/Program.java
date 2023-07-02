package org.launchcode.java.demos.lsn6inheritance;

public class Program {
    public static void main(String[] args) {


        org.launchcode.java.demos.lsn6inheritance.HouseCat garfield = new org.launchcode.java.demos.lsn6inheritance.HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());


        org.launchcode.java.demos.lsn6inheritance.HouseCat spike = new org.launchcode.java.demos.lsn6inheritance.HouseCat("Spike");
        System.out.println(spike.getWeight());


        org.launchcode.java.demos.lsn7interfaces.Main.Cat plainCat = new org.launchcode.java.demos.lsn7interfaces.Main.Cat(8.6);
        org.launchcode.java.demos.lsn6inheritance.HouseCat cheshireCat = new org.launchcode.java.demos.lsn6inheritance.HouseCat("Cheshire", 12);

        System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());
    }

}