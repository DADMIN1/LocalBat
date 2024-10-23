package Recursion1.Testcases;
import Recursion1.BunnyEars;

public class _BunnyEars
{
    static String[] testcaseStrings = {
        "bunnyEars(0)",
        "bunnyEars(1)",
        "bunnyEars(2)",
    };

    static int[] expectedResults = {
        0,
        2,
        4,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            BunnyEars.bunnyEars(0),
            BunnyEars.bunnyEars(1),
            BunnyEars.bunnyEars(2),
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
