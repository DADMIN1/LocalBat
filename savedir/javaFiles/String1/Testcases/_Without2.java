package String1.Testcases;
import String1.Without2;

public class _Without2
{
    static String[] testcaseStrings = {
        "without2(\"HelloHe\")",
        "without2(\"HelloHi\")",
        "without2(\"Hi\")",
    };

    static String[] expectedResults = {
        "lloHe",
        "HelloHi",
        "",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            Without2.without2("HelloHe"),
            Without2.without2("HelloHi"),
            Without2.without2("Hi"),
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
