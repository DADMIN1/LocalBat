package String1.Testcases;
import String1.WithoutEnd;

public class _WithoutEnd
{
    static String[] testcaseStrings = {
        "withoutEnd(\"Hello\")",
        "withoutEnd(\"java\")",
        "withoutEnd(\"coding\")",
    };

    static String[] expectedResults = {
        "ell",
        "av",
        "odin",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            WithoutEnd.withoutEnd("Hello"),
            WithoutEnd.withoutEnd("java"),
            WithoutEnd.withoutEnd("coding"),
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
