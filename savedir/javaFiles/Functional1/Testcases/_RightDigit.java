package Functional1.Testcases;
import Functional1.RightDigit;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class _RightDigit
{
    static String[] testcaseStrings = {
        "rightDigit([1, 22, 93])",
        "rightDigit([16, 8, 886, 8, 1])",
        "rightDigit([10, 0])",
        "rightDigit([])",
        "rightDigit([5, 10])",
        "rightDigit([5, 50, 500, 5000, 5000])",
        "rightDigit([6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList(1, 2, 3),
        Arrays.asList(6, 8, 6, 8, 1),
        Arrays.asList(0, 0),
        Arrays.asList(),
        Arrays.asList(5, 0),
        Arrays.asList(5, 0, 0, 0, 0),
        Arrays.asList(6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            RightDigit.rightDigit(new ArrayList<>(Arrays.asList(1, 22, 93))),
            RightDigit.rightDigit(new ArrayList<>(Arrays.asList(16, 8, 886, 8, 1))),
            RightDigit.rightDigit(new ArrayList<>(Arrays.asList(10, 0))),
            RightDigit.rightDigit(new ArrayList<>(Arrays.asList())),
            RightDigit.rightDigit(new ArrayList<>(Arrays.asList(5, 10))),
            RightDigit.rightDigit(new ArrayList<>(Arrays.asList(5, 50, 500, 5000, 5000))),
            RightDigit.rightDigit(new ArrayList<>(Arrays.asList(6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2))),
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
