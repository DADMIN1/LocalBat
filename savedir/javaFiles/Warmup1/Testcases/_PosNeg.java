package Warmup1.Testcases;
import Warmup1.PosNeg;

public class _PosNeg
{
    static String[] testcaseStrings = {
        "posNeg(1, -1, false)",
        "posNeg(-1, 1, false)",
        "posNeg(-4, -5, true)",
    };

    static boolean[] expectedResults = { true, true, true, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            PosNeg.posNeg(1, -1, false),
            PosNeg.posNeg(-1, 1, false),
            PosNeg.posNeg(-4, -5, true),
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
