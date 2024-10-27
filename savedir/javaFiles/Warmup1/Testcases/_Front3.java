package Warmup1.Testcases;
import Warmup1.Front3;

public final class _Front3
{
    static final String[] testcaseStrings = {
        "front3(\"Java\")",
        "front3(\"Chocolate\")",
        "front3(\"abc\")",
        "front3(\"abcXYZ\")",
        "front3(\"ab\")",
        "front3(\"a\")",
        "front3(\"\")",
    };

    static final String[] expectedResults = {
        "JavJavJav",
        "ChoChoCho",
        "abcabcabc",
        "abcabcabc",
        "ababab",
        "aaa",
        "",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            Front3.front3("Java"),
            Front3.front3("Chocolate"),
            Front3.front3("abc"),
            Front3.front3("abcXYZ"),
            Front3.front3("ab"),
            Front3.front3("a"),
            Front3.front3(""),
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
