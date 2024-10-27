package Recursion1.Testcases;
import Recursion1.CountHi2;

public final class _CountHi2
{
    static final String[] testcaseStrings = {
        "countHi2(\"ahixhi\")",
        "countHi2(\"ahibhi\")",
        "countHi2(\"xhixhi\")",
        "countHi2(\"hixhi\")",
        "countHi2(\"hixhhi\")",
        "countHi2(\"hihihi\")",
        "countHi2(\"hihihix\")",
        "countHi2(\"xhihihix\")",
        "countHi2(\"xxhi\")",
        "countHi2(\"hixxhi\")",
        "countHi2(\"hi\")",
        "countHi2(\"xxxx\")",
        "countHi2(\"h\")",
        "countHi2(\"x\")",
        "countHi2(\"\")",
        "countHi2(\"Hellohi\")",
    };

    static final int[] expectedResults = {
        1,
        2,
        0,
        1,
        2,
        3,
        3,
        2,
        0,
        1,
        1,
        0,
        0,
        0,
        0,
        1,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            CountHi2.countHi2("ahixhi"),
            CountHi2.countHi2("ahibhi"),
            CountHi2.countHi2("xhixhi"),
            CountHi2.countHi2("hixhi"),
            CountHi2.countHi2("hixhhi"),
            CountHi2.countHi2("hihihi"),
            CountHi2.countHi2("hihihix"),
            CountHi2.countHi2("xhihihix"),
            CountHi2.countHi2("xxhi"),
            CountHi2.countHi2("hixxhi"),
            CountHi2.countHi2("hi"),
            CountHi2.countHi2("xxxx"),
            CountHi2.countHi2("h"),
            CountHi2.countHi2("x"),
            CountHi2.countHi2(""),
            CountHi2.countHi2("Hellohi"),
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
