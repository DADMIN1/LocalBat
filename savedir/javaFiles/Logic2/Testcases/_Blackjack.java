package Logic2.Testcases;
import Logic2.Blackjack;

public class _Blackjack
{
    static String[] testcaseStrings = {
        "blackjack(19, 21)",
        "blackjack(21, 19)",
        "blackjack(19, 22)",
    };

    static int[] expectedResults = {
        21,
        21,
        19,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Blackjack.blackjack(19, 21),
            Blackjack.blackjack(21, 19),
            Blackjack.blackjack(19, 22),
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
