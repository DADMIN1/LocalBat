package String2.Testcases;
import String2.SameStarChar;

public class _SameStarChar
{
    static String[] testcaseStrings = {
        "sameStarChar(\"xy*yzz\")",
        "sameStarChar(\"xy*zzz\")",
        "sameStarChar(\"*xa*az\")",
        "sameStarChar(\"*xa*bz\")",
        "sameStarChar(\"*xa*a*\")",
        "sameStarChar(\"\")",
        "sameStarChar(\"*xa*a*a\")",
        "sameStarChar(\"*xa*a*b\")",
        "sameStarChar(\"*12*2*2\")",
        "sameStarChar(\"12*2*3*\")",
        "sameStarChar(\"abcDEF\")",
        "sameStarChar(\"XY*YYYY*Z*\")",
        "sameStarChar(\"XY*YYYY*Y*\")",
        "sameStarChar(\"12*2*3*\")",
        "sameStarChar(\"*\")",
        "sameStarChar(\"**\")",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            SameStarChar.sameStarChar("xy*yzz"),
            SameStarChar.sameStarChar("xy*zzz"),
            SameStarChar.sameStarChar("*xa*az"),
            SameStarChar.sameStarChar("*xa*bz"),
            SameStarChar.sameStarChar("*xa*a*"),
            SameStarChar.sameStarChar(""),
            SameStarChar.sameStarChar("*xa*a*a"),
            SameStarChar.sameStarChar("*xa*a*b"),
            SameStarChar.sameStarChar("*12*2*2"),
            SameStarChar.sameStarChar("12*2*3*"),
            SameStarChar.sameStarChar("abcDEF"),
            SameStarChar.sameStarChar("XY*YYYY*Z*"),
            SameStarChar.sameStarChar("XY*YYYY*Y*"),
            SameStarChar.sameStarChar("12*2*3*"),
            SameStarChar.sameStarChar("*"),
            SameStarChar.sameStarChar("**"),
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
