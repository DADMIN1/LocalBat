package String3.Testcases;
import String3.SumDigits;

public final class _SumDigits
{
    static final String[] testcaseStrings = {
        "sumDigits(\"aa1bc2d3\")",
        "sumDigits(\"aa11b33\")",
        "sumDigits(\"Chocolate\")",
        "sumDigits(\"5hoco1a1e\")",
        "sumDigits(\"123abc123\")",
        "sumDigits(\"\")",
        "sumDigits(\"Hello\")",
        "sumDigits(\"X1z9b2\")",
        "sumDigits(\"5432a\")",
    };

    static final int[] expectedResults = {
        6,
        8,
        0,
        7,
        12,
        0,
        0,
        12,
        14,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            SumDigits.sumDigits("aa1bc2d3"),
            SumDigits.sumDigits("aa11b33"),
            SumDigits.sumDigits("Chocolate"),
            SumDigits.sumDigits("5hoco1a1e"),
            SumDigits.sumDigits("123abc123"),
            SumDigits.sumDigits(""),
            SumDigits.sumDigits("Hello"),
            SumDigits.sumDigits("X1z9b2"),
            SumDigits.sumDigits("5432a"),
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
