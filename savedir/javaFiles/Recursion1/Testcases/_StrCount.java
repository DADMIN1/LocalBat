package Recursion1.Testcases;
import Recursion1.StrCount;

public class _StrCount
{
    static String[] testcaseStrings = {
        "strCount(\"catcowcat\", \"cat\")",
        "strCount(\"catcowcat\", \"cow\")",
        "strCount(\"catcowcat\", \"dog\")",
    };

    static int[] expectedResults = { 2, 1, 0, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            StrCount.strCount("catcowcat", "cat"),
            StrCount.strCount("catcowcat", "cow"),
            StrCount.strCount("catcowcat", "dog"),
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
