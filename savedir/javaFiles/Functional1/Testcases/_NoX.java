package Functional1.Testcases;
import Functional1.NoX;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _NoX
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<String> strings) {
            try { result = NoX.noX(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "noX([\"ax\", \"bb\", \"cx\"])",
        "noX([\"xxax\", \"xbxbx\", \"xxcx\"])",
        "noX([\"x\"])",
        "noX([\"\"])",
        "noX([])",
        "noX([\"the\", \"taxi\"])",
        "noX([\"the\", \"xxtxaxixxx\"])",
        "noX([\"this\", \"is\", \"the\", \"x\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("a", "bb", "c"),
        Arrays.asList("a", "bb", "c"),
        Arrays.asList(""),
        Arrays.asList(""),
        Arrays.asList(),
        Arrays.asList("the", "tai"),
        Arrays.asList("the", "tai"),
        Arrays.asList("this", "is", "the", ""),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList("ax", "bb", "cx"))),
            new TestResult(new ArrayList<>(Arrays.asList("xxax", "xbxbx", "xxcx"))),
            new TestResult(new ArrayList<>(Arrays.asList("x"))),
            new TestResult(new ArrayList<>(Arrays.asList(""))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList("the", "taxi"))),
            new TestResult(new ArrayList<>(Arrays.asList("the", "xxtxaxixxx"))),
            new TestResult(new ArrayList<>(Arrays.asList("this", "is", "the", "x"))),
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
