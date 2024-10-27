package Array1.Testcases;
import Array1.PlusTwo;
import java.util.Arrays;
import java.util.ArrayList;

public class _PlusTwo
{
    static String[] testcaseStrings = {
        "plusTwo([1, 2], [3, 4])",
        "plusTwo([4, 4], [2, 2])",
        "plusTwo([9, 2], [3, 4])",
    };

    static int[][] expectedResults = {
        {1, 2, 3, 4},
        {4, 4, 2, 2},
        {9, 2, 3, 4},
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
        int[] a1 = { 4, 4 }; int[] b1 = { 2, 2 }; 
        int[] a2 = { 9, 2 }; int[] b2 = { 3, 4 }; 

        int[][] resultsArray = {
            PlusTwo.plusTwo(a0, b0),
            PlusTwo.plusTwo(a1, b1),
            PlusTwo.plusTwo(a2, b2),
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
