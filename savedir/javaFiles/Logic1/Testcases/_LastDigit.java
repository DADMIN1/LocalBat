package Logic1.Testcases;
import Logic1.LastDigit;

public class _LastDigit
{
    static String[] testcaseStrings = {
        "lastDigit(23, 19, 13)",
        "lastDigit(23, 19, 12)",
        "lastDigit(23, 19, 3)",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            LastDigit.lastDigit(23, 19, 13),
            LastDigit.lastDigit(23, 19, 12),
            LastDigit.lastDigit(23, 19, 3),
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
