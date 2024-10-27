package String1.Testcases;
import String1.WithouEnd2;

public final class _WithouEnd2
{
    static final String[] testcaseStrings = {
        "withouEnd2(\"Hello\")",
        "withouEnd2(\"abc\")",
        "withouEnd2(\"ab\")",
        "withouEnd2(\"a\")",
        "withouEnd2(\"\")",
        "withouEnd2(\"coldy\")",
        "withouEnd2(\"java code\")",
    };

    static final String[] expectedResults = {
        "ell",
        "b",
        "",
        "",
        "",
        "old",
        "ava cod",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            WithouEnd2.withouEnd2("Hello"),
            WithouEnd2.withouEnd2("abc"),
            WithouEnd2.withouEnd2("ab"),
            WithouEnd2.withouEnd2("a"),
            WithouEnd2.withouEnd2(""),
            WithouEnd2.withouEnd2("coldy"),
            WithouEnd2.withouEnd2("java code"),
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
