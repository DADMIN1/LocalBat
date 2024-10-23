package String1.Testcases;
import String1.ConCat;

public class _ConCat
{
    static String[] testcaseStrings = {
        "conCat(\"abc\", \"cat\")",
        "conCat(\"dog\", \"cat\")",
        "conCat(\"abc\", \"\")",
    };

    static String[] expectedResults = {
        "abcat",
        "dogcat",
        "abc",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            ConCat.conCat("abc", "cat"),
            ConCat.conCat("dog", "cat"),
            ConCat.conCat("abc", ""),
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
