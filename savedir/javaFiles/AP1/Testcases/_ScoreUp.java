package AP1.Testcases;
import AP1.ScoreUp;

public final class _ScoreUp
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String[] key, String[] answers) {
            try { result = ScoreUp.scoreUp(key, answers); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mscoreUp\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\"], [\"a\", \"c\", \"b\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoreUp\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoreUp\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"b\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoreUp\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\"], [\"?\", \"c\", \"b\", \"?\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoreUp\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\"], [\"?\", \"c\", \"?\", \"?\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoreUp\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\"], [\"c\", \"?\", \"b\", \"b\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoreUp\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\"], [\"c\", \"?\", \"b\", \"?\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoreUp\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"c\"], [\"a\", \"c\", \"b\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoreUp\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\", \"c\", \"c\"], [\"a\", \"c\", \"a\", \"c\", \"a\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoreUp\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\", \"c\", \"c\"], [\"a\", \"c\", \"?\", \"?\", \"a\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoreUp\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\", \"c\", \"c\"], [\"a\", \"c\", \"?\", \"?\", \"c\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mscoreUp\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"c\"], [\"a\", \"b\", \"c\"]\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        6,
        11,
        16,
        3,
        -1,
        7,
        3,
        2,
        4,
        6,
        11,
        12,
    };

    public static final boolean Validate()
    {
        final String[] key0 = {"a", "a", "b", "b"}; final String[] answers0 = {"a", "c", "b", "c"}; 
        final String[] key1 = {"a", "a", "b", "b"}; final String[] answers1 = {"a", "a", "b", "c"}; 
        final String[] key2 = {"a", "a", "b", "b"}; final String[] answers2 = {"a", "a", "b", "b"}; 
        final String[] key3 = {"a", "a", "b", "b"}; final String[] answers3 = {"?", "c", "b", "?"}; 
        final String[] key4 = {"a", "a", "b", "b"}; final String[] answers4 = {"?", "c", "?", "?"}; 
        final String[] key5 = {"a", "a", "b", "b"}; final String[] answers5 = {"c", "?", "b", "b"}; 
        final String[] key6 = {"a", "a", "b", "b"}; final String[] answers6 = {"c", "?", "b", "?"}; 
        final String[] key7 = {"a", "b", "c"}; final String[] answers7 = {"a", "c", "b"}; 
        final String[] key8 = {"a", "a", "b", "b", "c", "c"}; final String[] answers8 = {"a", "c", "a", "c", "a", "c"}; 
        final String[] key9 = {"a", "a", "b", "b", "c", "c"}; final String[] answers9 = {"a", "c", "?", "?", "a", "c"}; 
        final String[] key10 = {"a", "a", "b", "b", "c", "c"}; final String[] answers10 = {"a", "c", "?", "?", "c", "c"}; 
        final String[] key11 = {"a", "b", "c"}; final String[] answers11 = {"a", "b", "c"}; 

        final TestResult[] results = {
            new TestResult(key0, answers0),
            new TestResult(key1, answers1),
            new TestResult(key2, answers2),
            new TestResult(key3, answers3),
            new TestResult(key4, answers4),
            new TestResult(key5, answers5),
            new TestResult(key6, answers6),
            new TestResult(key7, answers7),
            new TestResult(key8, answers8),
            new TestResult(key9, answers9),
            new TestResult(key10, answers10),
            new TestResult(key11, answers11),
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
