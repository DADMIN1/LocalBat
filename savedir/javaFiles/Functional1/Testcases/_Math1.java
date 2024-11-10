package Functional1.Testcases;
import Functional1.Math1;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Math1
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<Integer> nums) {
            try { result = Math1.math1(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "math1([1, 2, 3])",
        "math1([6, 8, 6, 8, 1])",
        "math1([10])",
        "math1([])",
        "math1([5, 10])",
        "math1([-1, -2, -3, -2, -1])",
        "math1([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(20, 30, 40),
        Arrays.asList(70, 90, 70, 90, 20),
        Arrays.asList(110),
        Arrays.asList(),
        Arrays.asList(60, 110),
        Arrays.asList(0, -10, -20, -10, 0),
        Arrays.asList(70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList(1, 2, 3))),
            new TestResult(new ArrayList<>(Arrays.asList(6, 8, 6, 8, 1))),
            new TestResult(new ArrayList<>(Arrays.asList(10))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(5, 10))),
            new TestResult(new ArrayList<>(Arrays.asList(-1, -2, -3, -2, -1))),
            new TestResult(new ArrayList<>(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2))),
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
