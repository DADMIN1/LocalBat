package AP1.Testcases;
import AP1.CopyEndy;
import java.util.Arrays;
import java.util.ArrayList;

public final class _CopyEndy
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] nums, int count) {
            try { result = CopyEndy.copyEndy(nums, count); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mcopyEndy\u001B[0;90m(\u001b[0;1m[9, 11, 90, 22, 6], 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mcopyEndy\u001B[0;90m(\u001b[0;1m[9, 11, 90, 22, 6], 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mcopyEndy\u001B[0;90m(\u001b[0;1m[12, 1, 1, 13, 0, 20], 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mcopyEndy\u001B[0;90m(\u001b[0;1m[12, 1, 1, 13, 0, 20], 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mcopyEndy\u001B[0;90m(\u001b[0;1m[0], 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mcopyEndy\u001B[0;90m(\u001b[0;1m[10, 11, 90], 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mcopyEndy\u001B[0;90m(\u001b[0;1m[90, 22, 100], 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mcopyEndy\u001B[0;90m(\u001b[0;1m[12, 11, 10, 89, 101, 4], 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mcopyEndy\u001B[0;90m(\u001b[0;1m[13, 2, 2, 0], 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mcopyEndy\u001B[0;90m(\u001b[0;1m[13, 2, 2, 0], 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mcopyEndy\u001B[0;90m(\u001b[0;1m[13, 2, 13, 2, 0, 30], 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mcopyEndy\u001B[0;90m(\u001b[0;1m[13, 2, 13, 2, 0, 30], 3\u001B[0m\u001b[90m)",
    };

    static final int[][] expectedResults = {
        {9, 90},
        {9, 90, 6},
        {1, 1},
        {1, 1, 0},
        {0},
        {10, 90},
        {90, 100},
        {10},
        {2, 2},
        {2, 2, 0},
        {2, 2},
        {2, 2, 0},
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
        final int[] nums0 = {9, 11, 90, 22, 6}; 
        final int[] nums1 = {9, 11, 90, 22, 6}; 
        final int[] nums2 = {12, 1, 1, 13, 0, 20}; 
        final int[] nums3 = {12, 1, 1, 13, 0, 20}; 
        final int[] nums4 = {0}; 
        final int[] nums5 = {10, 11, 90}; 
        final int[] nums6 = {90, 22, 100}; 
        final int[] nums7 = {12, 11, 10, 89, 101, 4}; 
        final int[] nums8 = {13, 2, 2, 0}; 
        final int[] nums9 = {13, 2, 2, 0}; 
        final int[] nums10 = {13, 2, 13, 2, 0, 30}; 
        final int[] nums11 = {13, 2, 13, 2, 0, 30}; 

        final TestResult[] results = {
            new TestResult(nums0, 2),
            new TestResult(nums1, 3),
            new TestResult(nums2, 2),
            new TestResult(nums3, 3),
            new TestResult(nums4, 1),
            new TestResult(nums5, 2),
            new TestResult(nums6, 2),
            new TestResult(nums7, 1),
            new TestResult(nums8, 2),
            new TestResult(nums9, 3),
            new TestResult(nums10, 2),
            new TestResult(nums11, 3),
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
