package AP1.Testcases;
import AP1.CopyEvens;
import java.util.Arrays;
import java.util.ArrayList;

public final class _CopyEvens
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] nums, int count) {
            try { result = CopyEvens.copyEvens(nums, count); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "copyEvens([3, 2, 4, 5, 8], 2)",
        "copyEvens([3, 2, 4, 5, 8], 3)",
        "copyEvens([6, 1, 2, 4, 5, 8], 3)",
        "copyEvens([6, 1, 2, 4, 5, 8], 4)",
        "copyEvens([3, 1, 4, 1, 5], 1)",
        "copyEvens([2], 1)",
        "copyEvens([6, 2, 4, 8], 2)",
        "copyEvens([6, 2, 4, 8], 3)",
        "copyEvens([6, 2, 4, 8], 4)",
        "copyEvens([1, 8, 4], 1)",
        "copyEvens([1, 8, 4], 2)",
        "copyEvens([2, 8, 4], 2)",
    };

    static final int[][] expectedResults = {
        {2, 4},
        {2, 4, 8},
        {6, 2, 4},
        {6, 2, 4, 8},
        {4},
        {2},
        {6, 2},
        {6, 2, 4},
        {6, 2, 4, 8},
        {8},
        {8, 4},
        {2, 8},
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
        final int[] nums0 = {3, 2, 4, 5, 8}; 
        final int[] nums1 = {3, 2, 4, 5, 8}; 
        final int[] nums2 = {6, 1, 2, 4, 5, 8}; 
        final int[] nums3 = {6, 1, 2, 4, 5, 8}; 
        final int[] nums4 = {3, 1, 4, 1, 5}; 
        final int[] nums5 = {2}; 
        final int[] nums6 = {6, 2, 4, 8}; 
        final int[] nums7 = {6, 2, 4, 8}; 
        final int[] nums8 = {6, 2, 4, 8}; 
        final int[] nums9 = {1, 8, 4}; 
        final int[] nums10 = {1, 8, 4}; 
        final int[] nums11 = {2, 8, 4}; 

        final TestResult[] results = {
            new TestResult(nums0, 2),
            new TestResult(nums1, 3),
            new TestResult(nums2, 3),
            new TestResult(nums3, 4),
            new TestResult(nums4, 1),
            new TestResult(nums5, 1),
            new TestResult(nums6, 2),
            new TestResult(nums7, 3),
            new TestResult(nums8, 4),
            new TestResult(nums9, 1),
            new TestResult(nums10, 2),
            new TestResult(nums11, 2),
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
