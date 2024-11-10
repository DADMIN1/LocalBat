package AP1.Testcases;
import AP1.MatchUp;

public final class _MatchUp
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String[] a, String[] b) {
            try { result = MatchUp.matchUp(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"xx\", \"bb\"])",
        "matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"b\", \"bb\"])",
        "matchUp([\"aa\", \"bb\", \"cc\"], [\"\", \"\", \"ccc\"])",
        "matchUp([\"\", \"\", \"ccc\"], [\"aa\", \"bb\", \"cc\"])",
        "matchUp([\"\", \"\", \"\"], [\"\", \"bb\", \"cc\"])",
        "matchUp([\"aa\", \"bb\", \"cc\"], [\"\", \"\", \"\"])",
        "matchUp([\"aa\", \"\", \"ccc\"], [\"\", \"bb\", \"cc\"])",
        "matchUp([\"x\", \"y\", \"z\"], [\"y\", \"z\", \"x\"])",
        "matchUp([\"\", \"y\", \"z\"], [\"\", \"y\", \"x\"])",
        "matchUp([\"x\", \"y\", \"z\"], [\"xx\", \"yyy\", \"zzz\"])",
        "matchUp([\"x\", \"y\", \"z\"], [\"xx\", \"yyy\", \"\"])",
        "matchUp([\"b\", \"x\", \"y\", \"z\"], [\"a\", \"xx\", \"yyy\", \"zzz\"])",
        "matchUp([\"aaa\", \"bb\", \"c\"], [\"aaa\", \"xx\", \"bb\"])",
    };

    static final int[] expectedResults = {
        1,
        2,
        1,
        1,
        0,
        0,
        1,
        0,
        1,
        3,
        2,
        3,
        1,
    };

    public static final boolean Validate()
    {
        final String[] a0 = {"aa", "bb", "cc"}; final String[] b0 = {"aaa", "xx", "bb"}; 
        final String[] a1 = {"aa", "bb", "cc"}; final String[] b1 = {"aaa", "b", "bb"}; 
        final String[] a2 = {"aa", "bb", "cc"}; final String[] b2 = {"", "", "ccc"}; 
        final String[] a3 = {"", "", "ccc"}; final String[] b3 = {"aa", "bb", "cc"}; 
        final String[] a4 = {"", "", ""}; final String[] b4 = {"", "bb", "cc"}; 
        final String[] a5 = {"aa", "bb", "cc"}; final String[] b5 = {"", "", ""}; 
        final String[] a6 = {"aa", "", "ccc"}; final String[] b6 = {"", "bb", "cc"}; 
        final String[] a7 = {"x", "y", "z"}; final String[] b7 = {"y", "z", "x"}; 
        final String[] a8 = {"", "y", "z"}; final String[] b8 = {"", "y", "x"}; 
        final String[] a9 = {"x", "y", "z"}; final String[] b9 = {"xx", "yyy", "zzz"}; 
        final String[] a10 = {"x", "y", "z"}; final String[] b10 = {"xx", "yyy", ""}; 
        final String[] a11 = {"b", "x", "y", "z"}; final String[] b11 = {"a", "xx", "yyy", "zzz"}; 
        final String[] a12 = {"aaa", "bb", "c"}; final String[] b12 = {"aaa", "xx", "bb"}; 

        final TestResult[] results = {
            new TestResult(a0, b0),
            new TestResult(a1, b1),
            new TestResult(a2, b2),
            new TestResult(a3, b3),
            new TestResult(a4, b4),
            new TestResult(a5, b5),
            new TestResult(a6, b6),
            new TestResult(a7, b7),
            new TestResult(a8, b8),
            new TestResult(a9, b9),
            new TestResult(a10, b10),
            new TestResult(a11, b11),
            new TestResult(a12, b12),
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
