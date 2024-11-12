package Recursion2.Testcases;
import Recursion2.GroupNoAdj;

public final class _GroupNoAdj
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int start, int[] nums, int target) {
            try { result = GroupNoAdj.groupNoAdj(start, nums, target); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mgroupNoAdj\u001B[0;30m(\u001b[0;1m0, [2, 5, 10, 4], 12\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupNoAdj\u001B[0;30m(\u001b[0;1m0, [2, 5, 10, 4], 14\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupNoAdj\u001B[0;30m(\u001b[0;1m0, [2, 5, 10, 4], 7\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupNoAdj\u001B[0;30m(\u001b[0;1m0, [2, 5, 10, 4, 2], 7\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupNoAdj\u001B[0;30m(\u001b[0;1m0, [2, 5, 10, 4], 9\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupNoAdj\u001B[0;30m(\u001b[0;1m0, [10, 2, 2, 3, 3], 15\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupNoAdj\u001B[0;30m(\u001b[0;1m0, [10, 2, 2, 3, 3], 7\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupNoAdj\u001B[0;30m(\u001b[0;1m0, [], 0\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupNoAdj\u001B[0;30m(\u001b[0;1m0, [1], 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupNoAdj\u001B[0;30m(\u001b[0;1m0, [9], 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupNoAdj\u001B[0;30m(\u001b[0;1m0, [9], 0\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupNoAdj\u001B[0;30m(\u001b[0;1m0, [5, 10, 4, 1], 11\u001B[0m\u001b[30m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {2, 5, 10, 4}; 
        final int[] nums1 = {2, 5, 10, 4}; 
        final int[] nums2 = {2, 5, 10, 4}; 
        final int[] nums3 = {2, 5, 10, 4, 2}; 
        final int[] nums4 = {2, 5, 10, 4}; 
        final int[] nums5 = {10, 2, 2, 3, 3}; 
        final int[] nums6 = {10, 2, 2, 3, 3}; 
        final int[] nums7 = {}; 
        final int[] nums8 = {1}; 
        final int[] nums9 = {9}; 
        final int[] nums10 = {9}; 
        final int[] nums11 = {5, 10, 4, 1}; 

        final TestResult[] results = {
            new TestResult(0, nums0, 12),
            new TestResult(0, nums1, 14),
            new TestResult(0, nums2, 7),
            new TestResult(0, nums3, 7),
            new TestResult(0, nums4, 9),
            new TestResult(0, nums5, 15),
            new TestResult(0, nums6, 7),
            new TestResult(0, nums7, 0),
            new TestResult(0, nums8, 1),
            new TestResult(0, nums9, 1),
            new TestResult(0, nums10, 0),
            new TestResult(0, nums11, 11),
        };

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[!]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[3;31;1mFailed!\u001B[0;31;1m \u001b[40;7m[EXCEPTION]\u001B[0m");
                System.out.println("\u001b[31;40;1m"+results[i].caught.getClass().getName());
                System.out.println("\u001b[0;33;40m"+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("\u001b[30;3m");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("\u001b[0m\u001B[0m"); continue;
            }
            if (results[i].result != expectedResults[i]) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[X]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[31;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[34;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[36;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[32;1m[✓] \u001B[0m\u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n \u001b[32;1m✓✓✓\u001B[0;1m\u001b[36;40m  ~  All tests passed  ~  \u001B[0m\u001b[32;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[32;1;40m "+successCount+"\u001B[0;1;40m / \u001b[34m"+results.length+"\u001b[30m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
