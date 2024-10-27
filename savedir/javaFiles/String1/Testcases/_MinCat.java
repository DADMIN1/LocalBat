package String1.Testcases;
import String1.MinCat;

public final class _MinCat
{
    static final String[] testcaseStrings = {
        "minCat(\"Hello\", \"Hi\")",
        "minCat(\"Hello\", \"java\")",
        "minCat(\"java\", \"Hello\")",
        "minCat(\"abc\", \"x\")",
        "minCat(\"x\", \"abc\")",
        "minCat(\"abc\", \"\")",
    };

    static final String[] expectedResults = {
        "loHi",
        "ellojava",
        "javaello",
        "cx",
        "xc",
        "",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            MinCat.minCat("Hello", "Hi"),
            MinCat.minCat("Hello", "java"),
            MinCat.minCat("java", "Hello"),
            MinCat.minCat("abc", "x"),
            MinCat.minCat("x", "abc"),
            MinCat.minCat("abc", ""),
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
