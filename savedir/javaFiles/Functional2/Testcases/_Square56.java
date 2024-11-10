package Functional2.Testcases;
import Functional2.Square56;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Square56
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<Integer> nums) {
            try { result = Square56.square56(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "square56([3, 1, 4])",
        "square56([1])",
        "square56([2])",
        "square56([3])",
        "square56([4])",
        "square56([5])",
        "square56([6])",
        "square56([7])",
        "square56([1, 2, 3, 4, 5, 6, 7])",
        "square56([3, -1, -4, 1, 5, 9])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(19, 11),
        Arrays.asList(11),
        Arrays.asList(14),
        Arrays.asList(19),
        Arrays.asList(),
        Arrays.asList(),
        Arrays.asList(),
        Arrays.asList(59),
        Arrays.asList(11, 14, 19, 59),
        Arrays.asList(19, 11, 11, 91),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList(3, 1, 4))),
            new TestResult(new ArrayList<>(Arrays.asList(1))),
            new TestResult(new ArrayList<>(Arrays.asList(2))),
            new TestResult(new ArrayList<>(Arrays.asList(3))),
            new TestResult(new ArrayList<>(Arrays.asList(4))),
            new TestResult(new ArrayList<>(Arrays.asList(5))),
            new TestResult(new ArrayList<>(Arrays.asList(6))),
            new TestResult(new ArrayList<>(Arrays.asList(7))),
            new TestResult(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7))),
            new TestResult(new ArrayList<>(Arrays.asList(3, -1, -4, 1, 5, 9))),
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
