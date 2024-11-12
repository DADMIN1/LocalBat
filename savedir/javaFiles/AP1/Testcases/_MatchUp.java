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
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"aa\", \"bb\", \"cc\"], [\"aaa\", \"xx\", \"bb\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"aa\", \"bb\", \"cc\"], [\"aaa\", \"b\", \"bb\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"aa\", \"bb\", \"cc\"], [\"\", \"\", \"ccc\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"\", \"\", \"ccc\"], [\"aa\", \"bb\", \"cc\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"\", \"\", \"\"], [\"\", \"bb\", \"cc\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"aa\", \"bb\", \"cc\"], [\"\", \"\", \"\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"aa\", \"\", \"ccc\"], [\"\", \"bb\", \"cc\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"x\", \"y\", \"z\"], [\"y\", \"z\", \"x\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"\", \"y\", \"z\"], [\"\", \"y\", \"x\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"x\", \"y\", \"z\"], [\"xx\", \"yyy\", \"zzz\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"x\", \"y\", \"z\"], [\"xx\", \"yyy\", \"\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"b\", \"x\", \"y\", \"z\"], [\"a\", \"xx\", \"yyy\", \"zzz\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mmatchUp\u001B[0;30m(\u001b[0;1m[\"aaa\", \"bb\", \"c\"], [\"aaa\", \"xx\", \"bb\"]\u001B[0m\u001b[30m)",
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

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[!]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[3;31;1mFailed!\u001B[0;31;1m \u001b[40;7m[EXCEPTION]\u001B[0m");
                System.out.println("\u001b[31;40;1m"+results[i].caught.getClass().getName());
                System.out.println("\u001b[0;33;40m"+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("\u001b[30;3m");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("\u001b[0m\u001B[0m"); continue;
            }
            if (results[i].result != expectedResults[i]) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[X]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[31;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[34;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[36;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[32;1m[✓] \u001B[0m\u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n \u001b[32;1m✓✓✓\u001B[0;1m\u001b[36;40m  ~  All tests passed  ~  \u001B[0m\u001b[32;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[32;1;40m "+successCount+"\u001B[0;1;40m / \u001b[34m"+results.length+"\u001b[30m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
