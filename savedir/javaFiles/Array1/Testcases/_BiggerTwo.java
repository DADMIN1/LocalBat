package Array1.Testcases;
import Array1.BiggerTwo;
import java.util.Arrays;
import java.util.ArrayList;

public class _BiggerTwo
{
    static String[] testcaseStrings = {
        "biggerTwo([1, 2], [3, 4])",
        "biggerTwo([3, 4], [1, 2])",
        "biggerTwo([1, 1], [1, 2])",
        "biggerTwo([2, 1], [1, 1])",
        "biggerTwo([2, 2], [1, 3])",
        "biggerTwo([1, 3], [2, 2])",
        "biggerTwo([6, 7], [3, 1])",
    };

    static int[][] expectedResults = {
        {3, 4},
        {3, 4},
        {1, 2},
        {2, 1},
        {2, 2},
        {1, 3},
        {6, 7},
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
        int[] a0 = { 1, 2 }; int[] b0 = { 3, 4 }; 
        int[] a1 = { 3, 4 }; int[] b1 = { 1, 2 }; 
        int[] a2 = { 1, 1 }; int[] b2 = { 1, 2 }; 
        int[] a3 = { 2, 1 }; int[] b3 = { 1, 1 }; 
        int[] a4 = { 2, 2 }; int[] b4 = { 1, 3 }; 
        int[] a5 = { 1, 3 }; int[] b5 = { 2, 2 }; 
        int[] a6 = { 6, 7 }; int[] b6 = { 3, 1 }; 

        int[][] resultsArray = {
            BiggerTwo.biggerTwo(a0, b0),
            BiggerTwo.biggerTwo(a1, b1),
            BiggerTwo.biggerTwo(a2, b2),
            BiggerTwo.biggerTwo(a3, b3),
            BiggerTwo.biggerTwo(a4, b4),
            BiggerTwo.biggerTwo(a5, b5),
            BiggerTwo.biggerTwo(a6, b6),
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
