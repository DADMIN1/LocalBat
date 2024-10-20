package Functional1.Testcases;
import Functional1.Math1;
import java.util.List;
import java.util.Arrays;

public class _Math1
{
    static String[] testcaseStrings = {
        "math1([1, 2, 3])",
        "math1([6, 8, 6, 8, 1])",
        "math1([10])",
    };

    static List<Integer>[] expectedResults = { Arrays.asList(20, 30, 40), Arrays.asList(70, 90, 70, 90, 20), Arrays.asList(110), };

    public static void Validate(boolean printSuccess)
    {
        List<Integer>[] resultsArray = {
            Math1.math1([1, 2, 3]),
            Math1.math1([6, 8, 6, 8, 1]),
            Math1.math1([10]),
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
