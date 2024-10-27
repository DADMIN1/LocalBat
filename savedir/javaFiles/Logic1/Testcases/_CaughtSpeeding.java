package Logic1.Testcases;
import Logic1.CaughtSpeeding;

public final class _CaughtSpeeding
{
    static final String[] testcaseStrings = {
        "caughtSpeeding(60, false)",
        "caughtSpeeding(65, false)",
        "caughtSpeeding(65, true)",
        "caughtSpeeding(80, false)",
        "caughtSpeeding(85, false)",
        "caughtSpeeding(85, true)",
        "caughtSpeeding(70, false)",
        "caughtSpeeding(75, false)",
        "caughtSpeeding(75, true)",
        "caughtSpeeding(40, false)",
        "caughtSpeeding(40, true)",
        "caughtSpeeding(90, false)",
    };

    static final int[] expectedResults = {
        0,
        1,
        0,
        1,
        2,
        1,
        1,
        1,
        1,
        0,
        0,
        2,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            CaughtSpeeding.caughtSpeeding(60, false),
            CaughtSpeeding.caughtSpeeding(65, false),
            CaughtSpeeding.caughtSpeeding(65, true),
            CaughtSpeeding.caughtSpeeding(80, false),
            CaughtSpeeding.caughtSpeeding(85, false),
            CaughtSpeeding.caughtSpeeding(85, true),
            CaughtSpeeding.caughtSpeeding(70, false),
            CaughtSpeeding.caughtSpeeding(75, false),
            CaughtSpeeding.caughtSpeeding(75, true),
            CaughtSpeeding.caughtSpeeding(40, false),
            CaughtSpeeding.caughtSpeeding(40, true),
            CaughtSpeeding.caughtSpeeding(90, false),
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
