package String2.Testcases;
import String2.XyzThere;

public final class _XyzThere
{
    static final String[] testcaseStrings = {
        "xyzThere(\"abcxyz\")",
        "xyzThere(\"abc.xyz\")",
        "xyzThere(\"xyz.abc\")",
        "xyzThere(\"abcxy\")",
        "xyzThere(\"xyz\")",
        "xyzThere(\"xy\")",
        "xyzThere(\"x\")",
        "xyzThere(\"\")",
        "xyzThere(\"abc.xyzxyz\")",
        "xyzThere(\"abc.xxyz\")",
        "xyzThere(\".xyz\")",
        "xyzThere(\"12.xyz\")",
        "xyzThere(\"12xyz\")",
        "xyzThere(\"1.xyz.xyz2.xyz\")",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        false,
        false,
        false,
        true,
        true,
        false,
        false,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            XyzThere.xyzThere("abcxyz"),
            XyzThere.xyzThere("abc.xyz"),
            XyzThere.xyzThere("xyz.abc"),
            XyzThere.xyzThere("abcxy"),
            XyzThere.xyzThere("xyz"),
            XyzThere.xyzThere("xy"),
            XyzThere.xyzThere("x"),
            XyzThere.xyzThere(""),
            XyzThere.xyzThere("abc.xyzxyz"),
            XyzThere.xyzThere("abc.xxyz"),
            XyzThere.xyzThere(".xyz"),
            XyzThere.xyzThere("12.xyz"),
            XyzThere.xyzThere("12xyz"),
            XyzThere.xyzThere("1.xyz.xyz2.xyz"),
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
