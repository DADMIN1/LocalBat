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
        "\u001b[3;90mmakeAbba\u001B[0;90m(\u001b[0;1m\"Hi\", \"Bye\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeAbba\u001B[0;90m(\u001b[0;1m\"Yo\", \"Alice\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeAbba\u001B[0;90m(\u001b[0;1m\"What\", \"Up\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeAbba\u001B[0;90m(\u001b[0;1m\"aaa\", \"bbb\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeAbba\u001B[0;90m(\u001b[0;1m\"x\", \"y\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeAbba\u001B[0;90m(\u001b[0;1m\"x\", \"\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeAbba\u001B[0;90m(\u001b[0;1m\"\", \"y\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeAbba\u001B[0;90m(\u001b[0;1m\"Bo\", \"Ya\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeAbba\u001B[0;90m(\u001b[0;1m\"Ya\", \"Ya\"\u001B[0m\u001b[90m)",
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

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[!]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[3;91;1mFailed!\u001B[0;91;1m \u001b[40;7m[EXCEPTION]\u001B[0m");
                System.out.println("\u001b[91;40;1m    "+results[i].caught.getClass().getName());
                System.out.println("\u001b[0;93;40m    "+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("\u001b[90;3m    ");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("\u001b[0m\u001B[0m"); continue;
            }
            if (!results[i].result.equals(expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[92;1m[✓] \u001B[0m\u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n \u001b[92;1m✓✓✓\u001B[0;1m\u001b[96;40m  ~  All tests passed  ~  \u001B[0m\u001b[92;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[92;1;40m "+successCount+"\u001B[0;1;40m / \u001b[94m"+results.length+"\u001b[90m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
