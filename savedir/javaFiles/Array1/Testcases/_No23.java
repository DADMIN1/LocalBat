package Array1.Testcases;
import Array1.No23;

public final class _No23
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = No23.no23(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mno23\u001B[0;90m(\u001b[0;1m[4, 5]\u001B[0m\u001b[90m)",
        "\u001b[3;90mno23\u001B[0;90m(\u001b[0;1m[4, 2]\u001B[0m\u001b[90m)",
        "\u001b[3;90mno23\u001B[0;90m(\u001b[0;1m[3, 5]\u001B[0m\u001b[90m)",
        "\u001b[3;90mno23\u001B[0;90m(\u001b[0;1m[1, 9]\u001B[0m\u001b[90m)",
        "\u001b[3;90mno23\u001B[0;90m(\u001b[0;1m[2, 9]\u001B[0m\u001b[90m)",
        "\u001b[3;90mno23\u001B[0;90m(\u001b[0;1m[1, 3]\u001B[0m\u001b[90m)",
        "\u001b[3;90mno23\u001B[0;90m(\u001b[0;1m[1, 1]\u001B[0m\u001b[90m)",
        "\u001b[3;90mno23\u001B[0;90m(\u001b[0;1m[2, 2]\u001B[0m\u001b[90m)",
        "\u001b[3;90mno23\u001B[0;90m(\u001b[0;1m[3, 3]\u001B[0m\u001b[90m)",
        "\u001b[3;90mno23\u001B[0;90m(\u001b[0;1m[7, 8]\u001B[0m\u001b[90m)",
        "\u001b[3;90mno23\u001B[0;90m(\u001b[0;1m[8, 7]\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {4, 5}; 
        final int[] nums1 = {4, 2}; 
        final int[] nums2 = {3, 5}; 
        final int[] nums3 = {1, 9}; 
        final int[] nums4 = {2, 9}; 
        final int[] nums5 = {1, 3}; 
        final int[] nums6 = {1, 1}; 
        final int[] nums7 = {2, 2}; 
        final int[] nums8 = {3, 3}; 
        final int[] nums9 = {7, 8}; 
        final int[] nums10 = {8, 7}; 

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
