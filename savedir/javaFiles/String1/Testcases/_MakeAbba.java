package String1.Testcases;
import String1.MakeAbba;

public final class _MakeAbba
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String a, String b) {
            try { result = MakeAbba.makeAbba(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

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

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hi", "Bye"),
            new TestResult("Yo", "Alice"),
            new TestResult("What", "Up"),
            new TestResult("aaa", "bbb"),
            new TestResult("x", "y"),
            new TestResult("x", ""),
            new TestResult("", "y"),
            new TestResult("Bo", "Ya"),
            new TestResult("Ya", "Ya"),
        };

        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[!] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed! [EXCEPTION]");
                System.out.println(results[i].caught.getClass().getName());
                System.out.println(results[i].caught.getMessage());
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println(); continue;
            }
            if (!results[i].result.equals(expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[x] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed!");
                System.out.println("    received: "+results[i].result);
                System.out.println("    expected: "+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                prevTestPassed = true;
                System.out.println("[✓] #"+(i+1)+" - "+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n ✓✓✓  ~ All tests passed. ~  ✓✓✓");
        System.out.println();
        return allTestsPassed;
    }
}
