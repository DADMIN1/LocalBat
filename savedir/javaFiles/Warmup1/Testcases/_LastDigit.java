package Warmup1.Testcases;
import Warmup1.LastDigit;

public class _LastDigit
{
    static String[] testcaseStrings = {
        "lastDigit(7, 17)",
        "lastDigit(6, 17)",
        "lastDigit(3, 113)",
        "lastDigit(114, 113)",
        "lastDigit(114, 4)",
        "lastDigit(10, 0)",
        "lastDigit(11, 0)",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            LastDigit.lastDigit(7, 17),
            LastDigit.lastDigit(6, 17),
            LastDigit.lastDigit(3, 113),
            LastDigit.lastDigit(114, 113),
            LastDigit.lastDigit(114, 4),
            LastDigit.lastDigit(10, 0),
            LastDigit.lastDigit(11, 0),
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
