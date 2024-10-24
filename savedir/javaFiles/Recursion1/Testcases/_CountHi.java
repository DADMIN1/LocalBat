package Recursion1.Testcases;
import Recursion1.CountHi;

public class _CountHi
{
    static String[] testcaseStrings = {
        "countHi(\"xxhixx\")",
        "countHi(\"xhixhix\")",
        "countHi(\"hi\")",
        "countHi(\"hihih\")",
        "countHi(\"h\")",
        "countHi(\"\")",
        "countHi(\"ihihihihih\")",
        "countHi(\"ihihihihihi\")",
        "countHi(\"hiAAhi12hi\")",
        "countHi(\"xhixhxihihhhih\")",
        "countHi(\"ship\")",
    };

    static int[] expectedResults = {
        1,
        2,
        1,
        2,
        0,
        0,
        4,
        5,
        3,
        3,
        1,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            CountHi.countHi("xxhixx"),
            CountHi.countHi("xhixhix"),
            CountHi.countHi("hi"),
            CountHi.countHi("hihih"),
            CountHi.countHi("h"),
            CountHi.countHi(""),
            CountHi.countHi("ihihihihih"),
            CountHi.countHi("ihihihihihi"),
            CountHi.countHi("hiAAhi12hi"),
            CountHi.countHi("xhixhxihihhhih"),
            CountHi.countHi("ship"),
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
