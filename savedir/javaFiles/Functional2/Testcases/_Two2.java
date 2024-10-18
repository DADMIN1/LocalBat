package Functional2.Testcases;
import Functional2.Two2;
import java.util.List;
import java.util.Arrays;

public class _Two2
{
    static String[] testcaseStrings = {
        "two2([1, 2, 3])",
        "two2([2, 6, 11])",
        "two2([0])",
    };

    static List<Integer>[] expectedResults = { Arrays.asList(4, 6), Arrays.asList(4), Arrays.asList(0), };

    public static void Validate(boolean printSuccess)
    {
        List<Integer>[] resultsArray = {
            Two2.two2([1, 2, 3]),
            Two2.two2([2, 6, 11]),
            Two2.two2([0]),
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
