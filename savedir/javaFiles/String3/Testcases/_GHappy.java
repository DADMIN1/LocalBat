package String3.Testcases;
import String3.GHappy;

public final class _GHappy
{
    static final String[] testcaseStrings = {
        "gHappy(\"xxggxx\")",
        "gHappy(\"xxgxx\")",
        "gHappy(\"xxggyygxx\")",
        "gHappy(\"g\")",
        "gHappy(\"gg\")",
        "gHappy(\"\")",
        "gHappy(\"xxgggxyz\")",
        "gHappy(\"xxgggxyg\")",
        "gHappy(\"xxgggxygg\")",
        "gHappy(\"mgm\")",
        "gHappy(\"mggm\")",
        "gHappy(\"yyygggxyy\")",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        false,
        true,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            GHappy.gHappy("xxggxx"),
            GHappy.gHappy("xxgxx"),
            GHappy.gHappy("xxggyygxx"),
            GHappy.gHappy("g"),
            GHappy.gHappy("gg"),
            GHappy.gHappy(""),
            GHappy.gHappy("xxgggxyz"),
            GHappy.gHappy("xxgggxyg"),
            GHappy.gHappy("xxgggxygg"),
            GHappy.gHappy("mgm"),
            GHappy.gHappy("mggm"),
            GHappy.gHappy("yyygggxyy"),
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
