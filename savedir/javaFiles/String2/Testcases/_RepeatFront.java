package String2.Testcases;
import String2.RepeatFront;

public final class _RepeatFront
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, int n) {
            try { result = RepeatFront.repeatFront(str, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "repeatFront(\"Chocolate\", 4)",
        "repeatFront(\"Chocolate\", 3)",
        "repeatFront(\"Ice Cream\", 2)",
        "repeatFront(\"Ice Cream\", 1)",
        "repeatFront(\"Ice Cream\", 0)",
        "repeatFront(\"xyz\", 3)",
        "repeatFront(\"\", 0)",
        "repeatFront(\"Java\", 4)",
        "repeatFront(\"Java\", 1)",
    };

    static final String[] expectedResults = {
        "ChocChoChC",
        "ChoChC",
        "IcI",
        "I",
        "",
        "xyzxyx",
        "",
        "JavaJavJaJ",
        "J",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Chocolate", 4),
            new TestResult("Chocolate", 3),
            new TestResult("Ice Cream", 2),
            new TestResult("Ice Cream", 1),
            new TestResult("Ice Cream", 0),
            new TestResult("xyz", 3),
            new TestResult("", 0),
            new TestResult("Java", 4),
            new TestResult("Java", 1),
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
