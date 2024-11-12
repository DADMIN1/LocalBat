package Recursion2.Testcases;
import Recursion2.GroupSum5;

public final class _GroupSum5
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int start, int[] nums, int target) {
            try { result = GroupSum5.groupSum5(start, nums, target); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [2, 5, 10, 4], 19\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [2, 5, 10, 4], 17\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [2, 5, 10, 4], 12\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [2, 5, 4, 10], 12\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [3, 5, 1], 4\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [3, 5, 1], 5\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [1, 3, 5], 5\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [3, 5, 1], 9\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [2, 5, 10, 4], 7\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [2, 5, 10, 4], 15\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [2, 5, 10, 4], 11\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [1], 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [9], 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [9], 0\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum5\u001B[0;30m(\u001b[0;1m0, [], 0\u001B[0m\u001b[30m)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        false,
        true,
        true,
        false,
        false,
        true,
        false,
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
        final int[] nums3 = {2, 5, 4, 10}; 
        final int[] nums4 = {3, 5, 1}; 
        final int[] nums5 = {3, 5, 1}; 
        final int[] nums6 = {1, 3, 5}; 
        final int[] nums7 = {3, 5, 1}; 
        final int[] nums8 = {2, 5, 10, 4}; 
        final int[] nums9 = {2, 5, 10, 4}; 
        final int[] nums10 = {2, 5, 10, 4}; 
        final int[] nums11 = {1}; 
        final int[] nums12 = {9}; 
        final int[] nums13 = {9}; 
        final int[] nums14 = {}; 

        final TestResult[] results = {
            new TestResult(0, nums0, 19),
            new TestResult(0, nums1, 17),
            new TestResult(0, nums2, 12),
            new TestResult(0, nums3, 12),
            new TestResult(0, nums4, 4),
            new TestResult(0, nums5, 5),
            new TestResult(0, nums6, 5),
            new TestResult(0, nums7, 9),
            new TestResult(0, nums8, 7),
            new TestResult(0, nums9, 15),
            new TestResult(0, nums10, 11),
            new TestResult(0, nums11, 1),
            new TestResult(0, nums12, 1),
            new TestResult(0, nums13, 0),
            new TestResult(0, nums14, 0),
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
