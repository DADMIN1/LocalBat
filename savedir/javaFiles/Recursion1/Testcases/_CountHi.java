package Recursion1.Testcases;
import Recursion1.CountHi;

public class _CountHi
{
    static String[] testcaseStrings = {
        "countHi(\"xxhixx\")",
        "countHi(\"xhixhix\")",
        "countHi(\"hi\")",
    };

    static int[] expectedResults = { 1, 2, 1, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            CountHi.countHi("xxhixx"),
            CountHi.countHi("xhixhix"),
            CountHi.countHi("hi"),
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
