package Recursion1.Testcases;
import Recursion1.CountAbc;

public class _CountAbc
{
    static String[] testcaseStrings = {
        "countAbc(\"abc\")",
        "countAbc(\"abcxxabc\")",
        "countAbc(\"abaxxaba\")",
        "countAbc(\"ababc\")",
        "countAbc(\"abxbc\")",
        "countAbc(\"aaabc\")",
        "countAbc(\"hello\")",
        "countAbc(\"\")",
        "countAbc(\"ab\")",
        "countAbc(\"aba\")",
        "countAbc(\"aca\")",
        "countAbc(\"aaa\")",
    };

    static int[] expectedResults = {
        1,
        2,
        2,
        2,
        0,
        1,
        0,
        0,
        0,
        1,
        0,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            CountAbc.countAbc("abc"),
            CountAbc.countAbc("abcxxabc"),
            CountAbc.countAbc("abaxxaba"),
            CountAbc.countAbc("ababc"),
            CountAbc.countAbc("abxbc"),
            CountAbc.countAbc("aaabc"),
            CountAbc.countAbc("hello"),
            CountAbc.countAbc(""),
            CountAbc.countAbc("ab"),
            CountAbc.countAbc("aba"),
            CountAbc.countAbc("aca"),
            CountAbc.countAbc("aaa"),
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
