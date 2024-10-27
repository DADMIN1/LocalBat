package String1.Testcases;
import String1.Left2;

public final class _Left2
{
    static final String[] testcaseStrings = {
        "left2(\"Hello\")",
        "left2(\"java\")",
        "left2(\"Hi\")",
        "left2(\"code\")",
        "left2(\"cat\")",
        "left2(\"12345\")",
        "left2(\"Chocolate\")",
        "left2(\"bricks\")",
    };

    static final String[] expectedResults = {
        "lloHe",
        "vaja",
        "Hi",
        "deco",
        "tca",
        "34512",
        "ocolateCh",
        "icksbr",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            Left2.left2("Hello"),
            Left2.left2("java"),
            Left2.left2("Hi"),
            Left2.left2("code"),
            Left2.left2("cat"),
            Left2.left2("12345"),
            Left2.left2("Chocolate"),
            Left2.left2("bricks"),
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
