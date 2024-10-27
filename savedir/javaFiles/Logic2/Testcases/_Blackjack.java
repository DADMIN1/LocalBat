package Logic2.Testcases;
import Logic2.Blackjack;

public final class _Blackjack
{
    static final String[] testcaseStrings = {
        "blackjack(19, 21)",
        "blackjack(21, 19)",
        "blackjack(19, 22)",
        "blackjack(22, 19)",
        "blackjack(22, 50)",
        "blackjack(22, 22)",
        "blackjack(33, 1)",
        "blackjack(1, 2)",
        "blackjack(34, 33)",
        "blackjack(17, 19)",
        "blackjack(18, 17)",
        "blackjack(16, 23)",
        "blackjack(3, 4)",
        "blackjack(3, 2)",
        "blackjack(21, 20)",
    };

    static final int[] expectedResults = {
        21,
        21,
        19,
        19,
        0,
        0,
        1,
        2,
        0,
        19,
        18,
        16,
        4,
        3,
        21,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            Blackjack.blackjack(19, 21),
            Blackjack.blackjack(21, 19),
            Blackjack.blackjack(19, 22),
            Blackjack.blackjack(22, 19),
            Blackjack.blackjack(22, 50),
            Blackjack.blackjack(22, 22),
            Blackjack.blackjack(33, 1),
            Blackjack.blackjack(1, 2),
            Blackjack.blackjack(34, 33),
            Blackjack.blackjack(17, 19),
            Blackjack.blackjack(18, 17),
            Blackjack.blackjack(16, 23),
            Blackjack.blackjack(3, 4),
            Blackjack.blackjack(3, 2),
            Blackjack.blackjack(21, 20),
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
