package String3.Testcases;
import String3.CountYZ;

public final class _CountYZ
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = CountYZ.countYZ(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "countYZ(\"fez day\")",
        "countYZ(\"day fez\")",
        "countYZ(\"day fyyyz\")",
        "countYZ(\"day yak\")",
        "countYZ(\"day:yak\")",
        "countYZ(\"!!day--yaz!!\")",
        "countYZ(\"yak zak\")",
        "countYZ(\"DAY abc XYZ\")",
        "countYZ(\"aaz yyz my\")",
        "countYZ(\"y2bz\")",
        "countYZ(\"zxyx\")",
    };

    static final int[] expectedResults = {
        2,
        2,
        2,
        1,
        1,
        2,
        0,
        2,
        3,
        2,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("fez day"),
            new TestResult("day fez"),
            new TestResult("day fyyyz"),
            new TestResult("day yak"),
            new TestResult("day:yak"),
            new TestResult("!!day--yaz!!"),
            new TestResult("yak zak"),
            new TestResult("DAY abc XYZ"),
            new TestResult("aaz yyz my"),
            new TestResult("y2bz"),
            new TestResult("zxyx"),
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
