package Array1.Testcases;
import Array1.Front11;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Front11
{
    static final String[] testcaseStrings = {
        "front11([1, 2, 3], [7, 9, 8])",
        "front11([1], [2])",
        "front11([1, 7], [])",
        "front11([], [2, 8])",
        "front11([], [])",
        "front11([3], [1, 4, 1, 9])",
        "front11([1, 4, 1, 9], [])",
    };

    static final int[][] expectedResults = {
        {1, 7},
        {1, 2},
        {1},
        {2},
        {},
        {3, 1},
        {1},
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
        final int[] a0 = {1, 2, 3}; final int[] b0 = {7, 9, 8}; 
        final int[] a1 = {1}; final int[] b1 = {2}; 
        final int[] a2 = {1, 7}; final int[] b2 = {}; 
        final int[] a3 = {}; final int[] b3 = {2, 8}; 
        final int[] a4 = {}; final int[] b4 = {}; 
        final int[] a5 = {3}; final int[] b5 = {1, 4, 1, 9}; 
        final int[] a6 = {1, 4, 1, 9}; final int[] b6 = {}; 

        final int[][] resultsArray = {
            Front11.front11(a0, b0),
            Front11.front11(a1, b1),
            Front11.front11(a2, b2),
            Front11.front11(a3, b3),
            Front11.front11(a4, b4),
            Front11.front11(a5, b5),
            Front11.front11(a6, b6),
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
