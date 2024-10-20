package String3.Testcases;
import String3.SameEnds;

public class _SameEnds
{
    static String[] testcaseStrings = {
        "sameEnds(\"abXYab\")",
        "sameEnds(\"xx\")",
        "sameEnds(\"xxx\")",
    };

    static String[] expectedResults = { "ab", "x", "x", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            SameEnds.sameEnds("abXYab"),
            SameEnds.sameEnds("xx"),
            SameEnds.sameEnds("xxx"),
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
