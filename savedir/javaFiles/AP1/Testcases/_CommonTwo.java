package AP1.Testcases;
import AP1.CommonTwo;

public final class _CommonTwo
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String[] a, String[] b) {
            try { result = CommonTwo.commonTwo(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"c\", \"x\"], [\"b\", \"c\", \"d\", \"x\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"c\", \"x\"], [\"a\", \"b\", \"c\", \"x\", \"z\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"c\"], [\"a\", \"b\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"b\", \"b\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"b\", \"c\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"b\", \"b\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"b\", \"b\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"c\", \"c\", \"d\"], [\"a\", \"b\", \"b\", \"c\", \"d\", \"d\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\", \"c\"], [\"b\", \"b\", \"b\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\", \"c\"], [\"c\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\", \"c\"], [\"b\", \"b\", \"b\", \"x\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"a\", \"b\", \"b\", \"c\"], [\"b\", \"b\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\"], [\"a\", \"b\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\"], [\"b\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"a\"], [\"b\", \"b\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mcommonTwo\u001B[0;90m(\u001b[0;1m[\"a\", \"b\"], [\"a\", \"b\"]\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        2,
        3,
        3,
        3,
        3,
        3,
        2,
        4,
        1,
        1,
        1,
        1,
        1,
        0,
        0,
        2,
    };

    public static final boolean Validate()
    {
        final String[] a0 = {"a", "c", "x"}; final String[] b0 = {"b", "c", "d", "x"}; 
        final String[] a1 = {"a", "c", "x"}; final String[] b1 = {"a", "b", "c", "x", "z"}; 
        final String[] a2 = {"a", "b", "c"}; final String[] b2 = {"a", "b", "c"}; 
        final String[] a3 = {"a", "a", "b", "b", "c"}; final String[] b3 = {"a", "b", "c"}; 
        final String[] a4 = {"a", "a", "b", "b", "c"}; final String[] b4 = {"a", "b", "b", "b", "c"}; 
        final String[] a5 = {"a", "a", "b", "b", "c"}; final String[] b5 = {"a", "b", "b", "c", "c"}; 
        final String[] a6 = {"b", "b", "b", "b", "c"}; final String[] b6 = {"a", "b", "b", "b", "c"}; 
        final String[] a7 = {"a", "b", "c", "c", "d"}; final String[] b7 = {"a", "b", "b", "c", "d", "d"}; 
        final String[] a8 = {"a", "a", "b", "b", "c"}; final String[] b8 = {"b", "b", "b"}; 
        final String[] a9 = {"a", "a", "b", "b", "c"}; final String[] b9 = {"c", "c"}; 
        final String[] a10 = {"a", "a", "b", "b", "c"}; final String[] b10 = {"b", "b", "b", "x"}; 
        final String[] a11 = {"a", "a", "b", "b", "c"}; final String[] b11 = {"b", "b"}; 
        final String[] a12 = {"a"}; final String[] b12 = {"a", "b"}; 
        final String[] a13 = {"a"}; final String[] b13 = {"b"}; 
        final String[] a14 = {"a", "a"}; final String[] b14 = {"b", "b"}; 
        final String[] a15 = {"a", "b"}; final String[] b15 = {"a", "b"}; 

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
            new TestResult(a13, b13),
            new TestResult(a14, b14),
            new TestResult(a15, b15),
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
