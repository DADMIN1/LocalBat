package Logic1.Testcases;
import Logic1.SquirrelPlay;

public class _SquirrelPlay
{
    static String[] testcaseStrings = {
        "squirrelPlay(70, false)",
        "squirrelPlay(95, false)",
        "squirrelPlay(95, true)",
        "squirrelPlay(90, false)",
        "squirrelPlay(90, true)",
        "squirrelPlay(50, false)",
        "squirrelPlay(50, true)",
        "squirrelPlay(100, false)",
        "squirrelPlay(100, true)",
        "squirrelPlay(105, true)",
        "squirrelPlay(59, false)",
        "squirrelPlay(59, true)",
        "squirrelPlay(60, false)",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        false,
        false,
        false,
        true,
        false,
        false,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            SquirrelPlay.squirrelPlay(70, false),
            SquirrelPlay.squirrelPlay(95, false),
            SquirrelPlay.squirrelPlay(95, true),
            SquirrelPlay.squirrelPlay(90, false),
            SquirrelPlay.squirrelPlay(90, true),
            SquirrelPlay.squirrelPlay(50, false),
            SquirrelPlay.squirrelPlay(50, true),
            SquirrelPlay.squirrelPlay(100, false),
            SquirrelPlay.squirrelPlay(100, true),
            SquirrelPlay.squirrelPlay(105, true),
            SquirrelPlay.squirrelPlay(59, false),
            SquirrelPlay.squirrelPlay(59, true),
            SquirrelPlay.squirrelPlay(60, false),
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
