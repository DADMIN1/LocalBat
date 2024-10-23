package Array3.Testcases;
import Array3.LinearIn;

public class _LinearIn
{
    static String[] testcaseStrings = {
        "linearIn([1, 2, 4, 6], [2, 4])",
        "linearIn([1, 2, 4, 6], [2, 3, 4])",
        "linearIn([1, 2, 4, 4, 6], [2, 4])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] outer0 = { 1, 2, 4, 6 }; int[] inner0 = { 2, 4 }; 
        int[] outer1 = { 1, 2, 4, 6 }; int[] inner1 = { 2, 3, 4 }; 
        int[] outer2 = { 1, 2, 4, 4, 6 }; int[] inner2 = { 2, 4 }; 

        boolean[] resultsArray = {
            LinearIn.linearIn(outer0, inner0),
            LinearIn.linearIn(outer1, inner1),
            LinearIn.linearIn(outer2, inner2),
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
