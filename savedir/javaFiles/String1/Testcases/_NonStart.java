package String1.Testcases;
import String1.NonStart;

public class _NonStart
{
    static String[] testcaseStrings = {
        "nonStart(\"Hello\", \"There\")",
        "nonStart(\"java\", \"code\")",
        "nonStart(\"shotl\", \"java\")",
    };

    static String[] expectedResults = {
        "ellohere",
        "avaode",
        "hotlava",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            NonStart.nonStart("Hello", "There"),
            NonStart.nonStart("java", "code"),
            NonStart.nonStart("shotl", "java"),
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
