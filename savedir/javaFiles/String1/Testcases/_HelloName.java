package String1.Testcases;
import String1.HelloName;

public final class _HelloName
{
    static final String[] testcaseStrings = {
        "helloName(\"Bob\")",
        "helloName(\"Alice\")",
        "helloName(\"X\")",
        "helloName(\"Dolly\")",
        "helloName(\"Alpha\")",
        "helloName(\"Omega\")",
        "helloName(\"Goodbye\")",
        "helloName(\"ho ho ho\")",
        "helloName(\"xyz!\")",
        "helloName(\"Hello\")",
    };

    static final String[] expectedResults = {
        "Hello Bob!",
        "Hello Alice!",
        "Hello X!",
        "Hello Dolly!",
        "Hello Alpha!",
        "Hello Omega!",
        "Hello Goodbye!",
        "Hello ho ho ho!",
        "Hello xyz!!",
        "Hello Hello!",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            HelloName.helloName("Bob"),
            HelloName.helloName("Alice"),
            HelloName.helloName("X"),
            HelloName.helloName("Dolly"),
            HelloName.helloName("Alpha"),
            HelloName.helloName("Omega"),
            HelloName.helloName("Goodbye"),
            HelloName.helloName("ho ho ho"),
            HelloName.helloName("xyz!"),
            HelloName.helloName("Hello"),
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
