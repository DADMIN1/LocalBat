package Array2.Testcases;
import Array2.FizzBuzz;
import java.util.Arrays;
import java.util.ArrayList;

public final class _FizzBuzz
{
    static final String[] testcaseStrings = {
        "fizzBuzz(1, 6)",
        "fizzBuzz(1, 8)",
        "fizzBuzz(1, 11)",
        "fizzBuzz(1, 16)",
        "fizzBuzz(1, 4)",
        "fizzBuzz(1, 2)",
        "fizzBuzz(50, 56)",
        "fizzBuzz(15, 17)",
        "fizzBuzz(30, 36)",
        "fizzBuzz(1000, 1006)",
        "fizzBuzz(99, 102)",
        "fizzBuzz(14, 20)",
    };

    static final String[][] expectedResults = {
        {"1", "2", "Fizz", "4", "Buzz"},
        {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"},
        {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"},
        {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"},
        {"1", "2", "Fizz"},
        {"1"},
        {"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"},
        {"FizzBuzz", "16"},
        {"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"},
        {"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"},
        {"Fizz", "Buzz", "101"},
        {"14", "FizzBuzz", "16", "17", "Fizz", "19"},
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
            FizzBuzz.fizzBuzz(1, 6),
            FizzBuzz.fizzBuzz(1, 8),
            FizzBuzz.fizzBuzz(1, 11),
            FizzBuzz.fizzBuzz(1, 16),
            FizzBuzz.fizzBuzz(1, 4),
            FizzBuzz.fizzBuzz(1, 2),
            FizzBuzz.fizzBuzz(50, 56),
            FizzBuzz.fizzBuzz(15, 17),
            FizzBuzz.fizzBuzz(30, 36),
            FizzBuzz.fizzBuzz(1000, 1006),
            FizzBuzz.fizzBuzz(99, 102),
            FizzBuzz.fizzBuzz(14, 20),
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
