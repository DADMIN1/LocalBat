package String1.Testcases;
import String1.MakeTags;

public class _MakeTags
{
    static String[] testcaseStrings = {
        "makeTags(\"i\", \"Yay\")",
        "makeTags(\"i\", \"Hello\")",
        "makeTags(\"cite\", \"Yay\")",
    };

    static String[] expectedResults = {
        "<i>Yay</i>",
        "<i>Hello</i>",
        "<cite>Yay</cite>",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            MakeTags.makeTags("i", "Yay"),
            MakeTags.makeTags("i", "Hello"),
            MakeTags.makeTags("cite", "Yay"),
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
