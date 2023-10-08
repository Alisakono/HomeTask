package de.telran;

public class StringExemple {
    public static void main(String[] args) {
        String str = "Негры ночью грузят уголь";
        String result = replaceBadWord(str);
        System.out.println(result);
        System.out.println(result.length()-str.length());
    }
   static String replaceBadWord (String str){
       return str.replace("негры", "афроамериканцы");

    }
}
