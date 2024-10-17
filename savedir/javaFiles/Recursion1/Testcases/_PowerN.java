package Recursion1.Testcases;
import Recursion1.PowerN;

public class _PowerN
{
    static String[] testcaseStrings = {
        "powerN(3, 1)",
        "powerN(3, 2)",
        "powerN(3, 3)",
    };

    static int[] expectedResults = { 3, 9, 27, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            PowerN.powerN(3, 1),
            PowerN.powerN(3, 2),
            PowerN.powerN(3, 3),
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
