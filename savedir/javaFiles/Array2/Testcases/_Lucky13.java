package Array2.Testcases;
import Array2.Lucky13;

public final class _Lucky13
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = Lucky13.lucky13(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "lucky13([0, 2, 4])",
        "lucky13([1, 2, 3])",
        "lucky13([1, 2, 4])",
        "lucky13([2, 7, 2, 8])",
        "lucky13([2, 7, 1, 8])",
        "lucky13([3, 7, 2, 8])",
        "lucky13([2, 7, 2, 1])",
        "lucky13([1, 2])",
        "lucky13([2, 2])",
        "lucky13([2])",
        "lucky13([3])",
        "lucky13([])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {0, 2, 4}; 
        final int[] nums1 = {1, 2, 3}; 
        final int[] nums2 = {1, 2, 4}; 
        final int[] nums3 = {2, 7, 2, 8}; 
        final int[] nums4 = {2, 7, 1, 8}; 
        final int[] nums5 = {3, 7, 2, 8}; 
        final int[] nums6 = {2, 7, 2, 1}; 
        final int[] nums7 = {1, 2}; 
        final int[] nums8 = {2, 2}; 
        final int[] nums9 = {2}; 
        final int[] nums10 = {3}; 
        final int[] nums11 = {}; 

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
