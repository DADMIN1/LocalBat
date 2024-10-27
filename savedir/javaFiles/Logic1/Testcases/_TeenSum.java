package Logic1.Testcases;
import Logic1.TeenSum;

public final class _TeenSum
{
    static final String[] testcaseStrings = {
        "teenSum(3, 4)",
        "teenSum(10, 13)",
        "teenSum(13, 2)",
        "teenSum(3, 19)",
        "teenSum(13, 13)",
        "teenSum(10, 10)",
        "teenSum(6, 14)",
        "teenSum(15, 2)",
        "teenSum(19, 19)",
        "teenSum(19, 20)",
        "teenSum(2, 18)",
        "teenSum(12, 4)",
        "teenSum(2, 20)",
        "teenSum(2, 17)",
        "teenSum(2, 16)",
        "teenSum(6, 7)",
    };

    static final int[] expectedResults = {
        7,
        19,
        19,
        19,
        19,
        20,
        19,
        19,
        19,
        19,
        19,
        16,
        22,
        19,
        19,
        13,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            TeenSum.teenSum(3, 4),
            TeenSum.teenSum(10, 13),
            TeenSum.teenSum(13, 2),
            TeenSum.teenSum(3, 19),
            TeenSum.teenSum(13, 13),
            TeenSum.teenSum(10, 10),
            TeenSum.teenSum(6, 14),
            TeenSum.teenSum(15, 2),
            TeenSum.teenSum(19, 19),
            TeenSum.teenSum(19, 20),
            TeenSum.teenSum(2, 18),
            TeenSum.teenSum(12, 4),
            TeenSum.teenSum(2, 20),
            TeenSum.teenSum(2, 17),
            TeenSum.teenSum(2, 16),
            TeenSum.teenSum(6, 7),
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
