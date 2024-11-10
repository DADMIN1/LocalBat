package Array3.Testcases;
import Array3.MaxSpan;

public final class _MaxSpan
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = MaxSpan.maxSpan(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "maxSpan([1, 2, 1, 1, 3])",
        "maxSpan([1, 4, 2, 1, 4, 1, 4])",
        "maxSpan([1, 4, 2, 1, 4, 4, 4])",
        "maxSpan([3, 3, 3])",
        "maxSpan([3, 9, 3])",
        "maxSpan([3, 9, 9])",
        "maxSpan([3, 9])",
        "maxSpan([3, 3])",
        "maxSpan([])",
        "maxSpan([1])",
    };

    static final int[] expectedResults = {
        4,
        6,
        6,
        3,
        3,
        2,
        1,
        2,
        0,
        1,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 1, 1, 3}; 
        final int[] nums1 = {1, 4, 2, 1, 4, 1, 4}; 
        final int[] nums2 = {1, 4, 2, 1, 4, 4, 4}; 
        final int[] nums3 = {3, 3, 3}; 
        final int[] nums4 = {3, 9, 3}; 
        final int[] nums5 = {3, 9, 9}; 
        final int[] nums6 = {3, 9}; 
        final int[] nums7 = {3, 3}; 
        final int[] nums8 = {}; 
        final int[] nums9 = {1}; 

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
