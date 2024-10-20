package Logic1.Testcases;
import Logic1.SortaSum;

public class _SortaSum
{
    static String[] testcaseStrings = {
        "sortaSum(3, 4)",
        "sortaSum(9, 4)",
        "sortaSum(10, 11)",
    };

    static int[] expectedResults = { 7, 20, 21, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            SortaSum.sortaSum(3, 4),
            SortaSum.sortaSum(9, 4),
            SortaSum.sortaSum(10, 11),
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
