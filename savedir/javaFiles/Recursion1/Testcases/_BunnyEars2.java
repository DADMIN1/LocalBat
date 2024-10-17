package Recursion1.Testcases;
import Recursion1.BunnyEars2;

public class _BunnyEars2
{
    static String[] testcaseStrings = {
        "bunnyEars2(0)",
        "bunnyEars2(1)",
        "bunnyEars2(2)",
    };

    static int[] expectedResults = { 0, 2, 5, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            BunnyEars2.bunnyEars2(0),
            BunnyEars2.bunnyEars2(1),
            BunnyEars2.bunnyEars2(2),
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
