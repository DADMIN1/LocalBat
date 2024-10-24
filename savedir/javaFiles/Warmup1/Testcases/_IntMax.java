package Warmup1.Testcases;
import Warmup1.IntMax;

public class _IntMax
{
    static String[] testcaseStrings = {
        "intMax(1, 2, 3)",
        "intMax(1, 3, 2)",
        "intMax(3, 2, 1)",
        "intMax(9, 3, 3)",
        "intMax(3, 9, 3)",
        "intMax(3, 3, 9)",
        "intMax(8, 2, 3)",
        "intMax(-3, -1, -2)",
        "intMax(6, 2, 5)",
        "intMax(5, 6, 2)",
        "intMax(5, 2, 6)",
    };

    static int[] expectedResults = {
        3,
        3,
        3,
        9,
        9,
        9,
        8,
        -1,
        6,
        6,
        6,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            IntMax.intMax(1, 2, 3),
            IntMax.intMax(1, 3, 2),
            IntMax.intMax(3, 2, 1),
            IntMax.intMax(9, 3, 3),
            IntMax.intMax(3, 9, 3),
            IntMax.intMax(3, 3, 9),
            IntMax.intMax(8, 2, 3),
            IntMax.intMax(-3, -1, -2),
            IntMax.intMax(6, 2, 5),
            IntMax.intMax(5, 6, 2),
            IntMax.intMax(5, 2, 6),
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
