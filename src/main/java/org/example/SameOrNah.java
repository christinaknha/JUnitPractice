package org.example;

public class SameOrNah {
    public boolean sameWord(String word1, String word2){
        if (word1.toLowerCase().equals(word2.toLowerCase())){
            System.out.println("The strings are the same!");
            return true;
        } else {
            System.out.println("The strings were different!");
            return false;
        }
    }
}
