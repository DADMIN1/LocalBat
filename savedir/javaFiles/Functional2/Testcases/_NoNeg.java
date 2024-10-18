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
    };

    static List<Integer>[] expectedResults = { Arrays.asList(1), Arrays.asList(3, 3), Arrays.asList(), };

    public static void Validate(boolean printSuccess)
    {
        List<Integer>[] resultsArray = {
            NoNeg.noNeg([1, -2]),
            NoNeg.noNeg([-3, -3, 3, 3]),
            NoNeg.noNeg([-1, -1, -1]),
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
