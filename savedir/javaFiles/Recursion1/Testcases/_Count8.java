package Recursion1.Testcases;
import Recursion1.Count8;

public class _Count8
{
    static String[] testcaseStrings = {
        "count8(8)",
        "count8(818)",
        "count8(8818)",
        "count8(8088)",
        "count8(123)",
        "count8(81238)",
        "count8(88788)",
        "count8(8234)",
        "count8(2348)",
        "count8(23884)",
        "count8(0)",
        "count8(1818188)",
        "count8(8818181)",
        "count8(1080)",
        "count8(188)",
        "count8(88888)",
        "count8(9898)",
        "count8(78)",
    };

    static int[] expectedResults = {
        1,
        2,
        4,
        4,
        0,
        2,
        6,
        1,
        1,
        3,
        0,
        5,
        5,
        1,
        3,
        9,
        2,
        1,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Count8.count8(8),
            Count8.count8(818),
            Count8.count8(8818),
            Count8.count8(8088),
            Count8.count8(123),
            Count8.count8(81238),
            Count8.count8(88788),
            Count8.count8(8234),
            Count8.count8(2348),
            Count8.count8(23884),
            Count8.count8(0),
            Count8.count8(1818188),
            Count8.count8(8818181),
            Count8.count8(1080),
            Count8.count8(188),
            Count8.count8(88888),
            Count8.count8(9898),
            Count8.count8(78),
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
