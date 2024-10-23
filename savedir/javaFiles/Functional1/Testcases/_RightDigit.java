package Functional1.Testcases;
import Functional1.RightDigit;
import java.util.List;
import java.util.Arrays;

public class _RightDigit
{
    static String[] testcaseStrings = {
        "rightDigit([1, 22, 93])",
        "rightDigit([16, 8, 886, 8, 1])",
        "rightDigit([10, 0])",
    };

    static List<Integer>[] expectedResults = {
        Arrays.asList(1, 2, 3),
        Arrays.asList(6, 8, 6, 8, 1),
        Arrays.asList(0, 0),
    };

    public static void Validate(boolean printSuccess)
    {
        List<Integer>[] resultsArray = {
            RightDigit.rightDigit([1, 22, 93]),
            RightDigit.rightDigit([16, 8, 886, 8, 1]),
            RightDigit.rightDigit([10, 0]),
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
