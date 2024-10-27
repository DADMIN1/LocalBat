package Warmup1.Testcases;
import Warmup1.SleepIn;

public final class _SleepIn
{
    static final String[] testcaseStrings = {
        "sleepIn(false, false)",
        "sleepIn(true, false)",
        "sleepIn(false, true)",
        "sleepIn(true, true)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            SleepIn.sleepIn(false, false),
            SleepIn.sleepIn(true, false),
            SleepIn.sleepIn(false, true),
            SleepIn.sleepIn(true, true),
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
