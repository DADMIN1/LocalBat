package Warmup1.Testcases;
import Warmup1.Close10;

public final class _Close10
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = Close10.close10(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mclose10\u001B[0;90m(\u001b[0;1m8, 13\u001B[0m\u001b[90m)",
        "\u001b[3;90mclose10\u001B[0;90m(\u001b[0;1m13, 8\u001B[0m\u001b[90m)",
        "\u001b[3;90mclose10\u001B[0;90m(\u001b[0;1m13, 7\u001B[0m\u001b[90m)",
        "\u001b[3;90mclose10\u001B[0;90m(\u001b[0;1m7, 13\u001B[0m\u001b[90m)",
        "\u001b[3;90mclose10\u001B[0;90m(\u001b[0;1m9, 13\u001B[0m\u001b[90m)",
        "\u001b[3;90mclose10\u001B[0;90m(\u001b[0;1m13, 8\u001B[0m\u001b[90m)",
        "\u001b[3;90mclose10\u001B[0;90m(\u001b[0;1m10, 12\u001B[0m\u001b[90m)",
        "\u001b[3;90mclose10\u001B[0;90m(\u001b[0;1m11, 10\u001B[0m\u001b[90m)",
        "\u001b[3;90mclose10\u001B[0;90m(\u001b[0;1m5, 21\u001B[0m\u001b[90m)",
        "\u001b[3;90mclose10\u001B[0;90m(\u001b[0;1m0, 20\u001B[0m\u001b[90m)",
        "\u001b[3;90mclose10\u001B[0;90m(\u001b[0;1m10, 10\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        8,
        8,
        0,
        0,
        9,
        8,
        10,
        10,
        5,
        0,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(8, 13),
            new TestResult(13, 8),
            new TestResult(13, 7),
            new TestResult(7, 13),
            new TestResult(9, 13),
            new TestResult(13, 8),
            new TestResult(10, 12),
            new TestResult(11, 10),
            new TestResult(5, 21),
            new TestResult(0, 20),
            new TestResult(10, 10),
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
            if (results[i].result != expectedResults[i]) {
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
