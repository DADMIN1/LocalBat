package Recursion1.Testcases;
import Recursion1.AllStar;

public final class _AllStar
{
    static final String[] testcaseStrings = {
        "allStar(\"hello\")",
        "allStar(\"abc\")",
        "allStar(\"ab\")",
        "allStar(\"a\")",
        "allStar(\"\")",
        "allStar(\"3.14\")",
        "allStar(\"Chocolate\")",
        "allStar(\"1234\")",
    };

    static final String[] expectedResults = {
        "h*e*l*l*o",
        "a*b*c",
        "a*b",
        "a",
        "",
        "3*.*1*4",
        "C*h*o*c*o*l*a*t*e",
        "1*2*3*4",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            AllStar.allStar("hello"),
            AllStar.allStar("abc"),
            AllStar.allStar("ab"),
            AllStar.allStar("a"),
            AllStar.allStar(""),
            AllStar.allStar("3.14"),
            AllStar.allStar("Chocolate"),
            AllStar.allStar("1234"),
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
