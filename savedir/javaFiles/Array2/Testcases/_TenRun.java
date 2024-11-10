package Array2.Testcases;
import Array2.TenRun;
import java.util.Arrays;
import java.util.ArrayList;

public final class _TenRun
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = TenRun.tenRun(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "tenRun([2, 10, 3, 4, 20, 5])",
        "tenRun([10, 1, 20, 2])",
        "tenRun([10, 1, 9, 20])",
        "tenRun([1, 2, 50, 1])",
        "tenRun([1, 20, 50, 1])",
        "tenRun([10, 10])",
        "tenRun([10, 2])",
        "tenRun([0, 2])",
        "tenRun([1, 2])",
        "tenRun([1])",
        "tenRun([])",
    };

    static final int[][] expectedResults = {
        {2, 10, 10, 10, 20, 20},
        {10, 10, 20, 20},
        {10, 10, 10, 20},
        {1, 2, 50, 50},
        {1, 20, 50, 50},
        {10, 10},
        {10, 10},
        {0, 0},
        {1, 2},
        {1},
        {},
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
        final int[] nums0 = {2, 10, 3, 4, 20, 5}; 
        final int[] nums1 = {10, 1, 20, 2}; 
        final int[] nums2 = {10, 1, 9, 20}; 
        final int[] nums3 = {1, 2, 50, 1}; 
        final int[] nums4 = {1, 20, 50, 1}; 
        final int[] nums5 = {10, 10}; 
        final int[] nums6 = {10, 2}; 
        final int[] nums7 = {0, 2}; 
        final int[] nums8 = {1, 2}; 
        final int[] nums9 = {1}; 
        final int[] nums10 = {}; 

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
