package org.example;

public class TestScores {

    public String letterGrade(int grade){
        if (grade >= 0 && grade <60){
            System.out.println("Your grade is an F");
            return "F";
        } else if (grade >= 60 && grade < 70){
            System.out.println("Your grade is a D");
            return "D";
        } else if (grade >= 70 && grade <80){
            System.out.println("Your grade is a C");
            return "C";
        } else if (grade >=80 && grade < 90){
            System.out.println("Your grade is a B");
            return "B";
        } else {
            System.out.println("Your grade is an A");
            return "A";
        }
    }
}
