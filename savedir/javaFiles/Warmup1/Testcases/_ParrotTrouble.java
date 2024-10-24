package Warmup1.Testcases;
import Warmup1.ParrotTrouble;

public class _ParrotTrouble
{
    static String[] testcaseStrings = {
        "parrotTrouble(true, 6)",
        "parrotTrouble(true, 7)",
        "parrotTrouble(false, 6)",
        "parrotTrouble(true, 21)",
        "parrotTrouble(false, 21)",
        "parrotTrouble(false, 20)",
        "parrotTrouble(true, 23)",
        "parrotTrouble(false, 23)",
        "parrotTrouble(true, 20)",
        "parrotTrouble(false, 12)",
    };

    static boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        false,
        false,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            ParrotTrouble.parrotTrouble(true, 6),
            ParrotTrouble.parrotTrouble(true, 7),
            ParrotTrouble.parrotTrouble(false, 6),
            ParrotTrouble.parrotTrouble(true, 21),
            ParrotTrouble.parrotTrouble(false, 21),
            ParrotTrouble.parrotTrouble(false, 20),
            ParrotTrouble.parrotTrouble(true, 23),
            ParrotTrouble.parrotTrouble(false, 23),
            ParrotTrouble.parrotTrouble(true, 20),
            ParrotTrouble.parrotTrouble(false, 12),
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
