package Array1.Testcases;
import Array1.Start1;

public final class _Start1
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] a, int[] b) {
            try { result = Start1.start1(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mstart1\u001B[0;90m(\u001b[0;1m[1, 2, 3], [1, 3]\u001B[0m\u001b[90m)",
        "\u001b[3;90mstart1\u001B[0;90m(\u001b[0;1m[7, 2, 3], [1]\u001B[0m\u001b[90m)",
        "\u001b[3;90mstart1\u001B[0;90m(\u001b[0;1m[1, 2], []\u001B[0m\u001b[90m)",
        "\u001b[3;90mstart1\u001B[0;90m(\u001b[0;1m[], [1, 2]\u001B[0m\u001b[90m)",
        "\u001b[3;90mstart1\u001B[0;90m(\u001b[0;1m[7], []\u001B[0m\u001b[90m)",
        "\u001b[3;90mstart1\u001B[0;90m(\u001b[0;1m[7], [1]\u001B[0m\u001b[90m)",
        "\u001b[3;90mstart1\u001B[0;90m(\u001b[0;1m[1], [1]\u001B[0m\u001b[90m)",
        "\u001b[3;90mstart1\u001B[0;90m(\u001b[0;1m[7], [8]\u001B[0m\u001b[90m)",
        "\u001b[3;90mstart1\u001B[0;90m(\u001b[0;1m[], []\u001B[0m\u001b[90m)",
        "\u001b[3;90mstart1\u001B[0;90m(\u001b[0;1m[1, 3], [1]\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        2,
        1,
        1,
        1,
        0,
        1,
        2,
        0,
        0,
        2,
    };

    public static final boolean Validate()
    {
        final int[] a0 = {1, 2, 3}; final int[] b0 = {1, 3}; 
        final int[] a1 = {7, 2, 3}; final int[] b1 = {1}; 
        final int[] a2 = {1, 2}; final int[] b2 = {}; 
        final int[] a3 = {}; final int[] b3 = {1, 2}; 
        final int[] a4 = {7}; final int[] b4 = {}; 
        final int[] a5 = {7}; final int[] b5 = {1}; 
        final int[] a6 = {1}; final int[] b6 = {1}; 
        final int[] a7 = {7}; final int[] b7 = {8}; 
        final int[] a8 = {}; final int[] b8 = {}; 
        final int[] a9 = {1, 3}; final int[] b9 = {1}; 

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
        };

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[!]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[3;91;1mFailed!\u001B[0;91;1m \u001b[40;7m[EXCEPTION]\u001B[0m");
                System.out.println("\u001b[91;40;1m    "+results[i].caught.getClass().getName());
                System.out.println("\u001b[0;93;40m    "+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("\u001b[90;3m    ");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("\u001b[0m\u001B[0m"); continue;
            }
            if (results[i].result != expectedResults[i]) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[92;1m[✓] \u001B[0m\u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n \u001b[92;1m✓✓✓\u001B[0;1m\u001b[96;40m  ~  All tests passed  ~  \u001B[0m\u001b[92;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[92;1;40m "+successCount+"\u001B[0;1;40m / \u001b[94m"+results.length+"\u001b[90m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
