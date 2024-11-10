package Array1.Testcases;
import Array1.FirstLast6;

public final class _FirstLast6
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = FirstLast6.firstLast6(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "firstLast6([1, 2, 6])",
        "firstLast6([6, 1, 2, 3])",
        "firstLast6([13, 6, 1, 2, 3])",
        "firstLast6([13, 6, 1, 2, 6])",
        "firstLast6([3, 2, 1])",
        "firstLast6([3, 6, 1])",
        "firstLast6([3, 6])",
        "firstLast6([6])",
        "firstLast6([3])",
        "firstLast6([5, 6])",
        "firstLast6([5, 5])",
        "firstLast6([1, 2, 3, 4, 6])",
        "firstLast6([1, 2, 3, 4])",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 6}; 
        final int[] nums1 = {6, 1, 2, 3}; 
        final int[] nums2 = {13, 6, 1, 2, 3}; 
        final int[] nums3 = {13, 6, 1, 2, 6}; 
        final int[] nums4 = {3, 2, 1}; 
        final int[] nums5 = {3, 6, 1}; 
        final int[] nums6 = {3, 6}; 
        final int[] nums7 = {6}; 
        final int[] nums8 = {3}; 
        final int[] nums9 = {5, 6}; 
        final int[] nums10 = {5, 5}; 
        final int[] nums11 = {1, 2, 3, 4, 6}; 
        final int[] nums12 = {1, 2, 3, 4}; 

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
