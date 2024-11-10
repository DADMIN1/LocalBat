package Recursion1.Testcases;
import Recursion1.Array220;

public final class _Array220
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums, int index) {
            try { result = Array220.array220(nums, index); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "array220([1, 2, 20], 0)",
        "array220([3, 30], 0)",
        "array220([3], 0)",
        "array220([], 0)",
        "array220([3, 3, 30, 4], 0)",
        "array220([2, 19, 4], 0)",
        "array220([20, 2, 21], 0)",
        "array220([20, 2, 21, 210], 0)",
        "array220([2, 200, 2000], 0)",
        "array220([0, 0], 0)",
        "array220([1, 2, 3, 4, 5, 6], 0)",
        "array220([1, 2, 3, 4, 5, 50, 6], 0)",
        "array220([1, 2, 3, 4, 5, 51, 6], 0)",
        "array220([1, 2, 3, 4, 4, 50, 500, 6], 0)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        true,
        true,
        false,
        true,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 20}; 
        final int[] nums1 = {3, 30}; 
        final int[] nums2 = {3}; 
        final int[] nums3 = {}; 
        final int[] nums4 = {3, 3, 30, 4}; 
        final int[] nums5 = {2, 19, 4}; 
        final int[] nums6 = {20, 2, 21}; 
        final int[] nums7 = {20, 2, 21, 210}; 
        final int[] nums8 = {2, 200, 2000}; 
        final int[] nums9 = {0, 0}; 
        final int[] nums10 = {1, 2, 3, 4, 5, 6}; 
        final int[] nums11 = {1, 2, 3, 4, 5, 50, 6}; 
        final int[] nums12 = {1, 2, 3, 4, 5, 51, 6}; 
        final int[] nums13 = {1, 2, 3, 4, 4, 50, 500, 6}; 

        final TestResult[] results = {
            new TestResult(nums0, 0),
            new TestResult(nums1, 0),
            new TestResult(nums2, 0),
            new TestResult(nums3, 0),
            new TestResult(nums4, 0),
            new TestResult(nums5, 0),
            new TestResult(nums6, 0),
            new TestResult(nums7, 0),
            new TestResult(nums8, 0),
            new TestResult(nums9, 0),
            new TestResult(nums10, 0),
            new TestResult(nums11, 0),
            new TestResult(nums12, 0),
            new TestResult(nums13, 0),
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
