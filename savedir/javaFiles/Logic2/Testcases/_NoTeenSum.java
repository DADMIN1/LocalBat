package Logic2.Testcases;
import Logic2.NoTeenSum;

public class _NoTeenSum
{
    static String[] testcaseStrings = {
        "noTeenSum(1, 2, 3)",
        "noTeenSum(2, 13, 1)",
        "noTeenSum(2, 1, 14)",
    };

    static int[] expectedResults = {
        6,
        3,
        3,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            NoTeenSum.noTeenSum(1, 2, 3),
            NoTeenSum.noTeenSum(2, 13, 1),
            NoTeenSum.noTeenSum(2, 1, 14),
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
