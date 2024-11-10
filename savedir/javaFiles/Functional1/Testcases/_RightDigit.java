package Functional1.Testcases;
import Functional1.RightDigit;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _RightDigit
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<Integer> nums) {
            try { result = RightDigit.rightDigit(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "rightDigit([1, 22, 93])",
        "rightDigit([16, 8, 886, 8, 1])",
        "rightDigit([10, 0])",
        "rightDigit([])",
        "rightDigit([5, 10])",
        "rightDigit([5, 50, 500, 5000, 5000])",
        "rightDigit([6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(1, 2, 3),
        Arrays.asList(6, 8, 6, 8, 1),
        Arrays.asList(0, 0),
        Arrays.asList(),
        Arrays.asList(5, 0),
        Arrays.asList(5, 0, 0, 0, 0),
        Arrays.asList(6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList(1, 22, 93))),
            new TestResult(new ArrayList<>(Arrays.asList(16, 8, 886, 8, 1))),
            new TestResult(new ArrayList<>(Arrays.asList(10, 0))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(5, 10))),
            new TestResult(new ArrayList<>(Arrays.asList(5, 50, 500, 5000, 5000))),
            new TestResult(new ArrayList<>(Arrays.asList(6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2))),
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
            if (!results[i].result.equals(expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[x] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed!");
                System.out.println("    received: "+results[i].result);
                System.out.println("    expected: "+expectedResults[i]);
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
