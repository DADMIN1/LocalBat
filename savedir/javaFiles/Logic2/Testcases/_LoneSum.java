package Logic2.Testcases;
import Logic2.LoneSum;

public class _LoneSum
{
    static String[] testcaseStrings = {
        "loneSum(1, 2, 3)",
        "loneSum(3, 2, 3)",
        "loneSum(3, 3, 3)",
        "loneSum(9, 2, 2)",
        "loneSum(2, 2, 9)",
        "loneSum(2, 9, 2)",
        "loneSum(2, 9, 3)",
        "loneSum(4, 2, 3)",
        "loneSum(1, 3, 1)",
    };

    static int[] expectedResults = {
        6,
        2,
        0,
        9,
        9,
        9,
        14,
        9,
        3,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            LoneSum.loneSum(1, 2, 3),
            LoneSum.loneSum(3, 2, 3),
            LoneSum.loneSum(3, 3, 3),
            LoneSum.loneSum(9, 2, 2),
            LoneSum.loneSum(2, 2, 9),
            LoneSum.loneSum(2, 9, 2),
            LoneSum.loneSum(2, 9, 3),
            LoneSum.loneSum(4, 2, 3),
            LoneSum.loneSum(1, 3, 1),
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
