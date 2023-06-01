package org.example;

public class AverageMethod {
    //  Creates a function that finds the sum of three numbers
    public int sum(int num1, int num2, int num3){
        int total = num1 + num2 + num3;
        return total;
    }
    //  Creates function that calls on the sum function to find average of three numbers
    public double average(int num1, int num2, int num3){
        double average = Double.valueOf(sum(num1, num2, num3)/ 3.0);
        System.out.println("The average is: " + average);
        return average;
    }
}

