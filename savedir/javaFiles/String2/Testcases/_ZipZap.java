package String2.Testcases;
import String2.ZipZap;

public class _ZipZap
{
    static String[] testcaseStrings = {
        "zipZap(\"zipXzap\")",
        "zipZap(\"zopzop\")",
        "zipZap(\"zzzopzop\")",
    };

    static String[] expectedResults = { "zpXzp", "zpzp", "zzzpzp", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            ZipZap.zipZap("zipXzap"),
            ZipZap.zipZap("zopzop"),
            ZipZap.zipZap("zzzopzop"),
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
