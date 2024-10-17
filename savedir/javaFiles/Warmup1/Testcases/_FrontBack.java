package Warmup1.Testcases;
import Warmup1.FrontBack;

public class _FrontBack
{
    static String[] testcaseStrings = {
        "frontBack(\"code\")",
        "frontBack(\"a\")",
        "frontBack(\"ab\")",
    };

    static String[] expectedResults = { "eodc", "a", "ba", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            FrontBack.frontBack("code"),
            FrontBack.frontBack("a"),
            FrontBack.frontBack("ab"),
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