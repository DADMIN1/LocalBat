package Warmup1.Testcases;
import Warmup1.NearHundred;

public final class _NearHundred
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = NearHundred.nearHundred(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "nearHundred(93)",
        "nearHundred(90)",
        "nearHundred(89)",
        "nearHundred(110)",
        "nearHundred(111)",
        "nearHundred(121)",
        "nearHundred(-101)",
        "nearHundred(-209)",
        "nearHundred(190)",
        "nearHundred(209)",
        "nearHundred(0)",
        "nearHundred(5)",
        "nearHundred(-50)",
        "nearHundred(191)",
        "nearHundred(189)",
        "nearHundred(200)",
        "nearHundred(210)",
        "nearHundred(211)",
        "nearHundred(290)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        true,
        false,
        true,
        true,
        false,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(93),
            new TestResult(90),
            new TestResult(89),
            new TestResult(110),
            new TestResult(111),
            new TestResult(121),
            new TestResult(-101),
            new TestResult(-209),
            new TestResult(190),
            new TestResult(209),
            new TestResult(0),
            new TestResult(5),
            new TestResult(-50),
            new TestResult(191),
            new TestResult(189),
            new TestResult(200),
            new TestResult(210),
            new TestResult(211),
            new TestResult(290),
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
            if (results[i].result != expectedResults[i]) {
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
