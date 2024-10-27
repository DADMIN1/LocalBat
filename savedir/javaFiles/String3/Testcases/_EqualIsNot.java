package String3.Testcases;
import String3.EqualIsNot;

public final class _EqualIsNot
{
    static final String[] testcaseStrings = {
        "equalIsNot(\"This is not\")",
        "equalIsNot(\"This is notnot\")",
        "equalIsNot(\"noisxxnotyynotxisi\")",
        "equalIsNot(\"noisxxnotyynotxsi\")",
        "equalIsNot(\"xxxyyyzzzintint\")",
        "equalIsNot(\"\")",
        "equalIsNot(\"isisnotnot\")",
        "equalIsNot(\"isisnotno7Not\")",
        "equalIsNot(\"isnotis\")",
        "equalIsNot(\"mis3notpotbotis\")",
    };

    static final boolean[] expectedResults = {
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
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            EqualIsNot.equalIsNot("This is not"),
            EqualIsNot.equalIsNot("This is notnot"),
            EqualIsNot.equalIsNot("noisxxnotyynotxisi"),
            EqualIsNot.equalIsNot("noisxxnotyynotxsi"),
            EqualIsNot.equalIsNot("xxxyyyzzzintint"),
            EqualIsNot.equalIsNot(""),
            EqualIsNot.equalIsNot("isisnotnot"),
            EqualIsNot.equalIsNot("isisnotno7Not"),
            EqualIsNot.equalIsNot("isnotis"),
            EqualIsNot.equalIsNot("mis3notpotbotis"),
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
