package Array1.Testcases;
import Array1.Front11;
import java.util.Arrays;
import java.util.ArrayList;

public class _Front11
{
    static String[] testcaseStrings = {
        "front11([1, 2, 3], [7, 9, 8])",
        "front11([1], [2])",
        "front11([1, 7], [])",
        "front11([], [2, 8])",
        "front11([], [])",
        "front11([3], [1, 4, 1, 9])",
        "front11([1, 4, 1, 9], [])",
    };

    static int[][] expectedResults = {
        {1, 7},
        {1, 2},
        {1},
        {2},
        {},
        {3, 1},
        {1},
    };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] a0 = { 1, 2, 3 }; int[] b0 = { 7, 9, 8 }; 
        int[] a1 = { 1 }; int[] b1 = { 2 }; 
        int[] a2 = { 1, 7 }; int[] b2 = {  }; 
        int[] a3 = {  }; int[] b3 = { 2, 8 }; 
        int[] a4 = {  }; int[] b4 = {  }; 
        int[] a5 = { 3 }; int[] b5 = { 1, 4, 1, 9 }; 
        int[] a6 = { 1, 4, 1, 9 }; int[] b6 = {  }; 

        int[][] resultsArray = {
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
