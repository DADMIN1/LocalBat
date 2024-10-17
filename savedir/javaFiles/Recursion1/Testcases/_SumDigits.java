package Recursion1.Testcases;
import Recursion1.SumDigits;

public class _SumDigits
{
    static String[] testcaseStrings = {
        "sumDigits(126)",
        "sumDigits(49)",
        "sumDigits(12)",
    };

    static int[] expectedResults = { 9, 13, 3, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            SumDigits.sumDigits(126),
            SumDigits.sumDigits(49),
            SumDigits.sumDigits(12),
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
