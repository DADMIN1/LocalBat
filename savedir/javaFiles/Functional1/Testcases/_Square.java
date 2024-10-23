package Functional1.Testcases;
import Functional1.Square;
import java.util.List;
import java.util.Arrays;

public class _Square
{
    static String[] testcaseStrings = {
        "square([1, 2, 3])",
        "square([6, 8, -6, -8, 1])",
        "square([])",
    };

    static List<Integer>[] expectedResults = {
        Arrays.asList(1, 4, 9),
        Arrays.asList(36, 64, 36, 64, 1),
        Arrays.asList(),
    };

    public static void Validate(boolean printSuccess)
    {
        List<Integer>[] resultsArray = {
            Square.square([1, 2, 3]),
            Square.square([6, 8, -6, -8, 1]),
            Square.square([]),
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
