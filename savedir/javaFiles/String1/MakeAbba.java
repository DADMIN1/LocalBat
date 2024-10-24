package String1;
import String1.Testcases._MakeAbba;

// https://codingbat.com/prob/p161056
// Difficulty: 106.0

public class MakeAbba
{
    /* Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". */

    /*___________________________________________
    |                 Testcases                  |
    |____________________________________________|
    | makeAbba("Hi", "Bye")   → "HiByeByeHi"     |
    | makeAbba("Yo", "Alice") → "YoAliceAliceYo" |
    | makeAbba("What", "Up")  → "WhatUpUpWhat"   |
    | makeAbba("aaa", "bbb")  → "aaabbbbbbaaa"   |
    | makeAbba("x", "y")      → "xyyx"           |
    | makeAbba("x", "")       → "xx"             |
    | makeAbba("", "y")       → "yy"             |
    | makeAbba("Bo", "Ya")    → "BoYaYaBo"       |
    | makeAbba("Ya", "Ya")    → "YaYaYaYa"       |
    |___________________________________________*/

    public static String makeAbba(String a, String b)
    {
        return "";
    }

    public static void main(String[] args) {
        _MakeAbba.Validate(true);  // pass 'false' to print failed tests only.
    }
}
