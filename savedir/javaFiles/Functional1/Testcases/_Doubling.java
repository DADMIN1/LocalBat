package Functional1.Testcases;
import Functional1.Doubling;
import java.util.List;
import java.util.Arrays;

public class _Doubling
{
    static String[] testcaseStrings = {
        "doubling([1, 2, 3])",
        "doubling([6, 8, 6, 8, -1])",
        "doubling([])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList(2, 4, 6),
        Arrays.asList(12, 16, 12, 16, -2),
        Arrays.asList(),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            Doubling.doubling(Arrays.asList(1, 2, 3)),
            Doubling.doubling(Arrays.asList(6, 8, 6, 8, -1)),
            Doubling.doubling(Arrays.asList()),
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
