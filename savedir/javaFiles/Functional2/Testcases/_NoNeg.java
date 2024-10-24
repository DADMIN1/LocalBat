package Functional2.Testcases;
import Functional2.NoNeg;
import java.util.List;
import java.util.Arrays;

public class _NoNeg
{
    static String[] testcaseStrings = {
        "noNeg([1, -2])",
        "noNeg([-3, -3, 3, 3])",
        "noNeg([-1, -1, -1])",
        "noNeg([])",
        "noNeg([0, 1, 2])",
        "noNeg([3, -10, 1, -1, 4, -400])",
        "noNeg([-1, 3, 1, -1, -10, -100, -111, 5])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList(1),
        Arrays.asList(3, 3),
        Arrays.asList(),
        Arrays.asList(),
        Arrays.asList(0, 1, 2),
        Arrays.asList(3, 1, 4),
        Arrays.asList(3, 1, 5),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            NoNeg.noNeg(Arrays.asList(1, -2)),
            NoNeg.noNeg(Arrays.asList(-3, -3, 3, 3)),
            NoNeg.noNeg(Arrays.asList(-1, -1, -1)),
            NoNeg.noNeg(Arrays.asList()),
            NoNeg.noNeg(Arrays.asList(0, 1, 2)),
            NoNeg.noNeg(Arrays.asList(3, -10, 1, -1, 4, -400)),
            NoNeg.noNeg(Arrays.asList(-1, 3, 1, -1, -10, -100, -111, 5)),
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
