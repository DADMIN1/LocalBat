package Logic1.Testcases;
import Logic1.LastDigit;

public class _LastDigit
{
    static String[] testcaseStrings = {
        "lastDigit(23, 19, 13)",
        "lastDigit(23, 19, 12)",
        "lastDigit(23, 19, 3)",
        "lastDigit(23, 19, 39)",
        "lastDigit(1, 2, 3)",
        "lastDigit(1, 1, 2)",
        "lastDigit(1, 2, 2)",
        "lastDigit(14, 25, 43)",
        "lastDigit(14, 25, 45)",
        "lastDigit(248, 106, 1002)",
        "lastDigit(248, 106, 1008)",
        "lastDigit(10, 11, 20)",
        "lastDigit(0, 11, 0)",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            LastDigit.lastDigit(23, 19, 13),
            LastDigit.lastDigit(23, 19, 12),
            LastDigit.lastDigit(23, 19, 3),
            LastDigit.lastDigit(23, 19, 39),
            LastDigit.lastDigit(1, 2, 3),
            LastDigit.lastDigit(1, 1, 2),
            LastDigit.lastDigit(1, 2, 2),
            LastDigit.lastDigit(14, 25, 43),
            LastDigit.lastDigit(14, 25, 45),
            LastDigit.lastDigit(248, 106, 1002),
            LastDigit.lastDigit(248, 106, 1008),
            LastDigit.lastDigit(10, 11, 20),
            LastDigit.lastDigit(0, 11, 0),
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
