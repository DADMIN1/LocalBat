package Recursion1.Testcases;
import Recursion1.StrDist;

public final class _StrDist
{
    static final String[] testcaseStrings = {
        "strDist(\"catcowcat\", \"cat\")",
        "strDist(\"catcowcat\", \"cow\")",
        "strDist(\"cccatcowcatxx\", \"cat\")",
        "strDist(\"abccatcowcatcatxyz\", \"cat\")",
        "strDist(\"xyx\", \"x\")",
        "strDist(\"xyx\", \"y\")",
        "strDist(\"xyx\", \"z\")",
        "strDist(\"z\", \"z\")",
        "strDist(\"x\", \"z\")",
        "strDist(\"\", \"z\")",
        "strDist(\"hiHellohihihi\", \"hi\")",
        "strDist(\"hiHellohihihi\", \"hih\")",
        "strDist(\"hiHellohihihi\", \"o\")",
        "strDist(\"hiHellohihihi\", \"ll\")",
    };

    static final int[] expectedResults = {
        9,
        3,
        9,
        12,
        3,
        1,
        0,
        1,
        0,
        0,
        13,
        5,
        1,
        2,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            StrDist.strDist("catcowcat", "cat"),
            StrDist.strDist("catcowcat", "cow"),
            StrDist.strDist("cccatcowcatxx", "cat"),
            StrDist.strDist("abccatcowcatcatxyz", "cat"),
            StrDist.strDist("xyx", "x"),
            StrDist.strDist("xyx", "y"),
            StrDist.strDist("xyx", "z"),
            StrDist.strDist("z", "z"),
            StrDist.strDist("x", "z"),
            StrDist.strDist("", "z"),
            StrDist.strDist("hiHellohihihi", "hi"),
            StrDist.strDist("hiHellohihihi", "hih"),
            StrDist.strDist("hiHellohihihi", "o"),
            StrDist.strDist("hiHellohihihi", "ll"),
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
