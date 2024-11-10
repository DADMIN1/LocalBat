package Array3.Testcases;
import Array3.Fix34;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Fix34
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = Fix34.fix34(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "fix34([1, 3, 1, 4])",
        "fix34([1, 3, 1, 4, 4, 3, 1])",
        "fix34([3, 2, 2, 4])",
        "fix34([3, 2, 3, 2, 4, 4])",
        "fix34([2, 3, 2, 3, 2, 4, 4])",
        "fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5])",
        "fix34([3, 1, 4])",
        "fix34([3, 4, 1])",
        "fix34([1, 1, 1])",
        "fix34([1])",
        "fix34([])",
        "fix34([7, 3, 7, 7, 4])",
        "fix34([3, 1, 4, 3, 1, 4])",
        "fix34([3, 1, 1, 3, 4, 4])",
    };

    static final int[][] expectedResults = {
        {1, 3, 4, 1},
        {1, 3, 4, 1, 1, 3, 4},
        {3, 4, 2, 2},
        {3, 4, 3, 4, 2, 2},
        {2, 3, 4, 3, 4, 2, 2},
        {5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4},
        {3, 4, 1},
        {3, 4, 1},
        {1, 1, 1},
        {1},
        {},
        {7, 3, 4, 7, 7},
        {3, 4, 1, 3, 4, 1},
        {3, 4, 1, 3, 4, 1},
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
        final int[] nums0 = {1, 3, 1, 4}; 
        final int[] nums1 = {1, 3, 1, 4, 4, 3, 1}; 
        final int[] nums2 = {3, 2, 2, 4}; 
        final int[] nums3 = {3, 2, 3, 2, 4, 4}; 
        final int[] nums4 = {2, 3, 2, 3, 2, 4, 4}; 
        final int[] nums5 = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5}; 
        final int[] nums6 = {3, 1, 4}; 
        final int[] nums7 = {3, 4, 1}; 
        final int[] nums8 = {1, 1, 1}; 
        final int[] nums9 = {1}; 
        final int[] nums10 = {}; 
        final int[] nums11 = {7, 3, 7, 7, 4}; 
        final int[] nums12 = {3, 1, 4, 3, 1, 4}; 
        final int[] nums13 = {3, 1, 1, 3, 4, 4}; 

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
