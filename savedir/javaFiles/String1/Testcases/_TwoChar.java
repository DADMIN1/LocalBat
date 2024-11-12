package String1.Testcases;
import String1.TwoChar;

public final class _TwoChar
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, int index) {
            try { result = TwoChar.twoChar(str, index); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"java\", 0\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"java\", 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"java\", 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"java\", 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"java\", -1\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"Hello\", 0\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"Hello\", 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"Hello\", 99\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"Hello\", 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"Hello\", 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"Hello\", 5\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"Hello\", -7\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"Hello\", 6\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"Hello\", -1\u001B[0m\u001b[90m)",
        "\u001b[3;90mtwoChar\u001B[0;90m(\u001b[0;1m\"yay\", 0\u001B[0m\u001b[90m)",
    };

    static final String[] expectedResults = {
        "ja",
        "va",
        "ja",
        "ja",
        "ja",
        "He",
        "el",
        "He",
        "lo",
        "He",
        "He",
        "He",
        "He",
        "He",
        "ya",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("java", 0),
            new TestResult("java", 2),
            new TestResult("java", 3),
            new TestResult("java", 4),
            new TestResult("java", -1),
            new TestResult("Hello", 0),
            new TestResult("Hello", 1),
            new TestResult("Hello", 99),
            new TestResult("Hello", 3),
            new TestResult("Hello", 4),
            new TestResult("Hello", 5),
            new TestResult("Hello", -7),
            new TestResult("Hello", 6),
            new TestResult("Hello", -1),
            new TestResult("yay", 0),
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
