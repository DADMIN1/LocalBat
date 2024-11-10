package AP1.Testcases;
import AP1.CopyEndy;
import java.util.Arrays;
import java.util.ArrayList;

public final class _CopyEndy
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] nums, int count) {
            try { result = CopyEndy.copyEndy(nums, count); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "copyEndy([9, 11, 90, 22, 6], 2)",
        "copyEndy([9, 11, 90, 22, 6], 3)",
        "copyEndy([12, 1, 1, 13, 0, 20], 2)",
        "copyEndy([12, 1, 1, 13, 0, 20], 3)",
        "copyEndy([0], 1)",
        "copyEndy([10, 11, 90], 2)",
        "copyEndy([90, 22, 100], 2)",
        "copyEndy([12, 11, 10, 89, 101, 4], 1)",
        "copyEndy([13, 2, 2, 0], 2)",
        "copyEndy([13, 2, 2, 0], 3)",
        "copyEndy([13, 2, 13, 2, 0, 30], 2)",
        "copyEndy([13, 2, 13, 2, 0, 30], 3)",
    };

    static final int[][] expectedResults = {
        {9, 90},
        {9, 90, 6},
        {1, 1},
        {1, 1, 0},
        {0},
        {10, 90},
        {90, 100},
        {10},
        {2, 2},
        {2, 2, 0},
        {2, 2},
        {2, 2, 0},
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
        final int[] nums0 = {9, 11, 90, 22, 6}; 
        final int[] nums1 = {9, 11, 90, 22, 6}; 
        final int[] nums2 = {12, 1, 1, 13, 0, 20}; 
        final int[] nums3 = {12, 1, 1, 13, 0, 20}; 
        final int[] nums4 = {0}; 
        final int[] nums5 = {10, 11, 90}; 
        final int[] nums6 = {90, 22, 100}; 
        final int[] nums7 = {12, 11, 10, 89, 101, 4}; 
        final int[] nums8 = {13, 2, 2, 0}; 
        final int[] nums9 = {13, 2, 2, 0}; 
        final int[] nums10 = {13, 2, 13, 2, 0, 30}; 
        final int[] nums11 = {13, 2, 13, 2, 0, 30}; 

        final TestResult[] results = {
            new TestResult(nums0, 2),
            new TestResult(nums1, 3),
            new TestResult(nums2, 2),
            new TestResult(nums3, 3),
            new TestResult(nums4, 1),
            new TestResult(nums5, 2),
            new TestResult(nums6, 2),
            new TestResult(nums7, 1),
            new TestResult(nums8, 2),
            new TestResult(nums9, 3),
            new TestResult(nums10, 2),
            new TestResult(nums11, 3),
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
