package Recursion1.Testcases;
import Recursion1.BunnyEars2;

public final class _BunnyEars2
{
    static final String[] testcaseStrings = {
        "bunnyEars2(0)",
        "bunnyEars2(1)",
        "bunnyEars2(2)",
        "bunnyEars2(3)",
        "bunnyEars2(4)",
        "bunnyEars2(5)",
        "bunnyEars2(6)",
        "bunnyEars2(10)",
    };

    static final int[] expectedResults = {
        0,
        2,
        5,
        7,
        10,
        12,
        15,
        25,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            BunnyEars2.bunnyEars2(0),
            BunnyEars2.bunnyEars2(1),
            BunnyEars2.bunnyEars2(2),
            BunnyEars2.bunnyEars2(3),
            BunnyEars2.bunnyEars2(4),
            BunnyEars2.bunnyEars2(5),
            BunnyEars2.bunnyEars2(6),
            BunnyEars2.bunnyEars2(10),
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
