package Logic1.Testcases;
import Logic1.FizzString;

public final class _FizzString
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = FizzString.fizzString(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "fizzString(\"fig\")",
        "fizzString(\"dib\")",
        "fizzString(\"fib\")",
        "fizzString(\"abc\")",
        "fizzString(\"fooo\")",
        "fizzString(\"booo\")",
        "fizzString(\"ooob\")",
        "fizzString(\"fooob\")",
        "fizzString(\"f\")",
        "fizzString(\"b\")",
        "fizzString(\"abcb\")",
        "fizzString(\"Hello\")",
        "fizzString(\"Hellob\")",
        "fizzString(\"af\")",
        "fizzString(\"bf\")",
        "fizzString(\"fb\")",
    };

    static final String[] expectedResults = {
        "Fizz",
        "Buzz",
        "FizzBuzz",
        "abc",
        "Fizz",
        "booo",
        "Buzz",
        "FizzBuzz",
        "Fizz",
        "Buzz",
        "Buzz",
        "Hello",
        "Buzz",
        "af",
        "bf",
        "FizzBuzz",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("fig"),
            new TestResult("dib"),
            new TestResult("fib"),
            new TestResult("abc"),
            new TestResult("fooo"),
            new TestResult("booo"),
            new TestResult("ooob"),
            new TestResult("fooob"),
            new TestResult("f"),
            new TestResult("b"),
            new TestResult("abcb"),
            new TestResult("Hello"),
            new TestResult("Hellob"),
            new TestResult("af"),
            new TestResult("bf"),
            new TestResult("fb"),
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
