package Recursion2.Testcases;
import Recursion2.GroupNoAdj;

public final class _GroupNoAdj
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int start, int[] nums, int target) {
            try { result = GroupNoAdj.groupNoAdj(start, nums, target); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "groupNoAdj(0, [2, 5, 10, 4], 12)",
        "groupNoAdj(0, [2, 5, 10, 4], 14)",
        "groupNoAdj(0, [2, 5, 10, 4], 7)",
        "groupNoAdj(0, [2, 5, 10, 4, 2], 7)",
        "groupNoAdj(0, [2, 5, 10, 4], 9)",
        "groupNoAdj(0, [10, 2, 2, 3, 3], 15)",
        "groupNoAdj(0, [10, 2, 2, 3, 3], 7)",
        "groupNoAdj(0, [], 0)",
        "groupNoAdj(0, [1], 1)",
        "groupNoAdj(0, [9], 1)",
        "groupNoAdj(0, [9], 0)",
        "groupNoAdj(0, [5, 10, 4, 1], 11)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {2, 5, 10, 4}; 
        final int[] nums1 = {2, 5, 10, 4}; 
        final int[] nums2 = {2, 5, 10, 4}; 
        final int[] nums3 = {2, 5, 10, 4, 2}; 
        final int[] nums4 = {2, 5, 10, 4}; 
        final int[] nums5 = {10, 2, 2, 3, 3}; 
        final int[] nums6 = {10, 2, 2, 3, 3}; 
        final int[] nums7 = {}; 
        final int[] nums8 = {1}; 
        final int[] nums9 = {9}; 
        final int[] nums10 = {9}; 
        final int[] nums11 = {5, 10, 4, 1}; 

        final TestResult[] results = {
            new TestResult(0, nums0, 12),
            new TestResult(0, nums1, 14),
            new TestResult(0, nums2, 7),
            new TestResult(0, nums3, 7),
            new TestResult(0, nums4, 9),
            new TestResult(0, nums5, 15),
            new TestResult(0, nums6, 7),
            new TestResult(0, nums7, 0),
            new TestResult(0, nums8, 1),
            new TestResult(0, nums9, 1),
            new TestResult(0, nums10, 0),
            new TestResult(0, nums11, 11),
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
