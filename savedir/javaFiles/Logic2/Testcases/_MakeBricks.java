package Logic2.Testcases;
import Logic2.MakeBricks;

public class _MakeBricks
{
    static String[] testcaseStrings = {
        "makeBricks(3, 1, 8)",
        "makeBricks(3, 1, 9)",
        "makeBricks(3, 2, 10)",
        "makeBricks(3, 2, 8)",
        "makeBricks(3, 2, 9)",
        "makeBricks(6, 1, 11)",
        "makeBricks(6, 0, 11)",
        "makeBricks(1, 4, 11)",
        "makeBricks(0, 3, 10)",
        "makeBricks(1, 4, 12)",
        "makeBricks(3, 1, 7)",
        "makeBricks(1, 1, 7)",
        "makeBricks(2, 1, 7)",
        "makeBricks(7, 1, 11)",
        "makeBricks(7, 1, 8)",
        "makeBricks(7, 1, 13)",
        "makeBricks(43, 1, 46)",
        "makeBricks(40, 1, 46)",
        "makeBricks(40, 2, 47)",
        "makeBricks(40, 2, 50)",
        "makeBricks(40, 2, 52)",
        "makeBricks(22, 2, 33)",
        "makeBricks(0, 2, 10)",
        "makeBricks(1000000, 1000, 1000100)",
        "makeBricks(2, 1000000, 100003)",
        "makeBricks(20, 0, 19)",
        "makeBricks(20, 0, 21)",
        "makeBricks(20, 4, 51)",
        "makeBricks(20, 4, 39)",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
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
        true,
        false,
        true,
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            MakeBricks.makeBricks(3, 1, 8),
            MakeBricks.makeBricks(3, 1, 9),
            MakeBricks.makeBricks(3, 2, 10),
            MakeBricks.makeBricks(3, 2, 8),
            MakeBricks.makeBricks(3, 2, 9),
            MakeBricks.makeBricks(6, 1, 11),
            MakeBricks.makeBricks(6, 0, 11),
            MakeBricks.makeBricks(1, 4, 11),
            MakeBricks.makeBricks(0, 3, 10),
            MakeBricks.makeBricks(1, 4, 12),
            MakeBricks.makeBricks(3, 1, 7),
            MakeBricks.makeBricks(1, 1, 7),
            MakeBricks.makeBricks(2, 1, 7),
            MakeBricks.makeBricks(7, 1, 11),
            MakeBricks.makeBricks(7, 1, 8),
            MakeBricks.makeBricks(7, 1, 13),
            MakeBricks.makeBricks(43, 1, 46),
            MakeBricks.makeBricks(40, 1, 46),
            MakeBricks.makeBricks(40, 2, 47),
            MakeBricks.makeBricks(40, 2, 50),
            MakeBricks.makeBricks(40, 2, 52),
            MakeBricks.makeBricks(22, 2, 33),
            MakeBricks.makeBricks(0, 2, 10),
            MakeBricks.makeBricks(1000000, 1000, 1000100),
            MakeBricks.makeBricks(2, 1000000, 100003),
            MakeBricks.makeBricks(20, 0, 19),
            MakeBricks.makeBricks(20, 0, 21),
            MakeBricks.makeBricks(20, 4, 51),
            MakeBricks.makeBricks(20, 4, 39),
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
