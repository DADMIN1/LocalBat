package String3.Testcases;
import String3.MirrorEnds;

public final class _MirrorEnds
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String string) {
            try { result = MirrorEnds.mirrorEnds(string); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "mirrorEnds(\"abXYZba\")",
        "mirrorEnds(\"abca\")",
        "mirrorEnds(\"aba\")",
        "mirrorEnds(\"abab\")",
        "mirrorEnds(\"xxx\")",
        "mirrorEnds(\"xxYxx\")",
        "mirrorEnds(\"Hi and iH\")",
        "mirrorEnds(\"x\")",
        "mirrorEnds(\"\")",
        "mirrorEnds(\"123and then 321\")",
        "mirrorEnds(\"band andab\")",
    };

    static final String[] expectedResults = {
        "ab",
        "a",
        "aba",
        "",
        "xxx",
        "xxYxx",
        "Hi ",
        "x",
        "",
        "123",
        "ba",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("abXYZba"),
            new TestResult("abca"),
            new TestResult("aba"),
            new TestResult("abab"),
            new TestResult("xxx"),
            new TestResult("xxYxx"),
            new TestResult("Hi and iH"),
            new TestResult("x"),
            new TestResult(""),
            new TestResult("123and then 321"),
            new TestResult("band andab"),
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
