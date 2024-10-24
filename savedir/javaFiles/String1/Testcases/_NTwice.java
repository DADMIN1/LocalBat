package String1.Testcases;
import String1.NTwice;

public class _NTwice
{
    static String[] testcaseStrings = {
        "nTwice(\"Hello\", 2)",
        "nTwice(\"Chocolate\", 3)",
        "nTwice(\"Chocolate\", 1)",
        "nTwice(\"Chocolate\", 0)",
        "nTwice(\"Hello\", 4)",
        "nTwice(\"Code\", 4)",
        "nTwice(\"Code\", 2)",
    };

    static String[] expectedResults = {
        "Helo",
        "Choate",
        "Ce",
        "",
        "Hellello",
        "CodeCode",
        "Code",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            NTwice.nTwice("Hello", 2),
            NTwice.nTwice("Chocolate", 3),
            NTwice.nTwice("Chocolate", 1),
            NTwice.nTwice("Chocolate", 0),
            NTwice.nTwice("Hello", 4),
            NTwice.nTwice("Code", 4),
            NTwice.nTwice("Code", 2),
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
