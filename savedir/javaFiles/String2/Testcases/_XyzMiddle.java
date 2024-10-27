package String2.Testcases;
import String2.XyzMiddle;

public final class _XyzMiddle
{
    static final String[] testcaseStrings = {
        "xyzMiddle(\"AAxyzBB\")",
        "xyzMiddle(\"AxyzBB\")",
        "xyzMiddle(\"AxyzBBB\")",
        "xyzMiddle(\"AxyzBBBB\")",
        "xyzMiddle(\"AAAxyzB\")",
        "xyzMiddle(\"AAAxyzBB\")",
        "xyzMiddle(\"AAAAxyzBB\")",
        "xyzMiddle(\"AAAAAxyzBBB\")",
        "xyzMiddle(\"1x345xyz12x4\")",
        "xyzMiddle(\"xyzAxyzBBB\")",
        "xyzMiddle(\"xyzAxyzBxyz\")",
        "xyzMiddle(\"xyzxyzAxyzBxyzxyz\")",
        "xyzMiddle(\"xyzxyzxyzBxyzxyz\")",
        "xyzMiddle(\"xyzxyzAxyzxyzxyz\")",
        "xyzMiddle(\"xyzxyzAxyzxyzxy\")",
        "xyzMiddle(\"AxyzxyzBB\")",
        "xyzMiddle(\"\")",
        "xyzMiddle(\"x\")",
        "xyzMiddle(\"xy\")",
        "xyzMiddle(\"xyz\")",
        "xyzMiddle(\"xyzz\")",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        false,
        true,
        false,
        false,
        true,
        true,
        true,
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            XyzMiddle.xyzMiddle("AAxyzBB"),
            XyzMiddle.xyzMiddle("AxyzBB"),
            XyzMiddle.xyzMiddle("AxyzBBB"),
            XyzMiddle.xyzMiddle("AxyzBBBB"),
            XyzMiddle.xyzMiddle("AAAxyzB"),
            XyzMiddle.xyzMiddle("AAAxyzBB"),
            XyzMiddle.xyzMiddle("AAAAxyzBB"),
            XyzMiddle.xyzMiddle("AAAAAxyzBBB"),
            XyzMiddle.xyzMiddle("1x345xyz12x4"),
            XyzMiddle.xyzMiddle("xyzAxyzBBB"),
            XyzMiddle.xyzMiddle("xyzAxyzBxyz"),
            XyzMiddle.xyzMiddle("xyzxyzAxyzBxyzxyz"),
            XyzMiddle.xyzMiddle("xyzxyzxyzBxyzxyz"),
            XyzMiddle.xyzMiddle("xyzxyzAxyzxyzxyz"),
            XyzMiddle.xyzMiddle("xyzxyzAxyzxyzxy"),
            XyzMiddle.xyzMiddle("AxyzxyzBB"),
            XyzMiddle.xyzMiddle(""),
            XyzMiddle.xyzMiddle("x"),
            XyzMiddle.xyzMiddle("xy"),
            XyzMiddle.xyzMiddle("xyz"),
            XyzMiddle.xyzMiddle("xyzz"),
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
