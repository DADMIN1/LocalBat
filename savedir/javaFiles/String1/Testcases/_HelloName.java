package String1.Testcases;
import String1.HelloName;

public class _HelloName
{
    static String[] testcaseStrings = {
        "helloName(\"Bob\")",
        "helloName(\"Alice\")",
        "helloName(\"X\")",
    };

    static String[] expectedResults = { "Hello Bob!", "Hello Alice!", "Hello X!", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            HelloName.helloName("Bob"),
            HelloName.helloName("Alice"),
            HelloName.helloName("X"),
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
