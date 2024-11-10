package Array2.Testcases;
import Array2.Sum28;

public final class _Sum28
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = Sum28.sum28(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sum28([2, 3, 2, 2, 4, 2])",
        "sum28([2, 3, 2, 2, 4, 2, 2])",
        "sum28([1, 2, 3, 4])",
        "sum28([2, 2, 2, 2])",
        "sum28([1, 2, 2, 2, 2, 4])",
        "sum28([])",
        "sum28([2])",
        "sum28([8])",
        "sum28([2, 2, 2])",
        "sum28([2, 2, 2, 2, 2])",
        "sum28([1, 2, 2, 1, 2, 2])",
        "sum28([5, 2, 2, 2, 4, 2])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {2, 3, 2, 2, 4, 2}; 
        final int[] nums1 = {2, 3, 2, 2, 4, 2, 2}; 
        final int[] nums2 = {1, 2, 3, 4}; 
        final int[] nums3 = {2, 2, 2, 2}; 
        final int[] nums4 = {1, 2, 2, 2, 2, 4}; 
        final int[] nums5 = {}; 
        final int[] nums6 = {2}; 
        final int[] nums7 = {8}; 
        final int[] nums8 = {2, 2, 2}; 
        final int[] nums9 = {2, 2, 2, 2, 2}; 
        final int[] nums10 = {1, 2, 2, 1, 2, 2}; 
        final int[] nums11 = {5, 2, 2, 2, 4, 2}; 

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
