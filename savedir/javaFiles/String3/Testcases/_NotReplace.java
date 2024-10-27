package String3.Testcases;
import String3.NotReplace;

public final class _NotReplace
{
    static final String[] testcaseStrings = {
        "notReplace(\"is test\")",
        "notReplace(\"is-is\")",
        "notReplace(\"This is right\")",
        "notReplace(\"This is isabell\")",
        "notReplace(\"\")",
        "notReplace(\"is\")",
        "notReplace(\"isis\")",
        "notReplace(\"Dis is bliss is\")",
        "notReplace(\"is his\")",
        "notReplace(\"xis yis\")",
        "notReplace(\"AAAis is\")",
    };

    static final String[] expectedResults = {
        "is not test",
        "is not-is not",
        "This is not right",
        "This is not isabell",
        "",
        "is not",
        "isis",
        "Dis is not bliss is not",
        "is not his",
        "xis yis",
        "AAAis is not",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            NotReplace.notReplace("is test"),
            NotReplace.notReplace("is-is"),
            NotReplace.notReplace("This is right"),
            NotReplace.notReplace("This is isabell"),
            NotReplace.notReplace(""),
            NotReplace.notReplace("is"),
            NotReplace.notReplace("isis"),
            NotReplace.notReplace("Dis is bliss is"),
            NotReplace.notReplace("is his"),
            NotReplace.notReplace("xis yis"),
            NotReplace.notReplace("AAAis is"),
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
