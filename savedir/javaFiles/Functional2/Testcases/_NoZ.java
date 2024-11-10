package Functional2.Testcases;
import Functional2.NoZ;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _NoZ
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<String> strings) {
            try { result = NoZ.noZ(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "noZ([\"aaa\", \"bbb\", \"aza\"])",
        "noZ([\"hziz\", \"hzello\", \"hi\"])",
        "noZ([\"hello\", \"howz\", \"are\", \"youz\"])",
        "noZ([])",
        "noZ([\"\"])",
        "noZ([\"x\", \"y\", \"z\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("aaa", "bbb"),
        Arrays.asList("hi"),
        Arrays.asList("hello", "are"),
        Arrays.asList(),
        Arrays.asList(""),
        Arrays.asList("x", "y"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList("aaa", "bbb", "aza"))),
            new TestResult(new ArrayList<>(Arrays.asList("hziz", "hzello", "hi"))),
            new TestResult(new ArrayList<>(Arrays.asList("hello", "howz", "are", "youz"))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(""))),
            new TestResult(new ArrayList<>(Arrays.asList("x", "y", "z"))),
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
