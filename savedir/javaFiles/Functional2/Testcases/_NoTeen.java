package Functional2.Testcases;
import Functional2.NoTeen;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _NoTeen
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<Integer> nums) {
            try { result = NoTeen.noTeen(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "noTeen([12, 13, 19, 20])",
        "noTeen([1, 14, 1])",
        "noTeen([15])",
        "noTeen([-15])",
        "noTeen([])",
        "noTeen([0, 1, 2, -3])",
        "noTeen([15, 17, 19, 21, 19])",
        "noTeen([-16, 2, 15, 3, 16, 25])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(12, 20),
        Arrays.asList(1, 1),
        Arrays.asList(),
        Arrays.asList(-15),
        Arrays.asList(),
        Arrays.asList(0, 1, 2, -3),
        Arrays.asList(21),
        Arrays.asList(-16, 2, 3, 25),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList(12, 13, 19, 20))),
            new TestResult(new ArrayList<>(Arrays.asList(1, 14, 1))),
            new TestResult(new ArrayList<>(Arrays.asList(15))),
            new TestResult(new ArrayList<>(Arrays.asList(-15))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(0, 1, 2, -3))),
            new TestResult(new ArrayList<>(Arrays.asList(15, 17, 19, 21, 19))),
            new TestResult(new ArrayList<>(Arrays.asList(-16, 2, 15, 3, 16, 25))),
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
