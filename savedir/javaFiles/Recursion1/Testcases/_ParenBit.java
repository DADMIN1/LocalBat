package Recursion1.Testcases;
import Recursion1.ParenBit;

public final class _ParenBit
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = ParenBit.parenBit(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "parenBit(\"xyz(abc)123\")",
        "parenBit(\"x(hello)\")",
        "parenBit(\"(xy)1\")",
        "parenBit(\"not really (possible)\")",
        "parenBit(\"(abc)\")",
        "parenBit(\"(abc)xyz\")",
        "parenBit(\"(abc)x\")",
        "parenBit(\"(x)\")",
        "parenBit(\"()\")",
        "parenBit(\"res (ipsa) loquitor\")",
        "parenBit(\"hello(not really)there\")",
        "parenBit(\"ab(ab)ab\")",
    };

    static final String[] expectedResults = {
        "(abc)",
        "(hello)",
        "(xy)",
        "(possible)",
        "(abc)",
        "(abc)",
        "(abc)",
        "(x)",
        "()",
        "(ipsa)",
        "(not really)",
        "(ab)",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("xyz(abc)123"),
            new TestResult("x(hello)"),
            new TestResult("(xy)1"),
            new TestResult("not really (possible)"),
            new TestResult("(abc)"),
            new TestResult("(abc)xyz"),
            new TestResult("(abc)x"),
            new TestResult("(x)"),
            new TestResult("()"),
            new TestResult("res (ipsa) loquitor"),
            new TestResult("hello(not really)there"),
            new TestResult("ab(ab)ab"),
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
