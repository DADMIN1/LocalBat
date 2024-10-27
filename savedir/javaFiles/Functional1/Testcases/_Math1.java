package Functional1.Testcases;
import Functional1.Math1;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Math1
{
    static final String[] testcaseStrings = {
        "math1([1, 2, 3])",
        "math1([6, 8, 6, 8, 1])",
        "math1([10])",
        "math1([])",
        "math1([5, 10])",
        "math1([-1, -2, -3, -2, -1])",
        "math1([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList(20, 30, 40),
        Arrays.asList(70, 90, 70, 90, 20),
        Arrays.asList(110),
        Arrays.asList(),
        Arrays.asList(60, 110),
        Arrays.asList(0, -10, -20, -10, 0),
        Arrays.asList(70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30),
    };

    public static final void Validate(boolean printSuccess)
    {
        final List<?>[] resultsArray = {
            Math1.math1(new ArrayList<>(Arrays.asList(1, 2, 3))),
            Math1.math1(new ArrayList<>(Arrays.asList(6, 8, 6, 8, 1))),
            Math1.math1(new ArrayList<>(Arrays.asList(10))),
            Math1.math1(new ArrayList<>(Arrays.asList())),
            Math1.math1(new ArrayList<>(Arrays.asList(5, 10))),
            Math1.math1(new ArrayList<>(Arrays.asList(-1, -2, -3, -2, -1))),
            Math1.math1(new ArrayList<>(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2))),
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
