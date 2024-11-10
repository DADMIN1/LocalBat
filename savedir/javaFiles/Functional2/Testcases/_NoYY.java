package Functional2.Testcases;
import Functional2.NoYY;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _NoYY
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<String> strings) {
            try { result = NoYY.noYY(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "noYY([\"a\", \"b\", \"c\"])",
        "noYY([\"a\", \"b\", \"cy\"])",
        "noYY([\"xx\", \"ya\", \"zz\"])",
        "noYY([\"xx\", \"yay\", \"zz\"])",
        "noYY([\"yyx\", \"y\", \"zzz\"])",
        "noYY([\"hello\", \"there\"])",
        "noYY([\"ya\"])",
        "noYY([])",
        "noYY([\"\"])",
        "noYY([\"xx\", \"yy\", \"zz\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("ay", "by", "cy"),
        Arrays.asList("ay", "by"),
        Arrays.asList("xxy", "yay", "zzy"),
        Arrays.asList("xxy", "zzy"),
        Arrays.asList("zzzy"),
        Arrays.asList("helloy", "therey"),
        Arrays.asList("yay"),
        Arrays.asList(),
        Arrays.asList("y"),
        Arrays.asList("xxy", "zzy"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList("a", "b", "c"))),
            new TestResult(new ArrayList<>(Arrays.asList("a", "b", "cy"))),
            new TestResult(new ArrayList<>(Arrays.asList("xx", "ya", "zz"))),
            new TestResult(new ArrayList<>(Arrays.asList("xx", "yay", "zz"))),
            new TestResult(new ArrayList<>(Arrays.asList("yyx", "y", "zzz"))),
            new TestResult(new ArrayList<>(Arrays.asList("hello", "there"))),
            new TestResult(new ArrayList<>(Arrays.asList("ya"))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(""))),
            new TestResult(new ArrayList<>(Arrays.asList("xx", "yy", "zz"))),
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
