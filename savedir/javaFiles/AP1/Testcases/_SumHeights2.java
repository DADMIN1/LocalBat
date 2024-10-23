package AP1.Testcases;
import AP1.SumHeights2;

public class _SumHeights2
{
    static String[] testcaseStrings = {
        "sumHeights2([5, 3, 6, 7, 2], 2, 4)",
        "sumHeights2([5, 3, 6, 7, 2], 0, 1)",
        "sumHeights2([5, 3, 6, 7, 2], 0, 4)",
    };

    static int[] expectedResults = {
        7,
        2,
        15,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] heights0 = { 5, 3, 6, 7, 2 }; 
        int[] heights1 = { 5, 3, 6, 7, 2 }; 
        int[] heights2 = { 5, 3, 6, 7, 2 }; 

        int[] resultsArray = {
            SumHeights2.sumHeights2(heights0, 2, 4),
            SumHeights2.sumHeights2(heights1, 0, 1),
            SumHeights2.sumHeights2(heights2, 0, 4),
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
