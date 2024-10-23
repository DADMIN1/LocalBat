package Recursion1.Testcases;
import Recursion1.CountX;

public class _CountX
{
    static String[] testcaseStrings = {
        "countX(\"xxhixx\")",
        "countX(\"xhixhix\")",
        "countX(\"hi\")",
    };

    static int[] expectedResults = {
        4,
        3,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            CountX.countX("xxhixx"),
            CountX.countX("xhixhix"),
            CountX.countX("hi"),
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
