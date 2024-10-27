package Logic1.Testcases;
import Logic1.WithoutDoubles;

public final class _WithoutDoubles
{
    static final String[] testcaseStrings = {
        "withoutDoubles(2, 3, true)",
        "withoutDoubles(3, 3, true)",
        "withoutDoubles(3, 3, false)",
        "withoutDoubles(2, 3, false)",
        "withoutDoubles(5, 4, true)",
        "withoutDoubles(5, 4, false)",
        "withoutDoubles(5, 5, true)",
        "withoutDoubles(5, 5, false)",
        "withoutDoubles(6, 6, true)",
        "withoutDoubles(6, 6, false)",
        "withoutDoubles(1, 6, true)",
        "withoutDoubles(6, 1, false)",
    };

    static final int[] expectedResults = {
        5,
        7,
        6,
        5,
        9,
        9,
        11,
        10,
        7,
        12,
        7,
        7,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            WithoutDoubles.withoutDoubles(2, 3, true),
            WithoutDoubles.withoutDoubles(3, 3, true),
            WithoutDoubles.withoutDoubles(3, 3, false),
            WithoutDoubles.withoutDoubles(2, 3, false),
            WithoutDoubles.withoutDoubles(5, 4, true),
            WithoutDoubles.withoutDoubles(5, 4, false),
            WithoutDoubles.withoutDoubles(5, 5, true),
            WithoutDoubles.withoutDoubles(5, 5, false),
            WithoutDoubles.withoutDoubles(6, 6, true),
            WithoutDoubles.withoutDoubles(6, 6, false),
            WithoutDoubles.withoutDoubles(1, 6, true),
            WithoutDoubles.withoutDoubles(6, 1, false),
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
