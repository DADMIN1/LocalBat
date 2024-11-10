package Functional2.Testcases;
import Functional2.NoNeg;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _NoNeg
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<Integer> nums) {
            try { result = NoNeg.noNeg(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "noNeg([1, -2])",
        "noNeg([-3, -3, 3, 3])",
        "noNeg([-1, -1, -1])",
        "noNeg([])",
        "noNeg([0, 1, 2])",
        "noNeg([3, -10, 1, -1, 4, -400])",
        "noNeg([-1, 3, 1, -1, -10, -100, -111, 5])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(1),
        Arrays.asList(3, 3),
        Arrays.asList(),
        Arrays.asList(),
        Arrays.asList(0, 1, 2),
        Arrays.asList(3, 1, 4),
        Arrays.asList(3, 1, 5),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList(1, -2))),
            new TestResult(new ArrayList<>(Arrays.asList(-3, -3, 3, 3))),
            new TestResult(new ArrayList<>(Arrays.asList(-1, -1, -1))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(0, 1, 2))),
            new TestResult(new ArrayList<>(Arrays.asList(3, -10, 1, -1, 4, -400))),
            new TestResult(new ArrayList<>(Arrays.asList(-1, 3, 1, -1, -10, -100, -111, 5))),
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
