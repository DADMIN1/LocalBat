package Functional1.Testcases;
import Functional1.AddStar;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _AddStar
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<String> strings) {
            try { result = AddStar.addStar(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "addStar([\"a\", \"bb\", \"ccc\"])",
        "addStar([\"hello\", \"there\"])",
        "addStar([\"*\"])",
        "addStar([])",
        "addStar([\"kittens\", \"and\", \"chocolate\", \"and\"])",
        "addStar([\"empty\", \"string\", \"\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("a*", "bb*", "ccc*"),
        Arrays.asList("hello*", "there*"),
        Arrays.asList("**"),
        Arrays.asList(),
        Arrays.asList("kittens*", "and*", "chocolate*", "and*"),
        Arrays.asList("empty*", "string*", "*"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))),
            new TestResult(new ArrayList<>(Arrays.asList("hello", "there"))),
            new TestResult(new ArrayList<>(Arrays.asList("*"))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList("kittens", "and", "chocolate", "and"))),
            new TestResult(new ArrayList<>(Arrays.asList("empty", "string", ""))),
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
