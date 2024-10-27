package Recursion1.Testcases;
import Recursion1.StringClean;

public final class _StringClean
{
    static final String[] testcaseStrings = {
        "stringClean(\"yyzzza\")",
        "stringClean(\"abbbcdd\")",
        "stringClean(\"Hello\")",
        "stringClean(\"XXabcYY\")",
        "stringClean(\"112ab445\")",
        "stringClean(\"Hello Bookkeeper\")",
    };

    static final String[] expectedResults = {
        "yza",
        "abcd",
        "Helo",
        "XabcY",
        "12ab45",
        "Helo Bokeper",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            StringClean.stringClean("yyzzza"),
            StringClean.stringClean("abbbcdd"),
            StringClean.stringClean("Hello"),
            StringClean.stringClean("XXabcYY"),
            StringClean.stringClean("112ab445"),
            StringClean.stringClean("Hello Bookkeeper"),
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
