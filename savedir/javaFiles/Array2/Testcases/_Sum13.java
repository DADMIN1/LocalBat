package Array2.Testcases;
import Array2.Sum13;

public final class _Sum13
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = Sum13.sum13(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[1, 2, 2, 1]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[1, 1]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[1, 2, 2, 1, 13]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[1, 2, 13, 2, 1, 13]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[13, 1, 2, 13, 2, 1, 13]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[13]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[13, 13]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[13, 0, 13]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[13, 1, 13]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[5, 7, 2]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[5, 13, 2]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[0]\u001B[0m\u001b[90m)",
        "\u001b[3;90msum13\u001B[0;90m(\u001b[0;1m[13, 0]\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        6,
        2,
        6,
        4,
        3,
        0,
        0,
        0,
        0,
        0,
        14,
        5,
        0,
        0,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 2, 1}; 
        final int[] nums1 = {1, 1}; 
        final int[] nums2 = {1, 2, 2, 1, 13}; 
        final int[] nums3 = {1, 2, 13, 2, 1, 13}; 
        final int[] nums4 = {13, 1, 2, 13, 2, 1, 13}; 
        final int[] nums5 = {}; 
        final int[] nums6 = {13}; 
        final int[] nums7 = {13, 13}; 
        final int[] nums8 = {13, 0, 13}; 
        final int[] nums9 = {13, 1, 13}; 
        final int[] nums10 = {5, 7, 2}; 
        final int[] nums11 = {5, 13, 2}; 
        final int[] nums12 = {0}; 
        final int[] nums13 = {13, 0}; 

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
