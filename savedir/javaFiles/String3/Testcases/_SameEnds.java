package String3.Testcases;
import String3.SameEnds;

public final class _SameEnds
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String string) {
            try { result = SameEnds.sameEnds(string); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sameEnds(\"abXYab\")",
        "sameEnds(\"xx\")",
        "sameEnds(\"xxx\")",
        "sameEnds(\"xxxx\")",
        "sameEnds(\"javaXYZjava\")",
        "sameEnds(\"javajava\")",
        "sameEnds(\"xavaXYZjava\")",
        "sameEnds(\"Hello! and Hello!\")",
        "sameEnds(\"x\")",
        "sameEnds(\"\")",
        "sameEnds(\"abcb\")",
        "sameEnds(\"mymmy\")",
    };

    static final String[] expectedResults = {
        "ab",
        "x",
        "x",
        "xx",
        "java",
        "java",
        "",
        "Hello!",
        "",
        "",
        "",
        "my",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("abXYab"),
            new TestResult("xx"),
            new TestResult("xxx"),
            new TestResult("xxxx"),
            new TestResult("javaXYZjava"),
            new TestResult("javajava"),
            new TestResult("xavaXYZjava"),
            new TestResult("Hello! and Hello!"),
            new TestResult("x"),
            new TestResult(""),
            new TestResult("abcb"),
            new TestResult("mymmy"),
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
