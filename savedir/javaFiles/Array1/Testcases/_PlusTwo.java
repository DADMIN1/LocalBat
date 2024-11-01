package Array1.Testcases;
import Array1.PlusTwo;
import java.util.Arrays;
import java.util.ArrayList;

public final class _PlusTwo
{
    static final String[] testcaseStrings = {
        "plusTwo([1, 2], [3, 4])",
        "plusTwo([4, 4], [2, 2])",
        "plusTwo([9, 2], [3, 4])",
    };

    static final int[][] expectedResults = {
        {1, 2, 3, 4},
        {4, 4, 2, 2},
        {9, 2, 3, 4},
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
        final int[] a0 = {1, 2}; final int[] b0 = {3, 4}; 
        final int[] a1 = {4, 4}; final int[] b1 = {2, 2}; 
        final int[] a2 = {9, 2}; final int[] b2 = {3, 4}; 

        final int[][] resultsArray = {
            PlusTwo.plusTwo(a0, b0),
            PlusTwo.plusTwo(a1, b1),
            PlusTwo.plusTwo(a2, b2),
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
