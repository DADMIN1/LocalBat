package String1.Testcases;
import String1.MinCat;

public class _MinCat
{
    static String[] testcaseStrings = {
        "minCat(\"Hello\", \"Hi\")",
        "minCat(\"Hello\", \"java\")",
        "minCat(\"java\", \"Hello\")",
    };

    static String[] expectedResults = { "loHi", "ellojava", "javaello", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            MinCat.minCat("Hello", "Hi"),
            MinCat.minCat("Hello", "java"),
            MinCat.minCat("java", "Hello"),
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
