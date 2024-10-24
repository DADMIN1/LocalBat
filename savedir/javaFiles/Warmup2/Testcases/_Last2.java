package Warmup2.Testcases;
import Warmup2.Last2;

public class _Last2
{
    static String[] testcaseStrings = {
        "last2(\"hixxhi\")",
        "last2(\"xaxxaxaxx\")",
        "last2(\"axxxaaxx\")",
        "last2(\"xxaxxaxxaxx\")",
        "last2(\"xaxaxaxx\")",
        "last2(\"xxxx\")",
        "last2(\"13121312\")",
        "last2(\"11212\")",
        "last2(\"13121311\")",
        "last2(\"1717171\")",
        "last2(\"hi\")",
        "last2(\"h\")",
        "last2(\"\")",
    };

    static int[] expectedResults = {
        1,
        1,
        2,
        3,
        0,
        2,
        1,
        1,
        0,
        2,
        0,
        0,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Last2.last2("hixxhi"),
            Last2.last2("xaxxaxaxx"),
            Last2.last2("axxxaaxx"),
            Last2.last2("xxaxxaxxaxx"),
            Last2.last2("xaxaxaxx"),
            Last2.last2("xxxx"),
            Last2.last2("13121312"),
            Last2.last2("11212"),
            Last2.last2("13121311"),
            Last2.last2("1717171"),
            Last2.last2("hi"),
            Last2.last2("h"),
            Last2.last2(""),
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
