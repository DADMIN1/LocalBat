package Warmup1.Testcases;
import Warmup1.BackAround;

public final class _BackAround
{
    static final String[] testcaseStrings = {
        "backAround(\"cat\")",
        "backAround(\"Hello\")",
        "backAround(\"a\")",
        "backAround(\"abc\")",
        "backAround(\"read\")",
        "backAround(\"boo\")",
    };

    static final String[] expectedResults = {
        "tcatt",
        "oHelloo",
        "aaa",
        "cabcc",
        "dreadd",
        "obooo",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            BackAround.backAround("cat"),
            BackAround.backAround("Hello"),
            BackAround.backAround("a"),
            BackAround.backAround("abc"),
            BackAround.backAround("read"),
            BackAround.backAround("boo"),
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
