package String1.Testcases;
import String1.TheEnd;

public class _TheEnd
{
    static String[] testcaseStrings = {
        "theEnd(\"Hello\", true)",
        "theEnd(\"Hello\", false)",
        "theEnd(\"oh\", true)",
    };

    static String[] expectedResults = {
        "H",
        "o",
        "o",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            TheEnd.theEnd("Hello", true),
            TheEnd.theEnd("Hello", false),
            TheEnd.theEnd("oh", true),
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
