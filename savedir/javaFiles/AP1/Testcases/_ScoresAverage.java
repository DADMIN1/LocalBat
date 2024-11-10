package AP1.Testcases;
import AP1.ScoresAverage;

public final class _ScoresAverage
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] scores) {
            try { result = ScoresAverage.scoresAverage(scores); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "scoresAverage([2, 2, 4, 4])",
        "scoresAverage([4, 4, 4, 2, 2, 2])",
        "scoresAverage([3, 4, 5, 1, 2, 3])",
        "scoresAverage([5, 6])",
        "scoresAverage([5, 4])",
        "scoresAverage([5, 4, 5, 6, 2, 1, 2, 3])",
    };

    static final int[] expectedResults = {
        4,
        4,
        4,
        6,
        5,
        5,
    };

    public static final boolean Validate()
    {
        final int[] scores0 = {2, 2, 4, 4}; 
        final int[] scores1 = {4, 4, 4, 2, 2, 2}; 
        final int[] scores2 = {3, 4, 5, 1, 2, 3}; 
        final int[] scores3 = {5, 6}; 
        final int[] scores4 = {5, 4}; 
        final int[] scores5 = {5, 4, 5, 6, 2, 1, 2, 3}; 

        final TestResult[] results = {
            new TestResult(scores0),
            new TestResult(scores1),
            new TestResult(scores2),
            new TestResult(scores3),
            new TestResult(scores4),
            new TestResult(scores5),
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
