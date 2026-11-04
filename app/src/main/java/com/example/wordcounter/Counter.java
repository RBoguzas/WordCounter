package com.example.wordcounter;

public class Counter {

    /**
     * Grąžina visų simbolių skaičių (įskaitant tarpus, tabus, naujas eilutes).
     * Jei input == null, grąžina -1.
     */
    public static int getCharCount(String input) {
        if (input == null) {
            return -1;
        }
        return input.length();
    }

    /**
     * Grąžina specialiųjų simbolių (? ! / *) skaičių.
     * Jei input == null, grąžina -1.
     */
    public static int getSpecCount(String input) {
        if (input == null) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '?' || currentChar == '!' || currentChar == '/' || currentChar == '*') {
                count++;
            }
        }
        return count;
    }

    /**
     * Grąžina žodžių skaičių.
     * Jei input == null, grąžina -1.
     * Tuščias tekstas arba tik tarpai/tabai/naujos eilutės grąžina 0.
     */
    public static int getWordCount(String input) {
        if (input == null) {
            return -1;
        }
        String trimmed = input.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }

    /**
     * Grąžina sakinių skaičių (skaičiuojami taškai).
     * Jei input == null, grąžina -1.
     */
    public static int getSentencesCount(String input) {
        if (input == null) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                count++;
            }
        }
        return count;
    }
}