package Functional1.Testcases;
import Functional1.Lower;
import java.util.List;
import java.util.Arrays;

public class _Lower
{
    static String[] testcaseStrings = {
        "lower([\"Hello\", \"Hi\"])",
        "lower([\"AAA\", \"BBB\", \"ccc\"])",
        "lower([\"KitteN\", \"ChocolaTE\"])",
    };

    static List<String>[] expectedResults = {
        Arrays.asList("hello", "hi"),
        Arrays.asList("aaa", "bbb", "ccc"),
        Arrays.asList("kitten", "chocolate"),
    };

    public static void Validate(boolean printSuccess)
    {
        List<String>[] resultsArray = {
            Lower.lower(["Hello", "Hi"]),
            Lower.lower(["AAA", "BBB", "ccc"]),
            Lower.lower(["KitteN", "ChocolaTE"]),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+expectedResults[i]);
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
