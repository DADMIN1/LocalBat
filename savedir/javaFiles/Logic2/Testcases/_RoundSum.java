package Logic2.Testcases;
import Logic2.RoundSum;

public final class _RoundSum
{
    static final String[] testcaseStrings = {
        "roundSum(16, 17, 18)",
        "roundSum(12, 13, 14)",
        "roundSum(6, 4, 4)",
        "roundSum(4, 6, 5)",
        "roundSum(4, 4, 6)",
        "roundSum(9, 4, 4)",
        "roundSum(0, 0, 1)",
        "roundSum(0, 9, 0)",
        "roundSum(10, 10, 19)",
        "roundSum(20, 30, 40)",
        "roundSum(45, 21, 30)",
        "roundSum(23, 11, 26)",
        "roundSum(23, 24, 25)",
        "roundSum(25, 24, 25)",
        "roundSum(23, 24, 29)",
        "roundSum(11, 24, 36)",
        "roundSum(24, 36, 32)",
        "roundSum(14, 12, 26)",
        "roundSum(12, 10, 24)",
    };

    static final int[] expectedResults = {
        60,
        30,
        10,
        20,
        10,
        10,
        0,
        10,
        40,
        90,
        100,
        60,
        70,
        80,
        70,
        70,
        90,
        50,
        40,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            RoundSum.roundSum(16, 17, 18),
            RoundSum.roundSum(12, 13, 14),
            RoundSum.roundSum(6, 4, 4),
            RoundSum.roundSum(4, 6, 5),
            RoundSum.roundSum(4, 4, 6),
            RoundSum.roundSum(9, 4, 4),
            RoundSum.roundSum(0, 0, 1),
            RoundSum.roundSum(0, 9, 0),
            RoundSum.roundSum(10, 10, 19),
            RoundSum.roundSum(20, 30, 40),
            RoundSum.roundSum(45, 21, 30),
            RoundSum.roundSum(23, 11, 26),
            RoundSum.roundSum(23, 24, 25),
            RoundSum.roundSum(25, 24, 25),
            RoundSum.roundSum(23, 24, 29),
            RoundSum.roundSum(11, 24, 36),
            RoundSum.roundSum(24, 36, 32),
            RoundSum.roundSum(14, 12, 26),
            RoundSum.roundSum(12, 10, 24),
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
