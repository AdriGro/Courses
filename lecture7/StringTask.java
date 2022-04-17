package com.lecture7;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTask {

    public static void task1 (String string) {
        String firstBlock = string.substring(0, 4);
        String thirdBlock = string.substring(9, 13);
        String firstTask = firstBlock.concat(thirdBlock);
        System.out.println(firstTask);
    }

    public static void task2 (String string) {
        StringBuffer sb = new StringBuffer(string);
        sb.replace(5, 8, "***");
        sb.replace(14,17, "***");
        System.out.println(sb);
    }

    public static void task3 (String string) {
        StringBuffer sb1 = new StringBuffer(string);
        char[] ch = new char[11];
        sb1.getChars(5, 8, ch, 0);
        ch[3] = '/';
        sb1.getChars(14, 17, ch, 4);
        ch[7] = '/';
        ch[8] = sb1.charAt(19);
        ch[9] = '/';
        ch[10] = sb1.charAt(21);
        String charArray = new String(ch);
        System.out.println(charArray.toLowerCase(Locale.ROOT));
    }

    public static void task4 (String string) {
        StringBuilder sb2 = new StringBuilder(string);
        char[] ch2 = new char[11];
        sb2.getChars(5, 8, ch2, 0);
        ch2[3] = '/';
        sb2.getChars(14, 17, ch2, 4);
        ch2[7] = '/';
        ch2[8] = sb2.charAt(19);
        ch2[9] = '/';
        ch2[10] = sb2.charAt(21);
        String charArray2 = new String(ch2);
        System.out.println("Letters: " + charArray2.toUpperCase(Locale.ROOT));
    }

    public static void task5 (String string) {
        String comparisonWord = "abc";
        Pattern pattern = Pattern.compile(comparisonWord, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            System.out.println("Has been found");
        } else {
            System.out.println("Hasn't been found");
        }
    }

    public static void task6 (String string) {
        char[] ch3 = new char[3];
        string.getChars(0, 3, ch3, 0);
        String charsSequency = new String(ch3);
        if (charsSequency.equals("555")) {
            System.out.println("It really does");
        } else {
            System.out.println("A good try, but no");
        }
    }

    public static void task7 (String string) {
        char[] ch4 = new char[4];
        string.getChars(string.length() - 4, string.length(), ch4, 0);
        String charsSeq = new String(ch4);
        if (charsSeq.equals("1a2b")) {
            System.out.println("It really does");
        } else {
            System.out.println("A good try, but no");
        }
    }



}
