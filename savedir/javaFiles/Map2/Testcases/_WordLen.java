package Map2.Testcases;
import Map2.WordLen;
import java.util.Map;
import java.util.HashMap;

public final class _WordLen
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = WordLen.wordLen(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "wordLen([\"a\", \"bb\", \"a\", \"bb\"])",
        "wordLen([\"this\", \"and\", \"that\", \"and\"])",
        "wordLen([\"code\", \"code\", \"code\", \"bug\"])",
        "wordLen([])",
        "wordLen([\"z\"])",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("bb", 2, "a", 1),
        Map.of("that", 4, "and", 3, "this", 4),
        Map.of("code", 4, "bug", 3),
        Map.of(),
        Map.of("z", 1),
    };

    public static final boolean Validate()
    {
        final String[] strings0 = {"a", "bb", "a", "bb"}; 
        final String[] strings1 = {"this", "and", "that", "and"}; 
        final String[] strings2 = {"code", "code", "code", "bug"}; 
        final String[] strings3 = {}; 
        final String[] strings4 = {"z"}; 

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
