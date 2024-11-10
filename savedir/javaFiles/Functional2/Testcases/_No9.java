package Functional2.Testcases;
import Functional2.No9;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _No9
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<Integer> nums) {
            try { result = No9.no9(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "no9([1, 2, 19])",
        "no9([9, 19, 29, 3])",
        "no9([1, 2, 3])",
        "no9([45, 99, 90, 28, 13, 999, 0])",
        "no9([])",
        "no9([9])",
        "no9([0, 9, 0])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(1, 2),
        Arrays.asList(3),
        Arrays.asList(1, 2, 3),
        Arrays.asList(45, 90, 28, 13, 0),
        Arrays.asList(),
        Arrays.asList(),
        Arrays.asList(0, 0),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList(1, 2, 19))),
            new TestResult(new ArrayList<>(Arrays.asList(9, 19, 29, 3))),
            new TestResult(new ArrayList<>(Arrays.asList(1, 2, 3))),
            new TestResult(new ArrayList<>(Arrays.asList(45, 99, 90, 28, 13, 999, 0))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(9))),
            new TestResult(new ArrayList<>(Arrays.asList(0, 9, 0))),
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
