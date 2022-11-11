package org.example;

import java.lang.annotation.Target;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sleep in ---");
        System.out.println("");
        System.out.println(Task.sleepIn(true, true));
        System.out.println(Task.sleepIn(false, true));
        System.out.println(Task.sleepIn(true, false));
        System.out.println(Task.sleepIn(false, false));
        System.out.println("--- *** ---");
        System.out.println("--- Diff 21 ---");
        /*
        Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
         */
        System.out.println(Task.diff21(19));
        System.out.println(Task.diff21(10));
        System.out.println(Task.diff21(21));

        /*
        Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
         */
        System.out.println("--------");
        System.out.println(Task.neadHundred(93));
        System.out.println(Task.neadHundred(90));
        System.out.println(Task.neadHundred(89));
        System.out.println("");

        /*
        Given a non-empty string and an int n, return a new string where the char at index n has been removed.
        The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

        missingChar("kitten", 1) → "ktten"
        missingChar("kitten", 0) → "itten"
        missingChar("kitten", 4) → "kittn"
         */
        System.out.println("--- missing char ---");
        System.out.println(Task.missingChar("kitten", 1));
        System.out.println(Task.missingChar("kitten", 0));
        System.out.println(Task.missingChar("kitten", 4));
        System.out.println(Task.missingChar("", 4));

        /*
        Given a string, return a new string where the first and last chars have been exchanged.

        frontBack("code") → "eodc"
        frontBack("a") → "a"
        frontBack("ab") → "ba"
         */
        System.out.println("--- front back ---");
        System.out.println(Task.frontBack("code"));
        System.out.println(Task.frontBack("a"));
        System.out.println(Task.frontBack("ab"));
        System.out.println();

        /*
        Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
        the front is whatever is there. Return a new string which is 3 copies of the front.

        front3("Java") → "JavJavJav"
        front3("Chocolate") → "ChoChoCho"
        front3("abc") → "abcabcabc"
         */
        System.out.println("--- front 3 ---");
        System.out.println(Task.front3("Java"));
        System.out.println(Task.front3("Chocolate"));
        System.out.println(Task.front3("abc"));
        System.out.println(Task.front3("bc"));
        System.out.println();

        /*
        Given a string, take the last char and return a new string with the last char added at the front and back, so
        "cat" yields "tcatt". The original string will be length 1 or more.

        backAround("cat") → "tcatt"
        backAround("Hello") → "oHelloo"
        backAround("a") → "aaa"
        */
        System.out.println("--- backAround ---");
        System.out.println(Task.backAround("cat"));
        System.out.println(Task.backAround("Hello"));
        System.out.println(Task.backAround("a"));
        System.out.println();

         /*
        Given a string, return true if the string starts with "hi" and false otherwise.

        startHi("hi there") → true
        startHi("hi") → true
        startHi("hello hi") → false
         */
        System.out.println("--- start hi ---");
        System.out.println(Task.startHi("hi there"));
        System.out.println(Task.startHi("hi"));
        System.out.println(Task.startHi("hello hi"));
        System.out.println();

        /*
        We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

        hasTeen(13, 20, 10) → true
        hasTeen(20, 19, 10) → true
        hasTeen(20, 10, 13) → true
        */
        System.out.println("--- has teen ---");
        System.out.println(Task.hasTeen(13, 20, 10));
        System.out.println(Task.hasTeen(20, 19, 10));
        System.out.println(Task.hasTeen(20, 10, 13));
        System.out.println(Task.hasTeen(4, 2, 20));
        System.out.println();

        /*
        Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

        mixStart("mix snacks") → true
        mixStart("pix snacks") → true
        mixStart("piz snacks") → false
         */
        System.out.println("--- mix start ---");
        System.out.println(Task.mixStart("mix snacks"));
        System.out.println(Task.mixStart("pix snacks"));
        System.out.println(Task.mixStart("piz snacks"));
        System.out.println();

        /*
        Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
        Note that Math.abs(n) returns the absolute value of a number.

        close10(8, 13) → 8
        close10(13, 8) → 8
        close10(13, 7) → 0
         */
        System.out.println("--- close 10 ---");
        System.out.println(Task.close10(8, 13));
        System.out.println(Task.close10(13, 8));
        System.out.println(Task.close10(7, 13));
        System.out.println();

        /*
        Return true if the given string contains between 1 and 3 'e' chars.

        stringE("Hello") → true
        stringE("Heelle") → true
        stringE("Heelele") → false
         */
        System.out.println("--- string E ---");
        System.out.println(Task.stringE("Hello"));
        System.out.println(Task.stringE("Heelle"));
        System.out.println(Task.stringE("Heelele"));
        System.out.println(Task.stringE("e"));
        System.out.println(Task.stringE("Hii"));
        System.out.println(Task.stringE(""));
        System.out.println();

        /*
        Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of
        the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

        everyNth("Miracle", 2) → "Mrce"
        everyNth("abcdefg", 2) → "aceg"
        everyNth("abcdefg", 3) → "adg
         */
        System.out.println("--- everyNth---");
        System.out.println(Task.everyNth("Miracle", 2));
        System.out.println(Task.everyNth("abcdefg", 2));
        System.out.println(Task.everyNth("abcdefg", 3));
        System.out.println();

        /*
        We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if
        they are both smiling or if neither of them is smiling. Return true if we are in trouble.

        monkeyTrouble(true, true) → true
        monkeyTrouble(false, false) → true
        monkeyTrouble(true, false) → false
        */
        System.out.println("--- monkey trouble---");
        System.out.println(Task.monkeyTrouble(true, true));
        System.out.println(Task.monkeyTrouble(false, false));
        System.out.println(Task.monkeyTrouble(true, false));
        System.out.println();

        /*
        We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble
        if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

        parrotTrouble(true, 6) → true
        parrotTrouble(true, 7) → false
        parrotTrouble(false, 6) → false
        */
        System.out.println("--- parrot trouble---");
        System.out.println(Task.parrotTrouble(true, 6));
        System.out.println(Task.parrotTrouble(true, 7));
        System.out.println(Task.parrotTrouble(false, 6));
        System.out.println();

        /*
        Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is
        true, then return true only if both are negative.

        posNeg(1, -1, false) → true
        posNeg(-1, 1, false) → true
        posNeg(-4, -5, true) → true
         */
        System.out.println("--- pass neg---");
        System.out.println(Task.posNeg(1, -1, false));
        System.out.println(Task.posNeg(-1, 1, false));
        System.out.println(Task.posNeg(-4, -5, true));
        System.out.println(Task.posNeg(-4, -5, false));
        System.out.println();

        /*
        Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod

        or35(3) → true
        or35(10) → true
        or35(8) → false
        */
        System.out.println("--- or 35---");
        System.out.println(Task.or35(3));
        System.out.println(Task.or35(10));
        System.out.println(Task.or35(8));
        System.out.println();

        /*
        Given two temperatures, return true if one is less than 0 and the other is greater than 100.

        icyHot(120, -1) → true
        icyHot(-1, 120) → true
        icyHot(2, 120) → false
         */
        System.out.println("--- icy hot---");
        System.out.println(Task.icyHot(120, -1));
        System.out.println(Task.icyHot(-1, 120));
        System.out.println(Task.icyHot(2, 120));
        System.out.println();

        /*
        We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

        loneTeen(13, 99) → true
        loneTeen(21, 19) → true
        loneTeen(13, 13) → false
         */
        System.out.println("--- lone teen---");
        System.out.println(Task.loneTeen(13, 99));
        System.out.println(Task.loneTeen(21, 19));
        System.out.println(Task.loneTeen(13, 13));
        System.out.println();









    }
}