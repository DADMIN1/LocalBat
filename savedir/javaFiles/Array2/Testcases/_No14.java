package Array2.Testcases;
import Array2.No14;

public final class _No14
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] nums) {
            try { result = No14.no14(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "no14([1, 2, 3])",
        "no14([1, 2, 3, 4])",
        "no14([2, 3, 4])",
        "no14([1, 1, 4, 4])",
        "no14([2, 2, 4, 4])",
        "no14([2, 3, 4, 1])",
        "no14([2, 1, 1])",
        "no14([1, 4])",
        "no14([2])",
        "no14([2, 1])",
        "no14([1])",
        "no14([4])",
        "no14([])",
        "no14([1, 1, 1, 1])",
        "no14([9, 4, 4, 1])",
        "no14([4, 2, 3, 1])",
        "no14([4, 2, 3, 5])",
        "no14([4, 4, 2])",
        "no14([1, 4, 4])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        true,
        true,
        true,
        false,
        false,
        true,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final int[] nums0 = {1, 2, 3}; 
        final int[] nums1 = {1, 2, 3, 4}; 
        final int[] nums2 = {2, 3, 4}; 
        final int[] nums3 = {1, 1, 4, 4}; 
        final int[] nums4 = {2, 2, 4, 4}; 
        final int[] nums5 = {2, 3, 4, 1}; 
        final int[] nums6 = {2, 1, 1}; 
        final int[] nums7 = {1, 4}; 
        final int[] nums8 = {2}; 
        final int[] nums9 = {2, 1}; 
        final int[] nums10 = {1}; 
        final int[] nums11 = {4}; 
        final int[] nums12 = {}; 
        final int[] nums13 = {1, 1, 1, 1}; 
        final int[] nums14 = {9, 4, 4, 1}; 
        final int[] nums15 = {4, 2, 3, 1}; 
        final int[] nums16 = {4, 2, 3, 5}; 
        final int[] nums17 = {4, 4, 2}; 
        final int[] nums18 = {1, 4, 4}; 

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
            new TestResult(nums16),
            new TestResult(nums17),
            new TestResult(nums18),
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
