package Logic1.Testcases;
import Logic1.InOrderEqual;

public class _InOrderEqual
{
    static String[] testcaseStrings = {
        "inOrderEqual(2, 5, 11, false)",
        "inOrderEqual(5, 7, 6, false)",
        "inOrderEqual(5, 5, 7, true)",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            InOrderEqual.inOrderEqual(2, 5, 11, false),
            InOrderEqual.inOrderEqual(5, 7, 6, false),
            InOrderEqual.inOrderEqual(5, 5, 7, true),
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
