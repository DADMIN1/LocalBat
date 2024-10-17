package Warmup2.Testcases;
import Warmup2.CountXX;

public class _CountXX
{
    static String[] testcaseStrings = {
        "countXX(\"abcxx\")",
        "countXX(\"xxx\")",
        "countXX(\"xxxx\")",
    };

    static int[] expectedResults = { 1, 2, 3, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            CountXX.countXX("abcxx"),
            CountXX.countXX("xxx"),
            CountXX.countXX("xxxx"),
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
