package Array2.Testcases;
import Array2.MatchUp;

public final class _MatchUp
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums1, int[] nums2) {
            try { result = MatchUp.matchUp(nums1, nums2); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[1, 2, 3], [2, 3, 10]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[1, 2, 3], [2, 3, 5]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[1, 2, 3], [2, 3, 3]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[5, 3], [5, 5]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[5, 3], [4, 4]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[5, 3], [3, 3]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[5, 3], [2, 2]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[5, 3], [1, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[5, 3], [0, 0]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[4], [4]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[4], [5]\u001B[0m\u001b[30m)",
    };

    static final int[] expectedResults = {
        2,
        3,
        2,
        1,
        2,
        1,
        1,
        1,
        0,
        0,
        1,
    };

    public static final boolean Validate()
    {
        final int[] nums10 = {1, 2, 3}; final int[] nums20 = {2, 3, 10}; 
        final int[] nums11 = {1, 2, 3}; final int[] nums21 = {2, 3, 5}; 
        final int[] nums12 = {1, 2, 3}; final int[] nums22 = {2, 3, 3}; 
        final int[] nums13 = {5, 3}; final int[] nums23 = {5, 5}; 
        final int[] nums14 = {5, 3}; final int[] nums24 = {4, 4}; 
        final int[] nums15 = {5, 3}; final int[] nums25 = {3, 3}; 
        final int[] nums16 = {5, 3}; final int[] nums26 = {2, 2}; 
        final int[] nums17 = {5, 3}; final int[] nums27 = {1, 1}; 
        final int[] nums18 = {5, 3}; final int[] nums28 = {0, 0}; 
        final int[] nums19 = {4}; final int[] nums29 = {4}; 
        final int[] nums110 = {4}; final int[] nums210 = {5}; 

        final TestResult[] results = {
            new TestResult(nums10, nums20),
            new TestResult(nums11, nums21),
            new TestResult(nums12, nums22),
            new TestResult(nums13, nums23),
            new TestResult(nums14, nums24),
            new TestResult(nums15, nums25),
            new TestResult(nums16, nums26),
            new TestResult(nums17, nums27),
            new TestResult(nums18, nums28),
            new TestResult(nums19, nums29),
            new TestResult(nums110, nums210),
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
