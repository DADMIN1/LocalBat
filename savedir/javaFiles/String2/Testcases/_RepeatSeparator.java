package String2.Testcases;
import String2.RepeatSeparator;

public class _RepeatSeparator
{
    static String[] testcaseStrings = {
        "repeatSeparator(\"Word\", \"X\", 3)",
        "repeatSeparator(\"This\", \"And\", 2)",
        "repeatSeparator(\"This\", \"And\", 1)",
    };

    static String[] expectedResults = {
        "WordXWordXWord",
        "ThisAndThis",
        "This",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            RepeatSeparator.repeatSeparator("Word", "X", 3),
            RepeatSeparator.repeatSeparator("This", "And", 2),
            RepeatSeparator.repeatSeparator("This", "And", 1),
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
