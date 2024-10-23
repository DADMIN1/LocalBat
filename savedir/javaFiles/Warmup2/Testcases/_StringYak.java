package Warmup2.Testcases;
import Warmup2.StringYak;

public class _StringYak
{
    static String[] testcaseStrings = {
        "stringYak(\"yakpak\")",
        "stringYak(\"pakyak\")",
        "stringYak(\"yak123ya\")",
    };

    static String[] expectedResults = {
        "pak",
        "pak",
        "123ya",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            StringYak.stringYak("yakpak"),
            StringYak.stringYak("pakyak"),
            StringYak.stringYak("yak123ya"),
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
