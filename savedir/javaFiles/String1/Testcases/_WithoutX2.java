package String1.Testcases;
import String1.WithoutX2;

public final class _WithoutX2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = WithoutX2.withoutX2(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "withoutX2(\"xHi\")",
        "withoutX2(\"Hxi\")",
        "withoutX2(\"Hi\")",
        "withoutX2(\"xxHi\")",
        "withoutX2(\"Hix\")",
        "withoutX2(\"xaxb\")",
        "withoutX2(\"xx\")",
        "withoutX2(\"x\")",
        "withoutX2(\"\")",
        "withoutX2(\"Hello\")",
        "withoutX2(\"Hexllo\")",
        "withoutX2(\"xHxllo\")",
    };

    static final String[] expectedResults = {
        "Hi",
        "Hi",
        "Hi",
        "Hi",
        "Hix",
        "axb",
        "",
        "",
        "",
        "Hello",
        "Hexllo",
        "Hxllo",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("xHi"),
            new TestResult("Hxi"),
            new TestResult("Hi"),
            new TestResult("xxHi"),
            new TestResult("Hix"),
            new TestResult("xaxb"),
            new TestResult("xx"),
            new TestResult("x"),
            new TestResult(""),
            new TestResult("Hello"),
            new TestResult("Hexllo"),
            new TestResult("xHxllo"),
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
