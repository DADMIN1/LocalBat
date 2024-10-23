package String2.Testcases;
import String2.SameStarChar;

public class _SameStarChar
{
    static String[] testcaseStrings = {
        "sameStarChar(\"xy*yzz\")",
        "sameStarChar(\"xy*zzz\")",
        "sameStarChar(\"*xa*az\")",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            SameStarChar.sameStarChar("xy*yzz"),
            SameStarChar.sameStarChar("xy*zzz"),
            SameStarChar.sameStarChar("*xa*az"),
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
