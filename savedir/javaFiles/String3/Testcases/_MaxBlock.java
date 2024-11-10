package String3.Testcases;
import String3.MaxBlock;

public final class _MaxBlock
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = MaxBlock.maxBlock(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "maxBlock(\"hoopla\")",
        "maxBlock(\"abbCCCddBBBxx\")",
        "maxBlock(\"\")",
        "maxBlock(\"xyz\")",
        "maxBlock(\"xxyz\")",
        "maxBlock(\"xyzz\")",
        "maxBlock(\"abbbcbbbxbbbx\")",
        "maxBlock(\"XXBBBbbxx\")",
        "maxBlock(\"XXBBBBbbxx\")",
        "maxBlock(\"XXBBBbbxxXXXX\")",
        "maxBlock(\"XX2222BBBbbXX2222\")",
    };

    static final int[] expectedResults = {
        2,
        3,
        0,
        1,
        2,
        2,
        3,
        3,
        4,
        4,
        4,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("hoopla"),
            new TestResult("abbCCCddBBBxx"),
            new TestResult(""),
            new TestResult("xyz"),
            new TestResult("xxyz"),
            new TestResult("xyzz"),
            new TestResult("abbbcbbbxbbbx"),
            new TestResult("XXBBBbbxx"),
            new TestResult("XXBBBBbbxx"),
            new TestResult("XXBBBbbxxXXXX"),
            new TestResult("XX2222BBBbbXX2222"),
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
