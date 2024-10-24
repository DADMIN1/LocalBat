package AP1.Testcases;
import AP1.ScoresSpecial;

public class _ScoresSpecial
{
    static String[] testcaseStrings = {
        "scoresSpecial([12, 10, 4], [2, 20, 30])",
        "scoresSpecial([20, 10, 4], [2, 20, 10])",
        "scoresSpecial([12, 11, 4], [2, 20, 31])",
        "scoresSpecial([1, 20, 2, 50], [3, 4, 5])",
        "scoresSpecial([3, 4, 5], [1, 50, 2, 20])",
        "scoresSpecial([10, 4, 20, 30], [20])",
        "scoresSpecial([10, 4, 20, 30], [20])",
        "scoresSpecial([10, 4, 20, 30], [3, 20, 99])",
        "scoresSpecial([10, 4, 20, 30], [30, 20, 99])",
        "scoresSpecial([], [2])",
        "scoresSpecial([], [20])",
        "scoresSpecial([14, 10, 4], [4, 20, 30])",
    };

    static int[] expectedResults = {
        40,
        40,
        20,
        50,
        50,
        50,
        50,
        50,
        60,
        0,
        20,
        40,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] a0 = { 12, 10, 4 }; int[] b0 = { 2, 20, 30 }; 
        int[] a1 = { 20, 10, 4 }; int[] b1 = { 2, 20, 10 }; 
        int[] a2 = { 12, 11, 4 }; int[] b2 = { 2, 20, 31 }; 
        int[] a3 = { 1, 20, 2, 50 }; int[] b3 = { 3, 4, 5 }; 
        int[] a4 = { 3, 4, 5 }; int[] b4 = { 1, 50, 2, 20 }; 
        int[] a5 = { 10, 4, 20, 30 }; int[] b5 = { 20 }; 
        int[] a6 = { 10, 4, 20, 30 }; int[] b6 = { 20 }; 
        int[] a7 = { 10, 4, 20, 30 }; int[] b7 = { 3, 20, 99 }; 
        int[] a8 = { 10, 4, 20, 30 }; int[] b8 = { 30, 20, 99 }; 
        int[] a9 = {  }; int[] b9 = { 2 }; 
        int[] a10 = {  }; int[] b10 = { 20 }; 
        int[] a11 = { 14, 10, 4 }; int[] b11 = { 4, 20, 30 }; 

        int[] resultsArray = {
            ScoresSpecial.scoresSpecial(a0, b0),
            ScoresSpecial.scoresSpecial(a1, b1),
            ScoresSpecial.scoresSpecial(a2, b2),
            ScoresSpecial.scoresSpecial(a3, b3),
            ScoresSpecial.scoresSpecial(a4, b4),
            ScoresSpecial.scoresSpecial(a5, b5),
            ScoresSpecial.scoresSpecial(a6, b6),
            ScoresSpecial.scoresSpecial(a7, b7),
            ScoresSpecial.scoresSpecial(a8, b8),
            ScoresSpecial.scoresSpecial(a9, b9),
            ScoresSpecial.scoresSpecial(a10, b10),
            ScoresSpecial.scoresSpecial(a11, b11),
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
