package String2.Testcases;
import String2.StarOut;

public final class _StarOut
{
    static final String[] testcaseStrings = {
        "starOut(\"ab*cd\")",
        "starOut(\"ab**cd\")",
        "starOut(\"sm*eilly\")",
        "starOut(\"sm*eil*ly\")",
        "starOut(\"sm**eil*ly\")",
        "starOut(\"sm***eil*ly\")",
        "starOut(\"stringy*\")",
        "starOut(\"*stringy\")",
        "starOut(\"*str*in*gy\")",
        "starOut(\"abc\")",
        "starOut(\"a*bc\")",
        "starOut(\"ab\")",
        "starOut(\"a*b\")",
        "starOut(\"a\")",
        "starOut(\"a*\")",
        "starOut(\"*a\")",
        "starOut(\"*\")",
        "starOut(\"\")",
    };

    static final String[] expectedResults = {
        "ad",
        "ad",
        "silly",
        "siy",
        "siy",
        "siy",
        "string",
        "tringy",
        "ty",
        "abc",
        "c",
        "ab",
        "",
        "a",
        "",
        "",
        "",
        "",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            StarOut.starOut("ab*cd"),
            StarOut.starOut("ab**cd"),
            StarOut.starOut("sm*eilly"),
            StarOut.starOut("sm*eil*ly"),
            StarOut.starOut("sm**eil*ly"),
            StarOut.starOut("sm***eil*ly"),
            StarOut.starOut("stringy*"),
            StarOut.starOut("*stringy"),
            StarOut.starOut("*str*in*gy"),
            StarOut.starOut("abc"),
            StarOut.starOut("a*bc"),
            StarOut.starOut("ab"),
            StarOut.starOut("a*b"),
            StarOut.starOut("a"),
            StarOut.starOut("a*"),
            StarOut.starOut("*a"),
            StarOut.starOut("*"),
            StarOut.starOut(""),
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
