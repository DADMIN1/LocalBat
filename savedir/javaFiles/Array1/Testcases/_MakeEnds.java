package Array1.Testcases;
import Array1.MakeEnds;
import java.util.Arrays;
import java.util.ArrayList;

public final class _MakeEnds
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = MakeEnds.makeEnds(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mmakeEnds\u001B[0;90m(\u001b[0;1m[1, 2, 3]\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeEnds\u001B[0;90m(\u001b[0;1m[1, 2, 3, 4]\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeEnds\u001B[0;90m(\u001b[0;1m[7, 4, 6, 2]\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeEnds\u001B[0;90m(\u001b[0;1m[1, 2, 2, 2, 2, 2, 2, 3]\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeEnds\u001B[0;90m(\u001b[0;1m[7, 4]\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeEnds\u001B[0;90m(\u001b[0;1m[7]\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeEnds\u001B[0;90m(\u001b[0;1m[5, 2, 9]\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeEnds\u001B[0;90m(\u001b[0;1m[2, 3, 4, 1]\u001B[0m\u001b[90m)",
    };

    static final int[][] expectedResults = {
        {1, 3},
        {1, 4},
        {7, 2},
        {1, 3},
        {7, 4},
        {7, 7},
        {5, 9},
        {2, 1},
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
        final int[] nums1 = {1, 2, 3, 4}; 
        final int[] nums2 = {7, 4, 6, 2}; 
        final int[] nums3 = {1, 2, 2, 2, 2, 2, 2, 3}; 
        final int[] nums4 = {7, 4}; 
        final int[] nums5 = {7}; 
        final int[] nums6 = {5, 2, 9}; 
        final int[] nums7 = {2, 3, 4, 1}; 

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
            if (!Arrays.equals(results[i].result, expectedResults[i])) {
                allTestsPassed = false;
                if(suppressOutput) continue;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+printArray(results[i].result));
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+printArray(expectedResults[i]));
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
