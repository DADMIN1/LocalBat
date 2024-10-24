package Logic1.Testcases;
import Logic1.InOrderEqual;

public class _InOrderEqual
{
    static String[] testcaseStrings = {
        "inOrderEqual(2, 5, 11, false)",
        "inOrderEqual(5, 7, 6, false)",
        "inOrderEqual(5, 5, 7, true)",
        "inOrderEqual(5, 5, 7, false)",
        "inOrderEqual(2, 5, 4, false)",
        "inOrderEqual(3, 4, 3, false)",
        "inOrderEqual(3, 4, 4, false)",
        "inOrderEqual(3, 4, 3, true)",
        "inOrderEqual(3, 4, 4, true)",
        "inOrderEqual(1, 5, 5, true)",
        "inOrderEqual(5, 5, 5, true)",
        "inOrderEqual(2, 2, 1, true)",
        "inOrderEqual(9, 2, 2, true)",
        "inOrderEqual(0, 1, 0, true)",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
        true,
        false,
        false,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            InOrderEqual.inOrderEqual(2, 5, 11, false),
            InOrderEqual.inOrderEqual(5, 7, 6, false),
            InOrderEqual.inOrderEqual(5, 5, 7, true),
            InOrderEqual.inOrderEqual(5, 5, 7, false),
            InOrderEqual.inOrderEqual(2, 5, 4, false),
            InOrderEqual.inOrderEqual(3, 4, 3, false),
            InOrderEqual.inOrderEqual(3, 4, 4, false),
            InOrderEqual.inOrderEqual(3, 4, 3, true),
            InOrderEqual.inOrderEqual(3, 4, 4, true),
            InOrderEqual.inOrderEqual(1, 5, 5, true),
            InOrderEqual.inOrderEqual(5, 5, 5, true),
            InOrderEqual.inOrderEqual(2, 2, 1, true),
            InOrderEqual.inOrderEqual(9, 2, 2, true),
            InOrderEqual.inOrderEqual(0, 1, 0, true),
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
