package Recursion2.Testcases;
import Recursion2.GroupSum6;

public final class _GroupSum6
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int start, int[] nums, int target) {
            try { result = GroupSum6.groupSum6(start, nums, target); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [5, 6, 2], 8\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [5, 6, 2], 9\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [5, 6, 2], 7\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [1], 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [9], 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [], 0\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [3, 2, 4, 6], 8\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [6, 2, 4, 3], 8\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [5, 2, 4, 6], 9\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [6, 2, 4, 5], 9\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [3, 2, 4, 6], 3\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [1, 6, 2, 6, 4], 12\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [1, 6, 2, 6, 4], 13\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [1, 6, 2, 6, 4], 4\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [1, 6, 2, 6, 4], 9\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [1, 6, 2, 6, 5], 14\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [1, 6, 2, 6, 5], 15\u001B[0m\u001b[30m)",
        "\u001b[3;30mgroupSum6\u001B[0;30m(\u001b[0;1m0, [1, 6, 2, 6, 5], 16\u001B[0m\u001b[30m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        false,
        true,
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
        true,
        false,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {5, 6, 2}; 
        final int[] nums1 = {5, 6, 2}; 
        final int[] nums2 = {5, 6, 2}; 
        final int[] nums3 = {1}; 
        final int[] nums4 = {9}; 
        final int[] nums5 = {}; 
        final int[] nums6 = {3, 2, 4, 6}; 
        final int[] nums7 = {6, 2, 4, 3}; 
        final int[] nums8 = {5, 2, 4, 6}; 
        final int[] nums9 = {6, 2, 4, 5}; 
        final int[] nums10 = {3, 2, 4, 6}; 
        final int[] nums11 = {1, 6, 2, 6, 4}; 
        final int[] nums12 = {1, 6, 2, 6, 4}; 
        final int[] nums13 = {1, 6, 2, 6, 4}; 
        final int[] nums14 = {1, 6, 2, 6, 4}; 
        final int[] nums15 = {1, 6, 2, 6, 5}; 
        final int[] nums16 = {1, 6, 2, 6, 5}; 
        final int[] nums17 = {1, 6, 2, 6, 5}; 

        final TestResult[] results = {
            new TestResult(0, nums0, 8),
            new TestResult(0, nums1, 9),
            new TestResult(0, nums2, 7),
            new TestResult(0, nums3, 1),
            new TestResult(0, nums4, 1),
            new TestResult(0, nums5, 0),
            new TestResult(0, nums6, 8),
            new TestResult(0, nums7, 8),
            new TestResult(0, nums8, 9),
            new TestResult(0, nums9, 9),
            new TestResult(0, nums10, 3),
            new TestResult(0, nums11, 12),
            new TestResult(0, nums12, 13),
            new TestResult(0, nums13, 4),
            new TestResult(0, nums14, 9),
            new TestResult(0, nums15, 14),
            new TestResult(0, nums16, 15),
            new TestResult(0, nums17, 16),
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
