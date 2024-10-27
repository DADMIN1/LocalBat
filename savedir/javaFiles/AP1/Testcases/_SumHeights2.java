package AP1.Testcases;
import AP1.SumHeights2;

public final class _SumHeights2
{
    static final String[] testcaseStrings = {
        "sumHeights2([5, 3, 6, 7, 2], 2, 4)",
        "sumHeights2([5, 3, 6, 7, 2], 0, 1)",
        "sumHeights2([5, 3, 6, 7, 2], 0, 4)",
        "sumHeights2([5, 3, 6, 7, 2], 1, 1)",
        "sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3)",
        "sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 4, 8)",
        "sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 7, 8)",
        "sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 8, 8)",
        "sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 2, 2)",
        "sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 3, 6)",
        "sumHeights2([10, 8, 7, 7, 7, 6, 7], 1, 4)",
        "sumHeights2([10, 8, 7, 7, 7, 6, 7], 1, 5)",
    };

    static final int[] expectedResults = {
        7,
        2,
        15,
        0,
        6,
        19,
        16,
        0,
        0,
        4,
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
            SumHeights2.sumHeights2(heights0, 2, 4),
            SumHeights2.sumHeights2(heights1, 0, 1),
            SumHeights2.sumHeights2(heights2, 0, 4),
            SumHeights2.sumHeights2(heights3, 1, 1),
            SumHeights2.sumHeights2(heights4, 0, 3),
            SumHeights2.sumHeights2(heights5, 4, 8),
            SumHeights2.sumHeights2(heights6, 7, 8),
            SumHeights2.sumHeights2(heights7, 8, 8),
            SumHeights2.sumHeights2(heights8, 2, 2),
            SumHeights2.sumHeights2(heights9, 3, 6),
            SumHeights2.sumHeights2(heights10, 1, 4),
            SumHeights2.sumHeights2(heights11, 1, 5),
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
