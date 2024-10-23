package String2.Testcases;
import String2.StarOut;

public class _StarOut
{
    static String[] testcaseStrings = {
        "starOut(\"ab*cd\")",
        "starOut(\"ab**cd\")",
        "starOut(\"sm*eilly\")",
    };

    static String[] expectedResults = {
        "ad",
        "ad",
        "silly",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            StarOut.starOut("ab*cd"),
            StarOut.starOut("ab**cd"),
            StarOut.starOut("sm*eilly"),
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
