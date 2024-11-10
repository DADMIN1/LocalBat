package Logic2.Testcases;
import Logic2.Blackjack;

public final class _Blackjack
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = Blackjack.blackjack(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "blackjack(19, 21)",
        "blackjack(21, 19)",
        "blackjack(19, 22)",
        "blackjack(22, 19)",
        "blackjack(22, 50)",
        "blackjack(22, 22)",
        "blackjack(33, 1)",
        "blackjack(1, 2)",
        "blackjack(34, 33)",
        "blackjack(17, 19)",
        "blackjack(18, 17)",
        "blackjack(16, 23)",
        "blackjack(3, 4)",
        "blackjack(3, 2)",
        "blackjack(21, 20)",
    };

    static final int[] expectedResults = {
        21,
        21,
        19,
        19,
        0,
        0,
        1,
        2,
        0,
        19,
        18,
        16,
        4,
        3,
        21,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(19, 21),
            new TestResult(21, 19),
            new TestResult(19, 22),
            new TestResult(22, 19),
            new TestResult(22, 50),
            new TestResult(22, 22),
            new TestResult(33, 1),
            new TestResult(1, 2),
            new TestResult(34, 33),
            new TestResult(17, 19),
            new TestResult(18, 17),
            new TestResult(16, 23),
            new TestResult(3, 4),
            new TestResult(3, 2),
            new TestResult(21, 20),
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
