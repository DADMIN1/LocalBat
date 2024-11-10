package Array3.Testcases;
import Array3.LinearIn;

public final class _LinearIn
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] outer, int[] inner) {
            try { result = LinearIn.linearIn(outer, inner); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "linearIn([1, 2, 4, 6], [2, 4])",
        "linearIn([1, 2, 4, 6], [2, 3, 4])",
        "linearIn([1, 2, 4, 4, 6], [2, 4])",
        "linearIn([2, 2, 4, 4, 6, 6], [2, 4])",
        "linearIn([2, 2, 2, 2, 2], [2, 2])",
        "linearIn([2, 2, 2, 2, 2], [2, 4])",
        "linearIn([2, 2, 2, 2, 4], [2, 4])",
        "linearIn([1, 2, 3], [2])",
        "linearIn([1, 2, 3], [-1])",
        "linearIn([1, 2, 3], [])",
        "linearIn([-1, 0, 3, 3, 3, 10, 12], [-1, 0, 3, 12])",
        "linearIn([-1, 0, 3, 3, 3, 10, 12], [0, 3, 12, 14])",
        "linearIn([-1, 0, 3, 3, 3, 10, 12], [-1, 10, 11])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
    };

    public static final boolean Validate()
    {
        final int[] outer0 = {1, 2, 4, 6}; final int[] inner0 = {2, 4}; 
        final int[] outer1 = {1, 2, 4, 6}; final int[] inner1 = {2, 3, 4}; 
        final int[] outer2 = {1, 2, 4, 4, 6}; final int[] inner2 = {2, 4}; 
        final int[] outer3 = {2, 2, 4, 4, 6, 6}; final int[] inner3 = {2, 4}; 
        final int[] outer4 = {2, 2, 2, 2, 2}; final int[] inner4 = {2, 2}; 
        final int[] outer5 = {2, 2, 2, 2, 2}; final int[] inner5 = {2, 4}; 
        final int[] outer6 = {2, 2, 2, 2, 4}; final int[] inner6 = {2, 4}; 
        final int[] outer7 = {1, 2, 3}; final int[] inner7 = {2}; 
        final int[] outer8 = {1, 2, 3}; final int[] inner8 = {-1}; 
        final int[] outer9 = {1, 2, 3}; final int[] inner9 = {}; 
        final int[] outer10 = {-1, 0, 3, 3, 3, 10, 12}; final int[] inner10 = {-1, 0, 3, 12}; 
        final int[] outer11 = {-1, 0, 3, 3, 3, 10, 12}; final int[] inner11 = {0, 3, 12, 14}; 
        final int[] outer12 = {-1, 0, 3, 3, 3, 10, 12}; final int[] inner12 = {-1, 10, 11}; 

        final TestResult[] results = {
            new TestResult(outer0, inner0),
            new TestResult(outer1, inner1),
            new TestResult(outer2, inner2),
            new TestResult(outer3, inner3),
            new TestResult(outer4, inner4),
            new TestResult(outer5, inner5),
            new TestResult(outer6, inner6),
            new TestResult(outer7, inner7),
            new TestResult(outer8, inner8),
            new TestResult(outer9, inner9),
            new TestResult(outer10, inner10),
            new TestResult(outer11, inner11),
            new TestResult(outer12, inner12),
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
