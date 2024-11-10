package Functional2.Testcases;
import Functional2.NoLong;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _NoLong
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<String> strings) {
            try { result = NoLong.noLong(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "noLong([\"this\", \"not\", \"too\", \"long\"])",
        "noLong([\"a\", \"bbb\", \"cccc\"])",
        "noLong([\"cccc\", \"cccc\", \"cccc\"])",
        "noLong([])",
        "noLong([\"\"])",
        "noLong([\"empty\", \"\", \"empty\"])",
        "noLong([\"a\"])",
        "noLong([\"aaaa\", \"bbb\", \"***\", \"333\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("not", "too"),
        Arrays.asList("a", "bbb"),
        Arrays.asList(),
        Arrays.asList(),
        Arrays.asList(""),
        Arrays.asList(""),
        Arrays.asList("a"),
        Arrays.asList("bbb", "***", "333"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList("this", "not", "too", "long"))),
            new TestResult(new ArrayList<>(Arrays.asList("a", "bbb", "cccc"))),
            new TestResult(new ArrayList<>(Arrays.asList("cccc", "cccc", "cccc"))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(""))),
            new TestResult(new ArrayList<>(Arrays.asList("empty", "", "empty"))),
            new TestResult(new ArrayList<>(Arrays.asList("a"))),
            new TestResult(new ArrayList<>(Arrays.asList("aaaa", "bbb", "***", "333"))),
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
