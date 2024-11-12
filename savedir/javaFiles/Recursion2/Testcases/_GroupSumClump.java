package Recursion2.Testcases;
import Recursion2.GroupSumClump;

public final class _GroupSumClump
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int start, int[] nums, int target) {
            try { result = GroupSumClump.groupSumClump(start, nums, target); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mgroupSumClump\u001B[0;90m(\u001b[0;1m0, [2, 4, 8], 10\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSumClump\u001B[0;90m(\u001b[0;1m0, [1, 2, 4, 8, 1], 14\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSumClump\u001B[0;90m(\u001b[0;1m0, [2, 4, 4, 8], 14\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSumClump\u001B[0;90m(\u001b[0;1m0, [8, 2, 2, 1], 9\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSumClump\u001B[0;90m(\u001b[0;1m0, [8, 2, 2, 1], 11\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSumClump\u001B[0;90m(\u001b[0;1m0, [1], 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mgroupSumClump\u001B[0;90m(\u001b[0;1m0, [9], 1\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {2, 4, 8}; 
        final int[] nums1 = {1, 2, 4, 8, 1}; 
        final int[] nums2 = {2, 4, 4, 8}; 
        final int[] nums3 = {8, 2, 2, 1}; 
        final int[] nums4 = {8, 2, 2, 1}; 
        final int[] nums5 = {1}; 
        final int[] nums6 = {9}; 

        final TestResult[] results = {
            new TestResult(0, nums0, 10),
            new TestResult(0, nums1, 14),
            new TestResult(0, nums2, 14),
            new TestResult(0, nums3, 9),
            new TestResult(0, nums4, 11),
            new TestResult(0, nums5, 1),
            new TestResult(0, nums6, 1),
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
