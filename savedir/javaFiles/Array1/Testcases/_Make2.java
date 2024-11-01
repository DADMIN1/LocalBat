package Array1.Testcases;
import Array1.Make2;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Make2
{
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

    public static final void Validate(boolean printSuccess)
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

        final int[][] resultsArray = {
            Make2.make2(a0, b0),
            Make2.make2(a1, b1),
            Make2.make2(a2, b2),
            Make2.make2(a3, b3),
            Make2.make2(a4, b4),
            Make2.make2(a5, b5),
            Make2.make2(a6, b6),
            Make2.make2(a7, b7),
            Make2.make2(a8, b8),
            Make2.make2(a9, b9),
            Make2.make2(a10, b10),
            Make2.make2(a11, b11),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!Arrays.equals(resultsArray[i], expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(expectedResults[i]));
                System.out.println("\n");
            } else if (printSuccess) { 
                System.out.println("[✔] #"+(i+1)+" - "+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n ✔✔✔  ~ All tests passed. ~  ✔✔✔");
        System.out.println();
        return;
    }
}
