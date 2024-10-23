package Array1.Testcases;
import Array1.BiggerTwo;
import java.util.Arrays;

public class _BiggerTwo
{
    static String[] testcaseStrings = {
        "biggerTwo([1, 2], [3, 4])",
        "biggerTwo([3, 4], [1, 2])",
        "biggerTwo([1, 1], [1, 2])",
    };

    static int[][] expectedResults = {
        {3, 4},
        {3, 4},
        {1, 2},
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

        int[][] resultsArray = {
            BiggerTwo.biggerTwo(a0, b0),
            BiggerTwo.biggerTwo(a1, b1),
            BiggerTwo.biggerTwo(a2, b2),
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
