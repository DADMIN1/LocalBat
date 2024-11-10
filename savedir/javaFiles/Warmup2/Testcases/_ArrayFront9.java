package Warmup2.Testcases;
import Warmup2.ArrayFront9;

public final class _ArrayFront9
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = ArrayFront9.arrayFront9(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "arrayFront9([1, 2, 9, 3, 4])",
        "arrayFront9([1, 2, 3, 4, 9])",
        "arrayFront9([1, 2, 3, 4, 5])",
        "arrayFront9([9, 2, 3])",
        "arrayFront9([1, 9, 9])",
        "arrayFront9([1, 2, 3])",
        "arrayFront9([1, 9])",
        "arrayFront9([5, 5])",
        "arrayFront9([2])",
        "arrayFront9([9])",
        "arrayFront9([])",
        "arrayFront9([3, 9, 2, 3, 3])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 9, 3, 4}; 
        final int[] nums1 = {1, 2, 3, 4, 9}; 
        final int[] nums2 = {1, 2, 3, 4, 5}; 
        final int[] nums3 = {9, 2, 3}; 
        final int[] nums4 = {1, 9, 9}; 
        final int[] nums5 = {1, 2, 3}; 
        final int[] nums6 = {1, 9}; 
        final int[] nums7 = {5, 5}; 
        final int[] nums8 = {2}; 
        final int[] nums9 = {9}; 
        final int[] nums10 = {}; 
        final int[] nums11 = {3, 9, 2, 3, 3}; 

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
            if (results[i].result != expectedResults[i]) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[x] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed!");
                System.out.println("    received: "+results[i].result);
                System.out.println("    expected: "+expectedResults[i]);
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
