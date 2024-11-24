package Functional1.Testcases;
import Functional1.Doubling;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Doubling
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<Integer> nums) {
            try { result = Doubling.doubling(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mdoubling\u001B[0;90m(\u001b[0;1m[1, 2, 3]\u001B[0m\u001b[90m)",
        "\u001b[3;90mdoubling\u001B[0;90m(\u001b[0;1m[6, 8, 6, 8, -1]\u001B[0m\u001b[90m)",
        "\u001b[3;90mdoubling\u001B[0;90m(\u001b[0;1m[]\u001B[0m\u001b[90m)",
        "\u001b[3;90mdoubling\u001B[0;90m(\u001b[0;1m[5]\u001B[0m\u001b[90m)",
        "\u001b[3;90mdoubling\u001B[0;90m(\u001b[0;1m[5, 10]\u001B[0m\u001b[90m)",
        "\u001b[3;90mdoubling\u001B[0;90m(\u001b[0;1m[8, -5, 7, 3, 109]\u001B[0m\u001b[90m)",
        "\u001b[3;90mdoubling\u001B[0;90m(\u001b[0;1m[6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]\u001B[0m\u001b[90m)",
        "\u001b[3;90mdoubling\u001B[0;90m(\u001b[0;1m[3, 1, 4, 1, 5, 9]\u001B[0m\u001b[90m)",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(2, 4, 6),
        Arrays.asList(12, 16, 12, 16, -2),
        Arrays.asList(),
        Arrays.asList(10),
        Arrays.asList(10, 20),
        Arrays.asList(16, -10, 14, 6, 218),
        Arrays.asList(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4),
        Arrays.asList(6, 2, 8, 2, 10, 18),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList(1, 2, 3))),
            new TestResult(new ArrayList<>(Arrays.asList(6, 8, 6, 8, -1))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(5))),
            new TestResult(new ArrayList<>(Arrays.asList(5, 10))),
            new TestResult(new ArrayList<>(Arrays.asList(8, -5, 7, 3, 109))),
            new TestResult(new ArrayList<>(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2))),
            new TestResult(new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9))),
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
            if (!results[i].result.equals(expectedResults[i])) {
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
