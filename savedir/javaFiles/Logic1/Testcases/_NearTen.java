package Logic1.Testcases;
import Logic1.NearTen;

public final class _NearTen
{
    static final String[] testcaseStrings = {
        "nearTen(12)",
        "nearTen(17)",
        "nearTen(19)",
        "nearTen(31)",
        "nearTen(6)",
        "nearTen(10)",
        "nearTen(11)",
        "nearTen(21)",
        "nearTen(22)",
        "nearTen(23)",
        "nearTen(54)",
        "nearTen(155)",
        "nearTen(158)",
        "nearTen(3)",
        "nearTen(1)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        true,
        true,
        false,
        false,
        false,
        true,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            NearTen.nearTen(12),
            NearTen.nearTen(17),
            NearTen.nearTen(19),
            NearTen.nearTen(31),
            NearTen.nearTen(6),
            NearTen.nearTen(10),
            NearTen.nearTen(11),
            NearTen.nearTen(21),
            NearTen.nearTen(22),
            NearTen.nearTen(23),
            NearTen.nearTen(54),
            NearTen.nearTen(155),
            NearTen.nearTen(158),
            NearTen.nearTen(3),
            NearTen.nearTen(1),
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
