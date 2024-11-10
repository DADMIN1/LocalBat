package Map2.Testcases;
import Map2.Word0;
import java.util.Map;
import java.util.HashMap;

public final class _Word0
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = Word0.word0(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "word0([\"a\", \"b\", \"a\", \"b\"])",
        "word0([\"a\", \"b\", \"a\", \"c\", \"b\"])",
        "word0([\"c\", \"b\", \"a\"])",
        "word0([\"c\", \"c\", \"c\", \"c\"])",
        "word0([])",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", 0, "b", 0),
        Map.of("a", 0, "b", 0, "c", 0),
        Map.of("a", 0, "b", 0, "c", 0),
        Map.of("c", 0),
        Map.of(),
    };

    public static final boolean Validate()
    {
        final String[] strings0 = {"a", "b", "a", "b"}; 
        final String[] strings1 = {"a", "b", "a", "c", "b"}; 
        final String[] strings2 = {"c", "b", "a"}; 
        final String[] strings3 = {"c", "c", "c", "c"}; 
        final String[] strings4 = {}; 

        final TestResult[] results = {
            new TestResult(strings0),
            new TestResult(strings1),
            new TestResult(strings2),
            new TestResult(strings3),
            new TestResult(strings4),
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
