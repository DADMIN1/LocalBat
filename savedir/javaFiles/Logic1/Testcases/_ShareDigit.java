package Logic1.Testcases;
import Logic1.ShareDigit;

public final class _ShareDigit
{
    static final String[] testcaseStrings = {
        "shareDigit(12, 23)",
        "shareDigit(12, 43)",
        "shareDigit(12, 44)",
        "shareDigit(23, 12)",
        "shareDigit(23, 39)",
        "shareDigit(23, 19)",
        "shareDigit(30, 90)",
        "shareDigit(30, 91)",
        "shareDigit(55, 55)",
        "shareDigit(55, 44)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            ShareDigit.shareDigit(12, 23),
            ShareDigit.shareDigit(12, 43),
            ShareDigit.shareDigit(12, 44),
            ShareDigit.shareDigit(23, 12),
            ShareDigit.shareDigit(23, 39),
            ShareDigit.shareDigit(23, 19),
            ShareDigit.shareDigit(30, 90),
            ShareDigit.shareDigit(30, 91),
            ShareDigit.shareDigit(55, 55),
            ShareDigit.shareDigit(55, 44),
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
