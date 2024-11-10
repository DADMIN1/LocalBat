package Array2.Testcases;
import Array2.FizzArray2;
import java.util.Arrays;
import java.util.ArrayList;

public final class _FizzArray2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String[] result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = FizzArray2.fizzArray2(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "fizzArray2(4)",
        "fizzArray2(10)",
        "fizzArray2(2)",
        "fizzArray2(1)",
        "fizzArray2(0)",
        "fizzArray2(7)",
        "fizzArray2(9)",
        "fizzArray2(11)",
    };

    static final String[][] expectedResults = {
        {"0", "1", "2", "3"},
        {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"},
        {"0", "1"},
        {"0"},
        {},
        {"0", "1", "2", "3", "4", "5", "6"},
        {"0", "1", "2", "3", "4", "5", "6", "7", "8"},
        {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
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
            new TestResult(4),
            new TestResult(10),
            new TestResult(2),
            new TestResult(1),
            new TestResult(0),
            new TestResult(7),
            new TestResult(9),
            new TestResult(11),
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
