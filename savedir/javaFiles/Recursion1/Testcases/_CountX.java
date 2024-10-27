package Recursion1.Testcases;
import Recursion1.CountX;

public final class _CountX
{
    static final String[] testcaseStrings = {
        "countX(\"xxhixx\")",
        "countX(\"xhixhix\")",
        "countX(\"hi\")",
        "countX(\"h\")",
        "countX(\"x\")",
        "countX(\"\")",
        "countX(\"hihi\")",
        "countX(\"hiAAhi12hi\")",
    };

    static final int[] expectedResults = {
        4,
        3,
        0,
        0,
        1,
        0,
        0,
        0,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            CountX.countX("xxhixx"),
            CountX.countX("xhixhix"),
            CountX.countX("hi"),
            CountX.countX("h"),
            CountX.countX("x"),
            CountX.countX(""),
            CountX.countX("hihi"),
            CountX.countX("hiAAhi12hi"),
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
