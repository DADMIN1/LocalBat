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
        "noTeen([-15])",
        "noTeen([])",
        "noTeen([0, 1, 2, -3])",
        "noTeen([15, 17, 19, 21, 19])",
        "noTeen([-16, 2, 15, 3, 16, 25])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList(12, 20),
        Arrays.asList(1, 1),
        Arrays.asList(),
        Arrays.asList(-15),
        Arrays.asList(),
        Arrays.asList(0, 1, 2, -3),
        Arrays.asList(21),
        Arrays.asList(-16, 2, 3, 25),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            NoTeen.noTeen(Arrays.asList(12, 13, 19, 20)),
            NoTeen.noTeen(Arrays.asList(1, 14, 1)),
            NoTeen.noTeen(Arrays.asList(15)),
            NoTeen.noTeen(Arrays.asList(-15)),
            NoTeen.noTeen(Arrays.asList()),
            NoTeen.noTeen(Arrays.asList(0, 1, 2, -3)),
            NoTeen.noTeen(Arrays.asList(15, 17, 19, 21, 19)),
            NoTeen.noTeen(Arrays.asList(-16, 2, 15, 3, 16, 25)),
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
