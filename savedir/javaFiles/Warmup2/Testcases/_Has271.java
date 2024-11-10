package Warmup2.Testcases;
import Warmup2.Has271;

public final class _Has271
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = Has271.has271(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "has271([1, 2, 7, 1])",
        "has271([1, 2, 8, 1])",
        "has271([2, 7, 1])",
        "has271([3, 8, 2])",
        "has271([2, 7, 3])",
        "has271([2, 7, 4])",
        "has271([2, 7, -1])",
        "has271([2, 7, -2])",
        "has271([4, 5, 3, 8, 0])",
        "has271([2, 7, 5, 10, 4])",
        "has271([2, 7, -2, 4, 9, 3])",
        "has271([2, 7, 5, 10, 1])",
        "has271([2, 7, -2, 4, 10, 2])",
        "has271([1, 1, 4, 9, 0])",
        "has271([1, 1, 4, 9, 4, 9, 2])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
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
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 7, 1}; 
        final int[] nums1 = {1, 2, 8, 1}; 
        final int[] nums2 = {2, 7, 1}; 
        final int[] nums3 = {3, 8, 2}; 
        final int[] nums4 = {2, 7, 3}; 
        final int[] nums5 = {2, 7, 4}; 
        final int[] nums6 = {2, 7, -1}; 
        final int[] nums7 = {2, 7, -2}; 
        final int[] nums8 = {4, 5, 3, 8, 0}; 
        final int[] nums9 = {2, 7, 5, 10, 4}; 
        final int[] nums10 = {2, 7, -2, 4, 9, 3}; 
        final int[] nums11 = {2, 7, 5, 10, 1}; 
        final int[] nums12 = {2, 7, -2, 4, 10, 2}; 
        final int[] nums13 = {1, 1, 4, 9, 0}; 
        final int[] nums14 = {1, 1, 4, 9, 4, 9, 2}; 

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
            new TestResult(nums14),
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
