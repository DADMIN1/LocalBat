package Warmup2.Testcases;
import Warmup2.FrontTimes;

public final class _FrontTimes
{
    static final String[] testcaseStrings = {
        "frontTimes(\"Chocolate\", 2)",
        "frontTimes(\"Chocolate\", 3)",
        "frontTimes(\"Abc\", 3)",
        "frontTimes(\"Ab\", 4)",
        "frontTimes(\"A\", 4)",
        "frontTimes(\"\", 4)",
        "frontTimes(\"Abc\", 0)",
    };

    static final String[] expectedResults = {
        "ChoCho",
        "ChoChoCho",
        "AbcAbcAbc",
        "AbAbAbAb",
        "AAAA",
        "",
        "",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            FrontTimes.frontTimes("Chocolate", 2),
            FrontTimes.frontTimes("Chocolate", 3),
            FrontTimes.frontTimes("Abc", 3),
            FrontTimes.frontTimes("Ab", 4),
            FrontTimes.frontTimes("A", 4),
            FrontTimes.frontTimes("", 4),
            FrontTimes.frontTimes("Abc", 0),
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
