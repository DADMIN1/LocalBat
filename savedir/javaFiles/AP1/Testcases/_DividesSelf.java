package AP1.Testcases;
import AP1.DividesSelf;

public final class _DividesSelf
{
    static final String[] testcaseStrings = {
        "dividesSelf(128)",
        "dividesSelf(12)",
        "dividesSelf(120)",
        "dividesSelf(122)",
        "dividesSelf(13)",
        "dividesSelf(32)",
        "dividesSelf(22)",
        "dividesSelf(42)",
        "dividesSelf(212)",
        "dividesSelf(213)",
        "dividesSelf(162)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        false,
        true,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            DividesSelf.dividesSelf(128),
            DividesSelf.dividesSelf(12),
            DividesSelf.dividesSelf(120),
            DividesSelf.dividesSelf(122),
            DividesSelf.dividesSelf(13),
            DividesSelf.dividesSelf(32),
            DividesSelf.dividesSelf(22),
            DividesSelf.dividesSelf(42),
            DividesSelf.dividesSelf(212),
            DividesSelf.dividesSelf(213),
            DividesSelf.dividesSelf(162),
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
