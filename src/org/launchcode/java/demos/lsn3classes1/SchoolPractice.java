package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student radhika = new Student("radhika", 1,1,4);
        System.out.println(radhika.getGpa());
        radhika.setGpa(3.5);
        System.out.println(radhika.getGpa());
    }
}
