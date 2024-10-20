package String1.Testcases;
import String1.LastTwo;

public class _LastTwo
{
    static String[] testcaseStrings = {
        "lastTwo(\"coding\")",
        "lastTwo(\"cat\")",
        "lastTwo(\"ab\")",
    };

    static String[] expectedResults = { "codign", "cta", "ba", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            LastTwo.lastTwo("coding"),
            LastTwo.lastTwo("cat"),
            LastTwo.lastTwo("ab"),
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
