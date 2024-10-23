package Warmup1.Testcases;
import Warmup1.Front3;

public class _Front3
{
    static String[] testcaseStrings = {
        "front3(\"Java\")",
        "front3(\"Chocolate\")",
        "front3(\"abc\")",
    };

    static String[] expectedResults = {
        "JavJavJav",
        "ChoChoCho",
        "abcabcabc",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            Front3.front3("Java"),
            Front3.front3("Chocolate"),
            Front3.front3("abc"),
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
