package Array1.Testcases;
import Array1.Make2;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Make2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int[] result;
        private RuntimeException caught = null;
        TestResult(int[] a, int[] b) {
            try { result = Make2.make2(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "make2([4, 5], [1, 2, 3])",
        "make2([4], [1, 2, 3])",
        "make2([], [1, 2])",
        "make2([1, 2], [])",
        "make2([3], [1, 2, 3])",
        "make2([3], [1])",
        "make2([3, 1, 4], [])",
        "make2([1], [1])",
        "make2([1, 2, 3], [7, 8])",
        "make2([7, 8], [1, 2, 3])",
        "make2([7], [1, 2, 3])",
        "make2([5, 4], [2, 3, 7])",
    };

    static final int[][] expectedResults = {
        {4, 5},
        {4, 1},
        {1, 2},
        {1, 2},
        {3, 1},
        {3, 1},
        {3, 1},
        {1, 1},
        {1, 2},
        {7, 8},
        {7, 1},
        {5, 4},
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
        final int[] a0 = {4, 5}; final int[] b0 = {1, 2, 3}; 
        final int[] a1 = {4}; final int[] b1 = {1, 2, 3}; 
        final int[] a2 = {}; final int[] b2 = {1, 2}; 
        final int[] a3 = {1, 2}; final int[] b3 = {}; 
        final int[] a4 = {3}; final int[] b4 = {1, 2, 3}; 
        final int[] a5 = {3}; final int[] b5 = {1}; 
        final int[] a6 = {3, 1, 4}; final int[] b6 = {}; 
        final int[] a7 = {1}; final int[] b7 = {1}; 
        final int[] a8 = {1, 2, 3}; final int[] b8 = {7, 8}; 
        final int[] a9 = {7, 8}; final int[] b9 = {1, 2, 3}; 
        final int[] a10 = {7}; final int[] b10 = {1, 2, 3}; 
        final int[] a11 = {5, 4}; final int[] b11 = {2, 3, 7}; 

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
