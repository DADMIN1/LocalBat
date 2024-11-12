package Array3.Testcases;
import Array3.MaxMirror;

public final class _MaxMirror
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = MaxMirror.maxMirror(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[1, 2, 3, 8, 9, 3, 2, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[1, 2, 1, 4]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[7, 1, 2, 9, 7, 2, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[1, 2, 3, 2, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[1, 2, 3, 3, 8]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[1, 2, 7, 8, 1, 7, 2]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[1, 1, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[9, 1, 1, 4, 2, 1, 1, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[5, 9, 9, 4, 5, 4, 9, 9, 2]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[5, 9, 9, 6, 5, 4, 9, 9, 2]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmaxMirror\u001B[0;30m(\u001b[0;1m[5, 9, 1, 6, 5, 4, 1, 9, 5]\u001B[0m\u001b[30m)",
    };

    static final int[] expectedResults = {
        3,
        3,
        2,
        4,
        4,
        5,
        2,
        2,
        3,
        1,
        0,
        3,
        7,
        2,
        3,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 3, 8, 9, 3, 2, 1}; 
        final int[] nums1 = {1, 2, 1, 4}; 
        final int[] nums2 = {7, 1, 2, 9, 7, 2, 1}; 
        final int[] nums3 = {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}; 
        final int[] nums4 = {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25}; 
        final int[] nums5 = {1, 2, 3, 2, 1}; 
        final int[] nums6 = {1, 2, 3, 3, 8}; 
        final int[] nums7 = {1, 2, 7, 8, 1, 7, 2}; 
        final int[] nums8 = {1, 1, 1}; 
        final int[] nums9 = {1}; 
        final int[] nums10 = {}; 
        final int[] nums11 = {9, 1, 1, 4, 2, 1, 1, 1}; 
        final int[] nums12 = {5, 9, 9, 4, 5, 4, 9, 9, 2}; 
        final int[] nums13 = {5, 9, 9, 6, 5, 4, 9, 9, 2}; 
        final int[] nums14 = {5, 9, 1, 6, 5, 4, 1, 9, 5}; 

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
