package Warmup1.Testcases;
import Warmup1.NearHundred;

public final class _NearHundred
{
    static final String[] testcaseStrings = {
        "nearHundred(93)",
        "nearHundred(90)",
        "nearHundred(89)",
        "nearHundred(110)",
        "nearHundred(111)",
        "nearHundred(121)",
        "nearHundred(-101)",
        "nearHundred(-209)",
        "nearHundred(190)",
        "nearHundred(209)",
        "nearHundred(0)",
        "nearHundred(5)",
        "nearHundred(-50)",
        "nearHundred(191)",
        "nearHundred(189)",
        "nearHundred(200)",
        "nearHundred(210)",
        "nearHundred(211)",
        "nearHundred(290)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        true,
        false,
        true,
        true,
        false,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            NearHundred.nearHundred(93),
            NearHundred.nearHundred(90),
            NearHundred.nearHundred(89),
            NearHundred.nearHundred(110),
            NearHundred.nearHundred(111),
            NearHundred.nearHundred(121),
            NearHundred.nearHundred(-101),
            NearHundred.nearHundred(-209),
            NearHundred.nearHundred(190),
            NearHundred.nearHundred(209),
            NearHundred.nearHundred(0),
            NearHundred.nearHundred(5),
            NearHundred.nearHundred(-50),
            NearHundred.nearHundred(191),
            NearHundred.nearHundred(189),
            NearHundred.nearHundred(200),
            NearHundred.nearHundred(210),
            NearHundred.nearHundred(211),
            NearHundred.nearHundred(290),
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
