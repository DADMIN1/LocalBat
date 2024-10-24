package String1.Testcases;
import String1.FrontAgain;

public class _FrontAgain
{
    static String[] testcaseStrings = {
        "frontAgain(\"edited\")",
        "frontAgain(\"edit\")",
        "frontAgain(\"ed\")",
        "frontAgain(\"jj\")",
        "frontAgain(\"jjj\")",
        "frontAgain(\"jjjj\")",
        "frontAgain(\"jjjk\")",
        "frontAgain(\"x\")",
        "frontAgain(\"\")",
        "frontAgain(\"java\")",
        "frontAgain(\"javaja\")",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            FrontAgain.frontAgain("edited"),
            FrontAgain.frontAgain("edit"),
            FrontAgain.frontAgain("ed"),
            FrontAgain.frontAgain("jj"),
            FrontAgain.frontAgain("jjj"),
            FrontAgain.frontAgain("jjjj"),
            FrontAgain.frontAgain("jjjk"),
            FrontAgain.frontAgain("x"),
            FrontAgain.frontAgain(""),
            FrontAgain.frontAgain("java"),
            FrontAgain.frontAgain("javaja"),
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
