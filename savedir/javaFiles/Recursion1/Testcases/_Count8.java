package Recursion1.Testcases;
import Recursion1.Count8;

public final class _Count8
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = Count8.count8(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m8\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m818\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m8818\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m8088\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m123\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m81238\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m88788\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m8234\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m2348\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m23884\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m0\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m1818188\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m8818181\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m1080\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m188\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m88888\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m9898\u001B[0m\u001b[90m)",
        "\u001b[3;90mcount8\u001B[0;90m(\u001b[0;1m78\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        1,
        2,
        4,
        4,
        0,
        2,
        6,
        1,
        1,
        3,
        0,
        5,
        5,
        1,
        3,
        9,
        2,
        1,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(8),
            new TestResult(818),
            new TestResult(8818),
            new TestResult(8088),
            new TestResult(123),
            new TestResult(81238),
            new TestResult(88788),
            new TestResult(8234),
            new TestResult(2348),
            new TestResult(23884),
            new TestResult(0),
            new TestResult(1818188),
            new TestResult(8818181),
            new TestResult(1080),
            new TestResult(188),
            new TestResult(88888),
            new TestResult(9898),
            new TestResult(78),
        };

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(suppressOutput) continue;
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
                if(suppressOutput) continue;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses && !suppressOutput) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[92;1m[✓] \u001B[0m\u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (suppressOutput) return allTestsPassed;
        if (allTestsPassed) System.out.println("\n \u001b[92;1m✓✓✓\u001B[0;1m\u001b[96;40m  ~  All tests passed  ~  \u001B[0m\u001b[92;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[92;1;40m "+successCount+"\u001B[0;1;40m / \u001b[94m"+results.length+"\u001b[90m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
