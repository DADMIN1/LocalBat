package Logic2.Testcases;
import Logic2.LuckySum;

public final class _LuckySum
{
    static final String[] testcaseStrings = {
        "luckySum(1, 2, 3)",
        "luckySum(1, 2, 13)",
        "luckySum(1, 13, 3)",
        "luckySum(1, 13, 13)",
        "luckySum(6, 5, 2)",
        "luckySum(13, 2, 3)",
        "luckySum(13, 2, 13)",
        "luckySum(13, 13, 2)",
        "luckySum(9, 4, 13)",
        "luckySum(8, 13, 2)",
        "luckySum(7, 2, 1)",
        "luckySum(3, 3, 13)",
    };

    static final int[] expectedResults = {
        6,
        3,
        1,
        1,
        13,
        0,
        0,
        0,
        13,
        8,
        10,
        6,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            LuckySum.luckySum(1, 2, 3),
            LuckySum.luckySum(1, 2, 13),
            LuckySum.luckySum(1, 13, 3),
            LuckySum.luckySum(1, 13, 13),
            LuckySum.luckySum(6, 5, 2),
            LuckySum.luckySum(13, 2, 3),
            LuckySum.luckySum(13, 2, 13),
            LuckySum.luckySum(13, 13, 2),
            LuckySum.luckySum(9, 4, 13),
            LuckySum.luckySum(8, 13, 2),
            LuckySum.luckySum(7, 2, 1),
            LuckySum.luckySum(3, 3, 13),
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
