package com.example.wordcounter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for the Counter class (character, special character, word and sentence counting).
 */
public class WordCounterUnitTest {

    // ---------- getCharCount ----------

    @Test
    public void getCharCount_Test1_lettersOnly() {
        assertEquals(5, Counter.getCharCount("labas"));
    }

    @Test
    public void getCharCount_Test2_emptyString() {
        assertEquals(0, Counter.getCharCount(""));
    }

    @Test
    public void getCharCount_Test3_nullString() {
        assertEquals(-1, Counter.getCharCount(null));
    }

    @Test
    public void getCharCount_Test4_specChar() {
        assertEquals(6, Counter.getCharCount("labas?"));
    }

    @Test
    public void getCharCount_Test5_onlySpaces() {
        assertEquals(5, Counter.getCharCount("     "));
    }

    @Test
    public void getCharCount_Test6_onlyTabs() {
        assertEquals(2, Counter.getCharCount("\t\t"));
    }

    @Test
    public void getCharCount_Test7_onlyNewLines() {
        assertEquals(3, Counter.getCharCount("\n\n\n"));
    }

    @Test
    public void getCharCount_Test8_normalText() {
        assertEquals(19, Counter.getCharCount("Labas rytas visiems"));
    }

    // ---------- getSpecCount ----------

    @Test
    public void getSpecCount_Test1_oneSpecChar() {
        assertEquals(1, Counter.getSpecCount("labas?"));
    }

    @Test
    public void getSpecCount_Test2_nullString() {
        assertEquals(-1, Counter.getSpecCount(null));
    }

    @Test
    public void getSpecCount_Test3_emptyString() {
        assertEquals(0, Counter.getSpecCount(""));
    }

    @Test
    public void getSpecCount_Test4_allSpecChars() {
        assertEquals(4, Counter.getSpecCount("?!/*"));
    }

    @Test
    public void getSpecCount_Test5_noSpecChars() {
        assertEquals(0, Counter.getSpecCount("Labas rytas"));
    }

    // ---------- getWordCount ----------

    @Test
    public void getWordCount_Test1_emptyString() {
        assertEquals(0, Counter.getWordCount(""));
    }

    @Test
    public void getWordCount_Test2_normalText() {
        assertEquals(3, Counter.getWordCount("Labas rytas visiems"));
    }

    @Test
    public void getWordCount_Test3_onlySpaces() {
        assertEquals(0, Counter.getWordCount("     "));
    }

    @Test
    public void getWordCount_Test4_onlyTabs() {
        assertEquals(0, Counter.getWordCount("\t\t\t"));
    }

    @Test
    public void getWordCount_Test5_onlyNewLines() {
        assertEquals(0, Counter.getWordCount("\n\n"));
    }

    @Test
    public void getWordCount_Test6_multipleSpacesBetweenWords() {
        assertEquals(2, Counter.getWordCount("labas    rytas"));
    }

    @Test
    public void getWordCount_Test7_leadingAndTrailingSpaces() {
        assertEquals(2, Counter.getWordCount("  labas rytas  "));
    }

    @Test
    public void getWordCount_Test8_nullString() {
        assertEquals(-1, Counter.getWordCount(null));
    }

    // ---------- getSentencesCount ----------

    @Test
    public void getSentencesCount_Test1_twoSentences() {
        assertEquals(2, Counter.getSentencesCount("Labas. Kaip sekasi."));
    }

    @Test
    public void getSentencesCount_Test2_emptyString() {
        assertEquals(0, Counter.getSentencesCount(""));
    }

    @Test
    public void getSentencesCount_Test3_nullString() {
        assertEquals(-1, Counter.getSentencesCount(null));
    }
}