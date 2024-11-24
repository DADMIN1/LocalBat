package String2.Testcases;
import String2.MixString;

public final class _MixString
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String a, String b) {
            try { result = MixString.mixString(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"abc\", \"xyz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"Hi\", \"There\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"xxxx\", \"There\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"xxx\", \"X\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"2/\", \"27 around\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"\", \"Hello\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"Abc\", \"\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"\", \"\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"a\", \"b\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"ax\", \"b\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"a\", \"bx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"So\", \"Long\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmixString\u001B[0;90m(\u001b[0;1m\"Long\", \"So\"\u001B[0m\u001b[90m)",
    };

    static final String[] expectedResults = {
        "axbycz",
        "HTihere",
        "xTxhxexre",
        "xXxx",
        "22/7 around",
        "Hello",
        "Abc",
        "",
        "ab",
        "abx",
        "abx",
        "SLoong",
        "LSoong",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("abc", "xyz"),
            new TestResult("Hi", "There"),
            new TestResult("xxxx", "There"),
            new TestResult("xxx", "X"),
            new TestResult("2/", "27 around"),
            new TestResult("", "Hello"),
            new TestResult("Abc", ""),
            new TestResult("", ""),
            new TestResult("a", "b"),
            new TestResult("ax", "b"),
            new TestResult("a", "bx"),
            new TestResult("So", "Long"),
            new TestResult("Long", "So"),
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
