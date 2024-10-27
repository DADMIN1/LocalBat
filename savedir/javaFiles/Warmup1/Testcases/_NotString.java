package Warmup1.Testcases;
import Warmup1.NotString;

public final class _NotString
{
    static final String[] testcaseStrings = {
        "notString(\"candy\")",
        "notString(\"x\")",
        "notString(\"not bad\")",
        "notString(\"bad\")",
        "notString(\"not\")",
        "notString(\"is not\")",
        "notString(\"no\")",
    };

    static final String[] expectedResults = {
        "not candy",
        "not x",
        "not bad",
        "not bad",
        "not",
        "not is not",
        "not no",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            NotString.notString("candy"),
            NotString.notString("x"),
            NotString.notString("not bad"),
            NotString.notString("bad"),
            NotString.notString("not"),
            NotString.notString("is not"),
            NotString.notString("no"),
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
