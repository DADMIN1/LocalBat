package Logic1.Testcases;
import Logic1.TeenSum;

public class _TeenSum
{
    static String[] testcaseStrings = {
        "teenSum(3, 4)",
        "teenSum(10, 13)",
        "teenSum(13, 2)",
    };

    static int[] expectedResults = { 7, 19, 19, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            TeenSum.teenSum(3, 4),
            TeenSum.teenSum(10, 13),
            TeenSum.teenSum(13, 2),
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
