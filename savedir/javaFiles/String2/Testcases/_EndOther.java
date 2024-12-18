package String2.Testcases;
import String2.EndOther;

public final class _EndOther
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String a, String b) {
            try { result = EndOther.endOther(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"Hiabc\", \"abc\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"AbC\", \"HiaBc\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"abc\", \"abXabc\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"Hiabc\", \"abcd\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"Hiabc\", \"bc\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"Hiabcx\", \"bc\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"abc\", \"abc\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"xyz\", \"12xyz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"yz\", \"12xz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"Z\", \"12xz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"12\", \"12\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"abcXYZ\", \"abcDEF\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"ab\", \"ab12\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mendOther\u001B[0;90m(\u001b[0;1m\"ab\", \"12ab\"\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hiabc", "abc"),
            new TestResult("AbC", "HiaBc"),
            new TestResult("abc", "abXabc"),
            new TestResult("Hiabc", "abcd"),
            new TestResult("Hiabc", "bc"),
            new TestResult("Hiabcx", "bc"),
            new TestResult("abc", "abc"),
            new TestResult("xyz", "12xyz"),
            new TestResult("yz", "12xz"),
            new TestResult("Z", "12xz"),
            new TestResult("12", "12"),
            new TestResult("abcXYZ", "abcDEF"),
            new TestResult("ab", "ab12"),
            new TestResult("ab", "12ab"),
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
            if (results[i].result != expectedResults[i]) {
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
