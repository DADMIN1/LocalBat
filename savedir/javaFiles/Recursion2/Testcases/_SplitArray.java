package Recursion2.Testcases;
import Recursion2.SplitArray;

public final class _SplitArray
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = SplitArray.splitArray(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "splitArray([2, 2])",
        "splitArray([2, 3])",
        "splitArray([5, 2, 3])",
        "splitArray([5, 2, 2])",
        "splitArray([1, 1, 1, 1, 1, 1])",
        "splitArray([1, 1, 1, 1, 1])",
        "splitArray([])",
        "splitArray([1])",
        "splitArray([3, 5])",
        "splitArray([5, 3, 2])",
        "splitArray([2, 2, 10, 10, 1, 1])",
        "splitArray([1, 2, 2, 10, 10, 1, 1])",
        "splitArray([1, 2, 3, 10, 10, 1, 1])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {2, 2}; 
        final int[] nums1 = {2, 3}; 
        final int[] nums2 = {5, 2, 3}; 
        final int[] nums3 = {5, 2, 2}; 
        final int[] nums4 = {1, 1, 1, 1, 1, 1}; 
        final int[] nums5 = {1, 1, 1, 1, 1}; 
        final int[] nums6 = {}; 
        final int[] nums7 = {1}; 
        final int[] nums8 = {3, 5}; 
        final int[] nums9 = {5, 3, 2}; 
        final int[] nums10 = {2, 2, 10, 10, 1, 1}; 
        final int[] nums11 = {1, 2, 2, 10, 10, 1, 1}; 
        final int[] nums12 = {1, 2, 3, 10, 10, 1, 1}; 

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
