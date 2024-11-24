package Warmup2.Testcases;
import Warmup2.Has271;

public final class _Has271
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = Has271.has271(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[1, 2, 7, 1]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[1, 2, 8, 1]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[2, 7, 1]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[3, 8, 2]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[2, 7, 3]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[2, 7, 4]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[2, 7, -1]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[2, 7, -2]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[4, 5, 3, 8, 0]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[2, 7, 5, 10, 4]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[2, 7, -2, 4, 9, 3]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[2, 7, 5, 10, 1]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[2, 7, -2, 4, 10, 2]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[1, 1, 4, 9, 0]\u001B[0m\u001b[90m)",
        "\u001b[3;90mhas271\u001B[0;90m(\u001b[0;1m[1, 1, 4, 9, 4, 9, 2]\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
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
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 7, 1}; 
        final int[] nums1 = {1, 2, 8, 1}; 
        final int[] nums2 = {2, 7, 1}; 
        final int[] nums3 = {3, 8, 2}; 
        final int[] nums4 = {2, 7, 3}; 
        final int[] nums5 = {2, 7, 4}; 
        final int[] nums6 = {2, 7, -1}; 
        final int[] nums7 = {2, 7, -2}; 
        final int[] nums8 = {4, 5, 3, 8, 0}; 
        final int[] nums9 = {2, 7, 5, 10, 4}; 
        final int[] nums10 = {2, 7, -2, 4, 9, 3}; 
        final int[] nums11 = {2, 7, 5, 10, 1}; 
        final int[] nums12 = {2, 7, -2, 4, 10, 2}; 
        final int[] nums13 = {1, 1, 4, 9, 0}; 
        final int[] nums14 = {1, 1, 4, 9, 4, 9, 2}; 

        final TestResult[] results = {
            new TestResult(nums0),
            new TestResult(nums1),
            new TestResult(nums2),
            new TestResult(nums3),
            new TestResult(nums4),
            new TestResult(nums5),
            new TestResult(nums6),
            new TestResult(nums7),
            new TestResult(nums8),
            new TestResult(nums9),
            new TestResult(nums10),
            new TestResult(nums11),
            new TestResult(nums12),
            new TestResult(nums13),
            new TestResult(nums14),
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
            if (results[i].result != expectedResults[i]) {
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
