package String1.Testcases;
import String1.Without2;

public final class _Without2
{
    static final String[] testcaseStrings = {
        "without2(\"HelloHe\")",
        "without2(\"HelloHi\")",
        "without2(\"Hi\")",
        "without2(\"Chocolate\")",
        "without2(\"xxx\")",
        "without2(\"xx\")",
        "without2(\"x\")",
        "without2(\"\")",
        "without2(\"Fruits\")",
    };

    static final String[] expectedResults = {
        "lloHe",
        "HelloHi",
        "",
        "Chocolate",
        "x",
        "",
        "x",
        "",
        "Fruits",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            Without2.without2("HelloHe"),
            Without2.without2("HelloHi"),
            Without2.without2("Hi"),
            Without2.without2("Chocolate"),
            Without2.without2("xxx"),
            Without2.without2("xx"),
            Without2.without2("x"),
            Without2.without2(""),
            Without2.without2("Fruits"),
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
