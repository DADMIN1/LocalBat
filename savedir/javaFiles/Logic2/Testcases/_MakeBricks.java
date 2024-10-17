package Logic2.Testcases;
import Logic2.MakeBricks;

public class _MakeBricks
{
    static String[] testcaseStrings = {
        "makeBricks(3, 1, 8)",
        "makeBricks(3, 1, 9)",
        "makeBricks(3, 2, 10)",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            MakeBricks.makeBricks(3, 1, 8),
            MakeBricks.makeBricks(3, 1, 9),
            MakeBricks.makeBricks(3, 2, 10),
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
