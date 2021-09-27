package com.db.anagramsdatabase;

public class Anagram {
    String word;
    String sortedWord;

    public Anagram(String word, String sortedWord) {
        this.word = word;
        this.sortedWord = sortedWord;
    }

    @Override
    public String toString() {
        return word;
    }
}

