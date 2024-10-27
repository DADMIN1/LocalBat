package Warmup2.Testcases;
import Warmup2.StringSplosion;

public final class _StringSplosion
{
    static final String[] testcaseStrings = {
        "stringSplosion(\"Code\")",
        "stringSplosion(\"abc\")",
        "stringSplosion(\"ab\")",
        "stringSplosion(\"x\")",
        "stringSplosion(\"fade\")",
        "stringSplosion(\"There\")",
        "stringSplosion(\"Kitten\")",
        "stringSplosion(\"Bye\")",
        "stringSplosion(\"Good\")",
        "stringSplosion(\"Bad\")",
    };

    static final String[] expectedResults = {
        "CCoCodCode",
        "aababc",
        "aab",
        "x",
        "ffafadfade",
        "TThTheTherThere",
        "KKiKitKittKitteKitten",
        "BByBye",
        "GGoGooGood",
        "BBaBad",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            StringSplosion.stringSplosion("Code"),
            StringSplosion.stringSplosion("abc"),
            StringSplosion.stringSplosion("ab"),
            StringSplosion.stringSplosion("x"),
            StringSplosion.stringSplosion("fade"),
            StringSplosion.stringSplosion("There"),
            StringSplosion.stringSplosion("Kitten"),
            StringSplosion.stringSplosion("Bye"),
            StringSplosion.stringSplosion("Good"),
            StringSplosion.stringSplosion("Bad"),
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
