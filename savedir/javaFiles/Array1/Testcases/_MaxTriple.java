package Array1.Testcases;
import Array1.MaxTriple;

public final class _MaxTriple
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = MaxTriple.maxTriple(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "maxTriple([1, 2, 3])",
        "maxTriple([1, 5, 3])",
        "maxTriple([5, 2, 3])",
        "maxTriple([1, 2, 3, 1, 1])",
        "maxTriple([1, 7, 3, 1, 5])",
        "maxTriple([5, 1, 3, 7, 1])",
        "maxTriple([5, 1, 7, 3, 7, 8, 1])",
        "maxTriple([5, 1, 7, 9, 7, 8, 1])",
        "maxTriple([5, 1, 7, 3, 7, 8, 9])",
        "maxTriple([2, 2, 5, 1, 1])",
    };

    static final int[] expectedResults = {
        3,
        5,
        5,
        3,
        5,
        5,
        5,
        9,
        9,
        5,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 3}; 
        final int[] nums1 = {1, 5, 3}; 
        final int[] nums2 = {5, 2, 3}; 
        final int[] nums3 = {1, 2, 3, 1, 1}; 
        final int[] nums4 = {1, 7, 3, 1, 5}; 
        final int[] nums5 = {5, 1, 3, 7, 1}; 
        final int[] nums6 = {5, 1, 7, 3, 7, 8, 1}; 
        final int[] nums7 = {5, 1, 7, 9, 7, 8, 1}; 
        final int[] nums8 = {5, 1, 7, 3, 7, 8, 9}; 
        final int[] nums9 = {2, 2, 5, 1, 1}; 

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
