package Logic2.Testcases;
import Logic2.NoTeenSum;

public class _NoTeenSum
{
    static String[] testcaseStrings = {
        "noTeenSum(1, 2, 3)",
        "noTeenSum(2, 13, 1)",
        "noTeenSum(2, 1, 14)",
        "noTeenSum(2, 1, 15)",
        "noTeenSum(2, 1, 16)",
        "noTeenSum(2, 1, 17)",
        "noTeenSum(17, 1, 2)",
        "noTeenSum(2, 15, 2)",
        "noTeenSum(16, 17, 18)",
        "noTeenSum(17, 18, 19)",
        "noTeenSum(15, 16, 1)",
        "noTeenSum(15, 15, 19)",
        "noTeenSum(15, 19, 16)",
        "noTeenSum(5, 17, 18)",
        "noTeenSum(17, 18, 16)",
        "noTeenSum(17, 19, 18)",
    };

    static int[] expectedResults = {
        6,
        3,
        3,
        18,
        19,
        3,
        3,
        19,
        16,
        0,
        32,
        30,
        31,
        5,
        16,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            NoTeenSum.noTeenSum(1, 2, 3),
            NoTeenSum.noTeenSum(2, 13, 1),
            NoTeenSum.noTeenSum(2, 1, 14),
            NoTeenSum.noTeenSum(2, 1, 15),
            NoTeenSum.noTeenSum(2, 1, 16),
            NoTeenSum.noTeenSum(2, 1, 17),
            NoTeenSum.noTeenSum(17, 1, 2),
            NoTeenSum.noTeenSum(2, 15, 2),
            NoTeenSum.noTeenSum(16, 17, 18),
            NoTeenSum.noTeenSum(17, 18, 19),
            NoTeenSum.noTeenSum(15, 16, 1),
            NoTeenSum.noTeenSum(15, 15, 19),
            NoTeenSum.noTeenSum(15, 19, 16),
            NoTeenSum.noTeenSum(5, 17, 18),
            NoTeenSum.noTeenSum(17, 18, 16),
            NoTeenSum.noTeenSum(17, 19, 18),
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
