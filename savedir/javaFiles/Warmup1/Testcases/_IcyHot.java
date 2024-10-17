package Warmup1.Testcases;
import Warmup1.IcyHot;

public class _IcyHot
{
    static String[] testcaseStrings = {
        "icyHot(120, -1)",
        "icyHot(-1, 120)",
        "icyHot(2, 120)",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            IcyHot.icyHot(120, -1),
            IcyHot.icyHot(-1, 120),
            IcyHot.icyHot(2, 120),
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
