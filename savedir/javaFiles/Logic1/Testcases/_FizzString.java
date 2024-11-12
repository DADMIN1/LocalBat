package Logic1.Testcases;
import Logic1.FizzString;

public final class _FizzString
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = FizzString.fizzString(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"fig\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"dib\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"fib\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"abc\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"fooo\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"booo\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"ooob\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"fooob\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"f\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"b\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"abcb\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"Hello\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"Hellob\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"af\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"bf\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mfizzString\u001B[0;90m(\u001b[0;1m\"fb\"\u001B[0m\u001b[90m)",
    };

    static final String[] expectedResults = {
        "Fizz",
        "Buzz",
        "FizzBuzz",
        "abc",
        "Fizz",
        "booo",
        "Buzz",
        "FizzBuzz",
        "Fizz",
        "Buzz",
        "Buzz",
        "Hello",
        "Buzz",
        "af",
        "bf",
        "FizzBuzz",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("fig"),
            new TestResult("dib"),
            new TestResult("fib"),
            new TestResult("abc"),
            new TestResult("fooo"),
            new TestResult("booo"),
            new TestResult("ooob"),
            new TestResult("fooob"),
            new TestResult("f"),
            new TestResult("b"),
            new TestResult("abcb"),
            new TestResult("Hello"),
            new TestResult("Hellob"),
            new TestResult("af"),
            new TestResult("bf"),
            new TestResult("fb"),
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
