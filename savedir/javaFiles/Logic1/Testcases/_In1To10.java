package Logic1.Testcases;
import Logic1.In1To10;

public final class _In1To10
{
    static final String[] testcaseStrings = {
        "in1To10(5, false)",
        "in1To10(11, false)",
        "in1To10(11, true)",
        "in1To10(10, false)",
        "in1To10(10, true)",
        "in1To10(9, false)",
        "in1To10(9, true)",
        "in1To10(1, false)",
        "in1To10(1, true)",
        "in1To10(0, false)",
        "in1To10(0, true)",
        "in1To10(-1, false)",
        "in1To10(-1, true)",
        "in1To10(99, false)",
        "in1To10(-99, true)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        true,
        false,
        true,
        true,
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
            In1To10.in1To10(5, false),
            In1To10.in1To10(11, false),
            In1To10.in1To10(11, true),
            In1To10.in1To10(10, false),
            In1To10.in1To10(10, true),
            In1To10.in1To10(9, false),
            In1To10.in1To10(9, true),
            In1To10.in1To10(1, false),
            In1To10.in1To10(1, true),
            In1To10.in1To10(0, false),
            In1To10.in1To10(0, true),
            In1To10.in1To10(-1, false),
            In1To10.in1To10(-1, true),
            In1To10.in1To10(99, false),
            In1To10.in1To10(-99, true),
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
