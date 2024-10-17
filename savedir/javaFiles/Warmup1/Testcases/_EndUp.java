package Warmup1.Testcases;
import Warmup1.EndUp;

public class _EndUp
{
    static String[] testcaseStrings = {
        "endUp(\"Hello\")",
        "endUp(\"hi there\")",
        "endUp(\"hi\")",
    };

    static String[] expectedResults = { "HeLLO", "hi thERE", "HI", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            EndUp.endUp("Hello"),
            EndUp.endUp("hi there"),
            EndUp.endUp("hi"),
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
