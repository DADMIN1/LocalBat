package Functional1.Testcases;
import Functional1.Doubling;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class _Doubling
{
    static String[] testcaseStrings = {
        "doubling([1, 2, 3])",
        "doubling([6, 8, 6, 8, -1])",
        "doubling([])",
        "doubling([5])",
        "doubling([5, 10])",
        "doubling([8, -5, 7, 3, 109])",
        "doubling([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2])",
        "doubling([3, 1, 4, 1, 5, 9])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList(2, 4, 6),
        Arrays.asList(12, 16, 12, 16, -2),
        Arrays.asList(),
        Arrays.asList(10),
        Arrays.asList(10, 20),
        Arrays.asList(16, -10, 14, 6, 218),
        Arrays.asList(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4),
        Arrays.asList(6, 2, 8, 2, 10, 18),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            Doubling.doubling(new ArrayList<>(Arrays.asList(1, 2, 3))),
            Doubling.doubling(new ArrayList<>(Arrays.asList(6, 8, 6, 8, -1))),
            Doubling.doubling(new ArrayList<>(Arrays.asList())),
            Doubling.doubling(new ArrayList<>(Arrays.asList(5))),
            Doubling.doubling(new ArrayList<>(Arrays.asList(5, 10))),
            Doubling.doubling(new ArrayList<>(Arrays.asList(8, -5, 7, 3, 109))),
            Doubling.doubling(new ArrayList<>(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2))),
            Doubling.doubling(new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9))),
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
