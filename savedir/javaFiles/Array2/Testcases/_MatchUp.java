package Array2.Testcases;
import Array2.MatchUp;

public final class _MatchUp
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] nums1, int[] nums2) {
            try { result = MatchUp.matchUp(nums1, nums2); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "matchUp([1, 2, 3], [2, 3, 10])",
        "matchUp([1, 2, 3], [2, 3, 5])",
        "matchUp([1, 2, 3], [2, 3, 3])",
        "matchUp([5, 3], [5, 5])",
        "matchUp([5, 3], [4, 4])",
        "matchUp([5, 3], [3, 3])",
        "matchUp([5, 3], [2, 2])",
        "matchUp([5, 3], [1, 1])",
        "matchUp([5, 3], [0, 0])",
        "matchUp([4], [4])",
        "matchUp([4], [5])",
    };

    static final int[] expectedResults = {
        2,
        3,
        2,
        1,
        2,
        1,
        1,
        1,
        0,
        0,
        1,
    };

    public static final boolean Validate()
    {
        final int[] nums10 = {1, 2, 3}; final int[] nums20 = {2, 3, 10}; 
        final int[] nums11 = {1, 2, 3}; final int[] nums21 = {2, 3, 5}; 
        final int[] nums12 = {1, 2, 3}; final int[] nums22 = {2, 3, 3}; 
        final int[] nums13 = {5, 3}; final int[] nums23 = {5, 5}; 
        final int[] nums14 = {5, 3}; final int[] nums24 = {4, 4}; 
        final int[] nums15 = {5, 3}; final int[] nums25 = {3, 3}; 
        final int[] nums16 = {5, 3}; final int[] nums26 = {2, 2}; 
        final int[] nums17 = {5, 3}; final int[] nums27 = {1, 1}; 
        final int[] nums18 = {5, 3}; final int[] nums28 = {0, 0}; 
        final int[] nums19 = {4}; final int[] nums29 = {4}; 
        final int[] nums110 = {4}; final int[] nums210 = {5}; 

        final TestResult[] results = {
            new TestResult(nums10, nums20),
            new TestResult(nums11, nums21),
            new TestResult(nums12, nums22),
            new TestResult(nums13, nums23),
            new TestResult(nums14, nums24),
            new TestResult(nums15, nums25),
            new TestResult(nums16, nums26),
            new TestResult(nums17, nums27),
            new TestResult(nums18, nums28),
            new TestResult(nums19, nums29),
            new TestResult(nums110, nums210),
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
