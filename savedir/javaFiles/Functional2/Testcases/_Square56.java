package Functional2.Testcases;
import Functional2.Square56;
import java.util.List;
import java.util.Arrays;

public class _Square56
{
    static String[] testcaseStrings = {
        "square56([3, 1, 4])",
        "square56([1])",
        "square56([2])",
        "square56([3])",
        "square56([4])",
        "square56([5])",
        "square56([6])",
        "square56([7])",
        "square56([1, 2, 3, 4, 5, 6, 7])",
        "square56([3, -1, -4, 1, 5, 9])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList(19, 11),
        Arrays.asList(11),
        Arrays.asList(14),
        Arrays.asList(19),
        Arrays.asList(),
        Arrays.asList(),
        Arrays.asList(),
        Arrays.asList(59),
        Arrays.asList(11, 14, 19, 59),
        Arrays.asList(19, 11, 11, 91),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            Square56.square56(Arrays.asList(3, 1, 4)),
            Square56.square56(Arrays.asList(1)),
            Square56.square56(Arrays.asList(2)),
            Square56.square56(Arrays.asList(3)),
            Square56.square56(Arrays.asList(4)),
            Square56.square56(Arrays.asList(5)),
            Square56.square56(Arrays.asList(6)),
            Square56.square56(Arrays.asList(7)),
            Square56.square56(Arrays.asList(1, 2, 3, 4, 5, 6, 7)),
            Square56.square56(Arrays.asList(3, -1, -4, 1, 5, 9)),
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
