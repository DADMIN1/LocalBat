package AP1.Testcases;
import AP1.UserCompare;

public final class _UserCompare
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String aName, int aId, String bName, int bId) {
            try { result = UserCompare.userCompare(aName, aId, bName, bId); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "userCompare(\"bb\", 1, \"zz\", 2)",
        "userCompare(\"bb\", 1, \"aa\", 2)",
        "userCompare(\"bb\", 1, \"bb\", 1)",
        "userCompare(\"bb\", 5, \"bb\", 1)",
        "userCompare(\"bb\", 5, \"bb\", 10)",
        "userCompare(\"adam\", 1, \"bob\", 2)",
        "userCompare(\"bob\", 1, \"bob\", 2)",
        "userCompare(\"bzb\", 1, \"bob\", 2)",
    };

    static final int[] expectedResults = {
        -1,
        1,
        0,
        1,
        -1,
        -1,
        -1,
        1,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("bb", 1, "zz", 2),
            new TestResult("bb", 1, "aa", 2),
            new TestResult("bb", 1, "bb", 1),
            new TestResult("bb", 5, "bb", 1),
            new TestResult("bb", 5, "bb", 10),
            new TestResult("adam", 1, "bob", 2),
            new TestResult("bob", 1, "bob", 2),
            new TestResult("bzb", 1, "bob", 2),
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
