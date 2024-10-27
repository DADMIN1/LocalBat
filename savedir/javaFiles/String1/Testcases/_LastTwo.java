package String1.Testcases;
import String1.LastTwo;

public final class _LastTwo
{
    static final String[] testcaseStrings = {
        "lastTwo(\"coding\")",
        "lastTwo(\"cat\")",
        "lastTwo(\"ab\")",
        "lastTwo(\"a\")",
        "lastTwo(\"\")",
    };

    static final String[] expectedResults = {
        "codign",
        "cta",
        "ba",
        "a",
        "",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            LastTwo.lastTwo("coding"),
            LastTwo.lastTwo("cat"),
            LastTwo.lastTwo("ab"),
            LastTwo.lastTwo("a"),
            LastTwo.lastTwo(""),
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
