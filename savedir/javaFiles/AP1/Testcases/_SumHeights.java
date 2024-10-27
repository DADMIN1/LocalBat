package AP1.Testcases;
import AP1.SumHeights;

public final class _SumHeights
{
    static final String[] testcaseStrings = {
        "sumHeights([5, 3, 6, 7, 2], 2, 4)",
        "sumHeights([5, 3, 6, 7, 2], 0, 1)",
        "sumHeights([5, 3, 6, 7, 2], 0, 4)",
        "sumHeights([5, 3, 6, 7, 2], 1, 1)",
        "sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3)",
        "sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 4, 8)",
        "sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 7, 8)",
        "sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 8, 8)",
        "sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 2, 2)",
        "sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 3, 6)",
        "sumHeights([10, 8, 7, 7, 7, 6, 7], 1, 4)",
        "sumHeights([10, 8, 7, 7, 7, 6, 7], 1, 5)",
    };

    static final int[] expectedResults = {
        6,
        2,
        11,
        0,
        3,
        11,
        8,
        0,
        0,
        3,
        1,
        2,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] heights0 = { 5, 3, 6, 7, 2 }; 
        final int[] heights1 = { 5, 3, 6, 7, 2 }; 
        final int[] heights2 = { 5, 3, 6, 7, 2 }; 
        final int[] heights3 = { 5, 3, 6, 7, 2 }; 
        final int[] heights4 = { 1, 2, 3, 4, 5, 4, 3, 2, 10 }; 
        final int[] heights5 = { 1, 2, 3, 4, 5, 4, 3, 2, 10 }; 
        final int[] heights6 = { 1, 2, 3, 4, 5, 4, 3, 2, 10 }; 
        final int[] heights7 = { 1, 2, 3, 4, 5, 4, 3, 2, 10 }; 
        final int[] heights8 = { 1, 2, 3, 4, 5, 4, 3, 2, 10 }; 
        final int[] heights9 = { 1, 2, 3, 4, 5, 4, 3, 2, 10 }; 
        final int[] heights10 = { 10, 8, 7, 7, 7, 6, 7 }; 
        final int[] heights11 = { 10, 8, 7, 7, 7, 6, 7 }; 

        final int[] resultsArray = {
            SumHeights.sumHeights(heights0, 2, 4),
            SumHeights.sumHeights(heights1, 0, 1),
            SumHeights.sumHeights(heights2, 0, 4),
            SumHeights.sumHeights(heights3, 1, 1),
            SumHeights.sumHeights(heights4, 0, 3),
            SumHeights.sumHeights(heights5, 4, 8),
            SumHeights.sumHeights(heights6, 7, 8),
            SumHeights.sumHeights(heights7, 8, 8),
            SumHeights.sumHeights(heights8, 2, 2),
            SumHeights.sumHeights(heights9, 3, 6),
            SumHeights.sumHeights(heights10, 1, 4),
            SumHeights.sumHeights(heights11, 1, 5),
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
