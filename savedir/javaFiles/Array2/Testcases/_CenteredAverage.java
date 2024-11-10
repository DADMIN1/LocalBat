package Array2.Testcases;
import Array2.CenteredAverage;

public final class _CenteredAverage
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = CenteredAverage.centeredAverage(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "centeredAverage([1, 2, 3, 4, 100])",
        "centeredAverage([1, 1, 5, 5, 10, 8, 7])",
        "centeredAverage([-10, -4, -2, -4, -2, 0])",
        "centeredAverage([5, 3, 4, 6, 2])",
        "centeredAverage([5, 3, 4, 0, 100])",
        "centeredAverage([100, 0, 5, 3, 4])",
        "centeredAverage([4, 0, 100])",
        "centeredAverage([0, 2, 3, 4, 100])",
        "centeredAverage([1, 1, 100])",
        "centeredAverage([7, 7, 7])",
        "centeredAverage([1, 7, 8])",
        "centeredAverage([1, 1, 99, 99])",
        "centeredAverage([1000, 0, 1, 99])",
        "centeredAverage([4, 4, 4, 4, 5])",
        "centeredAverage([4, 4, 4, 1, 5])",
        "centeredAverage([6, 4, 8, 12, 3])",
    };

    static final int[] expectedResults = {
        3,
        5,
        -3,
        4,
        4,
        4,
        4,
        3,
        1,
        7,
        7,
        50,
        50,
        4,
        4,
        6,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 3, 4, 100}; 
        final int[] nums1 = {1, 1, 5, 5, 10, 8, 7}; 
        final int[] nums2 = {-10, -4, -2, -4, -2, 0}; 
        final int[] nums3 = {5, 3, 4, 6, 2}; 
        final int[] nums4 = {5, 3, 4, 0, 100}; 
        final int[] nums5 = {100, 0, 5, 3, 4}; 
        final int[] nums6 = {4, 0, 100}; 
        final int[] nums7 = {0, 2, 3, 4, 100}; 
        final int[] nums8 = {1, 1, 100}; 
        final int[] nums9 = {7, 7, 7}; 
        final int[] nums10 = {1, 7, 8}; 
        final int[] nums11 = {1, 1, 99, 99}; 
        final int[] nums12 = {1000, 0, 1, 99}; 
        final int[] nums13 = {4, 4, 4, 4, 5}; 
        final int[] nums14 = {4, 4, 4, 1, 5}; 
        final int[] nums15 = {6, 4, 8, 12, 3}; 

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
            new TestResult(nums14),
            new TestResult(nums15),
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
