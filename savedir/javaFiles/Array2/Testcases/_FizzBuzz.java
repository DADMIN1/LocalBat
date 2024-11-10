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
        "fizzBuzz(1, 6)",
        "fizzBuzz(1, 8)",
        "fizzBuzz(1, 11)",
        "fizzBuzz(1, 16)",
        "fizzBuzz(1, 4)",
        "fizzBuzz(1, 2)",
        "fizzBuzz(50, 56)",
        "fizzBuzz(15, 17)",
        "fizzBuzz(30, 36)",
        "fizzBuzz(1000, 1006)",
        "fizzBuzz(99, 102)",
        "fizzBuzz(14, 20)",
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

        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[!] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed! [EXCEPTION]");
                System.out.println(results[i].caught.getClass().getName());
                System.out.println(results[i].caught.getMessage());
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println(); continue;
            }
            if (!Arrays.equals(results[i].result, expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[x] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed!");
                System.out.println("    received: "+printArray(results[i].result));
                System.out.println("    expected: "+printArray(expectedResults[i]));
                System.out.println();
            } else if (printSuccesses) {
                prevTestPassed = true;
                System.out.println("[✓] #"+(i+1)+" - "+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n ✓✓✓  ~ All tests passed. ~  ✓✓✓");
        System.out.println();
        return allTestsPassed;
    }
}
