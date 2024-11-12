package String1.Testcases;
import String1.ComboString;

public final class _ComboString
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String a, String b) {
            try { result = ComboString.comboString(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mcomboString\u001B[0;90m(\u001b[0;1m\"Hello\", \"hi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcomboString\u001B[0;90m(\u001b[0;1m\"hi\", \"Hello\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcomboString\u001B[0;90m(\u001b[0;1m\"aaa\", \"b\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcomboString\u001B[0;90m(\u001b[0;1m\"b\", \"aaa\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcomboString\u001B[0;90m(\u001b[0;1m\"aaa\", \"\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcomboString\u001B[0;90m(\u001b[0;1m\"\", \"bb\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcomboString\u001B[0;90m(\u001b[0;1m\"aaa\", \"1234\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcomboString\u001B[0;90m(\u001b[0;1m\"aaa\", \"bb\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcomboString\u001B[0;90m(\u001b[0;1m\"a\", \"bb\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcomboString\u001B[0;90m(\u001b[0;1m\"bb\", \"a\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcomboString\u001B[0;90m(\u001b[0;1m\"xyz\", \"ab\"\u001B[0m\u001b[90m)",
    };

    static final String[] expectedResults = {
        "hiHellohi",
        "hiHellohi",
        "baaab",
        "baaab",
        "aaa",
        "bb",
        "aaa1234aaa",
        "bbaaabb",
        "abba",
        "abba",
        "abxyzab",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello", "hi"),
            new TestResult("hi", "Hello"),
            new TestResult("aaa", "b"),
            new TestResult("b", "aaa"),
            new TestResult("aaa", ""),
            new TestResult("", "bb"),
            new TestResult("aaa", "1234"),
            new TestResult("aaa", "bb"),
            new TestResult("a", "bb"),
            new TestResult("bb", "a"),
            new TestResult("xyz", "ab"),
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
