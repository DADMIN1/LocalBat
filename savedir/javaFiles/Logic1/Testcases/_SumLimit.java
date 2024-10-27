package Logic1.Testcases;
import Logic1.SumLimit;

public final class _SumLimit
{
    static final String[] testcaseStrings = {
        "sumLimit(2, 3)",
        "sumLimit(8, 3)",
        "sumLimit(8, 1)",
        "sumLimit(11, 39)",
        "sumLimit(11, 99)",
        "sumLimit(0, 0)",
        "sumLimit(99, 0)",
        "sumLimit(99, 1)",
        "sumLimit(123, 1)",
        "sumLimit(1, 123)",
        "sumLimit(23, 60)",
        "sumLimit(23, 80)",
        "sumLimit(9000, 1)",
        "sumLimit(90000000, 1)",
        "sumLimit(9000, 1000)",
    };

    static final int[] expectedResults = {
        5,
        8,
        9,
        50,
        11,
        0,
        99,
        99,
        124,
        1,
        83,
        23,
        9001,
        90000001,
        9000,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            SumLimit.sumLimit(2, 3),
            SumLimit.sumLimit(8, 3),
            SumLimit.sumLimit(8, 1),
            SumLimit.sumLimit(11, 39),
            SumLimit.sumLimit(11, 99),
            SumLimit.sumLimit(0, 0),
            SumLimit.sumLimit(99, 0),
            SumLimit.sumLimit(99, 1),
            SumLimit.sumLimit(123, 1),
            SumLimit.sumLimit(1, 123),
            SumLimit.sumLimit(23, 60),
            SumLimit.sumLimit(23, 80),
            SumLimit.sumLimit(9000, 1),
            SumLimit.sumLimit(90000000, 1),
            SumLimit.sumLimit(9000, 1000),
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
