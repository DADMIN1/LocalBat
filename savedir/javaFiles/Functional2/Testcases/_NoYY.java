package Functional2.Testcases;
import Functional2.NoYY;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _NoYY
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<String> strings) {
            try { result = NoYY.noYY(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mnoYY\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoYY\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"cy\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoYY\u001B[0;90m(\u001b[0;1m[\"xx\", \"ya\", \"zz\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoYY\u001B[0;90m(\u001b[0;1m[\"xx\", \"yay\", \"zz\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoYY\u001B[0;90m(\u001b[0;1m[\"yyx\", \"y\", \"zzz\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoYY\u001B[0;90m(\u001b[0;1m[\"hello\", \"there\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoYY\u001B[0;90m(\u001b[0;1m[\"ya\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoYY\u001B[0;90m(\u001b[0;1m[]\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoYY\u001B[0;90m(\u001b[0;1m[\"\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoYY\u001B[0;90m(\u001b[0;1m[\"xx\", \"yy\", \"zz\"]\u001B[0m\u001b[90m)",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("ay", "by", "cy"),
        Arrays.asList("ay", "by"),
        Arrays.asList("xxy", "yay", "zzy"),
        Arrays.asList("xxy", "zzy"),
        Arrays.asList("zzzy"),
        Arrays.asList("helloy", "therey"),
        Arrays.asList("yay"),
        Arrays.asList(),
        Arrays.asList("y"),
        Arrays.asList("xxy", "zzy"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList("a", "b", "c"))),
            new TestResult(new ArrayList<>(Arrays.asList("a", "b", "cy"))),
            new TestResult(new ArrayList<>(Arrays.asList("xx", "ya", "zz"))),
            new TestResult(new ArrayList<>(Arrays.asList("xx", "yay", "zz"))),
            new TestResult(new ArrayList<>(Arrays.asList("yyx", "y", "zzz"))),
            new TestResult(new ArrayList<>(Arrays.asList("hello", "there"))),
            new TestResult(new ArrayList<>(Arrays.asList("ya"))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(""))),
            new TestResult(new ArrayList<>(Arrays.asList("xx", "yy", "zz"))),
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
