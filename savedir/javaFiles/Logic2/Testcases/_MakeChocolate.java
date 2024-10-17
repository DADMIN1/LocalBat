package Logic2.Testcases;
import Logic2.MakeChocolate;

public class _MakeChocolate
{
    static String[] testcaseStrings = {
        "makeChocolate(4, 1, 9)",
        "makeChocolate(4, 1, 10)",
        "makeChocolate(4, 1, 7)",
    };

    static int[] expectedResults = { 4, -1, 2, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            MakeChocolate.makeChocolate(4, 1, 9),
            MakeChocolate.makeChocolate(4, 1, 10),
            MakeChocolate.makeChocolate(4, 1, 7),
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
