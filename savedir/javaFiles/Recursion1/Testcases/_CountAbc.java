package Recursion1.Testcases;
import Recursion1.CountAbc;

public class _CountAbc
{
    static String[] testcaseStrings = {
        "countAbc(\"abc\")",
        "countAbc(\"abcxxabc\")",
        "countAbc(\"abaxxaba\")",
    };

    static int[] expectedResults = {
        1,
        2,
        2,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            CountAbc.countAbc("abc"),
            CountAbc.countAbc("abcxxabc"),
            CountAbc.countAbc("abaxxaba"),
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
