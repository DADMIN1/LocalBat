package Logic1.Testcases;
import Logic1.TwoAsOne;

public final class _TwoAsOne
{
    static final String[] testcaseStrings = {
        "twoAsOne(1, 2, 3)",
        "twoAsOne(3, 1, 2)",
        "twoAsOne(3, 2, 2)",
        "twoAsOne(2, 3, 1)",
        "twoAsOne(5, 3, -2)",
        "twoAsOne(5, 3, -3)",
        "twoAsOne(2, 5, 3)",
        "twoAsOne(9, 5, 5)",
        "twoAsOne(9, 4, 5)",
        "twoAsOne(5, 4, 9)",
        "twoAsOne(3, 3, 0)",
        "twoAsOne(3, 3, 2)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            TwoAsOne.twoAsOne(1, 2, 3),
            TwoAsOne.twoAsOne(3, 1, 2),
            TwoAsOne.twoAsOne(3, 2, 2),
            TwoAsOne.twoAsOne(2, 3, 1),
            TwoAsOne.twoAsOne(5, 3, -2),
            TwoAsOne.twoAsOne(5, 3, -3),
            TwoAsOne.twoAsOne(2, 5, 3),
            TwoAsOne.twoAsOne(9, 5, 5),
            TwoAsOne.twoAsOne(9, 4, 5),
            TwoAsOne.twoAsOne(5, 4, 9),
            TwoAsOne.twoAsOne(3, 3, 0),
            TwoAsOne.twoAsOne(3, 3, 2),
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
