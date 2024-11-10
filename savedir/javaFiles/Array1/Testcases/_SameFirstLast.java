package Array1.Testcases;
import Array1.SameFirstLast;

public final class _SameFirstLast
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = SameFirstLast.sameFirstLast(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sameFirstLast([1, 2, 3])",
        "sameFirstLast([1, 2, 3, 1])",
        "sameFirstLast([1, 2, 1])",
        "sameFirstLast([7])",
        "sameFirstLast([])",
        "sameFirstLast([1, 2, 3, 4, 5, 1])",
        "sameFirstLast([1, 2, 3, 4, 5, 13])",
        "sameFirstLast([13, 2, 3, 4, 5, 13])",
        "sameFirstLast([7, 7])",
    };

    static final boolean[] expectedResults = {
        false,
        true,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 3}; 
        final int[] nums1 = {1, 2, 3, 1}; 
        final int[] nums2 = {1, 2, 1}; 
        final int[] nums3 = {7}; 
        final int[] nums4 = {}; 
        final int[] nums5 = {1, 2, 3, 4, 5, 1}; 
        final int[] nums6 = {1, 2, 3, 4, 5, 13}; 
        final int[] nums7 = {13, 2, 3, 4, 5, 13}; 
        final int[] nums8 = {7, 7}; 

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
