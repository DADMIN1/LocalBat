package Recursion1.Testcases;
import Recursion1.PairStar;

public class _PairStar
{
    static String[] testcaseStrings = {
        "pairStar(\"hello\")",
        "pairStar(\"xxyy\")",
        "pairStar(\"aaaa\")",
    };

    static String[] expectedResults = {
        "hel*lo",
        "x*xy*y",
        "a*a*a*a",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            PairStar.pairStar("hello"),
            PairStar.pairStar("xxyy"),
            PairStar.pairStar("aaaa"),
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
