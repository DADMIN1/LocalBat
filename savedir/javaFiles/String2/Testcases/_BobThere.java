package String2.Testcases;
import String2.BobThere;

public final class _BobThere
{
    static final String[] testcaseStrings = {
        "bobThere(\"abcbob\")",
        "bobThere(\"b9b\")",
        "bobThere(\"bac\")",
        "bobThere(\"bbb\")",
        "bobThere(\"abcdefb\")",
        "bobThere(\"123abcbcdbabxyz\")",
        "bobThere(\"b12\")",
        "bobThere(\"b1b\")",
        "bobThere(\"b12b1b\")",
        "bobThere(\"bbc\")",
        "bobThere(\"bbb\")",
        "bobThere(\"bb\")",
        "bobThere(\"b\")",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            BobThere.bobThere("abcbob"),
            BobThere.bobThere("b9b"),
            BobThere.bobThere("bac"),
            BobThere.bobThere("bbb"),
            BobThere.bobThere("abcdefb"),
            BobThere.bobThere("123abcbcdbabxyz"),
            BobThere.bobThere("b12"),
            BobThere.bobThere("b1b"),
            BobThere.bobThere("b12b1b"),
            BobThere.bobThere("bbc"),
            BobThere.bobThere("bbb"),
            BobThere.bobThere("bb"),
            BobThere.bobThere("b"),
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
