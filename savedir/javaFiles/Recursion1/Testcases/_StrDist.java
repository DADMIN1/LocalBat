package Recursion1.Testcases;
import Recursion1.StrDist;

public class _StrDist
{
    static String[] testcaseStrings = {
        "strDist(\"catcowcat\", \"cat\")",
        "strDist(\"catcowcat\", \"cow\")",
        "strDist(\"cccatcowcatxx\", \"cat\")",
    };

    static int[] expectedResults = {
        9,
        3,
        9,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            StrDist.strDist("catcowcat", "cat"),
            StrDist.strDist("catcowcat", "cow"),
            StrDist.strDist("cccatcowcatxx", "cat"),
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
