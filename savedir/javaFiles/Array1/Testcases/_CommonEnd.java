package Array1.Testcases;
import Array1.CommonEnd;

public class _CommonEnd
{
    static String[] testcaseStrings = {
        "commonEnd([1, 2, 3], [7, 3])",
        "commonEnd([1, 2, 3], [7, 3, 2])",
        "commonEnd([1, 2, 3], [1, 3])",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        int[] a0 = { 1, 2, 3 }; int[] b0 = { 7, 3 }; 
        int[] a1 = { 1, 2, 3 }; int[] b1 = { 7, 3, 2 }; 
        int[] a2 = { 1, 2, 3 }; int[] b2 = { 1, 3 }; 

        boolean[] resultsArray = {
            CommonEnd.commonEnd(a0, b0),
            CommonEnd.commonEnd(a1, b1),
            CommonEnd.commonEnd(a2, b2),
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
