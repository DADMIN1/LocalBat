package String1.Testcases;
import String1.HasBad;

public class _HasBad
{
    static String[] testcaseStrings = {
        "hasBad(\"badxx\")",
        "hasBad(\"xbadxx\")",
        "hasBad(\"xxbadxx\")",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            HasBad.hasBad("badxx"),
            HasBad.hasBad("xbadxx"),
            HasBad.hasBad("xxbadxx"),
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
