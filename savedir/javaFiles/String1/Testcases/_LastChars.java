package String1.Testcases;
import String1.LastChars;

public class _LastChars
{
    static String[] testcaseStrings = {
        "lastChars(\"last\", \"chars\")",
        "lastChars(\"yo\", \"java\")",
        "lastChars(\"hi\", \"\")",
    };

    static String[] expectedResults = { "ls", "ya", "h@", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            LastChars.lastChars("last", "chars"),
            LastChars.lastChars("yo", "java"),
            LastChars.lastChars("hi", ""),
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
