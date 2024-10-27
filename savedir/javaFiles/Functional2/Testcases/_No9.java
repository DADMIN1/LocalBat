package Functional2.Testcases;
import Functional2.No9;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _No9
{
    static final String[] testcaseStrings = {
        "no9([1, 2, 19])",
        "no9([9, 19, 29, 3])",
        "no9([1, 2, 3])",
        "no9([45, 99, 90, 28, 13, 999, 0])",
        "no9([])",
        "no9([9])",
        "no9([0, 9, 0])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(1, 2),
        Arrays.asList(3),
        Arrays.asList(1, 2, 3),
        Arrays.asList(45, 90, 28, 13, 0),
        Arrays.asList(),
        Arrays.asList(),
        Arrays.asList(0, 0),
    };

    public static final void Validate(boolean printSuccess)
    {
        final List<?>[] resultsArray = {
            No9.no9(new ArrayList<>(Arrays.asList(1, 2, 19))),
            No9.no9(new ArrayList<>(Arrays.asList(9, 19, 29, 3))),
            No9.no9(new ArrayList<>(Arrays.asList(1, 2, 3))),
            No9.no9(new ArrayList<>(Arrays.asList(45, 99, 90, 28, 13, 999, 0))),
            No9.no9(new ArrayList<>(Arrays.asList())),
            No9.no9(new ArrayList<>(Arrays.asList(9))),
            No9.no9(new ArrayList<>(Arrays.asList(0, 9, 0))),
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
