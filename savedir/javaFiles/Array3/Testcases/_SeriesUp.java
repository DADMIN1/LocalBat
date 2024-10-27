package Array3.Testcases;
import Array3.SeriesUp;
import java.util.Arrays;
import java.util.ArrayList;

public final class _SeriesUp
{
    static final String[] testcaseStrings = {
        "seriesUp(3)",
        "seriesUp(4)",
        "seriesUp(2)",
        "seriesUp(1)",
        "seriesUp(0)",
        "seriesUp(6)",
    };

    static final int[][] expectedResults = {
        {1, 1, 2, 1, 2, 3},
        {1, 1, 2, 1, 2, 3, 1, 2, 3, 4},
        {1, 1, 2},
        {1},
        {},
        {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6},
    };

    public static final String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static final void Validate(boolean printSuccess)
    {
        final int[][] resultsArray = {
            SeriesUp.seriesUp(3),
            SeriesUp.seriesUp(4),
            SeriesUp.seriesUp(2),
            SeriesUp.seriesUp(1),
            SeriesUp.seriesUp(0),
            SeriesUp.seriesUp(6),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!Arrays.equals(resultsArray[i], expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(expectedResults[i]));
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
