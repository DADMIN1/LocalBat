package Logic1.Testcases;
import Logic1.FizzString2;

public final class _FizzString2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = FizzString2.fizzString2(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m1\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m2\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m3\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m4\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m5\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m6\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m7\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m8\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m9\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m15\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m16\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m18\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m19\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m21\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m44\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m45\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString2\u001B[0;90m(\u001b[0;1m100\u001B[0m\u001b[90m)",
    };

    static final String[] expectedResults = {
        "1!",
        "2!",
        "Fizz!",
        "4!",
        "Buzz!",
        "Fizz!",
        "7!",
        "8!",
        "Fizz!",
        "FizzBuzz!",
        "16!",
        "Fizz!",
        "19!",
        "Fizz!",
        "44!",
        "FizzBuzz!",
        "Buzz!",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1),
            new TestResult(2),
            new TestResult(3),
            new TestResult(4),
            new TestResult(5),
            new TestResult(6),
            new TestResult(7),
            new TestResult(8),
            new TestResult(9),
            new TestResult(15),
            new TestResult(16),
            new TestResult(18),
            new TestResult(19),
            new TestResult(21),
            new TestResult(44),
            new TestResult(45),
            new TestResult(100),
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
            if (!results[i].result.equals(expectedResults[i])) {
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
