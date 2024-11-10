package String1;
import String1.Testcases._MakeAbba;

// https://codingbat.com/prob/p161056
// Difficulty: 106.0

public final class MakeAbba
{
    /* Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". */

    /*___________________________________________
    |                 Testcases                  |
    |____________________________________________|
    | a (String) | b (String) | returns (String) |
    |____________|____________|__________________|
    |    "Hi"    |   "Bye"    |   "HiByeByeHi"   |
    |    "Yo"    |  "Alice"   | "YoAliceAliceYo" |
    |   "What"   |    "Up"    |  "WhatUpUpWhat"  |
    |   "aaa"    |   "bbb"    |  "aaabbbbbbaaa"  |
    |    "x"     |    "y"     |      "xyyx"      |
    |    "x"     |     ""     |       "xx"       |
    |     ""     |    "y"     |       "yy"       |
    |    "Bo"    |    "Ya"    |    "BoYaYaBo"    |
    |    "Ya"    |    "Ya"    |    "YaYaYaYa"    |
    |____________|____________|_________________*/

    public static final String makeAbba(String a, String b)
    {
        return "";
    }

    public static final void main(String[] args) {
        //_MakeAbba.printSuccesses = false;  // set 'false' to print failing tests only.
        //_MakeAbba.getStacktraces = true;  // set 'true' for stacktraces on exceptions.
        _MakeAbba.Validate();
    }
}
