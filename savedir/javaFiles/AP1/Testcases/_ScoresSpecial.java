package AP1.Testcases;
import AP1.ScoresSpecial;

public class _ScoresSpecial
{
    static String[] testcaseStrings = {
        "scoresSpecial([12, 10, 4], [2, 20, 30])",
        "scoresSpecial([20, 10, 4], [2, 20, 10])",
        "scoresSpecial([12, 11, 4], [2, 20, 31])",
    };

    static int[] expectedResults = {
        40,
        40,
        20,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] a0 = { 12, 10, 4 }; int[] b0 = { 2, 20, 30 }; 
        int[] a1 = { 20, 10, 4 }; int[] b1 = { 2, 20, 10 }; 
        int[] a2 = { 12, 11, 4 }; int[] b2 = { 2, 20, 31 }; 

        int[] resultsArray = {
            ScoresSpecial.scoresSpecial(a0, b0),
            ScoresSpecial.scoresSpecial(a1, b1),
            ScoresSpecial.scoresSpecial(a2, b2),
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
