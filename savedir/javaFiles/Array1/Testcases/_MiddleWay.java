package Array1.Testcases;
import Array1.MiddleWay;
import java.util.Arrays;
import java.util.ArrayList;

public final class _MiddleWay
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] a, int[] b) {
            try { result = MiddleWay.middleWay(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "middleWay([1, 2, 3], [4, 5, 6])",
        "middleWay([7, 7, 7], [3, 8, 0])",
        "middleWay([5, 2, 9], [1, 4, 5])",
        "middleWay([1, 9, 7], [4, 8, 8])",
        "middleWay([1, 2, 3], [3, 1, 4])",
        "middleWay([1, 2, 3], [4, 1, 1])",
    };

    static final int[][] expectedResults = {
        {2, 5},
        {7, 8},
        {2, 4},
        {9, 8},
        {2, 1},
        {2, 1},
    };

    public static final String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static final boolean Validate()
    {
        final int[] a0 = {1, 2, 3}; final int[] b0 = {4, 5, 6}; 
        final int[] a1 = {7, 7, 7}; final int[] b1 = {3, 8, 0}; 
        final int[] a2 = {5, 2, 9}; final int[] b2 = {1, 4, 5}; 
        final int[] a3 = {1, 9, 7}; final int[] b3 = {4, 8, 8}; 
        final int[] a4 = {1, 2, 3}; final int[] b4 = {3, 1, 4}; 
        final int[] a5 = {1, 2, 3}; final int[] b5 = {4, 1, 1}; 

        final TestResult[] results = {
            new TestResult(a0, b0),
            new TestResult(a1, b1),
            new TestResult(a2, b2),
            new TestResult(a3, b3),
            new TestResult(a4, b4),
            new TestResult(a5, b5),
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
            if (!Arrays.equals(results[i].result, expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[x] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed!");
                System.out.println("    received: "+printArray(results[i].result));
                System.out.println("    expected: "+printArray(expectedResults[i]));
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
