package AP1.Testcases;
import AP1.BigHeights;

public final class _BigHeights
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] heights, int start, int end) {
            try { result = BigHeights.bigHeights(heights, start, end); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "bigHeights([5, 3, 6, 7, 2], 2, 4)",
        "bigHeights([5, 3, 6, 7, 2], 0, 1)",
        "bigHeights([5, 3, 6, 7, 2], 0, 4)",
        "bigHeights([5, 3, 6, 7, 3], 0, 4)",
        "bigHeights([5, 3, 6, 7, 2], 1, 1)",
        "bigHeights([5, 13, 6, 7, 2], 1, 2)",
        "bigHeights([5, 13, 6, 7, 2], 0, 2)",
        "bigHeights([5, 13, 6, 7, 2], 1, 4)",
        "bigHeights([5, 13, 6, 7, 2], 0, 4)",
        "bigHeights([5, 13, 6, 7, 2], 0, 3)",
        "bigHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3)",
        "bigHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 4, 8)",
        "bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 0, 3)",
        "bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 7, 8)",
        "bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 3, 8)",
        "bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 2, 8)",
    };

    static final int[] expectedResults = {
        1,
        0,
        1,
        0,
        0,
        1,
        2,
        2,
        3,
        2,
        0,
        1,
        1,
        1,
        2,
        3,
    };

    public static final boolean Validate()
    {
        final int[] heights0 = {5, 3, 6, 7, 2}; 
        final int[] heights1 = {5, 3, 6, 7, 2}; 
        final int[] heights2 = {5, 3, 6, 7, 2}; 
        final int[] heights3 = {5, 3, 6, 7, 3}; 
        final int[] heights4 = {5, 3, 6, 7, 2}; 
        final int[] heights5 = {5, 13, 6, 7, 2}; 
        final int[] heights6 = {5, 13, 6, 7, 2}; 
        final int[] heights7 = {5, 13, 6, 7, 2}; 
        final int[] heights8 = {5, 13, 6, 7, 2}; 
        final int[] heights9 = {5, 13, 6, 7, 2}; 
        final int[] heights10 = {1, 2, 3, 4, 5, 4, 3, 2, 10}; 
        final int[] heights11 = {1, 2, 3, 4, 5, 4, 3, 2, 10}; 
        final int[] heights12 = {1, 2, 3, 14, 5, 4, 3, 2, 10}; 
        final int[] heights13 = {1, 2, 3, 14, 5, 4, 3, 2, 10}; 
        final int[] heights14 = {1, 2, 3, 14, 5, 4, 3, 2, 10}; 
        final int[] heights15 = {1, 2, 3, 14, 5, 4, 3, 2, 10}; 

        final TestResult[] results = {
            new TestResult(heights0, 2, 4),
            new TestResult(heights1, 0, 1),
            new TestResult(heights2, 0, 4),
            new TestResult(heights3, 0, 4),
            new TestResult(heights4, 1, 1),
            new TestResult(heights5, 1, 2),
            new TestResult(heights6, 0, 2),
            new TestResult(heights7, 1, 4),
            new TestResult(heights8, 0, 4),
            new TestResult(heights9, 0, 3),
            new TestResult(heights10, 0, 3),
            new TestResult(heights11, 4, 8),
            new TestResult(heights12, 0, 3),
            new TestResult(heights13, 7, 8),
            new TestResult(heights14, 3, 8),
            new TestResult(heights15, 2, 8),
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
