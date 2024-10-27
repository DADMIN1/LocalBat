package Warmup2.Testcases;
import Warmup2.DoubleX;

public final class _DoubleX
{
    static final String[] testcaseStrings = {
        "doubleX(\"axxbb\")",
        "doubleX(\"axaxax\")",
        "doubleX(\"xxxxx\")",
        "doubleX(\"xaxxx\")",
        "doubleX(\"aaaax\")",
        "doubleX(\"\")",
        "doubleX(\"abc\")",
        "doubleX(\"x\")",
        "doubleX(\"xx\")",
        "doubleX(\"xax\")",
        "doubleX(\"xaxx\")",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        false,
        false,
        false,
        false,
        true,
        false,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            DoubleX.doubleX("axxbb"),
            DoubleX.doubleX("axaxax"),
            DoubleX.doubleX("xxxxx"),
            DoubleX.doubleX("xaxxx"),
            DoubleX.doubleX("aaaax"),
            DoubleX.doubleX(""),
            DoubleX.doubleX("abc"),
            DoubleX.doubleX("x"),
            DoubleX.doubleX("xx"),
            DoubleX.doubleX("xax"),
            DoubleX.doubleX("xaxx"),
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
