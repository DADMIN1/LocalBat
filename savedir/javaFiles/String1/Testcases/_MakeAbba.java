package String1.Testcases;
import String1.MakeAbba;

public class _MakeAbba
{
    static String[] testcaseStrings = {
        "makeAbba(\"Hi\", \"Bye\")",
        "makeAbba(\"Yo\", \"Alice\")",
        "makeAbba(\"What\", \"Up\")",
    };

    static String[] expectedResults = { "HiByeByeHi", "YoAliceAliceYo", "WhatUpUpWhat", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            MakeAbba.makeAbba("Hi", "Bye"),
            MakeAbba.makeAbba("Yo", "Alice"),
            MakeAbba.makeAbba("What", "Up"),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
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
