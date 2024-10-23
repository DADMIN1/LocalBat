package String2.Testcases;
import String2.RepeatEnd;

public class _RepeatEnd
{
    static String[] testcaseStrings = {
        "repeatEnd(\"Hello\", 3)",
        "repeatEnd(\"Hello\", 2)",
        "repeatEnd(\"Hello\", 1)",
    };

    static String[] expectedResults = {
        "llollollo",
        "lolo",
        "o",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            RepeatEnd.repeatEnd("Hello", 3),
            RepeatEnd.repeatEnd("Hello", 2),
            RepeatEnd.repeatEnd("Hello", 1),
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
