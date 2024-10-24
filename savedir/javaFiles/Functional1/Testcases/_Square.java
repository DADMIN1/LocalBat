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
        "square([12])",
        "square([5, 10])",
        "square([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList(1, 4, 9),
        Arrays.asList(36, 64, 36, 64, 1),
        Arrays.asList(),
        Arrays.asList(144),
        Arrays.asList(25, 100),
        Arrays.asList(36, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            Square.square(Arrays.asList(1, 2, 3)),
            Square.square(Arrays.asList(6, 8, -6, -8, 1)),
            Square.square(Arrays.asList()),
            Square.square(Arrays.asList(12)),
            Square.square(Arrays.asList(5, 10)),
            Square.square(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)),
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
