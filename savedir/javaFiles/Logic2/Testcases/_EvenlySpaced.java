package Logic2.Testcases;
import Logic2.EvenlySpaced;

public class _EvenlySpaced
{
    static String[] testcaseStrings = {
        "evenlySpaced(2, 4, 6)",
        "evenlySpaced(4, 6, 2)",
        "evenlySpaced(4, 6, 3)",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            EvenlySpaced.evenlySpaced(2, 4, 6),
            EvenlySpaced.evenlySpaced(4, 6, 2),
            EvenlySpaced.evenlySpaced(4, 6, 3),
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
