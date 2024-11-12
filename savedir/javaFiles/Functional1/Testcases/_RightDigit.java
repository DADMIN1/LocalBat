package Functional1.Testcases;
import Functional1.RightDigit;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _RightDigit
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<Integer> nums) {
            try { result = RightDigit.rightDigit(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mrightDigit\u001B[0;90m(\u001b[0;1m[1, 22, 93]\u001B[0m\u001b[90m)",
        "\u001b[3;90mrightDigit\u001B[0;90m(\u001b[0;1m[16, 8, 886, 8, 1]\u001B[0m\u001b[90m)",
        "\u001b[3;90mrightDigit\u001B[0;90m(\u001b[0;1m[10, 0]\u001B[0m\u001b[90m)",
        "\u001b[3;90mrightDigit\u001B[0;90m(\u001b[0;1m[]\u001B[0m\u001b[90m)",
        "\u001b[3;90mrightDigit\u001B[0;90m(\u001b[0;1m[5, 10]\u001B[0m\u001b[90m)",
        "\u001b[3;90mrightDigit\u001B[0;90m(\u001b[0;1m[5, 50, 500, 5000, 5000]\u001B[0m\u001b[90m)",
        "\u001b[3;90mrightDigit\u001B[0;90m(\u001b[0;1m[6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2]\u001B[0m\u001b[90m)",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(1, 2, 3),
        Arrays.asList(6, 8, 6, 8, 1),
        Arrays.asList(0, 0),
        Arrays.asList(),
        Arrays.asList(5, 0),
        Arrays.asList(5, 0, 0, 0, 0),
        Arrays.asList(6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList(1, 22, 93))),
            new TestResult(new ArrayList<>(Arrays.asList(16, 8, 886, 8, 1))),
            new TestResult(new ArrayList<>(Arrays.asList(10, 0))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(5, 10))),
            new TestResult(new ArrayList<>(Arrays.asList(5, 50, 500, 5000, 5000))),
            new TestResult(new ArrayList<>(Arrays.asList(6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2))),
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
