package Recursion1.Testcases;
import Recursion1.Array11;

public final class _Array11
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums, int index) {
            try { result = Array11.array11(nums, index); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "array11([1, 2, 11], 0)",
        "array11([11, 11], 0)",
        "array11([1, 2, 3, 4], 0)",
        "array11([1, 11, 3, 11, 11], 0)",
        "array11([11], 0)",
        "array11([1], 0)",
        "array11([], 0)",
        "array11([11, 2, 3, 4, 11, 5], 0)",
        "array11([11, 5, 11], 0)",
    };

    static final int[] expectedResults = {
        1,
        2,
        0,
        3,
        1,
        0,
        0,
        2,
        2,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 11}; 
        final int[] nums1 = {11, 11}; 
        final int[] nums2 = {1, 2, 3, 4}; 
        final int[] nums3 = {1, 11, 3, 11, 11}; 
        final int[] nums4 = {11}; 
        final int[] nums5 = {1}; 
        final int[] nums6 = {}; 
        final int[] nums7 = {11, 2, 3, 4, 11, 5}; 
        final int[] nums8 = {11, 5, 11}; 

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
