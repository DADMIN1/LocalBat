package Warmup1.Testcases;
import Warmup1.Max1020;

public class _Max1020
{
    static String[] testcaseStrings = {
        "max1020(11, 19)",
        "max1020(19, 11)",
        "max1020(11, 9)",
    };

    static int[] expectedResults = {
        19,
        19,
        11,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Max1020.max1020(11, 19),
            Max1020.max1020(19, 11),
            Max1020.max1020(11, 9),
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
