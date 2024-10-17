package Logic1.Testcases;
import Logic1.CaughtSpeeding;

public class _CaughtSpeeding
{
    static String[] testcaseStrings = {
        "caughtSpeeding(60, false)",
        "caughtSpeeding(65, false)",
        "caughtSpeeding(65, true)",
    };

    static int[] expectedResults = { 0, 1, 0, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            CaughtSpeeding.caughtSpeeding(60, false),
            CaughtSpeeding.caughtSpeeding(65, false),
            CaughtSpeeding.caughtSpeeding(65, true),
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
