package Array1.Testcases;
import Array1.MakeLast;
import java.util.Arrays;
import java.util.ArrayList;

public final class _MakeLast
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = MakeLast.makeLast(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "makeLast([4, 5, 6])",
        "makeLast([1, 2])",
        "makeLast([3])",
        "makeLast([0])",
        "makeLast([7, 7, 7])",
        "makeLast([3, 1, 4])",
        "makeLast([1, 2, 3, 4])",
        "makeLast([1, 2, 3, 0])",
        "makeLast([2, 4])",
    };

    static final int[][] expectedResults = {
        {0, 0, 0, 0, 0, 6},
        {0, 0, 0, 2},
        {0, 3},
        {0, 0},
        {0, 0, 0, 0, 0, 7},
        {0, 0, 0, 0, 0, 4},
        {0, 0, 0, 0, 0, 0, 0, 4},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 4},
    };

    public static final String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static final boolean Validate()
    {
        final int[] nums0 = {4, 5, 6}; 
        final int[] nums1 = {1, 2}; 
        final int[] nums2 = {3}; 
        final int[] nums3 = {0}; 
        final int[] nums4 = {7, 7, 7}; 
        final int[] nums5 = {3, 1, 4}; 
        final int[] nums6 = {1, 2, 3, 4}; 
        final int[] nums7 = {1, 2, 3, 0}; 
        final int[] nums8 = {2, 4}; 

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
            if (!Arrays.equals(results[i].result, expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[x] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed!");
                System.out.println("    received: "+printArray(results[i].result));
                System.out.println("    expected: "+printArray(expectedResults[i]));
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
