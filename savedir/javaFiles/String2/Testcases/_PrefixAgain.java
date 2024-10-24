package String2.Testcases;
import String2.PrefixAgain;

public class _PrefixAgain
{
    static String[] testcaseStrings = {
        "prefixAgain(\"abXYabc\", 1)",
        "prefixAgain(\"abXYabc\", 2)",
        "prefixAgain(\"abXYabc\", 3)",
        "prefixAgain(\"xyzxyxyxy\", 2)",
        "prefixAgain(\"xyzxyxyxy\", 3)",
        "prefixAgain(\"Hi12345Hi6789Hi10\", 1)",
        "prefixAgain(\"Hi12345Hi6789Hi10\", 2)",
        "prefixAgain(\"Hi12345Hi6789Hi10\", 3)",
        "prefixAgain(\"Hi12345Hi6789Hi10\", 4)",
        "prefixAgain(\"a\", 1)",
        "prefixAgain(\"aa\", 1)",
        "prefixAgain(\"ab\", 1)",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        false,
        false,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            PrefixAgain.prefixAgain("abXYabc", 1),
            PrefixAgain.prefixAgain("abXYabc", 2),
            PrefixAgain.prefixAgain("abXYabc", 3),
            PrefixAgain.prefixAgain("xyzxyxyxy", 2),
            PrefixAgain.prefixAgain("xyzxyxyxy", 3),
            PrefixAgain.prefixAgain("Hi12345Hi6789Hi10", 1),
            PrefixAgain.prefixAgain("Hi12345Hi6789Hi10", 2),
            PrefixAgain.prefixAgain("Hi12345Hi6789Hi10", 3),
            PrefixAgain.prefixAgain("Hi12345Hi6789Hi10", 4),
            PrefixAgain.prefixAgain("a", 1),
            PrefixAgain.prefixAgain("aa", 1),
            PrefixAgain.prefixAgain("ab", 1),
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
