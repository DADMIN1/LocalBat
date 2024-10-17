package Array1.Testcases;
import Array1.Start1;

public class _Start1
{
    static String[] testcaseStrings = {
        "start1([1, 2, 3], [1, 3])",
        "start1([7, 2, 3], [1])",
        "start1([1, 2], [])",
    };

    static int[] expectedResults = { 2, 1, 1, };

    public static void Validate(boolean printSuccess)
    {
        int[] a0 = { 1, 2, 3 }; int[] b0 = { 1, 3 }; 
        int[] a1 = { 7, 2, 3 }; int[] b1 = { 1 }; 
        int[] a2 = { 1, 2 }; int[] b2 = {  }; 

        int[] resultsArray = {
            Start1.start1(a0, b0),
            Start1.start1(a1, b1),
            Start1.start1(a2, b2),
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
