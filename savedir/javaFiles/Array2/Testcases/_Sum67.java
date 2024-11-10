package Array2.Testcases;
import Array2.Sum67;

public final class _Sum67
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = Sum67.sum67(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sum67([1, 2, 2])",
        "sum67([1, 2, 2, 6, 99, 99, 7])",
        "sum67([1, 1, 6, 7, 2])",
        "sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7])",
        "sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7])",
        "sum67([2, 7, 6, 2, 6, 7, 2, 7])",
        "sum67([2, 7, 6, 2, 6, 2, 7])",
        "sum67([1, 6, 7, 7])",
        "sum67([6, 7, 1, 6, 7, 7])",
        "sum67([6, 8, 1, 6, 7])",
        "sum67([])",
        "sum67([6, 7, 11])",
        "sum67([11, 6, 7, 11])",
        "sum67([2, 2, 6, 7, 7])",
    };

    static final int[] expectedResults = {
        5,
        5,
        4,
        2,
        2,
        18,
        9,
        8,
        8,
        0,
        0,
        11,
        22,
        11,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 2}; 
        final int[] nums1 = {1, 2, 2, 6, 99, 99, 7}; 
        final int[] nums2 = {1, 1, 6, 7, 2}; 
        final int[] nums3 = {1, 6, 2, 2, 7, 1, 6, 99, 99, 7}; 
        final int[] nums4 = {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}; 
        final int[] nums5 = {2, 7, 6, 2, 6, 7, 2, 7}; 
        final int[] nums6 = {2, 7, 6, 2, 6, 2, 7}; 
        final int[] nums7 = {1, 6, 7, 7}; 
        final int[] nums8 = {6, 7, 1, 6, 7, 7}; 
        final int[] nums9 = {6, 8, 1, 6, 7}; 
        final int[] nums10 = {}; 
        final int[] nums11 = {6, 7, 11}; 
        final int[] nums12 = {11, 6, 7, 11}; 
        final int[] nums13 = {2, 2, 6, 7, 7}; 

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
