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
        "lower([])",
        "lower([\"EMPTY\", \"\"])",
        "lower([\"aaX\", \"bYb\", \"Ycc\", \"ZZZ\"])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList("hello", "hi"),
        Arrays.asList("aaa", "bbb", "ccc"),
        Arrays.asList("kitten", "chocolate"),
        Arrays.asList(),
        Arrays.asList("empty", ""),
        Arrays.asList("aax", "byb", "ycc", "zzz"),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            Lower.lower(Arrays.asList("Hello", "Hi")),
            Lower.lower(Arrays.asList("AAA", "BBB", "ccc")),
            Lower.lower(Arrays.asList("KitteN", "ChocolaTE")),
            Lower.lower(Arrays.asList()),
            Lower.lower(Arrays.asList("EMPTY", "")),
            Lower.lower(Arrays.asList("aaX", "bYb", "Ycc", "ZZZ")),
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
