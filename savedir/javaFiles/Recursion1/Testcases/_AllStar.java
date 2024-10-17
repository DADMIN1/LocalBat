package Recursion1.Testcases;
import Recursion1.AllStar;

public class _AllStar
{
    static String[] testcaseStrings = {
        "allStar(\"hello\")",
        "allStar(\"abc\")",
        "allStar(\"ab\")",
    };

    static String[] expectedResults = { "h*e*l*l*o", "a*b*c", "a*b", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            AllStar.allStar("hello"),
            AllStar.allStar("abc"),
            AllStar.allStar("ab"),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
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
