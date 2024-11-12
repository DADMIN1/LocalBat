package Recursion2.Testcases;
import Recursion2.GroupSum;

public final class _GroupSum
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int start, int[] nums, int target) {
            try { result = GroupSum.groupSum(start, nums, target); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m0, [2, 4, 8], 10\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m0, [2, 4, 8], 14\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m0, [2, 4, 8], 9\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m0, [2, 4, 8], 8\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m1, [2, 4, 8], 8\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m1, [2, 4, 8], 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m0, [1], 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m0, [9], 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m1, [9], 0\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m0, [], 0\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m0, [10, 2, 2, 5], 17\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m0, [10, 2, 2, 5], 15\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSum\u001B[0;90m(\u001b[0;1m0, [10, 2, 2, 5], 9\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {2, 4, 8}; 
        final int[] nums1 = {2, 4, 8}; 
        final int[] nums2 = {2, 4, 8}; 
        final int[] nums3 = {2, 4, 8}; 
        final int[] nums4 = {2, 4, 8}; 
        final int[] nums5 = {2, 4, 8}; 
        final int[] nums6 = {1}; 
        final int[] nums7 = {9}; 
        final int[] nums8 = {9}; 
        final int[] nums9 = {}; 
        final int[] nums10 = {10, 2, 2, 5}; 
        final int[] nums11 = {10, 2, 2, 5}; 
        final int[] nums12 = {10, 2, 2, 5}; 

        final TestResult[] results = {
            new TestResult(0, nums0, 10),
            new TestResult(0, nums1, 14),
            new TestResult(0, nums2, 9),
            new TestResult(0, nums3, 8),
            new TestResult(1, nums4, 8),
            new TestResult(1, nums5, 2),
            new TestResult(0, nums6, 1),
            new TestResult(0, nums7, 1),
            new TestResult(1, nums8, 0),
            new TestResult(0, nums9, 0),
            new TestResult(0, nums10, 17),
            new TestResult(0, nums11, 15),
            new TestResult(0, nums12, 9),
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
