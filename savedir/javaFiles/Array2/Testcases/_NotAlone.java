package Array2.Testcases;
import Array2.NotAlone;
import java.util.Arrays;
import java.util.ArrayList;

public final class _NotAlone
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] nums, int val) {
            try { result = NotAlone.notAlone(nums, val); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "notAlone([1, 2, 3], 2)",
        "notAlone([1, 2, 3, 2, 5, 2], 2)",
        "notAlone([3, 4], 3)",
        "notAlone([3, 3], 3)",
        "notAlone([1, 3, 1, 2], 1)",
        "notAlone([3], 3)",
        "notAlone([], 3)",
        "notAlone([7, 1, 6], 1)",
        "notAlone([1, 1, 1], 1)",
        "notAlone([1, 1, 1, 2], 1)",
    };

    static final int[][] expectedResults = {
        {1, 3, 3},
        {1, 3, 3, 5, 5, 2},
        {3, 4},
        {3, 3},
        {1, 3, 3, 2},
        {3},
        {},
        {7, 7, 6},
        {1, 1, 1},
        {1, 1, 1, 2},
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
        final int[] nums1 = {1, 2, 3, 2, 5, 2}; 
        final int[] nums2 = {3, 4}; 
        final int[] nums3 = {3, 3}; 
        final int[] nums4 = {1, 3, 1, 2}; 
        final int[] nums5 = {3}; 
        final int[] nums6 = {}; 
        final int[] nums7 = {7, 1, 6}; 
        final int[] nums8 = {1, 1, 1}; 
        final int[] nums9 = {1, 1, 1, 2}; 

        final TestResult[] results = {
            new TestResult(nums0, 2),
            new TestResult(nums1, 2),
            new TestResult(nums2, 3),
            new TestResult(nums3, 3),
            new TestResult(nums4, 1),
            new TestResult(nums5, 3),
            new TestResult(nums6, 3),
            new TestResult(nums7, 1),
            new TestResult(nums8, 1),
            new TestResult(nums9, 1),
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
