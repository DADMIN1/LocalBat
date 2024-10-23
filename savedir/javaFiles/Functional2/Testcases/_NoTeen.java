package Functional2.Testcases;
import Functional2.NoTeen;
import java.util.List;
import java.util.Arrays;

public class _NoTeen
{
    static String[] testcaseStrings = {
        "noTeen([12, 13, 19, 20])",
        "noTeen([1, 14, 1])",
        "noTeen([15])",
    };

    static List<Integer>[] expectedResults = {
        Arrays.asList(12, 20),
        Arrays.asList(1, 1),
        Arrays.asList(),
    };

    public static void Validate(boolean printSuccess)
    {
        List<Integer>[] resultsArray = {
            NoTeen.noTeen([12, 13, 19, 20]),
            NoTeen.noTeen([1, 14, 1]),
            NoTeen.noTeen([15]),
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
