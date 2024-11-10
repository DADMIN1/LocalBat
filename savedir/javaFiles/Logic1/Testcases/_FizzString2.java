package Logic1.Testcases;
import Logic1.FizzString2;

public final class _FizzString2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = FizzString2.fizzString2(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "fizzString2(1)",
        "fizzString2(2)",
        "fizzString2(3)",
        "fizzString2(4)",
        "fizzString2(5)",
        "fizzString2(6)",
        "fizzString2(7)",
        "fizzString2(8)",
        "fizzString2(9)",
        "fizzString2(15)",
        "fizzString2(16)",
        "fizzString2(18)",
        "fizzString2(19)",
        "fizzString2(21)",
        "fizzString2(44)",
        "fizzString2(45)",
        "fizzString2(100)",
    };

    static final String[] expectedResults = {
        "1!",
        "2!",
        "Fizz!",
        "4!",
        "Buzz!",
        "Fizz!",
        "7!",
        "8!",
        "Fizz!",
        "FizzBuzz!",
        "16!",
        "Fizz!",
        "19!",
        "Fizz!",
        "44!",
        "FizzBuzz!",
        "Buzz!",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1),
            new TestResult(2),
            new TestResult(3),
            new TestResult(4),
            new TestResult(5),
            new TestResult(6),
            new TestResult(7),
            new TestResult(8),
            new TestResult(9),
            new TestResult(15),
            new TestResult(16),
            new TestResult(18),
            new TestResult(19),
            new TestResult(21),
            new TestResult(44),
            new TestResult(45),
            new TestResult(100),
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
