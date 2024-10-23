package String1.Testcases;
import String1.WithouEnd2;

public class _WithouEnd2
{
    static String[] testcaseStrings = {
        "withouEnd2(\"Hello\")",
        "withouEnd2(\"abc\")",
        "withouEnd2(\"ab\")",
    };

    static String[] expectedResults = {
        "ell",
        "b",
        "",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            WithouEnd2.withouEnd2("Hello"),
            WithouEnd2.withouEnd2("abc"),
            WithouEnd2.withouEnd2("ab"),
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
