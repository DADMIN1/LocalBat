package Array2.Testcases;
import Array2.SameEnds;

public final class _SameEnds
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums, int len) {
            try { result = SameEnds.sameEnds(nums, len); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[5, 6, 45, 99, 13, 5, 6], 1\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[5, 6, 45, 99, 13, 5, 6], 2\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[5, 6, 45, 99, 13, 5, 6], 3\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[1, 2, 5, 2, 1], 1\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[1, 2, 5, 2, 1], 2\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[1, 2, 5, 2, 1], 0\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[1, 2, 5, 2, 1], 5\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[1, 1, 1], 0\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[1, 1, 1], 1\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[1, 1, 1], 2\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[1, 1, 1], 3\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[1], 1\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[], 0\u001B[0m\u001b[90m)",
        "\u001b[3;90msameEnds\u001B[0;90m(\u001b[0;1m[4, 2, 4, 5], 1\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        true,
        true,
        true,
        true,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {5, 6, 45, 99, 13, 5, 6}; 
        final int[] nums1 = {5, 6, 45, 99, 13, 5, 6}; 
        final int[] nums2 = {5, 6, 45, 99, 13, 5, 6}; 
        final int[] nums3 = {1, 2, 5, 2, 1}; 
        final int[] nums4 = {1, 2, 5, 2, 1}; 
        final int[] nums5 = {1, 2, 5, 2, 1}; 
        final int[] nums6 = {1, 2, 5, 2, 1}; 
        final int[] nums7 = {1, 1, 1}; 
        final int[] nums8 = {1, 1, 1}; 
        final int[] nums9 = {1, 1, 1}; 
        final int[] nums10 = {1, 1, 1}; 
        final int[] nums11 = {1}; 
        final int[] nums12 = {}; 
        final int[] nums13 = {4, 2, 4, 5}; 

        final TestResult[] results = {
            new TestResult(nums0, 1),
            new TestResult(nums1, 2),
            new TestResult(nums2, 3),
            new TestResult(nums3, 1),
            new TestResult(nums4, 2),
            new TestResult(nums5, 0),
            new TestResult(nums6, 5),
            new TestResult(nums7, 0),
            new TestResult(nums8, 1),
            new TestResult(nums9, 2),
            new TestResult(nums10, 3),
            new TestResult(nums11, 1),
            new TestResult(nums12, 0),
            new TestResult(nums13, 1),
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
