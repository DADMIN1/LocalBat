package String1.Testcases;
import String1.WithoutX;

public final class _WithoutX
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = WithoutX.withoutX(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "withoutX(\"xHix\")",
        "withoutX(\"xHi\")",
        "withoutX(\"Hxix\")",
        "withoutX(\"Hi\")",
        "withoutX(\"xxHi\")",
        "withoutX(\"Hix\")",
        "withoutX(\"xaxbx\")",
        "withoutX(\"xx\")",
        "withoutX(\"x\")",
        "withoutX(\"\")",
        "withoutX(\"Hello\")",
        "withoutX(\"Hexllo\")",
    };

    static final String[] expectedResults = {
        "Hi",
        "Hi",
        "Hxi",
        "Hi",
        "xHi",
        "Hi",
        "axb",
        "",
        "",
        "",
        "Hello",
        "Hexllo",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("xHix"),
            new TestResult("xHi"),
            new TestResult("Hxix"),
            new TestResult("Hi"),
            new TestResult("xxHi"),
            new TestResult("Hix"),
            new TestResult("xaxbx"),
            new TestResult("xx"),
            new TestResult("x"),
            new TestResult(""),
            new TestResult("Hello"),
            new TestResult("Hexllo"),
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
