package String3.Testcases;
import String3.WithoutString;

public final class _WithoutString
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String base, String remove) {
            try { result = WithoutString.withoutString(base, remove); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "withoutString(\"Hello there\", \"llo\")",
        "withoutString(\"Hello there\", \"e\")",
        "withoutString(\"Hello there\", \"x\")",
        "withoutString(\"This is a FISH\", \"IS\")",
        "withoutString(\"THIS is a FISH\", \"is\")",
        "withoutString(\"THIS is a FISH\", \"iS\")",
        "withoutString(\"abxxxxab\", \"xx\")",
        "withoutString(\"abxxxab\", \"xx\")",
        "withoutString(\"abxxxab\", \"x\")",
        "withoutString(\"xxx\", \"x\")",
        "withoutString(\"xxx\", \"xx\")",
        "withoutString(\"xyzzy\", \"Y\")",
        "withoutString(\"\", \"x\")",
        "withoutString(\"abcabc\", \"b\")",
        "withoutString(\"AA22bb\", \"2\")",
        "withoutString(\"1111\", \"1\")",
        "withoutString(\"1111\", \"11\")",
        "withoutString(\"MkjtMkx\", \"Mk\")",
        "withoutString(\"Hi HoHo\", \"Ho\")",
    };

    static final String[] expectedResults = {
        "He there",
        "Hllo thr",
        "Hello there",
        "Th a FH",
        "TH a FH",
        "TH a FH",
        "abab",
        "abxab",
        "abab",
        "",
        "x",
        "xzz",
        "",
        "acac",
        "AAbb",
        "",
        "",
        "jtx",
        "Hi ",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello there", "llo"),
            new TestResult("Hello there", "e"),
            new TestResult("Hello there", "x"),
            new TestResult("This is a FISH", "IS"),
            new TestResult("THIS is a FISH", "is"),
            new TestResult("THIS is a FISH", "iS"),
            new TestResult("abxxxxab", "xx"),
            new TestResult("abxxxab", "xx"),
            new TestResult("abxxxab", "x"),
            new TestResult("xxx", "x"),
            new TestResult("xxx", "xx"),
            new TestResult("xyzzy", "Y"),
            new TestResult("", "x"),
            new TestResult("abcabc", "b"),
            new TestResult("AA22bb", "2"),
            new TestResult("1111", "1"),
            new TestResult("1111", "11"),
            new TestResult("MkjtMkx", "Mk"),
            new TestResult("Hi HoHo", "Ho"),
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
