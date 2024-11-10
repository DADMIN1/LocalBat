package Map2.Testcases;
import Map2.WordAppend;

public final class _WordAppend
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = WordAppend.wordAppend(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "wordAppend([\"a\", \"b\", \"a\"])",
        "wordAppend([\"a\", \"b\", \"a\", \"c\", \"a\", \"d\", \"a\"])",
        "wordAppend([\"a\", \"\", \"a\"])",
        "wordAppend([])",
        "wordAppend([\"a\", \"b\", \"b\", \"a\", \"a\"])",
        "wordAppend([\"a\", \"b\", \"b\", \"b\", \"a\", \"c\", \"a\", \"a\"])",
        "wordAppend([\"a\", \"b\", \"b\", \"b\", \"a\", \"c\", \"a\", \"a\", \"a\", \"b\", \"a\"])",
        "wordAppend([\"not\", \"and\", \"or\", \"and\", \"this\", \"and\", \"or\", \"that\", \"not\"])",
        "wordAppend([\"a\", \"b\", \"c\"])",
        "wordAppend([\"this\", \"or\", \"that\", \"and\", \"this\", \"and\", \"that\"])",
        "wordAppend([\"xx\", \"xx\", \"yy\", \"xx\", \"zz\", \"yy\", \"zz\", \"xx\"])",
    };

    static final String[] expectedResults = {
        "a",
        "aa",
        "a",
        "",
        "ba",
        "baa",
        "baaba",
        "andornot",
        "",
        "thisandthat",
        "xxyyzzxx",
    };

    public static final boolean Validate()
    {
        final String[] strings0 = {"a", "b", "a"}; 
        final String[] strings1 = {"a", "b", "a", "c", "a", "d", "a"}; 
        final String[] strings2 = {"a", "", "a"}; 
        final String[] strings3 = {}; 
        final String[] strings4 = {"a", "b", "b", "a", "a"}; 
        final String[] strings5 = {"a", "b", "b", "b", "a", "c", "a", "a"}; 
        final String[] strings6 = {"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"}; 
        final String[] strings7 = {"not", "and", "or", "and", "this", "and", "or", "that", "not"}; 
        final String[] strings8 = {"a", "b", "c"}; 
        final String[] strings9 = {"this", "or", "that", "and", "this", "and", "that"}; 
        final String[] strings10 = {"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"}; 

        final TestResult[] results = {
            new TestResult(strings0),
            new TestResult(strings1),
            new TestResult(strings2),
            new TestResult(strings3),
            new TestResult(strings4),
            new TestResult(strings5),
            new TestResult(strings6),
            new TestResult(strings7),
            new TestResult(strings8),
            new TestResult(strings9),
            new TestResult(strings10),
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
