package Functional2.Testcases;
import Functional2.Two2;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class _Two2
{
    static String[] testcaseStrings = {
        "two2([1, 2, 3])",
        "two2([2, 6, 11])",
        "two2([0])",
        "two2([])",
        "two2([1, 11, 111, 16])",
        "two2([2, 3, 5, 7, 11])",
        "two2([3, 1, 4, 1, 6, 99, 0])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList(4, 6),
        Arrays.asList(4),
        Arrays.asList(0),
        Arrays.asList(),
        Arrays.asList(),
        Arrays.asList(4, 6, 10, 14),
        Arrays.asList(6, 8, 198, 0),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            Two2.two2(new ArrayList<>(Arrays.asList(1, 2, 3))),
            Two2.two2(new ArrayList<>(Arrays.asList(2, 6, 11))),
            Two2.two2(new ArrayList<>(Arrays.asList(0))),
            Two2.two2(new ArrayList<>(Arrays.asList())),
            Two2.two2(new ArrayList<>(Arrays.asList(1, 11, 111, 16))),
            Two2.two2(new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11))),
            Two2.two2(new ArrayList<>(Arrays.asList(3, 1, 4, 1, 6, 99, 0))),
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
