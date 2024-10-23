package Logic2.Testcases;
import Logic2.RoundSum;

public class _RoundSum
{
    static String[] testcaseStrings = {
        "roundSum(16, 17, 18)",
        "roundSum(12, 13, 14)",
        "roundSum(6, 4, 4)",
    };

    static int[] expectedResults = {
        60,
        30,
        10,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            RoundSum.roundSum(16, 17, 18),
            RoundSum.roundSum(12, 13, 14),
            RoundSum.roundSum(6, 4, 4),
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
