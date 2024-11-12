package Functional2.Testcases;
import Functional2.No34;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _No34
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<String> strings) {
            try { result = No34.no34(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mno34\u001B[0;30m(\u001b[0;1m[\"a\", \"bb\", \"ccc\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno34\u001B[0;30m(\u001b[0;1m[\"a\", \"bb\", \"ccc\", \"dddd\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno34\u001B[0;30m(\u001b[0;1m[\"ccc\", \"dddd\", \"apple\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno34\u001B[0;30m(\u001b[0;1m[\"this\", \"not\", \"too\", \"long\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno34\u001B[0;30m(\u001b[0;1m[\"a\", \"bbb\", \"cccc\", \"xx\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno34\u001B[0;30m(\u001b[0;1m[\"dddd\", \"ddd\", \"xxxxxxx\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno34\u001B[0;30m(\u001b[0;1m[]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno34\u001B[0;30m(\u001b[0;1m[\"\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno34\u001B[0;30m(\u001b[0;1m[\"empty\", \"\", \"empty\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno34\u001B[0;30m(\u001b[0;1m[\"a\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mno34\u001B[0;30m(\u001b[0;1m[\"aaaa\", \"bbb\", \"*****\", \"333\"]\u001B[0m\u001b[30m)",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("a", "bb"),
        Arrays.asList("a", "bb"),
        Arrays.asList("apple"),
        Arrays.asList(),
        Arrays.asList("a", "xx"),
        Arrays.asList("xxxxxxx"),
        Arrays.asList(),
        Arrays.asList(""),
        Arrays.asList("empty", "", "empty"),
        Arrays.asList("a"),
        Arrays.asList("*****"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))),
            new TestResult(new ArrayList<>(Arrays.asList("a", "bb", "ccc", "dddd"))),
            new TestResult(new ArrayList<>(Arrays.asList("ccc", "dddd", "apple"))),
            new TestResult(new ArrayList<>(Arrays.asList("this", "not", "too", "long"))),
            new TestResult(new ArrayList<>(Arrays.asList("a", "bbb", "cccc", "xx"))),
            new TestResult(new ArrayList<>(Arrays.asList("dddd", "ddd", "xxxxxxx"))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(""))),
            new TestResult(new ArrayList<>(Arrays.asList("empty", "", "empty"))),
            new TestResult(new ArrayList<>(Arrays.asList("a"))),
            new TestResult(new ArrayList<>(Arrays.asList("aaaa", "bbb", "*****", "333"))),
        };

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[!]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[3;31;1mFailed!\u001B[0;31;1m \u001b[40;7m[EXCEPTION]\u001B[0m");
                System.out.println("\u001b[31;40;1m"+results[i].caught.getClass().getName());
                System.out.println("\u001b[0;33;40m"+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("\u001b[30;3m");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("\u001b[0m\u001B[0m"); continue;
            }
            if (!results[i].result.equals(expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[X]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[31;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[34;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[36;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[32;1m[✓] \u001B[0m\u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n \u001b[32;1m✓✓✓\u001B[0;1m\u001b[36;40m  ~  All tests passed  ~  \u001B[0m\u001b[32;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[32;1;40m "+successCount+"\u001B[0;1;40m / \u001b[34m"+results.length+"\u001b[30m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
