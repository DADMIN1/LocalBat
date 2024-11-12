package Array2.Testcases;
import Array2.CenteredAverage;

public final class _CenteredAverage
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = CenteredAverage.centeredAverage(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[1, 2, 3, 4, 100]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[1, 1, 5, 5, 10, 8, 7]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[-10, -4, -2, -4, -2, 0]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[5, 3, 4, 6, 2]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[5, 3, 4, 0, 100]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[100, 0, 5, 3, 4]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[4, 0, 100]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[0, 2, 3, 4, 100]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[1, 1, 100]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[7, 7, 7]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[1, 7, 8]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[1, 1, 99, 99]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[1000, 0, 1, 99]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[4, 4, 4, 4, 5]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[4, 4, 4, 1, 5]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcenteredAverage\u001B[0;90m(\u001b[0;1m[6, 4, 8, 12, 3]\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        3,
        5,
        -3,
        4,
        4,
        4,
        4,
        3,
        1,
        7,
        7,
        50,
        50,
        4,
        4,
        6,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 3, 4, 100}; 
        final int[] nums1 = {1, 1, 5, 5, 10, 8, 7}; 
        final int[] nums2 = {-10, -4, -2, -4, -2, 0}; 
        final int[] nums3 = {5, 3, 4, 6, 2}; 
        final int[] nums4 = {5, 3, 4, 0, 100}; 
        final int[] nums5 = {100, 0, 5, 3, 4}; 
        final int[] nums6 = {4, 0, 100}; 
        final int[] nums7 = {0, 2, 3, 4, 100}; 
        final int[] nums8 = {1, 1, 100}; 
        final int[] nums9 = {7, 7, 7}; 
        final int[] nums10 = {1, 7, 8}; 
        final int[] nums11 = {1, 1, 99, 99}; 
        final int[] nums12 = {1000, 0, 1, 99}; 
        final int[] nums13 = {4, 4, 4, 4, 5}; 
        final int[] nums14 = {4, 4, 4, 1, 5}; 
        final int[] nums15 = {6, 4, 8, 12, 3}; 

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
            new TestResult(nums15),
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
