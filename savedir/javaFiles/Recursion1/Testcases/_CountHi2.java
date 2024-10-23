package Recursion1.Testcases;
import Recursion1.CountHi2;

public class _CountHi2
{
    static String[] testcaseStrings = {
        "countHi2(\"ahixhi\")",
        "countHi2(\"ahibhi\")",
        "countHi2(\"xhixhi\")",
    };

    static int[] expectedResults = {
        1,
        2,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            CountHi2.countHi2("ahixhi"),
            CountHi2.countHi2("ahibhi"),
            CountHi2.countHi2("xhixhi"),
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
