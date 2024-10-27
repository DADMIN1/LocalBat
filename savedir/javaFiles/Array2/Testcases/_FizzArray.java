package Array2.Testcases;
import Array2.FizzArray;
import java.util.Arrays;
import java.util.ArrayList;

public class _FizzArray
{
    static String[] testcaseStrings = {
        "fizzArray(4)",
        "fizzArray(1)",
        "fizzArray(10)",
        "fizzArray(0)",
        "fizzArray(2)",
        "fizzArray(7)",
    };

    static int[][] expectedResults = {
        {0, 1, 2, 3},
        {0},
        {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
        {},
        {0, 1},
        {0, 1, 2, 3, 4, 5, 6},
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
        int[][] resultsArray = {
            FizzArray.fizzArray(4),
            FizzArray.fizzArray(1),
            FizzArray.fizzArray(10),
            FizzArray.fizzArray(0),
            FizzArray.fizzArray(2),
            FizzArray.fizzArray(7),
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
