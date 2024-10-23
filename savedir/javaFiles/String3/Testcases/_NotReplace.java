package String3.Testcases;
import String3.NotReplace;

public class _NotReplace
{
    static String[] testcaseStrings = {
        "notReplace(\"is test\")",
        "notReplace(\"is-is\")",
        "notReplace(\"This is right\")",
    };

    static String[] expectedResults = {
        "is not test",
        "is not-is not",
        "This is not right",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            NotReplace.notReplace("is test"),
            NotReplace.notReplace("is-is"),
            NotReplace.notReplace("This is right"),
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
