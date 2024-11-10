package Recursion2.Testcases;
import Recursion2.GroupSum;

public final class _GroupSum
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int start, int[] nums, int target) {
            try { result = GroupSum.groupSum(start, nums, target); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "groupSum(0, [2, 4, 8], 10)",
        "groupSum(0, [2, 4, 8], 14)",
        "groupSum(0, [2, 4, 8], 9)",
        "groupSum(0, [2, 4, 8], 8)",
        "groupSum(1, [2, 4, 8], 8)",
        "groupSum(1, [2, 4, 8], 2)",
        "groupSum(0, [1], 1)",
        "groupSum(0, [9], 1)",
        "groupSum(1, [9], 0)",
        "groupSum(0, [], 0)",
        "groupSum(0, [10, 2, 2, 5], 17)",
        "groupSum(0, [10, 2, 2, 5], 15)",
        "groupSum(0, [10, 2, 2, 5], 9)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {2, 4, 8}; 
        final int[] nums1 = {2, 4, 8}; 
        final int[] nums2 = {2, 4, 8}; 
        final int[] nums3 = {2, 4, 8}; 
        final int[] nums4 = {2, 4, 8}; 
        final int[] nums5 = {2, 4, 8}; 
        final int[] nums6 = {1}; 
        final int[] nums7 = {9}; 
        final int[] nums8 = {9}; 
        final int[] nums9 = {}; 
        final int[] nums10 = {10, 2, 2, 5}; 
        final int[] nums11 = {10, 2, 2, 5}; 
        final int[] nums12 = {10, 2, 2, 5}; 

        final TestResult[] results = {
            new TestResult(0, nums0, 10),
            new TestResult(0, nums1, 14),
            new TestResult(0, nums2, 9),
            new TestResult(0, nums3, 8),
            new TestResult(1, nums4, 8),
            new TestResult(1, nums5, 2),
            new TestResult(0, nums6, 1),
            new TestResult(0, nums7, 1),
            new TestResult(1, nums8, 0),
            new TestResult(0, nums9, 0),
            new TestResult(0, nums10, 17),
            new TestResult(0, nums11, 15),
            new TestResult(0, nums12, 9),
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
