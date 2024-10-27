package String1.Testcases;
import String1.MakeAbba;

public final class _MakeAbba
{
    static final String[] testcaseStrings = {
        "makeAbba(\"Hi\", \"Bye\")",
        "makeAbba(\"Yo\", \"Alice\")",
        "makeAbba(\"What\", \"Up\")",
        "makeAbba(\"aaa\", \"bbb\")",
        "makeAbba(\"x\", \"y\")",
        "makeAbba(\"x\", \"\")",
        "makeAbba(\"\", \"y\")",
        "makeAbba(\"Bo\", \"Ya\")",
        "makeAbba(\"Ya\", \"Ya\")",
    };

    static final String[] expectedResults = {
        "HiByeByeHi",
        "YoAliceAliceYo",
        "WhatUpUpWhat",
        "aaabbbbbbaaa",
        "xyyx",
        "xx",
        "yy",
        "BoYaYaBo",
        "YaYaYaYa",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            MakeAbba.makeAbba("Hi", "Bye"),
            MakeAbba.makeAbba("Yo", "Alice"),
            MakeAbba.makeAbba("What", "Up"),
            MakeAbba.makeAbba("aaa", "bbb"),
            MakeAbba.makeAbba("x", "y"),
            MakeAbba.makeAbba("x", ""),
            MakeAbba.makeAbba("", "y"),
            MakeAbba.makeAbba("Bo", "Ya"),
            MakeAbba.makeAbba("Ya", "Ya"),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+expectedResults[i]);
                System.out.println("\n");
            } else if (printSuccess) { 
                System.out.println("[✔] #"+(i+1)+" - "+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n ✔✔✔  ~ All tests passed. ~  ✔✔✔");
        System.out.println();
        return;
    }
}
