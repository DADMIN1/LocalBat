package Recursion2.Testcases;
import Recursion2.GroupSum6;

public final class _GroupSum6
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int start, int[] nums, int target) {
            try { result = GroupSum6.groupSum6(start, nums, target); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "groupSum6(0, [5, 6, 2], 8)",
        "groupSum6(0, [5, 6, 2], 9)",
        "groupSum6(0, [5, 6, 2], 7)",
        "groupSum6(0, [1], 1)",
        "groupSum6(0, [9], 1)",
        "groupSum6(0, [], 0)",
        "groupSum6(0, [3, 2, 4, 6], 8)",
        "groupSum6(0, [6, 2, 4, 3], 8)",
        "groupSum6(0, [5, 2, 4, 6], 9)",
        "groupSum6(0, [6, 2, 4, 5], 9)",
        "groupSum6(0, [3, 2, 4, 6], 3)",
        "groupSum6(0, [1, 6, 2, 6, 4], 12)",
        "groupSum6(0, [1, 6, 2, 6, 4], 13)",
        "groupSum6(0, [1, 6, 2, 6, 4], 4)",
        "groupSum6(0, [1, 6, 2, 6, 4], 9)",
        "groupSum6(0, [1, 6, 2, 6, 5], 14)",
        "groupSum6(0, [1, 6, 2, 6, 5], 15)",
        "groupSum6(0, [1, 6, 2, 6, 5], 16)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        false,
        true,
        true,
        true,
        false,
        false,
        false,
        true,
        true,
        false,
        false,
        true,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {5, 6, 2}; 
        final int[] nums1 = {5, 6, 2}; 
        final int[] nums2 = {5, 6, 2}; 
        final int[] nums3 = {1}; 
        final int[] nums4 = {9}; 
        final int[] nums5 = {}; 
        final int[] nums6 = {3, 2, 4, 6}; 
        final int[] nums7 = {6, 2, 4, 3}; 
        final int[] nums8 = {5, 2, 4, 6}; 
        final int[] nums9 = {6, 2, 4, 5}; 
        final int[] nums10 = {3, 2, 4, 6}; 
        final int[] nums11 = {1, 6, 2, 6, 4}; 
        final int[] nums12 = {1, 6, 2, 6, 4}; 
        final int[] nums13 = {1, 6, 2, 6, 4}; 
        final int[] nums14 = {1, 6, 2, 6, 4}; 
        final int[] nums15 = {1, 6, 2, 6, 5}; 
        final int[] nums16 = {1, 6, 2, 6, 5}; 
        final int[] nums17 = {1, 6, 2, 6, 5}; 

        final TestResult[] results = {
            new TestResult(0, nums0, 8),
            new TestResult(0, nums1, 9),
            new TestResult(0, nums2, 7),
            new TestResult(0, nums3, 1),
            new TestResult(0, nums4, 1),
            new TestResult(0, nums5, 0),
            new TestResult(0, nums6, 8),
            new TestResult(0, nums7, 8),
            new TestResult(0, nums8, 9),
            new TestResult(0, nums9, 9),
            new TestResult(0, nums10, 3),
            new TestResult(0, nums11, 12),
            new TestResult(0, nums12, 13),
            new TestResult(0, nums13, 4),
            new TestResult(0, nums14, 9),
            new TestResult(0, nums15, 14),
            new TestResult(0, nums16, 15),
            new TestResult(0, nums17, 16),
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
