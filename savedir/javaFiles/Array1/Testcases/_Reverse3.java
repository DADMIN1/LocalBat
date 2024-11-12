package Array1.Testcases;
import Array1.Reverse3;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Reverse3
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = Reverse3.reverse3(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mreverse3\u001B[0;30m(\u001b[0;1m[1, 2, 3]\u001B[0m\u001b[30m)",
        "\u001b[3;30mreverse3\u001B[0;30m(\u001b[0;1m[5, 11, 9]\u001B[0m\u001b[30m)",
        "\u001b[3;30mreverse3\u001B[0;30m(\u001b[0;1m[7, 0, 0]\u001B[0m\u001b[30m)",
        "\u001b[3;30mreverse3\u001B[0;30m(\u001b[0;1m[2, 1, 2]\u001B[0m\u001b[30m)",
        "\u001b[3;30mreverse3\u001B[0;30m(\u001b[0;1m[1, 2, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mreverse3\u001B[0;30m(\u001b[0;1m[2, 11, 3]\u001B[0m\u001b[30m)",
        "\u001b[3;30mreverse3\u001B[0;30m(\u001b[0;1m[0, 6, 5]\u001B[0m\u001b[30m)",
        "\u001b[3;30mreverse3\u001B[0;30m(\u001b[0;1m[7, 2, 3]\u001B[0m\u001b[30m)",
    };

    static final int[][] expectedResults = {
        {3, 2, 1},
        {9, 11, 5},
        {0, 0, 7},
        {2, 1, 2},
        {1, 2, 1},
        {3, 11, 2},
        {5, 6, 0},
        {3, 2, 7},
    };

    public static final String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 3}; 
        final int[] nums1 = {5, 11, 9}; 
        final int[] nums2 = {7, 0, 0}; 
        final int[] nums3 = {2, 1, 2}; 
        final int[] nums4 = {1, 2, 1}; 
        final int[] nums5 = {2, 11, 3}; 
        final int[] nums6 = {0, 6, 5}; 
        final int[] nums7 = {7, 2, 3}; 

        final TestResult[] results = {
            new TestResult(nums0),
            new TestResult(nums1),
            new TestResult(nums2),
            new TestResult(nums3),
            new TestResult(nums4),
            new TestResult(nums5),
            new TestResult(nums6),
            new TestResult(nums7),
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
            if (!Arrays.equals(results[i].result, expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[X]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[31;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[34;3;4mreceived:\u001B[0m \u001b[1m"+printArray(results[i].result));
                System.out.println("    \u001b[36;3;4mexpected:\u001B[0m \u001b[1m"+printArray(expectedResults[i]));
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
