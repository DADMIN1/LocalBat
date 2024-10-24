package Warmup1.Testcases;
import Warmup1.StringE;

public class _StringE
{
    static String[] testcaseStrings = {
        "stringE(\"Hello\")",
        "stringE(\"Heelle\")",
        "stringE(\"Heelele\")",
        "stringE(\"Hll\")",
        "stringE(\"e\")",
        "stringE(\"\")",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            StringE.stringE("Hello"),
            StringE.stringE("Heelle"),
            StringE.stringE("Heelele"),
            StringE.stringE("Hll"),
            StringE.stringE("e"),
            StringE.stringE(""),
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
