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
        "\u001b[3;90mscoresClump\u001B[0;90m(\u001b[0;1m[3, 4, 5]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoresClump\u001B[0;90m(\u001b[0;1m[3, 4, 6]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoresClump\u001B[0;90m(\u001b[0;1m[1, 3, 5, 5]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoresClump\u001B[0;90m(\u001b[0;1m[2, 4, 5, 6]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoresClump\u001B[0;90m(\u001b[0;1m[2, 4, 5, 7]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoresClump\u001B[0;90m(\u001b[0;1m[2, 4, 4, 7]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoresClump\u001B[0;90m(\u001b[0;1m[3, 3, 6, 7, 9]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoresClump\u001B[0;90m(\u001b[0;1m[3, 3, 7, 7, 9]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoresClump\u001B[0;90m(\u001b[0;1m[4, 5, 8]\u001B[0m\u001b[90m)",
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

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[!]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[3;91;1mFailed!\u001B[0;91;1m \u001b[40;7m[EXCEPTION]\u001B[0m");
                System.out.println("\u001b[91;40;1m    "+results[i].caught.getClass().getName());
                System.out.println("\u001b[0;93;40m    "+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("\u001b[90;3m    ");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("\u001b[0m\u001B[0m"); continue;
            }
            if (results[i].result != expectedResults[i]) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[92;1m[✓] \u001B[0m\u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n \u001b[92;1m✓✓✓\u001B[0;1m\u001b[96;40m  ~  All tests passed  ~  \u001B[0m\u001b[92;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[92;1;40m "+successCount+"\u001B[0;1;40m / \u001b[94m"+results.length+"\u001b[90m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
