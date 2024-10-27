package Recursion1.Testcases;
import Recursion1.Count11;

public final class _Count11
{
    static final String[] testcaseStrings = {
        "count11(\"11abc11\")",
        "count11(\"abc11x11x11\")",
        "count11(\"111\")",
        "count11(\"1111\")",
        "count11(\"1\")",
        "count11(\"\")",
        "count11(\"hi\")",
        "count11(\"11x111x1111\")",
        "count11(\"1x111\")",
        "count11(\"1Hello1\")",
        "count11(\"Hello\")",
    };

    static final int[] expectedResults = {
        2,
        3,
        1,
        2,
        0,
        0,
        0,
        4,
        1,
        0,
        0,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            Count11.count11("11abc11"),
            Count11.count11("abc11x11x11"),
            Count11.count11("111"),
            Count11.count11("1111"),
            Count11.count11("1"),
            Count11.count11(""),
            Count11.count11("hi"),
            Count11.count11("11x111x1111"),
            Count11.count11("1x111"),
            Count11.count11("1Hello1"),
            Count11.count11("Hello"),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
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
