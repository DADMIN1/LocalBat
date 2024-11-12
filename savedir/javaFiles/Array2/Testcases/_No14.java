package Array2.Testcases;
import Array2.No14;

public final class _No14
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = No14.no14(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[1, 2, 3]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[1, 2, 3, 4]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[2, 3, 4]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[1, 1, 4, 4]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[2, 2, 4, 4]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[2, 3, 4, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[2, 1, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[1, 4]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[2]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[2, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[4]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[1, 1, 1, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[9, 4, 4, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[4, 2, 3, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[4, 2, 3, 5]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[4, 4, 2]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno14\u001B[0;30m(\u001b[0;1m[1, 4, 4]\u001B[0m\u001b[30m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
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
        false,
        false,
        true,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 3}; 
        final int[] nums1 = {1, 2, 3, 4}; 
        final int[] nums2 = {2, 3, 4}; 
        final int[] nums3 = {1, 1, 4, 4}; 
        final int[] nums4 = {2, 2, 4, 4}; 
        final int[] nums5 = {2, 3, 4, 1}; 
        final int[] nums6 = {2, 1, 1}; 
        final int[] nums7 = {1, 4}; 
        final int[] nums8 = {2}; 
        final int[] nums9 = {2, 1}; 
        final int[] nums10 = {1}; 
        final int[] nums11 = {4}; 
        final int[] nums12 = {}; 
        final int[] nums13 = {1, 1, 1, 1}; 
        final int[] nums14 = {9, 4, 4, 1}; 
        final int[] nums15 = {4, 2, 3, 1}; 
        final int[] nums16 = {4, 2, 3, 5}; 
        final int[] nums17 = {4, 4, 2}; 
        final int[] nums18 = {1, 4, 4}; 

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
            new TestResult(nums16),
            new TestResult(nums17),
            new TestResult(nums18),
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
