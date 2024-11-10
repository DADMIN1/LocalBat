package Array2.Testcases;
import Array2.Either24;

public final class _Either24
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = Either24.either24(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "either24([1, 2, 2])",
        "either24([4, 4, 1])",
        "either24([4, 4, 1, 2, 2])",
        "either24([1, 2, 3, 4])",
        "either24([3, 5, 9])",
        "either24([1, 2, 3, 4, 4])",
        "either24([2, 2, 3, 4])",
        "either24([1, 2, 3, 2, 2, 4])",
        "either24([1, 2, 3, 2, 2, 4, 4])",
        "either24([1, 2])",
        "either24([2, 2])",
        "either24([4, 4])",
        "either24([2])",
        "either24([])",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        false,
        true,
        true,
        true,
        false,
        false,
        true,
        true,
        false,
        false,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 2}; 
        final int[] nums1 = {4, 4, 1}; 
        final int[] nums2 = {4, 4, 1, 2, 2}; 
        final int[] nums3 = {1, 2, 3, 4}; 
        final int[] nums4 = {3, 5, 9}; 
        final int[] nums5 = {1, 2, 3, 4, 4}; 
        final int[] nums6 = {2, 2, 3, 4}; 
        final int[] nums7 = {1, 2, 3, 2, 2, 4}; 
        final int[] nums8 = {1, 2, 3, 2, 2, 4, 4}; 
        final int[] nums9 = {1, 2}; 
        final int[] nums10 = {2, 2}; 
        final int[] nums11 = {4, 4}; 
        final int[] nums12 = {2}; 
        final int[] nums13 = {}; 

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
