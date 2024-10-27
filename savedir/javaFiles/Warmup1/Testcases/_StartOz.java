package Warmup1.Testcases;
import Warmup1.StartOz;

public final class _StartOz
{
    static final String[] testcaseStrings = {
        "startOz(\"ozymandias\")",
        "startOz(\"bzoo\")",
        "startOz(\"oxx\")",
        "startOz(\"oz\")",
        "startOz(\"ounce\")",
        "startOz(\"o\")",
        "startOz(\"abc\")",
        "startOz(\"\")",
        "startOz(\"zoo\")",
        "startOz(\"aztec\")",
        "startOz(\"zzzz\")",
        "startOz(\"oznic\")",
    };

    static final String[] expectedResults = {
        "oz",
        "z",
        "o",
        "oz",
        "o",
        "o",
        "",
        "",
        "",
        "z",
        "z",
        "oz",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            StartOz.startOz("ozymandias"),
            StartOz.startOz("bzoo"),
            StartOz.startOz("oxx"),
            StartOz.startOz("oz"),
            StartOz.startOz("ounce"),
            StartOz.startOz("o"),
            StartOz.startOz("abc"),
            StartOz.startOz(""),
            StartOz.startOz("zoo"),
            StartOz.startOz("aztec"),
            StartOz.startOz("zzzz"),
            StartOz.startOz("oznic"),
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
