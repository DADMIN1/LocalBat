package Array2.Testcases;
import Array2.WithoutTen;
import java.util.Arrays;
import java.util.ArrayList;

public final class _WithoutTen
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = WithoutTen.withoutTen(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "withoutTen([1, 10, 10, 2])",
        "withoutTen([10, 2, 10])",
        "withoutTen([1, 99, 10])",
        "withoutTen([10, 13, 10, 14])",
        "withoutTen([10, 13, 10, 14, 10])",
        "withoutTen([10, 10, 3])",
        "withoutTen([1])",
        "withoutTen([13, 1])",
        "withoutTen([10])",
        "withoutTen([])",
    };

    static final int[][] expectedResults = {
        {1, 2, 0, 0},
        {2, 0, 0},
        {1, 99, 0},
        {13, 14, 0, 0},
        {13, 14, 0, 0, 0},
        {3, 0, 0},
        {1},
        {13, 1},
        {0},
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
        final int[] nums0 = {1, 10, 10, 2}; 
        final int[] nums1 = {10, 2, 10}; 
        final int[] nums2 = {1, 99, 10}; 
        final int[] nums3 = {10, 13, 10, 14}; 
        final int[] nums4 = {10, 13, 10, 14, 10}; 
        final int[] nums5 = {10, 10, 3}; 
        final int[] nums6 = {1}; 
        final int[] nums7 = {13, 1}; 
        final int[] nums8 = {10}; 
        final int[] nums9 = {}; 

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
