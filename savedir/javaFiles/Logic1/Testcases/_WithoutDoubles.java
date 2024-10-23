package Logic1.Testcases;
import Logic1.WithoutDoubles;

public class _WithoutDoubles
{
    static String[] testcaseStrings = {
        "withoutDoubles(2, 3, true)",
        "withoutDoubles(3, 3, true)",
        "withoutDoubles(3, 3, false)",
    };

    static int[] expectedResults = {
        5,
        7,
        6,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            WithoutDoubles.withoutDoubles(2, 3, true),
            WithoutDoubles.withoutDoubles(3, 3, true),
            WithoutDoubles.withoutDoubles(3, 3, false),
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
