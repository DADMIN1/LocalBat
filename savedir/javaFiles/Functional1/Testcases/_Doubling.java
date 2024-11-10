package Functional1.Testcases;
import Functional1.Doubling;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Doubling
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<Integer> nums) {
            try { result = Doubling.doubling(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "doubling([1, 2, 3])",
        "doubling([6, 8, 6, 8, -1])",
        "doubling([])",
        "doubling([5])",
        "doubling([5, 10])",
        "doubling([8, -5, 7, 3, 109])",
        "doubling([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2])",
        "doubling([3, 1, 4, 1, 5, 9])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(2, 4, 6),
        Arrays.asList(12, 16, 12, 16, -2),
        Arrays.asList(),
        Arrays.asList(10),
        Arrays.asList(10, 20),
        Arrays.asList(16, -10, 14, 6, 218),
        Arrays.asList(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4),
        Arrays.asList(6, 2, 8, 2, 10, 18),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList(1, 2, 3))),
            new TestResult(new ArrayList<>(Arrays.asList(6, 8, 6, 8, -1))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(5))),
            new TestResult(new ArrayList<>(Arrays.asList(5, 10))),
            new TestResult(new ArrayList<>(Arrays.asList(8, -5, 7, 3, 109))),
            new TestResult(new ArrayList<>(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2))),
            new TestResult(new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9))),
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
