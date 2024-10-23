package String1.Testcases;
import String1.WithoutX2;

public class _WithoutX2
{
    static String[] testcaseStrings = {
        "withoutX2(\"xHi\")",
        "withoutX2(\"Hxi\")",
        "withoutX2(\"Hi\")",
    };

    static String[] expectedResults = {
        "Hi",
        "Hi",
        "Hi",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            WithoutX2.withoutX2("xHi"),
            WithoutX2.withoutX2("Hxi"),
            WithoutX2.withoutX2("Hi"),
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
