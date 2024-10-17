package String1.Testcases;
import String1.Left2;

public class _Left2
{
    static String[] testcaseStrings = {
        "left2(\"Hello\")",
        "left2(\"java\")",
        "left2(\"Hi\")",
    };

    static String[] expectedResults = { "lloHe", "vaja", "Hi", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            Left2.left2("Hello"),
            Left2.left2("java"),
            Left2.left2("Hi"),
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
