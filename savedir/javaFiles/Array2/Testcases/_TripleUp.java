package Array2.Testcases;
import Array2.TripleUp;

public final class _TripleUp
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = TripleUp.tripleUp(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "tripleUp([1, 4, 5, 6, 2])",
        "tripleUp([1, 2, 3])",
        "tripleUp([1, 2, 4])",
        "tripleUp([1, 2, 4, 5, 7, 6, 5, 6, 7, 6])",
        "tripleUp([1, 2, 4, 5, 7, 6, 5, 7, 7, 6])",
        "tripleUp([1, 2])",
        "tripleUp([1])",
        "tripleUp([])",
        "tripleUp([10, 9, 8, -100, -99, -98, 100])",
        "tripleUp([10, 9, 8, -100, -99, 99, 100])",
        "tripleUp([-100, -99, -99, 100, 101, 102])",
        "tripleUp([2, 3, 5, 6, 8, 9, 2, 3])",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        false,
        false,
        false,
        true,
        false,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 4, 5, 6, 2}; 
        final int[] nums1 = {1, 2, 3}; 
        final int[] nums2 = {1, 2, 4}; 
        final int[] nums3 = {1, 2, 4, 5, 7, 6, 5, 6, 7, 6}; 
        final int[] nums4 = {1, 2, 4, 5, 7, 6, 5, 7, 7, 6}; 
        final int[] nums5 = {1, 2}; 
        final int[] nums6 = {1}; 
        final int[] nums7 = {}; 
        final int[] nums8 = {10, 9, 8, -100, -99, -98, 100}; 
        final int[] nums9 = {10, 9, 8, -100, -99, 99, 100}; 
        final int[] nums10 = {-100, -99, -99, 100, 101, 102}; 
        final int[] nums11 = {2, 3, 5, 6, 8, 9, 2, 3}; 

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
