package Logic1.Testcases;
import Logic1.More20;

public class _More20
{
    static String[] testcaseStrings = {
        "more20(20)",
        "more20(21)",
        "more20(22)",
        "more20(23)",
        "more20(25)",
        "more20(30)",
        "more20(31)",
        "more20(59)",
        "more20(60)",
        "more20(61)",
        "more20(62)",
        "more20(1020)",
        "more20(1021)",
        "more20(1000)",
        "more20(1001)",
        "more20(50)",
        "more20(55)",
        "more20(40)",
        "more20(41)",
        "more20(39)",
        "more20(42)",
    };

    static boolean[] expectedResults = {
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
        false,
        false,
        true,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            More20.more20(20),
            More20.more20(21),
            More20.more20(22),
            More20.more20(23),
            More20.more20(25),
            More20.more20(30),
            More20.more20(31),
            More20.more20(59),
            More20.more20(60),
            More20.more20(61),
            More20.more20(62),
            More20.more20(1020),
            More20.more20(1021),
            More20.more20(1000),
            More20.more20(1001),
            More20.more20(50),
            More20.more20(55),
            More20.more20(40),
            More20.more20(41),
            More20.more20(39),
            More20.more20(42),
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
