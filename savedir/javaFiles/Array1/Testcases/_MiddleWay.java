package Array1.Testcases;
import Array1.MiddleWay;
import java.util.Arrays;
import java.util.ArrayList;

public final class _MiddleWay
{
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

    public static final void Validate(boolean printSuccess)
    {
        final int[] a0 = {1, 2, 3}; final int[] b0 = {4, 5, 6}; 
        final int[] a1 = {7, 7, 7}; final int[] b1 = {3, 8, 0}; 
        final int[] a2 = {5, 2, 9}; final int[] b2 = {1, 4, 5}; 
        final int[] a3 = {1, 9, 7}; final int[] b3 = {4, 8, 8}; 
        final int[] a4 = {1, 2, 3}; final int[] b4 = {3, 1, 4}; 
        final int[] a5 = {1, 2, 3}; final int[] b5 = {4, 1, 1}; 

        final int[][] resultsArray = {
            MiddleWay.middleWay(a0, b0),
            MiddleWay.middleWay(a1, b1),
            MiddleWay.middleWay(a2, b2),
            MiddleWay.middleWay(a3, b3),
            MiddleWay.middleWay(a4, b4),
            MiddleWay.middleWay(a5, b5),
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
