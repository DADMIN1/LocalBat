package String1.Testcases;
import String1.TheEnd;

public final class _TheEnd
{
    static final String[] testcaseStrings = {
        "theEnd(\"Hello\", true)",
        "theEnd(\"Hello\", false)",
        "theEnd(\"oh\", true)",
        "theEnd(\"oh\", false)",
        "theEnd(\"x\", true)",
        "theEnd(\"x\", false)",
        "theEnd(\"java\", true)",
        "theEnd(\"chocolate\", false)",
        "theEnd(\"1234\", true)",
        "theEnd(\"code\", false)",
    };

    static final String[] expectedResults = {
        "H",
        "o",
        "o",
        "h",
        "x",
        "x",
        "j",
        "e",
        "1",
        "e",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            TheEnd.theEnd("Hello", true),
            TheEnd.theEnd("Hello", false),
            TheEnd.theEnd("oh", true),
            TheEnd.theEnd("oh", false),
            TheEnd.theEnd("x", true),
            TheEnd.theEnd("x", false),
            TheEnd.theEnd("java", true),
            TheEnd.theEnd("chocolate", false),
            TheEnd.theEnd("1234", true),
            TheEnd.theEnd("code", false),
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
