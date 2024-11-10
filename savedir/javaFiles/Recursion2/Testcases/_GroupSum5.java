package Recursion2.Testcases;
import Recursion2.GroupSum5;

public final class _GroupSum5
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int start, int[] nums, int target) {
            try { result = GroupSum5.groupSum5(start, nums, target); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "groupSum5(0, [2, 5, 10, 4], 19)",
        "groupSum5(0, [2, 5, 10, 4], 17)",
        "groupSum5(0, [2, 5, 10, 4], 12)",
        "groupSum5(0, [2, 5, 4, 10], 12)",
        "groupSum5(0, [3, 5, 1], 4)",
        "groupSum5(0, [3, 5, 1], 5)",
        "groupSum5(0, [1, 3, 5], 5)",
        "groupSum5(0, [3, 5, 1], 9)",
        "groupSum5(0, [2, 5, 10, 4], 7)",
        "groupSum5(0, [2, 5, 10, 4], 15)",
        "groupSum5(0, [2, 5, 10, 4], 11)",
        "groupSum5(0, [1], 1)",
        "groupSum5(0, [9], 1)",
        "groupSum5(0, [9], 0)",
        "groupSum5(0, [], 0)",
    };

    static final boolean[] expectedResults = {
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
        false,
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
        final int[] nums3 = {2, 5, 4, 10}; 
        final int[] nums4 = {3, 5, 1}; 
        final int[] nums5 = {3, 5, 1}; 
        final int[] nums6 = {1, 3, 5}; 
        final int[] nums7 = {3, 5, 1}; 
        final int[] nums8 = {2, 5, 10, 4}; 
        final int[] nums9 = {2, 5, 10, 4}; 
        final int[] nums10 = {2, 5, 10, 4}; 
        final int[] nums11 = {1}; 
        final int[] nums12 = {9}; 
        final int[] nums13 = {9}; 
        final int[] nums14 = {}; 

        final TestResult[] results = {
            new TestResult(0, nums0, 19),
            new TestResult(0, nums1, 17),
            new TestResult(0, nums2, 12),
            new TestResult(0, nums3, 12),
            new TestResult(0, nums4, 4),
            new TestResult(0, nums5, 5),
            new TestResult(0, nums6, 5),
            new TestResult(0, nums7, 9),
            new TestResult(0, nums8, 7),
            new TestResult(0, nums9, 15),
            new TestResult(0, nums10, 11),
            new TestResult(0, nums11, 1),
            new TestResult(0, nums12, 1),
            new TestResult(0, nums13, 0),
            new TestResult(0, nums14, 0),
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
