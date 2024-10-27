package Recursion1.Testcases;
import Recursion1.StrCount;

public final class _StrCount
{
    static final String[] testcaseStrings = {
        "strCount(\"catcowcat\", \"cat\")",
        "strCount(\"catcowcat\", \"cow\")",
        "strCount(\"catcowcat\", \"dog\")",
        "strCount(\"cacatcowcat\", \"cat\")",
        "strCount(\"xyx\", \"x\")",
        "strCount(\"iiiijj\", \"i\")",
        "strCount(\"iiiijj\", \"ii\")",
        "strCount(\"iiiijj\", \"iii\")",
        "strCount(\"iiiijj\", \"j\")",
        "strCount(\"iiiijj\", \"jj\")",
        "strCount(\"aaabababab\", \"ab\")",
        "strCount(\"aaabababab\", \"aa\")",
        "strCount(\"aaabababab\", \"a\")",
        "strCount(\"aaabababab\", \"b\")",
    };

    static final int[] expectedResults = {
        2,
        1,
        0,
        2,
        2,
        4,
        2,
        1,
        2,
        1,
        4,
        1,
        6,
        4,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            StrCount.strCount("catcowcat", "cat"),
            StrCount.strCount("catcowcat", "cow"),
            StrCount.strCount("catcowcat", "dog"),
            StrCount.strCount("cacatcowcat", "cat"),
            StrCount.strCount("xyx", "x"),
            StrCount.strCount("iiiijj", "i"),
            StrCount.strCount("iiiijj", "ii"),
            StrCount.strCount("iiiijj", "iii"),
            StrCount.strCount("iiiijj", "j"),
            StrCount.strCount("iiiijj", "jj"),
            StrCount.strCount("aaabababab", "ab"),
            StrCount.strCount("aaabababab", "aa"),
            StrCount.strCount("aaabababab", "a"),
            StrCount.strCount("aaabababab", "b"),
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
