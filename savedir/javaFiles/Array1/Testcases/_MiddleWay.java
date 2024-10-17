package Array1.Testcases;
import Array1.MiddleWay;
import java.util.Arrays;

public class _MiddleWay
{
    static String[] testcaseStrings = {
        "middleWay([1, 2, 3], [4, 5, 6])",
        "middleWay([7, 7, 7], [3, 8, 0])",
        "middleWay([5, 2, 9], [1, 4, 5])",
    };

    static int[][] expectedResults = { {2, 5}, {7, 8}, {2, 4}, };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] a0 = { 1, 2, 3 }; int[] b0 = { 4, 5, 6 }; 
        int[] a1 = { 7, 7, 7 }; int[] b1 = { 3, 8, 0 }; 
        int[] a2 = { 5, 2, 9 }; int[] b2 = { 1, 4, 5 }; 

        int[][] resultsArray = {
            MiddleWay.middleWay(a0, b0),
            MiddleWay.middleWay(a1, b1),
            MiddleWay.middleWay(a2, b2),
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
