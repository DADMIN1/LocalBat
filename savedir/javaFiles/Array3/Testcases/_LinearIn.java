package Array3.Testcases;
import Array3.LinearIn;

public class _LinearIn
{
    static String[] testcaseStrings = {
        "linearIn([1, 2, 4, 6], [2, 4])",
        "linearIn([1, 2, 4, 6], [2, 3, 4])",
        "linearIn([1, 2, 4, 4, 6], [2, 4])",
        "linearIn([2, 2, 4, 4, 6, 6], [2, 4])",
        "linearIn([2, 2, 2, 2, 2], [2, 2])",
        "linearIn([2, 2, 2, 2, 2], [2, 4])",
        "linearIn([2, 2, 2, 2, 4], [2, 4])",
        "linearIn([1, 2, 3], [2])",
        "linearIn([1, 2, 3], [-1])",
        "linearIn([1, 2, 3], [])",
        "linearIn([-1, 0, 3, 3, 3, 10, 12], [-1, 0, 3, 12])",
        "linearIn([-1, 0, 3, 3, 3, 10, 12], [0, 3, 12, 14])",
        "linearIn([-1, 0, 3, 3, 3, 10, 12], [-1, 10, 11])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] outer0 = { 1, 2, 4, 6 }; int[] inner0 = { 2, 4 }; 
        int[] outer1 = { 1, 2, 4, 6 }; int[] inner1 = { 2, 3, 4 }; 
        int[] outer2 = { 1, 2, 4, 4, 6 }; int[] inner2 = { 2, 4 }; 
        int[] outer3 = { 2, 2, 4, 4, 6, 6 }; int[] inner3 = { 2, 4 }; 
        int[] outer4 = { 2, 2, 2, 2, 2 }; int[] inner4 = { 2, 2 }; 
        int[] outer5 = { 2, 2, 2, 2, 2 }; int[] inner5 = { 2, 4 }; 
        int[] outer6 = { 2, 2, 2, 2, 4 }; int[] inner6 = { 2, 4 }; 
        int[] outer7 = { 1, 2, 3 }; int[] inner7 = { 2 }; 
        int[] outer8 = { 1, 2, 3 }; int[] inner8 = { -1 }; 
        int[] outer9 = { 1, 2, 3 }; int[] inner9 = {  }; 
        int[] outer10 = { -1, 0, 3, 3, 3, 10, 12 }; int[] inner10 = { -1, 0, 3, 12 }; 
        int[] outer11 = { -1, 0, 3, 3, 3, 10, 12 }; int[] inner11 = { 0, 3, 12, 14 }; 
        int[] outer12 = { -1, 0, 3, 3, 3, 10, 12 }; int[] inner12 = { -1, 10, 11 }; 

        boolean[] resultsArray = {
            LinearIn.linearIn(outer0, inner0),
            LinearIn.linearIn(outer1, inner1),
            LinearIn.linearIn(outer2, inner2),
            LinearIn.linearIn(outer3, inner3),
            LinearIn.linearIn(outer4, inner4),
            LinearIn.linearIn(outer5, inner5),
            LinearIn.linearIn(outer6, inner6),
            LinearIn.linearIn(outer7, inner7),
            LinearIn.linearIn(outer8, inner8),
            LinearIn.linearIn(outer9, inner9),
            LinearIn.linearIn(outer10, inner10),
            LinearIn.linearIn(outer11, inner11),
            LinearIn.linearIn(outer12, inner12),
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
