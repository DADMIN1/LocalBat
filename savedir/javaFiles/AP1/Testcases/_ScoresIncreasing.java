package AP1.Testcases;
import AP1.ScoresIncreasing;

public final class _ScoresIncreasing
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] scores) {
            try { result = ScoresIncreasing.scoresIncreasing(scores); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "scoresIncreasing([1, 3, 4])",
        "scoresIncreasing([1, 3, 2])",
        "scoresIncreasing([1, 1, 4])",
        "scoresIncreasing([1, 1, 2, 4, 4, 7])",
        "scoresIncreasing([1, 1, 2, 4, 3, 7])",
        "scoresIncreasing([-5, 4, 11])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final int[] scores0 = {1, 3, 4}; 
        final int[] scores1 = {1, 3, 2}; 
        final int[] scores2 = {1, 1, 4}; 
        final int[] scores3 = {1, 1, 2, 4, 4, 7}; 
        final int[] scores4 = {1, 1, 2, 4, 3, 7}; 
        final int[] scores5 = {-5, 4, 11}; 

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
