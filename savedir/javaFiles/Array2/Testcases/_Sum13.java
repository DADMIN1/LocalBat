package Array2.Testcases;
import Array2.Sum13;

public final class _Sum13
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = Sum13.sum13(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sum13([1, 2, 2, 1])",
        "sum13([1, 1])",
        "sum13([1, 2, 2, 1, 13])",
        "sum13([1, 2, 13, 2, 1, 13])",
        "sum13([13, 1, 2, 13, 2, 1, 13])",
        "sum13([])",
        "sum13([13])",
        "sum13([13, 13])",
        "sum13([13, 0, 13])",
        "sum13([13, 1, 13])",
        "sum13([5, 7, 2])",
        "sum13([5, 13, 2])",
        "sum13([0])",
        "sum13([13, 0])",
    };

    static final int[] expectedResults = {
        6,
        2,
        6,
        4,
        3,
        0,
        0,
        0,
        0,
        0,
        14,
        5,
        0,
        0,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 2, 1}; 
        final int[] nums1 = {1, 1}; 
        final int[] nums2 = {1, 2, 2, 1, 13}; 
        final int[] nums3 = {1, 2, 13, 2, 1, 13}; 
        final int[] nums4 = {13, 1, 2, 13, 2, 1, 13}; 
        final int[] nums5 = {}; 
        final int[] nums6 = {13}; 
        final int[] nums7 = {13, 13}; 
        final int[] nums8 = {13, 0, 13}; 
        final int[] nums9 = {13, 1, 13}; 
        final int[] nums10 = {5, 7, 2}; 
        final int[] nums11 = {5, 13, 2}; 
        final int[] nums12 = {0}; 
        final int[] nums13 = {13, 0}; 

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
