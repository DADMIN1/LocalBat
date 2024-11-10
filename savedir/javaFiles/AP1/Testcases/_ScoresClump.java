package AP1.Testcases;
import AP1.ScoresClump;

public final class _ScoresClump
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] scores) {
            try { result = ScoresClump.scoresClump(scores); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "scoresClump([3, 4, 5])",
        "scoresClump([3, 4, 6])",
        "scoresClump([1, 3, 5, 5])",
        "scoresClump([2, 4, 5, 6])",
        "scoresClump([2, 4, 5, 7])",
        "scoresClump([2, 4, 4, 7])",
        "scoresClump([3, 3, 6, 7, 9])",
        "scoresClump([3, 3, 7, 7, 9])",
        "scoresClump([4, 5, 8])",
    };

    static final boolean[] expectedResults = {
        true,
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
        final int[] scores0 = {3, 4, 5}; 
        final int[] scores1 = {3, 4, 6}; 
        final int[] scores2 = {1, 3, 5, 5}; 
        final int[] scores3 = {2, 4, 5, 6}; 
        final int[] scores4 = {2, 4, 5, 7}; 
        final int[] scores5 = {2, 4, 4, 7}; 
        final int[] scores6 = {3, 3, 6, 7, 9}; 
        final int[] scores7 = {3, 3, 7, 7, 9}; 
        final int[] scores8 = {4, 5, 8}; 

        final TestResult[] results = {
            new TestResult(scores0),
            new TestResult(scores1),
            new TestResult(scores2),
            new TestResult(scores3),
            new TestResult(scores4),
            new TestResult(scores5),
            new TestResult(scores6),
            new TestResult(scores7),
            new TestResult(scores8),
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
