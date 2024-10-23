package String3.Testcases;
import String3.WithoutString;

public class _WithoutString
{
    static String[] testcaseStrings = {
        "withoutString(\"Hello there\", \"llo\")",
        "withoutString(\"Hello there\", \"e\")",
        "withoutString(\"Hello there\", \"x\")",
    };

    static String[] expectedResults = {
        "He there",
        "Hllo thr",
        "Hello there",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            WithoutString.withoutString("Hello there", "llo"),
            WithoutString.withoutString("Hello there", "e"),
            WithoutString.withoutString("Hello there", "x"),
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
