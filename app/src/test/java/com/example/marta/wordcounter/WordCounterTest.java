package com.example.marta.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 13/11/2017.
 */

public class WordCounterTest {
    WordCounter counter;
    String text;

    @Before
    public void before() {
       counter = new WordCounter();
        text = "April is the cruellest month";
    }

    @Test
    public void canCountWords() {
        int actual = counter.countWords(text);
        assertEquals(5, actual );
    }


}
