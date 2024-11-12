package AP1.Testcases;
import AP1.BigHeights;

public final class _BigHeights
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int[] heights, int start, int end) {
            try { result = BigHeights.bigHeights(heights, start, end); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[5, 3, 6, 7, 2], 2, 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[5, 3, 6, 7, 2], 0, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[5, 3, 6, 7, 2], 0, 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[5, 3, 6, 7, 3], 0, 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[5, 3, 6, 7, 2], 1, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[5, 13, 6, 7, 2], 1, 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[5, 13, 6, 7, 2], 0, 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[5, 13, 6, 7, 2], 1, 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[5, 13, 6, 7, 2], 0, 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[5, 13, 6, 7, 2], 0, 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[1, 2, 3, 4, 5, 4, 3, 2, 10], 4, 8\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[1, 2, 3, 14, 5, 4, 3, 2, 10], 0, 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[1, 2, 3, 14, 5, 4, 3, 2, 10], 7, 8\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[1, 2, 3, 14, 5, 4, 3, 2, 10], 3, 8\u001B[0m\u001b[90m)",
        "\u001b[3;90mbigHeights\u001B[0;90m(\u001b[0;1m[1, 2, 3, 14, 5, 4, 3, 2, 10], 2, 8\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        1,
        0,
        1,
        0,
        0,
        1,
        2,
        2,
        3,
        2,
        0,
        1,
        1,
        1,
        2,
        3,
    };

    public static final boolean Validate()
    {
        final int[] heights0 = {5, 3, 6, 7, 2}; 
        final int[] heights1 = {5, 3, 6, 7, 2}; 
        final int[] heights2 = {5, 3, 6, 7, 2}; 
        final int[] heights3 = {5, 3, 6, 7, 3}; 
        final int[] heights4 = {5, 3, 6, 7, 2}; 
        final int[] heights5 = {5, 13, 6, 7, 2}; 
        final int[] heights6 = {5, 13, 6, 7, 2}; 
        final int[] heights7 = {5, 13, 6, 7, 2}; 
        final int[] heights8 = {5, 13, 6, 7, 2}; 
        final int[] heights9 = {5, 13, 6, 7, 2}; 
        final int[] heights10 = {1, 2, 3, 4, 5, 4, 3, 2, 10}; 
        final int[] heights11 = {1, 2, 3, 4, 5, 4, 3, 2, 10}; 
        final int[] heights12 = {1, 2, 3, 14, 5, 4, 3, 2, 10}; 
        final int[] heights13 = {1, 2, 3, 14, 5, 4, 3, 2, 10}; 
        final int[] heights14 = {1, 2, 3, 14, 5, 4, 3, 2, 10}; 
        final int[] heights15 = {1, 2, 3, 14, 5, 4, 3, 2, 10}; 

        final TestResult[] results = {
            new TestResult(heights0, 2, 4),
            new TestResult(heights1, 0, 1),
            new TestResult(heights2, 0, 4),
            new TestResult(heights3, 0, 4),
            new TestResult(heights4, 1, 1),
            new TestResult(heights5, 1, 2),
            new TestResult(heights6, 0, 2),
            new TestResult(heights7, 1, 4),
            new TestResult(heights8, 0, 4),
            new TestResult(heights9, 0, 3),
            new TestResult(heights10, 0, 3),
            new TestResult(heights11, 4, 8),
            new TestResult(heights12, 0, 3),
            new TestResult(heights13, 7, 8),
            new TestResult(heights14, 3, 8),
            new TestResult(heights15, 2, 8),
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
