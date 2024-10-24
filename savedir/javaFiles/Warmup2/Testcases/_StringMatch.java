package Warmup2.Testcases;
import Warmup2.StringMatch;

public class _StringMatch
{
    static String[] testcaseStrings = {
        "stringMatch(\"xxcaazz\", \"xxbaaz\")",
        "stringMatch(\"abc\", \"abc\")",
        "stringMatch(\"abc\", \"axc\")",
        "stringMatch(\"hello\", \"he\")",
        "stringMatch(\"he\", \"hello\")",
        "stringMatch(\"h\", \"hello\")",
        "stringMatch(\"\", \"hello\")",
        "stringMatch(\"aabbccdd\", \"abbbxxd\")",
        "stringMatch(\"aaxxaaxx\", \"iaxxai\")",
        "stringMatch(\"iaxxai\", \"aaxxaaxx\")",
    };

    static int[] expectedResults = {
        3,
        2,
        0,
        1,
        1,
        0,
        0,
        1,
        3,
        3,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            StringMatch.stringMatch("xxcaazz", "xxbaaz"),
            StringMatch.stringMatch("abc", "abc"),
            StringMatch.stringMatch("abc", "axc"),
            StringMatch.stringMatch("hello", "he"),
            StringMatch.stringMatch("he", "hello"),
            StringMatch.stringMatch("h", "hello"),
            StringMatch.stringMatch("", "hello"),
            StringMatch.stringMatch("aabbccdd", "abbbxxd"),
            StringMatch.stringMatch("aaxxaaxx", "iaxxai"),
            StringMatch.stringMatch("iaxxai", "aaxxaaxx"),
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
