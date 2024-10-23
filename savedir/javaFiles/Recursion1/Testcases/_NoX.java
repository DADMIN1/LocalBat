package Recursion1.Testcases;
import Recursion1.NoX;

public class _NoX
{
    static String[] testcaseStrings = {
        "noX(\"xaxb\")",
        "noX(\"abc\")",
        "noX(\"xx\")",
    };

    static String[] expectedResults = {
        "ab",
        "abc",
        "",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            NoX.noX("xaxb"),
            NoX.noX("abc"),
            NoX.noX("xx"),
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
