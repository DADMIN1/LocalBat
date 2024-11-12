package Functional2.Testcases;
import Functional2.NoTeen;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _NoTeen
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private List<?> result;
        private RuntimeException caught = null;
        TestResult(List<Integer> nums) {
            try { result = NoTeen.noTeen(nums); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mnoTeen\u001B[0;30m(\u001b[0;1m[12, 13, 19, 20]\u001B[0m\u001b[30m)",
        "\u001b[3;30mnoTeen\u001B[0;30m(\u001b[0;1m[1, 14, 1]\u001B[0m\u001b[30m)",
        "\u001b[3;30mnoTeen\u001B[0;30m(\u001b[0;1m[15]\u001B[0m\u001b[30m)",
        "\u001b[3;30mnoTeen\u001B[0;30m(\u001b[0;1m[-15]\u001B[0m\u001b[30m)",
        "\u001b[3;30mnoTeen\u001B[0;30m(\u001b[0;1m[]\u001B[0m\u001b[30m)",
        "\u001b[3;30mnoTeen\u001B[0;30m(\u001b[0;1m[0, 1, 2, -3]\u001B[0m\u001b[30m)",
        "\u001b[3;30mnoTeen\u001B[0;30m(\u001b[0;1m[15, 17, 19, 21, 19]\u001B[0m\u001b[30m)",
        "\u001b[3;30mnoTeen\u001B[0;30m(\u001b[0;1m[-16, 2, 15, 3, 16, 25]\u001B[0m\u001b[30m)",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(12, 20),
        Arrays.asList(1, 1),
        Arrays.asList(),
        Arrays.asList(-15),
        Arrays.asList(),
        Arrays.asList(0, 1, 2, -3),
        Arrays.asList(21),
        Arrays.asList(-16, 2, 3, 25),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new ArrayList<>(Arrays.asList(12, 13, 19, 20))),
            new TestResult(new ArrayList<>(Arrays.asList(1, 14, 1))),
            new TestResult(new ArrayList<>(Arrays.asList(15))),
            new TestResult(new ArrayList<>(Arrays.asList(-15))),
            new TestResult(new ArrayList<>(Arrays.asList())),
            new TestResult(new ArrayList<>(Arrays.asList(0, 1, 2, -3))),
            new TestResult(new ArrayList<>(Arrays.asList(15, 17, 19, 21, 19))),
            new TestResult(new ArrayList<>(Arrays.asList(-16, 2, 15, 3, 16, 25))),
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
            if (!results[i].result.equals(expectedResults[i])) {
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
