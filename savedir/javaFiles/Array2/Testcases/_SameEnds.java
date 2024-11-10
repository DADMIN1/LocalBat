package Array2.Testcases;
import Array2.SameEnds;

public final class _SameEnds
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums, int len) {
            try { result = SameEnds.sameEnds(nums, len); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sameEnds([5, 6, 45, 99, 13, 5, 6], 1)",
        "sameEnds([5, 6, 45, 99, 13, 5, 6], 2)",
        "sameEnds([5, 6, 45, 99, 13, 5, 6], 3)",
        "sameEnds([1, 2, 5, 2, 1], 1)",
        "sameEnds([1, 2, 5, 2, 1], 2)",
        "sameEnds([1, 2, 5, 2, 1], 0)",
        "sameEnds([1, 2, 5, 2, 1], 5)",
        "sameEnds([1, 1, 1], 0)",
        "sameEnds([1, 1, 1], 1)",
        "sameEnds([1, 1, 1], 2)",
        "sameEnds([1, 1, 1], 3)",
        "sameEnds([1], 1)",
        "sameEnds([], 0)",
        "sameEnds([4, 2, 4, 5], 1)",
    };

    static final boolean[] expectedResults = {
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        true,
        true,
        true,
        true,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {5, 6, 45, 99, 13, 5, 6}; 
        final int[] nums1 = {5, 6, 45, 99, 13, 5, 6}; 
        final int[] nums2 = {5, 6, 45, 99, 13, 5, 6}; 
        final int[] nums3 = {1, 2, 5, 2, 1}; 
        final int[] nums4 = {1, 2, 5, 2, 1}; 
        final int[] nums5 = {1, 2, 5, 2, 1}; 
        final int[] nums6 = {1, 2, 5, 2, 1}; 
        final int[] nums7 = {1, 1, 1}; 
        final int[] nums8 = {1, 1, 1}; 
        final int[] nums9 = {1, 1, 1}; 
        final int[] nums10 = {1, 1, 1}; 
        final int[] nums11 = {1}; 
        final int[] nums12 = {}; 
        final int[] nums13 = {4, 2, 4, 5}; 

        final TestResult[] results = {
            new TestResult(nums0, 1),
            new TestResult(nums1, 2),
            new TestResult(nums2, 3),
            new TestResult(nums3, 1),
            new TestResult(nums4, 2),
            new TestResult(nums5, 0),
            new TestResult(nums6, 5),
            new TestResult(nums7, 0),
            new TestResult(nums8, 1),
            new TestResult(nums9, 2),
            new TestResult(nums10, 3),
            new TestResult(nums11, 1),
            new TestResult(nums12, 0),
            new TestResult(nums13, 1),
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
