package AP1.Testcases;
import AP1.SumHeights;

public class _SumHeights
{
    static String[] testcaseStrings = {
        "sumHeights([5, 3, 6, 7, 2], 2, 4)",
        "sumHeights([5, 3, 6, 7, 2], 0, 1)",
        "sumHeights([5, 3, 6, 7, 2], 0, 4)",
    };

    static int[] expectedResults = {
        6,
        2,
        11,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] heights0 = { 5, 3, 6, 7, 2 }; 
        int[] heights1 = { 5, 3, 6, 7, 2 }; 
        int[] heights2 = { 5, 3, 6, 7, 2 }; 

        int[] resultsArray = {
            SumHeights.sumHeights(heights0, 2, 4),
            SumHeights.sumHeights(heights1, 0, 1),
            SumHeights.sumHeights(heights2, 0, 4),
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
