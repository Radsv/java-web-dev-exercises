package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {

    private String courseName;
    private ArrayList<Student> studentList;

    private ArrayList<String> questionBank;

    public Course(String courseName){
        this.courseName = courseName;
        this.studentList = new ArrayList<Student>();
        this.questionBank = new ArrayList<String>();
    }


    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) toBeCompared;
        return theCourse.getCourseName() == getCourseName();
    }



    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<String> getQuestionBank() {
        return questionBank;
    }

    public void addStudent(Student student){
        this.studentList.add(student);
    }

    public void addQuestion(String question){
        this.questionBank.add(question);
    }
}
