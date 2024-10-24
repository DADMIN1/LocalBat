package Logic1.Testcases;
import Logic1.Less20;

public class _Less20
{
    static String[] testcaseStrings = {
        "less20(18)",
        "less20(19)",
        "less20(20)",
        "less20(8)",
        "less20(17)",
        "less20(23)",
        "less20(25)",
        "less20(30)",
        "less20(31)",
        "less20(58)",
        "less20(59)",
        "less20(60)",
        "less20(61)",
        "less20(62)",
        "less20(1017)",
        "less20(1018)",
        "less20(1019)",
        "less20(1020)",
        "less20(1021)",
        "less20(1022)",
        "less20(1023)",
        "less20(37)",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            Less20.less20(18),
            Less20.less20(19),
            Less20.less20(20),
            Less20.less20(8),
            Less20.less20(17),
            Less20.less20(23),
            Less20.less20(25),
            Less20.less20(30),
            Less20.less20(31),
            Less20.less20(58),
            Less20.less20(59),
            Less20.less20(60),
            Less20.less20(61),
            Less20.less20(62),
            Less20.less20(1017),
            Less20.less20(1018),
            Less20.less20(1019),
            Less20.less20(1020),
            Less20.less20(1021),
            Less20.less20(1022),
            Less20.less20(1023),
            Less20.less20(37),
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
