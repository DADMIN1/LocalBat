package Array2.Testcases;
import Array2.BigDiff;

public final class _BigDiff
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = BigDiff.bigDiff(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "bigDiff([10, 3, 5, 6])",
        "bigDiff([7, 2, 10, 9])",
        "bigDiff([2, 10, 7, 2])",
        "bigDiff([2, 10])",
        "bigDiff([10, 2])",
        "bigDiff([10, 0])",
        "bigDiff([2, 3])",
        "bigDiff([2, 2])",
        "bigDiff([2])",
        "bigDiff([5, 1, 6, 1, 9, 9])",
        "bigDiff([7, 6, 8, 5])",
        "bigDiff([7, 7, 6, 8, 5, 5, 6])",
    };

    static final int[] expectedResults = {
        7,
        8,
        8,
        8,
        8,
        10,
        1,
        0,
        0,
        8,
        3,
        3,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {10, 3, 5, 6}; 
        final int[] nums1 = {7, 2, 10, 9}; 
        final int[] nums2 = {2, 10, 7, 2}; 
        final int[] nums3 = {2, 10}; 
        final int[] nums4 = {10, 2}; 
        final int[] nums5 = {10, 0}; 
        final int[] nums6 = {2, 3}; 
        final int[] nums7 = {2, 2}; 
        final int[] nums8 = {2}; 
        final int[] nums9 = {5, 1, 6, 1, 9, 9}; 
        final int[] nums10 = {7, 6, 8, 5}; 
        final int[] nums11 = {7, 7, 6, 8, 5, 5, 6}; 

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
