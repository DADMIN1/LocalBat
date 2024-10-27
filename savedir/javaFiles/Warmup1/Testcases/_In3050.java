package Warmup1.Testcases;
import Warmup1.In3050;

public final class _In3050
{
    static final String[] testcaseStrings = {
        "in3050(30, 31)",
        "in3050(30, 41)",
        "in3050(40, 50)",
        "in3050(40, 51)",
        "in3050(39, 50)",
        "in3050(50, 39)",
        "in3050(40, 39)",
        "in3050(49, 48)",
        "in3050(50, 40)",
        "in3050(50, 51)",
        "in3050(35, 36)",
        "in3050(35, 45)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        false,
        false,
        true,
        true,
        true,
        false,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            In3050.in3050(30, 31),
            In3050.in3050(30, 41),
            In3050.in3050(40, 50),
            In3050.in3050(40, 51),
            In3050.in3050(39, 50),
            In3050.in3050(50, 39),
            In3050.in3050(40, 39),
            In3050.in3050(49, 48),
            In3050.in3050(50, 40),
            In3050.in3050(50, 51),
            In3050.in3050(35, 36),
            In3050.in3050(35, 45),
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
