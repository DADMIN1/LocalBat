package Array1.Testcases;
import Array1.Start1;

public class _Start1
{
    static String[] testcaseStrings = {
        "start1([1, 2, 3], [1, 3])",
        "start1([7, 2, 3], [1])",
        "start1([1, 2], [])",
        "start1([], [1, 2])",
        "start1([7], [])",
        "start1([7], [1])",
        "start1([1], [1])",
        "start1([7], [8])",
        "start1([], [])",
        "start1([1, 3], [1])",
    };

    static int[] expectedResults = {
        2,
        1,
        1,
        1,
        0,
        1,
        2,
        0,
        0,
        2,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] a0 = { 1, 2, 3 }; int[] b0 = { 1, 3 }; 
        int[] a1 = { 7, 2, 3 }; int[] b1 = { 1 }; 
        int[] a2 = { 1, 2 }; int[] b2 = {  }; 
        int[] a3 = {  }; int[] b3 = { 1, 2 }; 
        int[] a4 = { 7 }; int[] b4 = {  }; 
        int[] a5 = { 7 }; int[] b5 = { 1 }; 
        int[] a6 = { 1 }; int[] b6 = { 1 }; 
        int[] a7 = { 7 }; int[] b7 = { 8 }; 
        int[] a8 = {  }; int[] b8 = {  }; 
        int[] a9 = { 1, 3 }; int[] b9 = { 1 }; 

        int[] resultsArray = {
            Start1.start1(a0, b0),
            Start1.start1(a1, b1),
            Start1.start1(a2, b2),
            Start1.start1(a3, b3),
            Start1.start1(a4, b4),
            Start1.start1(a5, b5),
            Start1.start1(a6, b6),
            Start1.start1(a7, b7),
            Start1.start1(a8, b8),
            Start1.start1(a9, b9),
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
