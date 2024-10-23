package Array2.Testcases;
import Array2.FizzArray2;
import java.util.Arrays;

public class _FizzArray2
{
    static String[] testcaseStrings = {
        "fizzArray2(4)",
        "fizzArray2(10)",
        "fizzArray2(2)",
    };

    static String[][] expectedResults = {
        {"0", "1", "2", "3"},
        {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"},
        {"0", "1"},
    };

    public static String printArray(String[] array)
    {
        String result = "[";
        for (String a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        String[][] resultsArray = {
            FizzArray2.fizzArray2(4),
            FizzArray2.fizzArray2(10),
            FizzArray2.fizzArray2(2),
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
