package Recursion1.Testcases;
import Recursion1.SumDigits;

public final class _SumDigits
{
    static final String[] testcaseStrings = {
        "sumDigits(126)",
        "sumDigits(49)",
        "sumDigits(12)",
        "sumDigits(10)",
        "sumDigits(1)",
        "sumDigits(0)",
        "sumDigits(730)",
        "sumDigits(1111)",
        "sumDigits(11111)",
        "sumDigits(10110)",
        "sumDigits(235)",
    };

    static final int[] expectedResults = {
        9,
        13,
        3,
        1,
        1,
        0,
        10,
        4,
        5,
        3,
        10,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            SumDigits.sumDigits(126),
            SumDigits.sumDigits(49),
            SumDigits.sumDigits(12),
            SumDigits.sumDigits(10),
            SumDigits.sumDigits(1),
            SumDigits.sumDigits(0),
            SumDigits.sumDigits(730),
            SumDigits.sumDigits(1111),
            SumDigits.sumDigits(11111),
            SumDigits.sumDigits(10110),
            SumDigits.sumDigits(235),
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
