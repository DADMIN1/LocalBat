package Recursion1.Testcases;
import Recursion1.StringClean;

public class _StringClean
{
    static String[] testcaseStrings = {
        "stringClean(\"yyzzza\")",
        "stringClean(\"abbbcdd\")",
        "stringClean(\"Hello\")",
    };

    static String[] expectedResults = {
        "yza",
        "abcd",
        "Helo",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            StringClean.stringClean("yyzzza"),
            StringClean.stringClean("abbbcdd"),
            StringClean.stringClean("Hello"),
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
