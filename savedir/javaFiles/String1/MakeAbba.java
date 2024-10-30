package String1;
import String1.Testcases._MakeAbba;

// https://codingbat.com/prob/p161056
// Difficulty: 106.0

public final class MakeAbba
{
    /* Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". */

    /*_______________________________________
    |               Testcases                |
    |________________________________________|
    | a        | b        | expected         |
    | (String) | (String) | (String)         |
    |__________|__________|__________________|
    | "Hi"     | "Bye"    | "HiByeByeHi"     |
    | "Yo"     | "Alice"  | "YoAliceAliceYo" |
    | "What"   | "Up"     | "WhatUpUpWhat"   |
    | "aaa"    | "bbb"    | "aaabbbbbbaaa"   |
    | "x"      | "y"      | "xyyx"           |
    | "x"      | ""       | "xx"             |
    | ""       | "y"      | "yy"             |
    | "Bo"     | "Ya"     | "BoYaYaBo"       |
    | "Ya"     | "Ya"     | "YaYaYaYa"       |
    |__________|__________|_________________*/

    public static final String makeAbba(String a, String b)
    {
        return "";
    }

    public static final void main(String[] args) {
        _MakeAbba.Validate(true);  // pass 'false' to print failed tests only.
    }
}
