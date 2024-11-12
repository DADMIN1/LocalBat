package AP1.Testcases;
import AP1.ScoresSpecial;

public final class _ScoresSpecial
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] a, int[] b) {
            try { result = ScoresSpecial.scoresSpecial(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mscoresSpecial\u001B[0;30m(\u001b[0;1m[12, 10, 4], [2, 20, 30]\u001B[0m\u001b[30m)",
        "\u001b[3;30mscoresSpecial\u001B[0;30m(\u001b[0;1m[20, 10, 4], [2, 20, 10]\u001B[0m\u001b[30m)",
        "\u001b[3;30mscoresSpecial\u001B[0;30m(\u001b[0;1m[12, 11, 4], [2, 20, 31]\u001B[0m\u001b[30m)",
        "\u001b[3;30mscoresSpecial\u001B[0;30m(\u001b[0;1m[1, 20, 2, 50], [3, 4, 5]\u001B[0m\u001b[30m)",
        "\u001b[3;30mscoresSpecial\u001B[0;30m(\u001b[0;1m[3, 4, 5], [1, 50, 2, 20]\u001B[0m\u001b[30m)",
        "\u001b[3;30mscoresSpecial\u001B[0;30m(\u001b[0;1m[10, 4, 20, 30], [20]\u001B[0m\u001b[30m)",
        "\u001b[3;30mscoresSpecial\u001B[0;30m(\u001b[0;1m[10, 4, 20, 30], [20]\u001B[0m\u001b[30m)",
        "\u001b[3;30mscoresSpecial\u001B[0;30m(\u001b[0;1m[10, 4, 20, 30], [3, 20, 99]\u001B[0m\u001b[30m)",
        "\u001b[3;30mscoresSpecial\u001B[0;30m(\u001b[0;1m[10, 4, 20, 30], [30, 20, 99]\u001B[0m\u001b[30m)",
        "\u001b[3;30mscoresSpecial\u001B[0;30m(\u001b[0;1m[], [2]\u001B[0m\u001b[30m)",
        "\u001b[3;30mscoresSpecial\u001B[0;30m(\u001b[0;1m[], [20]\u001B[0m\u001b[30m)",
        "\u001b[3;30mscoresSpecial\u001B[0;30m(\u001b[0;1m[14, 10, 4], [4, 20, 30]\u001B[0m\u001b[30m)",
    };

    static final int[] expectedResults = {
        40,
        40,
        20,
        50,
        50,
        50,
        50,
        50,
        60,
        0,
        20,
        40,
    };

    public static final boolean Validate()
    {
        final int[] a0 = {12, 10, 4}; final int[] b0 = {2, 20, 30}; 
        final int[] a1 = {20, 10, 4}; final int[] b1 = {2, 20, 10}; 
        final int[] a2 = {12, 11, 4}; final int[] b2 = {2, 20, 31}; 
        final int[] a3 = {1, 20, 2, 50}; final int[] b3 = {3, 4, 5}; 
        final int[] a4 = {3, 4, 5}; final int[] b4 = {1, 50, 2, 20}; 
        final int[] a5 = {10, 4, 20, 30}; final int[] b5 = {20}; 
        final int[] a6 = {10, 4, 20, 30}; final int[] b6 = {20}; 
        final int[] a7 = {10, 4, 20, 30}; final int[] b7 = {3, 20, 99}; 
        final int[] a8 = {10, 4, 20, 30}; final int[] b8 = {30, 20, 99}; 
        final int[] a9 = {}; final int[] b9 = {2}; 
        final int[] a10 = {}; final int[] b10 = {20}; 
        final int[] a11 = {14, 10, 4}; final int[] b11 = {4, 20, 30}; 

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
