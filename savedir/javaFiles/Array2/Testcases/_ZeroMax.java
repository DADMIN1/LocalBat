package Array2.Testcases;
import Array2.ZeroMax;
import java.util.Arrays;
import java.util.ArrayList;

public final class _ZeroMax
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = ZeroMax.zeroMax(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "zeroMax([0, 5, 0, 3])",
        "zeroMax([0, 4, 0, 3])",
        "zeroMax([0, 1, 0])",
        "zeroMax([0, 1, 5])",
        "zeroMax([0, 2, 0])",
        "zeroMax([1])",
        "zeroMax([0])",
        "zeroMax([])",
        "zeroMax([7, 0, 4, 3, 0, 2])",
        "zeroMax([7, 0, 4, 3, 0, 1])",
        "zeroMax([7, 0, 4, 3, 0, 0])",
        "zeroMax([7, 0, 1, 0, 0, 7])",
    };

    static final int[][] expectedResults = {
        {5, 5, 3, 3},
        {3, 4, 3, 3},
        {1, 1, 0},
        {5, 1, 5},
        {0, 2, 0},
        {1},
        {0},
        {},
        {7, 3, 4, 3, 0, 2},
        {7, 3, 4, 3, 1, 1},
        {7, 3, 4, 3, 0, 0},
        {7, 7, 1, 7, 7, 7},
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
        final int[] nums0 = {0, 5, 0, 3}; 
        final int[] nums1 = {0, 4, 0, 3}; 
        final int[] nums2 = {0, 1, 0}; 
        final int[] nums3 = {0, 1, 5}; 
        final int[] nums4 = {0, 2, 0}; 
        final int[] nums5 = {1}; 
        final int[] nums6 = {0}; 
        final int[] nums7 = {}; 
        final int[] nums8 = {7, 0, 4, 3, 0, 2}; 
        final int[] nums9 = {7, 0, 4, 3, 0, 1}; 
        final int[] nums10 = {7, 0, 4, 3, 0, 0}; 
        final int[] nums11 = {7, 0, 1, 0, 0, 7}; 

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
        };

        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[!] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed! [EXCEPTION]");
                System.out.println(results[i].caught.getClass().getName());
                System.out.println(results[i].caught.getMessage());
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println(); continue;
            }
            if (!Arrays.equals(results[i].result, expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[x] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed!");
                System.out.println("    received: "+printArray(results[i].result));
                System.out.println("    expected: "+printArray(expectedResults[i]));
                System.out.println();
            } else if (printSuccesses) {
                prevTestPassed = true;
                System.out.println("[✓] #"+(i+1)+" - "+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n ✓✓✓  ~ All tests passed. ~  ✓✓✓");
        System.out.println();
        return allTestsPassed;
    }
}
