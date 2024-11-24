package String1.Testcases;
import String1.NTwice;

public final class _NTwice
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, int n) {
            try { result = NTwice.nTwice(str, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mnTwice\u001B[0;90m(\u001b[0;1m\"Hello\", 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mnTwice\u001B[0;90m(\u001b[0;1m\"Chocolate\", 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mnTwice\u001B[0;90m(\u001b[0;1m\"Chocolate\", 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mnTwice\u001B[0;90m(\u001b[0;1m\"Chocolate\", 0\u001B[0m\u001b[90m)",
        "\u001b[3;90mnTwice\u001B[0;90m(\u001b[0;1m\"Hello\", 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mnTwice\u001B[0;90m(\u001b[0;1m\"Code\", 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mnTwice\u001B[0;90m(\u001b[0;1m\"Code\", 2\u001B[0m\u001b[90m)",
    };

    static final String[] expectedResults = {
        "Helo",
        "Choate",
        "Ce",
        "",
        "Hellello",
        "CodeCode",
        "Code",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello", 2),
            new TestResult("Chocolate", 3),
            new TestResult("Chocolate", 1),
            new TestResult("Chocolate", 0),
            new TestResult("Hello", 4),
            new TestResult("Code", 4),
            new TestResult("Code", 2),
        };

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(suppressOutput) continue;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[!]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[3;91;1mFailed!\u001B[0;91;1m \u001b[40;7m[EXCEPTION]\u001B[0m");
                System.out.println("\u001b[91;40;1m    "+results[i].caught.getClass().getName());
                System.out.println("\u001b[0;93;40m    "+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("\u001b[90;3m    ");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("\u001b[0m\u001B[0m"); continue;
            }
            if (!results[i].result.equals(expectedResults[i])) {
                allTestsPassed = false;
                if(suppressOutput) continue;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses && !suppressOutput) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[92;1m[✓] \u001B[0m\u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (suppressOutput) return allTestsPassed;
        if (allTestsPassed) System.out.println("\n \u001b[92;1m✓✓✓\u001B[0;1m\u001b[96;40m  ~  All tests passed  ~  \u001B[0m\u001b[92;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[92;1;40m "+successCount+"\u001B[0;1;40m / \u001b[94m"+results.length+"\u001b[90m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
