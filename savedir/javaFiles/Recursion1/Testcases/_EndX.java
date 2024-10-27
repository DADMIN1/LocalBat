package Recursion1.Testcases;
import Recursion1.EndX;

public final class _EndX
{
    static final String[] testcaseStrings = {
        "endX(\"xxre\")",
        "endX(\"xxhixx\")",
        "endX(\"xhixhix\")",
        "endX(\"hiy\")",
        "endX(\"h\")",
        "endX(\"x\")",
        "endX(\"xx\")",
        "endX(\"\")",
        "endX(\"bxx\")",
        "endX(\"bxax\")",
        "endX(\"axaxax\")",
        "endX(\"xxhxi\")",
    };

    static final String[] expectedResults = {
        "rexx",
        "hixxxx",
        "hihixxx",
        "hiy",
        "h",
        "x",
        "xx",
        "",
        "bxx",
        "baxx",
        "aaaxxx",
        "hixxx",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            EndX.endX("xxre"),
            EndX.endX("xxhixx"),
            EndX.endX("xhixhix"),
            EndX.endX("hiy"),
            EndX.endX("h"),
            EndX.endX("x"),
            EndX.endX("xx"),
            EndX.endX(""),
            EndX.endX("bxx"),
            EndX.endX("bxax"),
            EndX.endX("axaxax"),
            EndX.endX("xxhxi"),
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
