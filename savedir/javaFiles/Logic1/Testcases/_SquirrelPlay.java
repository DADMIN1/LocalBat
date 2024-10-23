package Logic1.Testcases;
import Logic1.SquirrelPlay;

public class _SquirrelPlay
{
    static String[] testcaseStrings = {
        "squirrelPlay(70, false)",
        "squirrelPlay(95, false)",
        "squirrelPlay(95, true)",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            SquirrelPlay.squirrelPlay(70, false),
            SquirrelPlay.squirrelPlay(95, false),
            SquirrelPlay.squirrelPlay(95, true),
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
