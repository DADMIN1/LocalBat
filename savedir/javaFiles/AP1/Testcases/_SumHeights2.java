package AP1.Testcases;
import AP1.SumHeights2;

public final class _SumHeights2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] heights, int start, int end) {
            try { result = SumHeights2.sumHeights2(heights, start, end); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30msumHeights2\u001B[0;30m(\u001b[0;1m[5, 3, 6, 7, 2], 2, 4\u001B[0m\u001b[30m)",
        "\u001b[3;30msumHeights2\u001B[0;30m(\u001b[0;1m[5, 3, 6, 7, 2], 0, 1\u001B[0m\u001b[30m)",
        "\u001b[3;30msumHeights2\u001B[0;30m(\u001b[0;1m[5, 3, 6, 7, 2], 0, 4\u001B[0m\u001b[30m)",
        "\u001b[3;30msumHeights2\u001B[0;30m(\u001b[0;1m[5, 3, 6, 7, 2], 1, 1\u001B[0m\u001b[30m)",
        "\u001b[3;30msumHeights2\u001B[0;30m(\u001b[0;1m[1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3\u001B[0m\u001b[30m)",
        "\u001b[3;30msumHeights2\u001B[0;30m(\u001b[0;1m[1, 2, 3, 4, 5, 4, 3, 2, 10], 4, 8\u001B[0m\u001b[30m)",
        "\u001b[3;30msumHeights2\u001B[0;30m(\u001b[0;1m[1, 2, 3, 4, 5, 4, 3, 2, 10], 7, 8\u001B[0m\u001b[30m)",
        "\u001b[3;30msumHeights2\u001B[0;30m(\u001b[0;1m[1, 2, 3, 4, 5, 4, 3, 2, 10], 8, 8\u001B[0m\u001b[30m)",
        "\u001b[3;30msumHeights2\u001B[0;30m(\u001b[0;1m[1, 2, 3, 4, 5, 4, 3, 2, 10], 2, 2\u001B[0m\u001b[30m)",
        "\u001b[3;30msumHeights2\u001B[0;30m(\u001b[0;1m[1, 2, 3, 4, 5, 4, 3, 2, 10], 3, 6\u001B[0m\u001b[30m)",
        "\u001b[3;30msumHeights2\u001B[0;30m(\u001b[0;1m[10, 8, 7, 7, 7, 6, 7], 1, 4\u001B[0m\u001b[30m)",
        "\u001b[3;30msumHeights2\u001B[0;30m(\u001b[0;1m[10, 8, 7, 7, 7, 6, 7], 1, 5\u001B[0m\u001b[30m)",
    };

    static final int[] expectedResults = {
        7,
        2,
        15,
        0,
        6,
        19,
        16,
        0,
        0,
        4,
        1,
        2,
    };

    public static final boolean Validate()
    {
        final int[] heights0 = {5, 3, 6, 7, 2}; 
        final int[] heights1 = {5, 3, 6, 7, 2}; 
        final int[] heights2 = {5, 3, 6, 7, 2}; 
        final int[] heights3 = {5, 3, 6, 7, 2}; 
        final int[] heights4 = {1, 2, 3, 4, 5, 4, 3, 2, 10}; 
        final int[] heights5 = {1, 2, 3, 4, 5, 4, 3, 2, 10}; 
        final int[] heights6 = {1, 2, 3, 4, 5, 4, 3, 2, 10}; 
        final int[] heights7 = {1, 2, 3, 4, 5, 4, 3, 2, 10}; 
        final int[] heights8 = {1, 2, 3, 4, 5, 4, 3, 2, 10}; 
        final int[] heights9 = {1, 2, 3, 4, 5, 4, 3, 2, 10}; 
        final int[] heights10 = {10, 8, 7, 7, 7, 6, 7}; 
        final int[] heights11 = {10, 8, 7, 7, 7, 6, 7}; 

        final TestResult[] results = {
            new TestResult(heights0, 2, 4),
            new TestResult(heights1, 0, 1),
            new TestResult(heights2, 0, 4),
            new TestResult(heights3, 1, 1),
            new TestResult(heights4, 0, 3),
            new TestResult(heights5, 4, 8),
            new TestResult(heights6, 7, 8),
            new TestResult(heights7, 8, 8),
            new TestResult(heights8, 2, 2),
            new TestResult(heights9, 3, 6),
            new TestResult(heights10, 1, 4),
            new TestResult(heights11, 1, 5),
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
