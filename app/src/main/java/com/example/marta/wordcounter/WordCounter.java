package com.example.marta.wordcounter;

/**
 * Created by marta on 13/11/2017.
 */

public class WordCounter {
    WordCounter counter;


    public int countWords(String text) {
        String[] parts = text.split(" ");
        int numberOfWords = parts.length;
        return numberOfWords;
    }




}
