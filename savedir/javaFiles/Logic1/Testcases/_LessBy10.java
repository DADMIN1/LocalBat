package Logic1.Testcases;
import Logic1.LessBy10;

public final class _LessBy10
{
    static final String[] testcaseStrings = {
        "lessBy10(1, 7, 11)",
        "lessBy10(1, 7, 10)",
        "lessBy10(11, 1, 7)",
        "lessBy10(10, 7, 1)",
        "lessBy10(-10, 2, 2)",
        "lessBy10(2, 11, 11)",
        "lessBy10(3, 3, 30)",
        "lessBy10(3, 3, 3)",
        "lessBy10(10, 1, 11)",
        "lessBy10(10, 11, 1)",
        "lessBy10(10, 11, 2)",
        "lessBy10(3, 30, 3)",
        "lessBy10(2, 2, -8)",
        "lessBy10(2, 8, 12)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            LessBy10.lessBy10(1, 7, 11),
            LessBy10.lessBy10(1, 7, 10),
            LessBy10.lessBy10(11, 1, 7),
            LessBy10.lessBy10(10, 7, 1),
            LessBy10.lessBy10(-10, 2, 2),
            LessBy10.lessBy10(2, 11, 11),
            LessBy10.lessBy10(3, 3, 30),
            LessBy10.lessBy10(3, 3, 3),
            LessBy10.lessBy10(10, 1, 11),
            LessBy10.lessBy10(10, 11, 1),
            LessBy10.lessBy10(10, 11, 2),
            LessBy10.lessBy10(3, 30, 3),
            LessBy10.lessBy10(2, 2, -8),
            LessBy10.lessBy10(2, 8, 12),
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
