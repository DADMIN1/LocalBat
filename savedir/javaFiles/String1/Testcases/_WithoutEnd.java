package String1.Testcases;
import String1.WithoutEnd;

public final class _WithoutEnd
{
    static final String[] testcaseStrings = {
        "withoutEnd(\"Hello\")",
        "withoutEnd(\"java\")",
        "withoutEnd(\"coding\")",
        "withoutEnd(\"code\")",
        "withoutEnd(\"ab\")",
        "withoutEnd(\"Chocolate!\")",
        "withoutEnd(\"kitten\")",
        "withoutEnd(\"woohoo\")",
    };

    static final String[] expectedResults = {
        "ell",
        "av",
        "odin",
        "od",
        "",
        "hocolate",
        "itte",
        "ooho",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            WithoutEnd.withoutEnd("Hello"),
            WithoutEnd.withoutEnd("java"),
            WithoutEnd.withoutEnd("coding"),
            WithoutEnd.withoutEnd("code"),
            WithoutEnd.withoutEnd("ab"),
            WithoutEnd.withoutEnd("Chocolate!"),
            WithoutEnd.withoutEnd("kitten"),
            WithoutEnd.withoutEnd("woohoo"),
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
