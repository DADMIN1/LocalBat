package String3.Testcases;
import String3.CountYZ;

public class _CountYZ
{
    static String[] testcaseStrings = {
        "countYZ(\"fez day\")",
        "countYZ(\"day fez\")",
        "countYZ(\"day fyyyz\")",
    };

    static int[] expectedResults = {
        2,
        2,
        2,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            CountYZ.countYZ("fez day"),
            CountYZ.countYZ("day fez"),
            CountYZ.countYZ("day fyyyz"),
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
