package Recursion1.Testcases;
import Recursion1.StrCopies;

public final class _StrCopies
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String str, String sub, int n) {
            try { result = StrCopies.strCopies(str, sub, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"catcowcat\", \"cat\", 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"catcowcat\", \"cow\", 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"catcowcat\", \"cow\", 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"iiijjj\", \"i\", 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"iiijjj\", \"i\", 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"iiijjj\", \"ii\", 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"iiijjj\", \"ii\", 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"iiijjj\", \"x\", 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"iiijjj\", \"x\", 0\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"iiiiij\", \"iii\", 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"iiiiij\", \"iii\", 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"ijiiiiij\", \"iiii\", 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"ijiiiiij\", \"iiii\", 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mstrCopies\u001B[0;90m(\u001b[0;1m\"dogcatdogcat\", \"dog\", 2\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("catcowcat", "cat", 2),
            new TestResult("catcowcat", "cow", 2),
            new TestResult("catcowcat", "cow", 1),
            new TestResult("iiijjj", "i", 3),
            new TestResult("iiijjj", "i", 4),
            new TestResult("iiijjj", "ii", 2),
            new TestResult("iiijjj", "ii", 3),
            new TestResult("iiijjj", "x", 3),
            new TestResult("iiijjj", "x", 0),
            new TestResult("iiiiij", "iii", 3),
            new TestResult("iiiiij", "iii", 4),
            new TestResult("ijiiiiij", "iiii", 2),
            new TestResult("ijiiiiij", "iiii", 3),
            new TestResult("dogcatdogcat", "dog", 2),
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
