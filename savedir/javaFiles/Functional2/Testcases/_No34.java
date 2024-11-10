package Functional2.Testcases;
import Functional2.No34;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _No34
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<String> strings) {
            try { result = No34.no34(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "no34([\"a\", \"bb\", \"ccc\"])",
        "no34([\"a\", \"bb\", \"ccc\", \"dddd\"])",
        "no34([\"ccc\", \"dddd\", \"apple\"])",
        "no34([\"this\", \"not\", \"too\", \"long\"])",
        "no34([\"a\", \"bbb\", \"cccc\", \"xx\"])",
        "no34([\"dddd\", \"ddd\", \"xxxxxxx\"])",
        "no34([])",
        "no34([\"\"])",
        "no34([\"empty\", \"\", \"empty\"])",
        "no34([\"a\"])",
        "no34([\"aaaa\", \"bbb\", \"*****\", \"333\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("a", "bb"),
        Arrays.asList("a", "bb"),
        Arrays.asList("apple"),
        Arrays.asList(),
        Arrays.asList("a", "xx"),
        Arrays.asList("xxxxxxx"),
        Arrays.asList(),
        Arrays.asList(""),
        Arrays.asList("empty", "", "empty"),
        Arrays.asList("a"),
        Arrays.asList("*****"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))),
            new TestResult(new ArrayList<>(Arrays.asList("a", "bb", "ccc", "dddd"))),
            new TestResult(new ArrayList<>(Arrays.asList("ccc", "dddd", "apple"))),
            new TestResult(new ArrayList<>(Arrays.asList("this", "not", "too", "long"))),
            new TestResult(new ArrayList<>(Arrays.asList("a", "bbb", "cccc", "xx"))),
            new TestResult(new ArrayList<>(Arrays.asList("dddd", "ddd", "xxxxxxx"))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(""))),
            new TestResult(new ArrayList<>(Arrays.asList("empty", "", "empty"))),
            new TestResult(new ArrayList<>(Arrays.asList("a"))),
            new TestResult(new ArrayList<>(Arrays.asList("aaaa", "bbb", "*****", "333"))),
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
