package Recursion1.Testcases;
import Recursion1.Array11;

public final class _Array11
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums, int index) {
            try { result = Array11.array11(nums, index); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30marray11\u001B[0;30m(\u001b[0;1m[1, 2, 11], 0\u001B[0m\u001b[30m)",
        "\u001b[3;30marray11\u001B[0;30m(\u001b[0;1m[11, 11], 0\u001B[0m\u001b[30m)",
        "\u001b[3;30marray11\u001B[0;30m(\u001b[0;1m[1, 2, 3, 4], 0\u001B[0m\u001b[30m)",
        "\u001b[3;30marray11\u001B[0;30m(\u001b[0;1m[1, 11, 3, 11, 11], 0\u001B[0m\u001b[30m)",
        "\u001b[3;30marray11\u001B[0;30m(\u001b[0;1m[11], 0\u001B[0m\u001b[30m)",
        "\u001b[3;30marray11\u001B[0;30m(\u001b[0;1m[1], 0\u001B[0m\u001b[30m)",
        "\u001b[3;30marray11\u001B[0;30m(\u001b[0;1m[], 0\u001B[0m\u001b[30m)",
        "\u001b[3;30marray11\u001B[0;30m(\u001b[0;1m[11, 2, 3, 4, 11, 5], 0\u001B[0m\u001b[30m)",
        "\u001b[3;30marray11\u001B[0;30m(\u001b[0;1m[11, 5, 11], 0\u001B[0m\u001b[30m)",
    };

    static final int[] expectedResults = {
        1,
        2,
        0,
        3,
        1,
        0,
        0,
        2,
        2,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 11}; 
        final int[] nums1 = {11, 11}; 
        final int[] nums2 = {1, 2, 3, 4}; 
        final int[] nums3 = {1, 11, 3, 11, 11}; 
        final int[] nums4 = {11}; 
        final int[] nums5 = {1}; 
        final int[] nums6 = {}; 
        final int[] nums7 = {11, 2, 3, 4, 11, 5}; 
        final int[] nums8 = {11, 5, 11}; 

        final TestResult[] results = {
            new TestResult(nums0, 0),
            new TestResult(nums1, 0),
            new TestResult(nums2, 0),
            new TestResult(nums3, 0),
            new TestResult(nums4, 0),
            new TestResult(nums5, 0),
            new TestResult(nums6, 0),
            new TestResult(nums7, 0),
            new TestResult(nums8, 0),
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
