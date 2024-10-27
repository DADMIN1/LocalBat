package String1.Testcases;
import String1.DeFront;

public class _DeFront
{
    static String[] testcaseStrings = {
        "deFront(\"Hello\")",
        "deFront(\"java\")",
        "deFront(\"away\")",
        "deFront(\"axy\")",
        "deFront(\"abc\")",
        "deFront(\"xby\")",
        "deFront(\"ab\")",
        "deFront(\"ax\")",
        "deFront(\"axb\")",
        "deFront(\"aaa\")",
        "deFront(\"xbc\")",
        "deFront(\"bbb\")",
        "deFront(\"bazz\")",
        "deFront(\"ba\")",
        "deFront(\"abxyz\")",
        "deFront(\"hi\")",
        "deFront(\"his\")",
        "deFront(\"xz\")",
        "deFront(\"zzz\")",
    };

    static String[] expectedResults = {
        "llo",
        "va",
        "aay",
        "ay",
        "abc",
        "by",
        "ab",
        "a",
        "ab",
        "aa",
        "bc",
        "bb",
        "zz",
        "",
        "abxyz",
        "",
        "s",
        "",
        "z",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            DeFront.deFront("Hello"),
            DeFront.deFront("java"),
            DeFront.deFront("away"),
            DeFront.deFront("axy"),
            DeFront.deFront("abc"),
            DeFront.deFront("xby"),
            DeFront.deFront("ab"),
            DeFront.deFront("ax"),
            DeFront.deFront("axb"),
            DeFront.deFront("aaa"),
            DeFront.deFront("xbc"),
            DeFront.deFront("bbb"),
            DeFront.deFront("bazz"),
            DeFront.deFront("ba"),
            DeFront.deFront("abxyz"),
            DeFront.deFront("hi"),
            DeFront.deFront("his"),
            DeFront.deFront("xz"),
            DeFront.deFront("zzz"),
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
