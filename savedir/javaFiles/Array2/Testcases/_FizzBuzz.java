package Array2.Testcases;
import Array2.FizzBuzz;
import java.util.Arrays;

public class _FizzBuzz
{
    static String[] testcaseStrings = {
        "fizzBuzz(1, 6)",
        "fizzBuzz(1, 8)",
        "fizzBuzz(1, 11)",
    };

    static String[][] expectedResults = {
        {"1", "2", "Fizz", "4", "Buzz"},
        {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"},
        {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"},
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
            FizzBuzz.fizzBuzz(1, 6),
            FizzBuzz.fizzBuzz(1, 8),
            FizzBuzz.fizzBuzz(1, 11),
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
