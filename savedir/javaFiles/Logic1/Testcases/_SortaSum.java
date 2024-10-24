package Logic1.Testcases;
import Logic1.SortaSum;

public class _SortaSum
{
    static String[] testcaseStrings = {
        "sortaSum(3, 4)",
        "sortaSum(9, 4)",
        "sortaSum(10, 11)",
        "sortaSum(12, -3)",
        "sortaSum(-3, 12)",
        "sortaSum(4, 5)",
        "sortaSum(4, 6)",
        "sortaSum(14, 7)",
        "sortaSum(14, 6)",
    };

    static int[] expectedResults = {
        7,
        20,
        21,
        9,
        9,
        9,
        20,
        21,
        20,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            SortaSum.sortaSum(3, 4),
            SortaSum.sortaSum(9, 4),
            SortaSum.sortaSum(10, 11),
            SortaSum.sortaSum(12, -3),
            SortaSum.sortaSum(-3, 12),
            SortaSum.sortaSum(4, 5),
            SortaSum.sortaSum(4, 6),
            SortaSum.sortaSum(14, 7),
            SortaSum.sortaSum(14, 6),
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
