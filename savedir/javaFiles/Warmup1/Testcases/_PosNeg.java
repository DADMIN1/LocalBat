package Warmup1.Testcases;
import Warmup1.PosNeg;

public final class _PosNeg
{
    static final String[] testcaseStrings = {
        "posNeg(1, -1, false)",
        "posNeg(-1, 1, false)",
        "posNeg(-4, -5, true)",
        "posNeg(-4, -5, false)",
        "posNeg(-4, 5, false)",
        "posNeg(-4, 5, true)",
        "posNeg(1, 1, false)",
        "posNeg(-1, -1, false)",
        "posNeg(1, -1, true)",
        "posNeg(-1, 1, true)",
        "posNeg(1, 1, true)",
        "posNeg(-1, -1, true)",
        "posNeg(5, -5, false)",
        "posNeg(-6, 6, false)",
        "posNeg(-5, -6, false)",
        "posNeg(-2, -1, false)",
        "posNeg(1, 2, false)",
        "posNeg(-5, 6, true)",
        "posNeg(-5, -5, true)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        true,
        false,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            PosNeg.posNeg(1, -1, false),
            PosNeg.posNeg(-1, 1, false),
            PosNeg.posNeg(-4, -5, true),
            PosNeg.posNeg(-4, -5, false),
            PosNeg.posNeg(-4, 5, false),
            PosNeg.posNeg(-4, 5, true),
            PosNeg.posNeg(1, 1, false),
            PosNeg.posNeg(-1, -1, false),
            PosNeg.posNeg(1, -1, true),
            PosNeg.posNeg(-1, 1, true),
            PosNeg.posNeg(1, 1, true),
            PosNeg.posNeg(-1, -1, true),
            PosNeg.posNeg(5, -5, false),
            PosNeg.posNeg(-6, 6, false),
            PosNeg.posNeg(-5, -6, false),
            PosNeg.posNeg(-2, -1, false),
            PosNeg.posNeg(1, 2, false),
            PosNeg.posNeg(-5, 6, true),
            PosNeg.posNeg(-5, -5, true),
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
