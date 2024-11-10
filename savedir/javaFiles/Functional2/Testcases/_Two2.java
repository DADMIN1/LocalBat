package Functional2.Testcases;
import Functional2.Two2;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Two2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<Integer> nums) {
            try { result = Two2.two2(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "two2([1, 2, 3])",
        "two2([2, 6, 11])",
        "two2([0])",
        "two2([])",
        "two2([1, 11, 111, 16])",
        "two2([2, 3, 5, 7, 11])",
        "two2([3, 1, 4, 1, 6, 99, 0])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(4, 6),
        Arrays.asList(4),
        Arrays.asList(0),
        Arrays.asList(),
        Arrays.asList(),
        Arrays.asList(4, 6, 10, 14),
        Arrays.asList(6, 8, 198, 0),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList(1, 2, 3))),
            new TestResult(new ArrayList<>(Arrays.asList(2, 6, 11))),
            new TestResult(new ArrayList<>(Arrays.asList(0))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(1, 11, 111, 16))),
            new TestResult(new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11))),
            new TestResult(new ArrayList<>(Arrays.asList(3, 1, 4, 1, 6, 99, 0))),
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
