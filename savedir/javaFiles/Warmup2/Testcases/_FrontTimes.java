package Warmup2.Testcases;
import Warmup2.FrontTimes;

public class _FrontTimes
{
    static String[] testcaseStrings = {
        "frontTimes(\"Chocolate\", 2)",
        "frontTimes(\"Chocolate\", 3)",
        "frontTimes(\"Abc\", 3)",
    };

    static String[] expectedResults = {
        "ChoCho",
        "ChoChoCho",
        "AbcAbcAbc",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            FrontTimes.frontTimes("Chocolate", 2),
            FrontTimes.frontTimes("Chocolate", 3),
            FrontTimes.frontTimes("Abc", 3),
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
