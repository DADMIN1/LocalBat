package String2.Testcases;
import String2.RepeatSeparator;

public final class _RepeatSeparator
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String word, String sep, int count) {
            try { result = RepeatSeparator.repeatSeparator(word, sep, count); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "repeatSeparator(\"Word\", \"X\", 3)",
        "repeatSeparator(\"This\", \"And\", 2)",
        "repeatSeparator(\"This\", \"And\", 1)",
        "repeatSeparator(\"Hi\", \"-n-\", 2)",
        "repeatSeparator(\"AAA\", \"\", 1)",
        "repeatSeparator(\"AAA\", \"\", 0)",
        "repeatSeparator(\"A\", \"B\", 5)",
        "repeatSeparator(\"abc\", \"XX\", 3)",
        "repeatSeparator(\"abc\", \"XX\", 2)",
        "repeatSeparator(\"abc\", \"XX\", 1)",
        "repeatSeparator(\"XYZ\", \"a\", 2)",
    };

    static final String[] expectedResults = {
        "WordXWordXWord",
        "ThisAndThis",
        "This",
        "Hi-n-Hi",
        "AAA",
        "",
        "ABABABABA",
        "abcXXabcXXabc",
        "abcXXabc",
        "abc",
        "XYZaXYZ",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Word", "X", 3),
            new TestResult("This", "And", 2),
            new TestResult("This", "And", 1),
            new TestResult("Hi", "-n-", 2),
            new TestResult("AAA", "", 1),
            new TestResult("AAA", "", 0),
            new TestResult("A", "B", 5),
            new TestResult("abc", "XX", 3),
            new TestResult("abc", "XX", 2),
            new TestResult("abc", "XX", 1),
            new TestResult("XYZ", "a", 2),
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
