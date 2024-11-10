package Warmup2.Testcases;
import Warmup2.Array667;

public final class _Array667
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = Array667.array667(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "array667([6, 6, 2])",
        "array667([6, 6, 2, 6])",
        "array667([6, 7, 2, 6])",
        "array667([6, 6, 2, 6, 7])",
        "array667([1, 6, 3])",
        "array667([6, 1])",
        "array667([])",
        "array667([3, 6, 7, 6])",
        "array667([3, 6, 6, 7])",
        "array667([6, 3, 6, 6])",
        "array667([6, 7, 6, 6])",
        "array667([1, 2, 3, 5, 6])",
        "array667([1, 2, 3, 6, 6])",
    };

    static final int[] expectedResults = {
        1,
        1,
        1,
        2,
        0,
        0,
        0,
        1,
        2,
        1,
        2,
        0,
        1,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {6, 6, 2}; 
        final int[] nums1 = {6, 6, 2, 6}; 
        final int[] nums2 = {6, 7, 2, 6}; 
        final int[] nums3 = {6, 6, 2, 6, 7}; 
        final int[] nums4 = {1, 6, 3}; 
        final int[] nums5 = {6, 1}; 
        final int[] nums6 = {}; 
        final int[] nums7 = {3, 6, 7, 6}; 
        final int[] nums8 = {3, 6, 6, 7}; 
        final int[] nums9 = {6, 3, 6, 6}; 
        final int[] nums10 = {6, 7, 6, 6}; 
        final int[] nums11 = {1, 2, 3, 5, 6}; 
        final int[] nums12 = {1, 2, 3, 6, 6}; 

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
