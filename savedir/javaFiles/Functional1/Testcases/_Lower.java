package Functional1.Testcases;
import Functional1.Lower;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Lower
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<String> strings) {
            try { result = Lower.lower(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "lower([\"Hello\", \"Hi\"])",
        "lower([\"AAA\", \"BBB\", \"ccc\"])",
        "lower([\"KitteN\", \"ChocolaTE\"])",
        "lower([])",
        "lower([\"EMPTY\", \"\"])",
        "lower([\"aaX\", \"bYb\", \"Ycc\", \"ZZZ\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("hello", "hi"),
        Arrays.asList("aaa", "bbb", "ccc"),
        Arrays.asList("kitten", "chocolate"),
        Arrays.asList(),
        Arrays.asList("empty", ""),
        Arrays.asList("aax", "byb", "ycc", "zzz"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList("Hello", "Hi"))),
            new TestResult(new ArrayList<>(Arrays.asList("AAA", "BBB", "ccc"))),
            new TestResult(new ArrayList<>(Arrays.asList("KitteN", "ChocolaTE"))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList("EMPTY", ""))),
            new TestResult(new ArrayList<>(Arrays.asList("aaX", "bYb", "Ycc", "ZZZ"))),
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
