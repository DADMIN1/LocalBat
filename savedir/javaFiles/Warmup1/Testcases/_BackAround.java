package Warmup1.Testcases;
import Warmup1.BackAround;

public class _BackAround
{
    static String[] testcaseStrings = {
        "backAround(\"cat\")",
        "backAround(\"Hello\")",
        "backAround(\"a\")",
    };

    static String[] expectedResults = {
        "tcatt",
        "oHelloo",
        "aaa",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            BackAround.backAround("cat"),
            BackAround.backAround("Hello"),
            BackAround.backAround("a"),
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
