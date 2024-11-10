package Recursion2.Testcases;
import Recursion2.SplitOdd10;

public final class _SplitOdd10
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = SplitOdd10.splitOdd10(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "splitOdd10([5, 5, 5])",
        "splitOdd10([5, 5, 6])",
        "splitOdd10([5, 5, 6, 1])",
        "splitOdd10([6, 5, 5, 1])",
        "splitOdd10([6, 5, 5, 1, 10])",
        "splitOdd10([6, 5, 5, 5, 1])",
        "splitOdd10([1])",
        "splitOdd10([])",
        "splitOdd10([10, 7, 5, 5])",
        "splitOdd10([10, 0, 5, 5])",
        "splitOdd10([10, 7, 5, 5, 2])",
        "splitOdd10([10, 7, 5, 5, 1])",
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
        false,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {5, 5, 5}; 
        final int[] nums1 = {5, 5, 6}; 
        final int[] nums2 = {5, 5, 6, 1}; 
        final int[] nums3 = {6, 5, 5, 1}; 
        final int[] nums4 = {6, 5, 5, 1, 10}; 
        final int[] nums5 = {6, 5, 5, 5, 1}; 
        final int[] nums6 = {1}; 
        final int[] nums7 = {}; 
        final int[] nums8 = {10, 7, 5, 5}; 
        final int[] nums9 = {10, 0, 5, 5}; 
        final int[] nums10 = {10, 7, 5, 5, 2}; 
        final int[] nums11 = {10, 7, 5, 5, 1}; 

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
