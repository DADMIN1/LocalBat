package Array1.Testcases;
import Array1.Start1;

public final class _Start1
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] a, int[] b) {
            try { result = Start1.start1(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "start1([1, 2, 3], [1, 3])",
        "start1([7, 2, 3], [1])",
        "start1([1, 2], [])",
        "start1([], [1, 2])",
        "start1([7], [])",
        "start1([7], [1])",
        "start1([1], [1])",
        "start1([7], [8])",
        "start1([], [])",
        "start1([1, 3], [1])",
    };

    static final int[] expectedResults = {
        2,
        1,
        1,
        1,
        0,
        1,
        2,
        0,
        0,
        2,
    };

    public static final boolean Validate()
    {
        final int[] a0 = {1, 2, 3}; final int[] b0 = {1, 3}; 
        final int[] a1 = {7, 2, 3}; final int[] b1 = {1}; 
        final int[] a2 = {1, 2}; final int[] b2 = {}; 
        final int[] a3 = {}; final int[] b3 = {1, 2}; 
        final int[] a4 = {7}; final int[] b4 = {}; 
        final int[] a5 = {7}; final int[] b5 = {1}; 
        final int[] a6 = {1}; final int[] b6 = {1}; 
        final int[] a7 = {7}; final int[] b7 = {8}; 
        final int[] a8 = {}; final int[] b8 = {}; 
        final int[] a9 = {1, 3}; final int[] b9 = {1}; 

        final TestResult[] results = {
            new TestResult(a0, b0),
            new TestResult(a1, b1),
            new TestResult(a2, b2),
            new TestResult(a3, b3),
            new TestResult(a4, b4),
            new TestResult(a5, b5),
            new TestResult(a6, b6),
            new TestResult(a7, b7),
            new TestResult(a8, b8),
            new TestResult(a9, b9),
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
