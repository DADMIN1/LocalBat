package Warmup2.Testcases;
import Warmup2.StringSplosion;

public class _StringSplosion
{
    static String[] testcaseStrings = {
        "stringSplosion(\"Code\")",
        "stringSplosion(\"abc\")",
        "stringSplosion(\"ab\")",
    };

    static String[] expectedResults = {
        "CCoCodCode",
        "aababc",
        "aab",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            StringSplosion.stringSplosion("Code"),
            StringSplosion.stringSplosion("abc"),
            StringSplosion.stringSplosion("ab"),
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
