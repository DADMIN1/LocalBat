package String1.Testcases;
import String1.TwoChar;

public class _TwoChar
{
    static String[] testcaseStrings = {
        "twoChar(\"java\", 0)",
        "twoChar(\"java\", 2)",
        "twoChar(\"java\", 3)",
    };

    static String[] expectedResults = {
        "ja",
        "va",
        "ja",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            TwoChar.twoChar("java", 0),
            TwoChar.twoChar("java", 2),
            TwoChar.twoChar("java", 3),
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
