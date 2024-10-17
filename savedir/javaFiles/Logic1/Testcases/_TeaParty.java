package Logic1.Testcases;
import Logic1.TeaParty;

public class _TeaParty
{
    static String[] testcaseStrings = {
        "teaParty(6, 8)",
        "teaParty(3, 8)",
        "teaParty(20, 6)",
    };

    static int[] expectedResults = { 1, 0, 2, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            TeaParty.teaParty(6, 8),
            TeaParty.teaParty(3, 8),
            TeaParty.teaParty(20, 6),
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
