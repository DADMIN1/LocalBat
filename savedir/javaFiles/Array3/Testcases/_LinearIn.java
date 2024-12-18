package Array3.Testcases;
import Array3.LinearIn;

public final class _LinearIn
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] outer, int[] inner) {
            try { result = LinearIn.linearIn(outer, inner); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[1, 2, 4, 6], [2, 4]\u001B[0m\u001b[90m)",
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[1, 2, 4, 6], [2, 3, 4]\u001B[0m\u001b[90m)",
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[1, 2, 4, 4, 6], [2, 4]\u001B[0m\u001b[90m)",
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[2, 2, 4, 4, 6, 6], [2, 4]\u001B[0m\u001b[90m)",
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[2, 2, 2, 2, 2], [2, 2]\u001B[0m\u001b[90m)",
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[2, 2, 2, 2, 2], [2, 4]\u001B[0m\u001b[90m)",
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[2, 2, 2, 2, 4], [2, 4]\u001B[0m\u001b[90m)",
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[1, 2, 3], [2]\u001B[0m\u001b[90m)",
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[1, 2, 3], [-1]\u001B[0m\u001b[90m)",
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[1, 2, 3], []\u001B[0m\u001b[90m)",
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[-1, 0, 3, 3, 3, 10, 12], [-1, 0, 3, 12]\u001B[0m\u001b[90m)",
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[-1, 0, 3, 3, 3, 10, 12], [0, 3, 12, 14]\u001B[0m\u001b[90m)",
        "\u001b[3;90mlinearIn\u001B[0;90m(\u001b[0;1m[-1, 0, 3, 3, 3, 10, 12], [-1, 10, 11]\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
    };

    public static final boolean Validate()
    {
        final int[] outer0 = {1, 2, 4, 6}; final int[] inner0 = {2, 4}; 
        final int[] outer1 = {1, 2, 4, 6}; final int[] inner1 = {2, 3, 4}; 
        final int[] outer2 = {1, 2, 4, 4, 6}; final int[] inner2 = {2, 4}; 
        final int[] outer3 = {2, 2, 4, 4, 6, 6}; final int[] inner3 = {2, 4}; 
        final int[] outer4 = {2, 2, 2, 2, 2}; final int[] inner4 = {2, 2}; 
        final int[] outer5 = {2, 2, 2, 2, 2}; final int[] inner5 = {2, 4}; 
        final int[] outer6 = {2, 2, 2, 2, 4}; final int[] inner6 = {2, 4}; 
        final int[] outer7 = {1, 2, 3}; final int[] inner7 = {2}; 
        final int[] outer8 = {1, 2, 3}; final int[] inner8 = {-1}; 
        final int[] outer9 = {1, 2, 3}; final int[] inner9 = {}; 
        final int[] outer10 = {-1, 0, 3, 3, 3, 10, 12}; final int[] inner10 = {-1, 0, 3, 12}; 
        final int[] outer11 = {-1, 0, 3, 3, 3, 10, 12}; final int[] inner11 = {0, 3, 12, 14}; 
        final int[] outer12 = {-1, 0, 3, 3, 3, 10, 12}; final int[] inner12 = {-1, 10, 11}; 

        final TestResult[] results = {
            new TestResult(outer0, inner0),
            new TestResult(outer1, inner1),
            new TestResult(outer2, inner2),
            new TestResult(outer3, inner3),
            new TestResult(outer4, inner4),
            new TestResult(outer5, inner5),
            new TestResult(outer6, inner6),
            new TestResult(outer7, inner7),
            new TestResult(outer8, inner8),
            new TestResult(outer9, inner9),
            new TestResult(outer10, inner10),
            new TestResult(outer11, inner11),
            new TestResult(outer12, inner12),
        };

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(suppressOutput) continue;
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
                if(suppressOutput) continue;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses && !suppressOutput) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[92;1m[✓] \u001B[0m\u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (suppressOutput) return allTestsPassed;
        if (allTestsPassed) System.out.println("\n \u001b[92;1m✓✓✓\u001B[0;1m\u001b[96;40m  ~  All tests passed  ~  \u001B[0m\u001b[92;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[92;1;40m "+successCount+"\u001B[0;1;40m / \u001b[94m"+results.length+"\u001b[90m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
