package Recursion1.Testcases;
import Recursion1.EndX;

public class _EndX
{
    static String[] testcaseStrings = {
        "endX(\"xxre\")",
        "endX(\"xxhixx\")",
        "endX(\"xhixhix\")",
    };

    static String[] expectedResults = { "rexx", "hixxxx", "hihixxx", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            EndX.endX("xxre"),
            EndX.endX("xxhixx"),
            EndX.endX("xhixhix"),
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
