package Map2.Testcases;
import Map2.FirstChar;
import java.util.Map;
import java.util.HashMap;

public final class _FirstChar
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = FirstChar.firstChar(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "firstChar([\"salt\", \"tea\", \"soda\", \"toast\"])",
        "firstChar([\"aa\", \"bb\", \"cc\", \"aAA\", \"cCC\", \"d\"])",
        "firstChar([])",
        "firstChar([\"apple\", \"bells\", \"salt\", \"aardvark\", \"bells\", \"sun\", \"zen\", \"bells\"])",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("s", "saltsoda", "t", "teatoast"),
        Map.of("a", "aaaAA", "b", "bb", "c", "cccCC", "d", "d"),
        Map.of(),
        Map.of("a", "appleaardvark", "b", "bellsbellsbells", "s", "saltsun", "z", "zen"),
    };

    public static final boolean Validate()
    {
        final String[] strings0 = {"salt", "tea", "soda", "toast"}; 
        final String[] strings1 = {"aa", "bb", "cc", "aAA", "cCC", "d"}; 
        final String[] strings2 = {}; 
        final String[] strings3 = {"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"}; 

        final TestResult[] results = {
            new TestResult(strings0),
            new TestResult(strings1),
            new TestResult(strings2),
            new TestResult(strings3),
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
