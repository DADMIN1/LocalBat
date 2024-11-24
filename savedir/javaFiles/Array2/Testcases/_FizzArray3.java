package Array2.Testcases;
import Array2.FizzArray3;
import java.util.Arrays;
import java.util.ArrayList;

public final class _FizzArray3
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int start, int end) {
            try { result = FizzArray3.fizzArray3(start, end); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mfizzArray3\u001B[0;90m(\u001b[0;1m5, 10\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzArray3\u001B[0;90m(\u001b[0;1m11, 18\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzArray3\u001B[0;90m(\u001b[0;1m1, 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzArray3\u001B[0;90m(\u001b[0;1m1, 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzArray3\u001B[0;90m(\u001b[0;1m1, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzArray3\u001B[0;90m(\u001b[0;1m1000, 1005\u001B[0m\u001b[90m)",
    };

    static final int[][] expectedResults = {
        {5, 6, 7, 8, 9},
        {11, 12, 13, 14, 15, 16, 17},
        {1, 2},
        {1},
        {},
        {1000, 1001, 1002, 1003, 1004},
    };

    public static final String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(5, 10),
            new TestResult(11, 18),
            new TestResult(1, 3),
            new TestResult(1, 2),
            new TestResult(1, 1),
            new TestResult(1000, 1005),
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
            if (!Arrays.equals(results[i].result, expectedResults[i])) {
                allTestsPassed = false;
                if(suppressOutput) continue;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+printArray(results[i].result));
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+printArray(expectedResults[i]));
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
