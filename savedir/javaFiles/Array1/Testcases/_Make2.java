package Array1.Testcases;
import Array1.Make2;
import java.util.Arrays;

public class _Make2
{
    static String[] testcaseStrings = {
        "make2([4, 5], [1, 2, 3])",
        "make2([4], [1, 2, 3])",
        "make2([], [1, 2])",
    };

    static int[][] expectedResults = { {4, 5}, {4, 1}, {1, 2}, };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] a0 = { 4, 5 }; int[] b0 = { 1, 2, 3 }; 
        int[] a1 = { 4 }; int[] b1 = { 1, 2, 3 }; 
        int[] a2 = {  }; int[] b2 = { 1, 2 }; 

        int[][] resultsArray = {
            Make2.make2(a0, b0),
            Make2.make2(a1, b1),
            Make2.make2(a2, b2),
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
