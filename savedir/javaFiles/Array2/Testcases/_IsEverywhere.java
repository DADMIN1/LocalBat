package Array2.Testcases;
import Array2.IsEverywhere;

public final class _IsEverywhere
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums, int val) {
            try { result = IsEverywhere.isEverywhere(nums, val); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "isEverywhere([1, 2, 1, 3], 1)",
        "isEverywhere([1, 2, 1, 3], 2)",
        "isEverywhere([1, 2, 1, 3, 4], 1)",
        "isEverywhere([2, 1, 2, 1], 1)",
        "isEverywhere([2, 1, 2, 1], 2)",
        "isEverywhere([2, 1, 2, 3, 1], 2)",
        "isEverywhere([3, 1], 3)",
        "isEverywhere([3, 1], 2)",
        "isEverywhere([3], 1)",
        "isEverywhere([], 1)",
        "isEverywhere([1, 2, 1, 2, 3, 2, 5], 2)",
        "isEverywhere([1, 2, 1, 1, 1, 2], 2)",
        "isEverywhere([2, 1, 2, 1, 1, 2], 2)",
        "isEverywhere([2, 1, 2, 2, 2, 1, 1, 2], 2)",
        "isEverywhere([2, 1, 2, 2, 2, 1, 2, 1], 2)",
        "isEverywhere([2, 1, 2, 1, 2], 2)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
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
        true,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 1, 3}; 
        final int[] nums1 = {1, 2, 1, 3}; 
        final int[] nums2 = {1, 2, 1, 3, 4}; 
        final int[] nums3 = {2, 1, 2, 1}; 
        final int[] nums4 = {2, 1, 2, 1}; 
        final int[] nums5 = {2, 1, 2, 3, 1}; 
        final int[] nums6 = {3, 1}; 
        final int[] nums7 = {3, 1}; 
        final int[] nums8 = {3}; 
        final int[] nums9 = {}; 
        final int[] nums10 = {1, 2, 1, 2, 3, 2, 5}; 
        final int[] nums11 = {1, 2, 1, 1, 1, 2}; 
        final int[] nums12 = {2, 1, 2, 1, 1, 2}; 
        final int[] nums13 = {2, 1, 2, 2, 2, 1, 1, 2}; 
        final int[] nums14 = {2, 1, 2, 2, 2, 1, 2, 1}; 
        final int[] nums15 = {2, 1, 2, 1, 2}; 

        final TestResult[] results = {
            new TestResult(nums0, 1),
            new TestResult(nums1, 2),
            new TestResult(nums2, 1),
            new TestResult(nums3, 1),
            new TestResult(nums4, 2),
            new TestResult(nums5, 2),
            new TestResult(nums6, 3),
            new TestResult(nums7, 2),
            new TestResult(nums8, 1),
            new TestResult(nums9, 1),
            new TestResult(nums10, 2),
            new TestResult(nums11, 2),
            new TestResult(nums12, 2),
            new TestResult(nums13, 2),
            new TestResult(nums14, 2),
            new TestResult(nums15, 2),
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
