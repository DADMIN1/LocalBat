package Warmup1.Testcases;
import Warmup1.Max1020;

public class _Max1020
{
    static String[] testcaseStrings = {
        "max1020(11, 19)",
        "max1020(19, 11)",
        "max1020(11, 9)",
        "max1020(9, 21)",
        "max1020(10, 21)",
        "max1020(21, 10)",
        "max1020(9, 11)",
        "max1020(23, 10)",
        "max1020(20, 10)",
        "max1020(7, 20)",
        "max1020(17, 16)",
    };

    static int[] expectedResults = {
        19,
        19,
        11,
        0,
        10,
        10,
        11,
        10,
        20,
        20,
        17,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Max1020.max1020(11, 19),
            Max1020.max1020(19, 11),
            Max1020.max1020(11, 9),
            Max1020.max1020(9, 21),
            Max1020.max1020(10, 21),
            Max1020.max1020(21, 10),
            Max1020.max1020(9, 11),
            Max1020.max1020(23, 10),
            Max1020.max1020(20, 10),
            Max1020.max1020(7, 20),
            Max1020.max1020(17, 16),
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
