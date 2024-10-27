package String1.Testcases;
import String1.NonStart;

public final class _NonStart
{
    static final String[] testcaseStrings = {
        "nonStart(\"Hello\", \"There\")",
        "nonStart(\"java\", \"code\")",
        "nonStart(\"shotl\", \"java\")",
        "nonStart(\"ab\", \"xy\")",
        "nonStart(\"ab\", \"x\")",
        "nonStart(\"x\", \"ac\")",
        "nonStart(\"a\", \"x\")",
        "nonStart(\"kit\", \"kat\")",
        "nonStart(\"mart\", \"dart\")",
    };

    static final String[] expectedResults = {
        "ellohere",
        "avaode",
        "hotlava",
        "by",
        "b",
        "c",
        "",
        "itat",
        "artart",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            NonStart.nonStart("Hello", "There"),
            NonStart.nonStart("java", "code"),
            NonStart.nonStart("shotl", "java"),
            NonStart.nonStart("ab", "xy"),
            NonStart.nonStart("ab", "x"),
            NonStart.nonStart("x", "ac"),
            NonStart.nonStart("a", "x"),
            NonStart.nonStart("kit", "kat"),
            NonStart.nonStart("mart", "dart"),
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
