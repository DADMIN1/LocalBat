package Functional2.Testcases;
import Functional2.No9;
import java.util.List;
import java.util.Arrays;

public class _No9
{
    static String[] testcaseStrings = {
        "no9([1, 2, 19])",
        "no9([9, 19, 29, 3])",
        "no9([1, 2, 3])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList(1, 2),
        Arrays.asList(3),
        Arrays.asList(1, 2, 3),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            No9.no9(Arrays.asList(1, 2, 19)),
            No9.no9(Arrays.asList(9, 19, 29, 3)),
            No9.no9(Arrays.asList(1, 2, 3)),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(expectedResults[i]))
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
