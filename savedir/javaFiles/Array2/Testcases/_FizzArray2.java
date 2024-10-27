package Array2.Testcases;
import Array2.FizzArray2;
import java.util.Arrays;
import java.util.ArrayList;

public final class _FizzArray2
{
    static final String[] testcaseStrings = {
        "fizzArray2(4)",
        "fizzArray2(10)",
        "fizzArray2(2)",
        "fizzArray2(1)",
        "fizzArray2(0)",
        "fizzArray2(7)",
        "fizzArray2(9)",
        "fizzArray2(11)",
    };

    static final String[][] expectedResults = {
        {"0", "1", "2", "3"},
        {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"},
        {"0", "1"},
        {"0"},
        {},
        {"0", "1", "2", "3", "4", "5", "6"},
        {"0", "1", "2", "3", "4", "5", "6", "7", "8"},
        {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
    };

    public static final String printArray(String[] array)
    {
        String result = "[";
        for (String a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static final void Validate(boolean printSuccess)
    {
        final String[][] resultsArray = {
            FizzArray2.fizzArray2(4),
            FizzArray2.fizzArray2(10),
            FizzArray2.fizzArray2(2),
            FizzArray2.fizzArray2(1),
            FizzArray2.fizzArray2(0),
            FizzArray2.fizzArray2(7),
            FizzArray2.fizzArray2(9),
            FizzArray2.fizzArray2(11),
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
