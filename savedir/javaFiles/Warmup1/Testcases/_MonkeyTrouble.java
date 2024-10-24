package Warmup1.Testcases;
import Warmup1.MonkeyTrouble;

public class _MonkeyTrouble
{
    static String[] testcaseStrings = {
        "monkeyTrouble(true, true)",
        "monkeyTrouble(false, false)",
        "monkeyTrouble(true, false)",
        "monkeyTrouble(false, true)",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            MonkeyTrouble.monkeyTrouble(true, true),
            MonkeyTrouble.monkeyTrouble(false, false),
            MonkeyTrouble.monkeyTrouble(true, false),
            MonkeyTrouble.monkeyTrouble(false, true),
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
