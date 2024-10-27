package String1.Testcases;
import String1.ExtraEnd;

public final class _ExtraEnd
{
    static final String[] testcaseStrings = {
        "extraEnd(\"Hello\")",
        "extraEnd(\"ab\")",
        "extraEnd(\"Hi\")",
        "extraEnd(\"Candy\")",
        "extraEnd(\"Code\")",
    };

    static final String[] expectedResults = {
        "lololo",
        "ababab",
        "HiHiHi",
        "dydydy",
        "dedede",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            ExtraEnd.extraEnd("Hello"),
            ExtraEnd.extraEnd("ab"),
            ExtraEnd.extraEnd("Hi"),
            ExtraEnd.extraEnd("Candy"),
            ExtraEnd.extraEnd("Code"),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(expectedResults[i]))
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
