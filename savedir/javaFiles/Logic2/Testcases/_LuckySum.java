package Logic2.Testcases;
import Logic2.LuckySum;

public class _LuckySum
{
    static String[] testcaseStrings = {
        "luckySum(1, 2, 3)",
        "luckySum(1, 2, 13)",
        "luckySum(1, 13, 3)",
    };

    static int[] expectedResults = { 6, 3, 1, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            LuckySum.luckySum(1, 2, 3),
            LuckySum.luckySum(1, 2, 13),
            LuckySum.luckySum(1, 13, 3),
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
