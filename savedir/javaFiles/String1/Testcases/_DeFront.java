package String1.Testcases;
import String1.DeFront;

public class _DeFront
{
    static String[] testcaseStrings = {
        "deFront(\"Hello\")",
        "deFront(\"java\")",
        "deFront(\"away\")",
    };

    static String[] expectedResults = { "llo", "va", "aay", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            DeFront.deFront("Hello"),
            DeFront.deFront("java"),
            DeFront.deFront("away"),
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
