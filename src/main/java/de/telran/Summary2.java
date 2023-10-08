package de.telran;

import java.util.Locale;

public class Summary2 {
    public static void main(String[] args) {
        System.out.println(getAbb("Deutsche", "Denokratische", "Republik"));
        System.out.println(getAbb("Deutsche", "Denokratische", "Republik", "Freiheit"));

    }

    static String getAbb(String word1, String word2, String word3) {
        return ("" + word1.charAt(0) +
                word2.charAt(0) +
                word3.charAt(0)).toUpperCase(Locale.ROOT);


    }

    static String getAbb(String word1, String word2, String word3, String word4) {
        return (getAbb(word1, word2, word3) + word4.charAt(0)).toUpperCase(Locale.ROOT);

    }
}
