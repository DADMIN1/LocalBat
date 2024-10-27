package Recursion1.Testcases;
import Recursion1.StrCopies;

public final class _StrCopies
{
    static final String[] testcaseStrings = {
        "strCopies(\"catcowcat\", \"cat\", 2)",
        "strCopies(\"catcowcat\", \"cow\", 2)",
        "strCopies(\"catcowcat\", \"cow\", 1)",
        "strCopies(\"iiijjj\", \"i\", 3)",
        "strCopies(\"iiijjj\", \"i\", 4)",
        "strCopies(\"iiijjj\", \"ii\", 2)",
        "strCopies(\"iiijjj\", \"ii\", 3)",
        "strCopies(\"iiijjj\", \"x\", 3)",
        "strCopies(\"iiijjj\", \"x\", 0)",
        "strCopies(\"iiiiij\", \"iii\", 3)",
        "strCopies(\"iiiiij\", \"iii\", 4)",
        "strCopies(\"ijiiiiij\", \"iiii\", 2)",
        "strCopies(\"ijiiiiij\", \"iiii\", 3)",
        "strCopies(\"dogcatdogcat\", \"dog\", 2)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            StrCopies.strCopies("catcowcat", "cat", 2),
            StrCopies.strCopies("catcowcat", "cow", 2),
            StrCopies.strCopies("catcowcat", "cow", 1),
            StrCopies.strCopies("iiijjj", "i", 3),
            StrCopies.strCopies("iiijjj", "i", 4),
            StrCopies.strCopies("iiijjj", "ii", 2),
            StrCopies.strCopies("iiijjj", "ii", 3),
            StrCopies.strCopies("iiijjj", "x", 3),
            StrCopies.strCopies("iiijjj", "x", 0),
            StrCopies.strCopies("iiiiij", "iii", 3),
            StrCopies.strCopies("iiiiij", "iii", 4),
            StrCopies.strCopies("ijiiiiij", "iiii", 2),
            StrCopies.strCopies("ijiiiiij", "iiii", 3),
            StrCopies.strCopies("dogcatdogcat", "dog", 2),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
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
