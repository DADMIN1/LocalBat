package Logic1.Testcases;
import Logic1.SpecialEleven;

public final class _SpecialEleven
{
    static final String[] testcaseStrings = {
        "specialEleven(22)",
        "specialEleven(23)",
        "specialEleven(24)",
        "specialEleven(21)",
        "specialEleven(11)",
        "specialEleven(12)",
        "specialEleven(10)",
        "specialEleven(9)",
        "specialEleven(8)",
        "specialEleven(0)",
        "specialEleven(1)",
        "specialEleven(2)",
        "specialEleven(121)",
        "specialEleven(122)",
        "specialEleven(123)",
        "specialEleven(46)",
        "specialEleven(49)",
        "specialEleven(52)",
        "specialEleven(54)",
        "specialEleven(55)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            SpecialEleven.specialEleven(22),
            SpecialEleven.specialEleven(23),
            SpecialEleven.specialEleven(24),
            SpecialEleven.specialEleven(21),
            SpecialEleven.specialEleven(11),
            SpecialEleven.specialEleven(12),
            SpecialEleven.specialEleven(10),
            SpecialEleven.specialEleven(9),
            SpecialEleven.specialEleven(8),
            SpecialEleven.specialEleven(0),
            SpecialEleven.specialEleven(1),
            SpecialEleven.specialEleven(2),
            SpecialEleven.specialEleven(121),
            SpecialEleven.specialEleven(122),
            SpecialEleven.specialEleven(123),
            SpecialEleven.specialEleven(46),
            SpecialEleven.specialEleven(49),
            SpecialEleven.specialEleven(52),
            SpecialEleven.specialEleven(54),
            SpecialEleven.specialEleven(55),
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
