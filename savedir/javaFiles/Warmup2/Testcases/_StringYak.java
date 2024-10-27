package Warmup2.Testcases;
import Warmup2.StringYak;

public final class _StringYak
{
    static final String[] testcaseStrings = {
        "stringYak(\"yakpak\")",
        "stringYak(\"pakyak\")",
        "stringYak(\"yak123ya\")",
        "stringYak(\"yak\")",
        "stringYak(\"yakxxxyak\")",
        "stringYak(\"HiyakHi\")",
        "stringYak(\"xxxyakyyyakzzz\")",
    };

    static final String[] expectedResults = {
        "pak",
        "pak",
        "123ya",
        "",
        "xxx",
        "HiHi",
        "xxxyyzzz",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            StringYak.stringYak("yakpak"),
            StringYak.stringYak("pakyak"),
            StringYak.stringYak("yak123ya"),
            StringYak.stringYak("yak"),
            StringYak.stringYak("yakxxxyak"),
            StringYak.stringYak("HiyakHi"),
            StringYak.stringYak("xxxyakyyyakzzz"),
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
