package String1.Testcases;
import String1.AtFirst;

public final class _AtFirst
{
    static final String[] testcaseStrings = {
        "atFirst(\"hello\")",
        "atFirst(\"hi\")",
        "atFirst(\"h\")",
        "atFirst(\"\")",
        "atFirst(\"kitten\")",
        "atFirst(\"java\")",
        "atFirst(\"j\")",
    };

    static final String[] expectedResults = {
        "he",
        "hi",
        "h@",
        "@@",
        "ki",
        "ja",
        "j@",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            AtFirst.atFirst("hello"),
            AtFirst.atFirst("hi"),
            AtFirst.atFirst("h"),
            AtFirst.atFirst(""),
            AtFirst.atFirst("kitten"),
            AtFirst.atFirst("java"),
            AtFirst.atFirst("j"),
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
