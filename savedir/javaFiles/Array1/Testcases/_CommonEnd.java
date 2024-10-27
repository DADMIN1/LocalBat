package Array1.Testcases;
import Array1.CommonEnd;

public final class _CommonEnd
{
    static final String[] testcaseStrings = {
        "commonEnd([1, 2, 3], [7, 3])",
        "commonEnd([1, 2, 3], [7, 3, 2])",
        "commonEnd([1, 2, 3], [1, 3])",
        "commonEnd([1, 2, 3], [1])",
        "commonEnd([1, 2, 3], [2])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] a0 = { 1, 2, 3 }; final int[] b0 = { 7, 3 }; 
        final int[] a1 = { 1, 2, 3 }; final int[] b1 = { 7, 3, 2 }; 
        final int[] a2 = { 1, 2, 3 }; final int[] b2 = { 1, 3 }; 
        final int[] a3 = { 1, 2, 3 }; final int[] b3 = { 1 }; 
        final int[] a4 = { 1, 2, 3 }; final int[] b4 = { 2 }; 

        final boolean[] resultsArray = {
            CommonEnd.commonEnd(a0, b0),
            CommonEnd.commonEnd(a1, b1),
            CommonEnd.commonEnd(a2, b2),
            CommonEnd.commonEnd(a3, b3),
            CommonEnd.commonEnd(a4, b4),
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
