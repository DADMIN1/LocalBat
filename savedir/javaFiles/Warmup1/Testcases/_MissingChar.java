package Warmup1.Testcases;
import Warmup1.MissingChar;

public class _MissingChar
{
    static String[] testcaseStrings = {
        "missingChar(\"kitten\", 1)",
        "missingChar(\"kitten\", 0)",
        "missingChar(\"kitten\", 4)",
        "missingChar(\"Hi\", 0)",
        "missingChar(\"Hi\", 1)",
        "missingChar(\"code\", 0)",
        "missingChar(\"code\", 1)",
        "missingChar(\"code\", 2)",
        "missingChar(\"code\", 3)",
        "missingChar(\"chocolate\", 8)",
    };

    static String[] expectedResults = {
        "ktten",
        "itten",
        "kittn",
        "i",
        "H",
        "ode",
        "cde",
        "coe",
        "cod",
        "chocolat",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            MissingChar.missingChar("kitten", 1),
            MissingChar.missingChar("kitten", 0),
            MissingChar.missingChar("kitten", 4),
            MissingChar.missingChar("Hi", 0),
            MissingChar.missingChar("Hi", 1),
            MissingChar.missingChar("code", 0),
            MissingChar.missingChar("code", 1),
            MissingChar.missingChar("code", 2),
            MissingChar.missingChar("code", 3),
            MissingChar.missingChar("chocolate", 8),
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
