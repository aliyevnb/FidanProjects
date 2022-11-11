package org.example;

public class Task {

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        boolean result = false;

        if (!weekday && !vacation) {
            result = true;
        } else if (weekday && !vacation) {
            result = false;
        } else if (!weekday && vacation) {
            result = true;
        }

        return result;

    }

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public static boolean neadHundred(int n) {
        return (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10);
    }

    /*
        Given a non-empty string and an int n, return a new string where the char at index n has been removed.
        The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

        missingChar("kitten", 1) → "ktten"
        missingChar("kitten", 0) → "itten"
        missingChar("kitten", 4) → "kittn"
    */

    public static String missingChar(String str, int n) {
        /*
        Initializing variables.
        firstHalf will take substring from 0 to n; unless n == 0
        secondHalf will take substring from n+1 till end of the string
         */
        String firstHalf = "";
        String secondHalf = "";
        String result = "";

        if(!str.isEmpty()) {
            if(n != 0) {
                firstHalf = str.substring(0, n);
                secondHalf = str.substring(n+1);
                result = firstHalf + secondHalf;
            } else {
                result = str.substring(n+1);
            }
        } else {
            result = "String is empty skipping";
        }
        return result;
    }

    /*
    Given a string, return a new string where the first and last chars have been exchanged.

    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */

    public static String frontBack(String str) {
        String result = "";
        if(str.isEmpty()) {
            result = "Empty string. Skipping";
        } else if(str.length() > 1) {
            String newSubStr = str.substring(1, str.length()-1);
            result = String.valueOf(str.charAt(str.length()-1)) + newSubStr + String.valueOf(str.charAt(0));
        } else {
            result = str;
        }
        return result;
    }

    /*
    Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
    the front is whatever is there. Return a new string which is 3 copies of the front.

    front3("Java") → "JavJavJav"
    front3("Chocolate") → "ChoChoCho"
    front3("abc") → "abcabcabc"
     */

    public static String front3(String str) {

        String front;

        if(str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        return front + front + front;

    }

    /*
    Given a string, take the last char and return a new string with the last char added at the front and back, so
    "cat" yields "tcatt". The original string will be length 1 or more.

    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"
     */
    public static String backAround(String str) {
        return String.valueOf(str.charAt(str.length() - 1)) + str + String.valueOf(str.charAt(str.length() - 1));
    }

    /*
    Given a string, return true if the string starts with "hi" and false otherwise.

    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false
     */
    public static boolean startHi(String str) {

        if(str.startsWith("hi")) {
            return true;
        } else {
            return false;
        }

    }

    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

    hasTeen(13, 20, 10) → true
    hasTeen(20, 19, 10) → true
    hasTeen(20, 10, 13) → true
     */
    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }
    
    public static boolean mixStart(String str) {
        boolean result = false;
        if(str.length() >= 3) {
            String front = str.substring(0,3);
            if(front.contains("ix")) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    /*
    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.

    close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0
     */
    public static int close10(int a, int b) {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);

        if (diffA < diffB) {
            return a;
        } else if (diffA > diffB) {
            return b;
        } else {
            return 0;
        }
    }

    /*
    Return true if the given string contains between 1 and 3 'e' chars.

    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
     */

    public static boolean stringE(String str){

        int counter = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e'){
                counter++;
            }
        }

        return (counter >= 1 && counter <= 3);
    }

    /*
    Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of
    the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg
    */
    public static String everyNth(String str, int n){

        String result = "";
        for(int i = 0; i < str.length(); i += n){
            result = result + str.charAt(i);
        }

        return result;
    }

    /*
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if
    they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        boolean result = false;
        if(aSmile && bSmile){
            result = true;
        } else if(!aSmile && !bSmile){
            result = true;
        } else if((aSmile || !bSmile) || (!aSmile || bSmile)) {
            result = false;
        }
        return result;
    }

    /*
    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble
    if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false
     */
    public static boolean parrotTrouble(boolean talking, int hour) {
        if(talking && (hour < 7 || hour > 20)){
            return true;
        } else {
            return false;
        }
    }

    /*
    Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true,
    then return true only if both are negative.

    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true
     */
    public static boolean posNeg(int a, int b, boolean negative){
        boolean result = false;

        if(a > 0 && b < 0 && !negative){
            result = true;
        } else if(a < 0 && b > 0 && !negative) {
            result = true;
        } else if (a < 0 && b < 0 && negative) {
            result = true;
        } else if (a < 0 && b < 0 && !negative) {
            result = false;
        } else if(a > 0 && b > 0 && negative) {
            result = false;
        } else if(a > 0 && b > 0 && !negative) {
            result = false;
        }

        return result;
    }

    /*
    Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod

    or35(3) → true
    or35(10) → true
    or35(8) → false
     */

    public static boolean or35(int n){
        return (n % 3 == 0 || n % 5 == 0);
    }

    /*
    icy hot
     */
    public static boolean icyHot (int a, int b){
        return (a >= 120 && b < 0) || (a < 0 && b >= 120);
    }

    /*
    lone teen
     */
    public static boolean loneTeen(int a, int b){
        boolean teenA = (a >= 13 && a <= 19);
        boolean teenB = (b >= 13 && b <= 19);

        return (teenA && !teenB) || (!teenA && teenB);
    }

}
