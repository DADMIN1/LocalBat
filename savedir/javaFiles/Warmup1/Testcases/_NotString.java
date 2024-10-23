package Warmup1.Testcases;
import Warmup1.NotString;

public class _NotString
{
    static String[] testcaseStrings = {
        "notString(\"candy\")",
        "notString(\"x\")",
        "notString(\"not bad\")",
    };

    static String[] expectedResults = {
        "not candy",
        "not x",
        "not bad",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            NotString.notString("candy"),
            NotString.notString("x"),
            NotString.notString("not bad"),
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
