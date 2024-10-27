package Warmup1.Testcases;
import Warmup1.MixStart;

public final class _MixStart
{
    static final String[] testcaseStrings = {
        "mixStart(\"mix snacks\")",
        "mixStart(\"pix snacks\")",
        "mixStart(\"piz snacks\")",
        "mixStart(\"nix\")",
        "mixStart(\"ni\")",
        "mixStart(\"n\")",
        "mixStart(\"\")",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        false,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            MixStart.mixStart("mix snacks"),
            MixStart.mixStart("pix snacks"),
            MixStart.mixStart("piz snacks"),
            MixStart.mixStart("nix"),
            MixStart.mixStart("ni"),
            MixStart.mixStart("n"),
            MixStart.mixStart(""),
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
