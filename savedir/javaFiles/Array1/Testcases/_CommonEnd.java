package Array1.Testcases;
import Array1.CommonEnd;

public final class _CommonEnd
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int[] a, int[] b) {
            try { result = CommonEnd.commonEnd(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mcommonEnd\u001B[0;30m(\u001b[0;1m[1, 2, 3], [7, 3]\u001B[0m\u001b[30m)",
        "\u001b[3;30mcommonEnd\u001B[0;30m(\u001b[0;1m[1, 2, 3], [7, 3, 2]\u001B[0m\u001b[30m)",
        "\u001b[3;30mcommonEnd\u001B[0;30m(\u001b[0;1m[1, 2, 3], [1, 3]\u001B[0m\u001b[30m)",
        "\u001b[3;30mcommonEnd\u001B[0;30m(\u001b[0;1m[1, 2, 3], [1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mcommonEnd\u001B[0;30m(\u001b[0;1m[1, 2, 3], [2]\u001B[0m\u001b[30m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final int[] a0 = {1, 2, 3}; final int[] b0 = {7, 3}; 
        final int[] a1 = {1, 2, 3}; final int[] b1 = {7, 3, 2}; 
        final int[] a2 = {1, 2, 3}; final int[] b2 = {1, 3}; 
        final int[] a3 = {1, 2, 3}; final int[] b3 = {1}; 
        final int[] a4 = {1, 2, 3}; final int[] b4 = {2}; 

        final TestResult[] results = {
            new TestResult(a0, b0),
            new TestResult(a1, b1),
            new TestResult(a2, b2),
            new TestResult(a3, b3),
            new TestResult(a4, b4),
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
