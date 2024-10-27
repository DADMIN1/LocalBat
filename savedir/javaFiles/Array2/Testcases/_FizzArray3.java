package Array2.Testcases;
import Array2.FizzArray3;
import java.util.Arrays;
import java.util.ArrayList;

public final class _FizzArray3
{
    static final String[] testcaseStrings = {
        "fizzArray3(5, 10)",
        "fizzArray3(11, 18)",
        "fizzArray3(1, 3)",
        "fizzArray3(1, 2)",
        "fizzArray3(1, 1)",
        "fizzArray3(1000, 1005)",
    };

    static final int[][] expectedResults = {
        {5, 6, 7, 8, 9},
        {11, 12, 13, 14, 15, 16, 17},
        {1, 2},
        {1},
        {},
        {1000, 1001, 1002, 1003, 1004},
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
        final int[][] resultsArray = {
            FizzArray3.fizzArray3(5, 10),
            FizzArray3.fizzArray3(11, 18),
            FizzArray3.fizzArray3(1, 3),
            FizzArray3.fizzArray3(1, 2),
            FizzArray3.fizzArray3(1, 1),
            FizzArray3.fizzArray3(1000, 1005),
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
