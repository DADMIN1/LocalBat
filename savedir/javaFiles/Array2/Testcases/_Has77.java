package Array2.Testcases;
import Array2.Has77;

public final class _Has77
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = Has77.has77(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "has77([1, 7, 7])",
        "has77([1, 7, 1, 7])",
        "has77([1, 7, 1, 1, 7])",
        "has77([7, 7, 1, 1, 7])",
        "has77([2, 7, 2, 2, 7, 2])",
        "has77([2, 7, 2, 2, 7, 7])",
        "has77([7, 2, 7, 2, 2, 7])",
        "has77([7, 2, 6, 2, 2, 7])",
        "has77([7, 7, 7])",
        "has77([7, 1, 7])",
        "has77([7, 1, 1])",
        "has77([1, 2])",
        "has77([1, 7])",
        "has77([7])",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 7, 7}; 
        final int[] nums1 = {1, 7, 1, 7}; 
        final int[] nums2 = {1, 7, 1, 1, 7}; 
        final int[] nums3 = {7, 7, 1, 1, 7}; 
        final int[] nums4 = {2, 7, 2, 2, 7, 2}; 
        final int[] nums5 = {2, 7, 2, 2, 7, 7}; 
        final int[] nums6 = {7, 2, 7, 2, 2, 7}; 
        final int[] nums7 = {7, 2, 6, 2, 2, 7}; 
        final int[] nums8 = {7, 7, 7}; 
        final int[] nums9 = {7, 1, 7}; 
        final int[] nums10 = {7, 1, 1}; 
        final int[] nums11 = {1, 2}; 
        final int[] nums12 = {1, 7}; 
        final int[] nums13 = {7}; 

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
