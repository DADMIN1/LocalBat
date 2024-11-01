package AP1.Testcases;
import AP1.BigHeights;

public final class _BigHeights
{
    static final String[] testcaseStrings = {
        "bigHeights([5, 3, 6, 7, 2], 2, 4)",
        "bigHeights([5, 3, 6, 7, 2], 0, 1)",
        "bigHeights([5, 3, 6, 7, 2], 0, 4)",
        "bigHeights([5, 3, 6, 7, 3], 0, 4)",
        "bigHeights([5, 3, 6, 7, 2], 1, 1)",
        "bigHeights([5, 13, 6, 7, 2], 1, 2)",
        "bigHeights([5, 13, 6, 7, 2], 0, 2)",
        "bigHeights([5, 13, 6, 7, 2], 1, 4)",
        "bigHeights([5, 13, 6, 7, 2], 0, 4)",
        "bigHeights([5, 13, 6, 7, 2], 0, 3)",
        "bigHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3)",
        "bigHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 4, 8)",
        "bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 0, 3)",
        "bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 7, 8)",
        "bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 3, 8)",
        "bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 2, 8)",
    };

    static final int[] expectedResults = {
        1,
        0,
        1,
        0,
        0,
        1,
        2,
        2,
        3,
        2,
        0,
        1,
        1,
        1,
        2,
        3,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] heights0 = {5, 3, 6, 7, 2}; 
        final int[] heights1 = {5, 3, 6, 7, 2}; 
        final int[] heights2 = {5, 3, 6, 7, 2}; 
        final int[] heights3 = {5, 3, 6, 7, 3}; 
        final int[] heights4 = {5, 3, 6, 7, 2}; 
        final int[] heights5 = {5, 13, 6, 7, 2}; 
        final int[] heights6 = {5, 13, 6, 7, 2}; 
        final int[] heights7 = {5, 13, 6, 7, 2}; 
        final int[] heights8 = {5, 13, 6, 7, 2}; 
        final int[] heights9 = {5, 13, 6, 7, 2}; 
        final int[] heights10 = {1, 2, 3, 4, 5, 4, 3, 2, 10}; 
        final int[] heights11 = {1, 2, 3, 4, 5, 4, 3, 2, 10}; 
        final int[] heights12 = {1, 2, 3, 14, 5, 4, 3, 2, 10}; 
        final int[] heights13 = {1, 2, 3, 14, 5, 4, 3, 2, 10}; 
        final int[] heights14 = {1, 2, 3, 14, 5, 4, 3, 2, 10}; 
        final int[] heights15 = {1, 2, 3, 14, 5, 4, 3, 2, 10}; 

        final int[] resultsArray = {
            BigHeights.bigHeights(heights0, 2, 4),
            BigHeights.bigHeights(heights1, 0, 1),
            BigHeights.bigHeights(heights2, 0, 4),
            BigHeights.bigHeights(heights3, 0, 4),
            BigHeights.bigHeights(heights4, 1, 1),
            BigHeights.bigHeights(heights5, 1, 2),
            BigHeights.bigHeights(heights6, 0, 2),
            BigHeights.bigHeights(heights7, 1, 4),
            BigHeights.bigHeights(heights8, 0, 4),
            BigHeights.bigHeights(heights9, 0, 3),
            BigHeights.bigHeights(heights10, 0, 3),
            BigHeights.bigHeights(heights11, 4, 8),
            BigHeights.bigHeights(heights12, 0, 3),
            BigHeights.bigHeights(heights13, 7, 8),
            BigHeights.bigHeights(heights14, 3, 8),
            BigHeights.bigHeights(heights15, 2, 8),
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
