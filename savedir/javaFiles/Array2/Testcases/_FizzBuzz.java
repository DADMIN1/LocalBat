package Array2.Testcases;
import Array2.FizzBuzz;
import java.util.Arrays;
import java.util.ArrayList;

public final class _FizzBuzz
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String[] result;
        private RuntimeException caught = null;
        TestResult(int start, int end) {
            try { result = FizzBuzz.fizzBuzz(start, end); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mfizzBuzz\u001B[0;30m(\u001b[0;1m1, 6\u001B[0m\u001b[30m)",
        "\u001b[3;30mfizzBuzz\u001B[0;30m(\u001b[0;1m1, 8\u001B[0m\u001b[30m)",
        "\u001b[3;30mfizzBuzz\u001B[0;30m(\u001b[0;1m1, 11\u001B[0m\u001b[30m)",
        "\u001b[3;30mfizzBuzz\u001B[0;30m(\u001b[0;1m1, 16\u001B[0m\u001b[30m)",
        "\u001b[3;30mfizzBuzz\u001B[0;30m(\u001b[0;1m1, 4\u001B[0m\u001b[30m)",
        "\u001b[3;30mfizzBuzz\u001B[0;30m(\u001b[0;1m1, 2\u001B[0m\u001b[30m)",
        "\u001b[3;30mfizzBuzz\u001B[0;30m(\u001b[0;1m50, 56\u001B[0m\u001b[30m)",
        "\u001b[3;30mfizzBuzz\u001B[0;30m(\u001b[0;1m15, 17\u001B[0m\u001b[30m)",
        "\u001b[3;30mfizzBuzz\u001B[0;30m(\u001b[0;1m30, 36\u001B[0m\u001b[30m)",
        "\u001b[3;30mfizzBuzz\u001B[0;30m(\u001b[0;1m1000, 1006\u001B[0m\u001b[30m)",
        "\u001b[3;30mfizzBuzz\u001B[0;30m(\u001b[0;1m99, 102\u001B[0m\u001b[30m)",
        "\u001b[3;30mfizzBuzz\u001B[0;30m(\u001b[0;1m14, 20\u001B[0m\u001b[30m)",
    };

    static final String[][] expectedResults = {
        {"1", "2", "Fizz", "4", "Buzz"},
        {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"},
        {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"},
        {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"},
        {"1", "2", "Fizz"},
        {"1"},
        {"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"},
        {"FizzBuzz", "16"},
        {"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"},
        {"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"},
        {"Fizz", "Buzz", "101"},
        {"14", "FizzBuzz", "16", "17", "Fizz", "19"},
    };

    public static final String printArray(String[] array)
    {
        String result = "[";
        for (String a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 6),
            new TestResult(1, 8),
            new TestResult(1, 11),
            new TestResult(1, 16),
            new TestResult(1, 4),
            new TestResult(1, 2),
            new TestResult(50, 56),
            new TestResult(15, 17),
            new TestResult(30, 36),
            new TestResult(1000, 1006),
            new TestResult(99, 102),
            new TestResult(14, 20),
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
            if (!Arrays.equals(results[i].result, expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[X]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[31;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[34;3;4mreceived:\u001B[0m \u001b[1m"+printArray(results[i].result));
                System.out.println("    \u001b[36;3;4mexpected:\u001B[0m \u001b[1m"+printArray(expectedResults[i]));
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
