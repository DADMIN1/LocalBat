package Warmup1.Testcases;
import Warmup1.Or35;

public final class _Or35
{
    static final String[] testcaseStrings = {
        "or35(3)",
        "or35(10)",
        "or35(8)",
        "or35(15)",
        "or35(5)",
        "or35(9)",
        "or35(4)",
        "or35(7)",
        "or35(6)",
        "or35(17)",
        "or35(18)",
        "or35(29)",
        "or35(20)",
        "or35(21)",
        "or35(22)",
        "or35(45)",
        "or35(99)",
        "or35(100)",
        "or35(101)",
        "or35(121)",
        "or35(122)",
        "or35(123)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        true,
        false,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        true,
        false,
        false,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            Or35.or35(3),
            Or35.or35(10),
            Or35.or35(8),
            Or35.or35(15),
            Or35.or35(5),
            Or35.or35(9),
            Or35.or35(4),
            Or35.or35(7),
            Or35.or35(6),
            Or35.or35(17),
            Or35.or35(18),
            Or35.or35(29),
            Or35.or35(20),
            Or35.or35(21),
            Or35.or35(22),
            Or35.or35(45),
            Or35.or35(99),
            Or35.or35(100),
            Or35.or35(101),
            Or35.or35(121),
            Or35.or35(122),
            Or35.or35(123),
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
