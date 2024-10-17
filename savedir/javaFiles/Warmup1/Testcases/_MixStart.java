package Warmup1.Testcases;
import Warmup1.MixStart;

public class _MixStart
{
    static String[] testcaseStrings = {
        "mixStart(\"mix snacks\")",
        "mixStart(\"pix snacks\")",
        "mixStart(\"piz snacks\")",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            MixStart.mixStart("mix snacks"),
            MixStart.mixStart("pix snacks"),
            MixStart.mixStart("piz snacks"),
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
