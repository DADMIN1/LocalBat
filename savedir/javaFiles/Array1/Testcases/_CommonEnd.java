package Array1.Testcases;
import Array1.CommonEnd;

public final class _CommonEnd
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] a, int[] b) {
            try { result = CommonEnd.commonEnd(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "commonEnd([1, 2, 3], [7, 3])",
        "commonEnd([1, 2, 3], [7, 3, 2])",
        "commonEnd([1, 2, 3], [1, 3])",
        "commonEnd([1, 2, 3], [1])",
        "commonEnd([1, 2, 3], [2])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final int[] a0 = {1, 2, 3}; final int[] b0 = {7, 3}; 
        final int[] a1 = {1, 2, 3}; final int[] b1 = {7, 3, 2}; 
        final int[] a2 = {1, 2, 3}; final int[] b2 = {1, 3}; 
        final int[] a3 = {1, 2, 3}; final int[] b3 = {1}; 
        final int[] a4 = {1, 2, 3}; final int[] b4 = {2}; 

        final TestResult[] results = {
            new TestResult(a0, b0),
            new TestResult(a1, b1),
            new TestResult(a2, b2),
            new TestResult(a3, b3),
            new TestResult(a4, b4),
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
