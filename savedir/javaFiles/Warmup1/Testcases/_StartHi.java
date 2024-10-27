package Warmup1.Testcases;
import Warmup1.StartHi;

public final class _StartHi
{
    static final String[] testcaseStrings = {
        "startHi(\"hi there\")",
        "startHi(\"hi\")",
        "startHi(\"hello hi\")",
        "startHi(\"he\")",
        "startHi(\"h\")",
        "startHi(\"\")",
        "startHi(\"ho hi\")",
        "startHi(\"hi ho\")",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            StartHi.startHi("hi there"),
            StartHi.startHi("hi"),
            StartHi.startHi("hello hi"),
            StartHi.startHi("he"),
            StartHi.startHi("h"),
            StartHi.startHi(""),
            StartHi.startHi("ho hi"),
            StartHi.startHi("hi ho"),
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
