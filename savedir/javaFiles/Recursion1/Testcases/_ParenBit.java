package Recursion1.Testcases;
import Recursion1.ParenBit;

public final class _ParenBit
{
    static final String[] testcaseStrings = {
        "parenBit(\"xyz(abc)123\")",
        "parenBit(\"x(hello)\")",
        "parenBit(\"(xy)1\")",
        "parenBit(\"not really (possible)\")",
        "parenBit(\"(abc)\")",
        "parenBit(\"(abc)xyz\")",
        "parenBit(\"(abc)x\")",
        "parenBit(\"(x)\")",
        "parenBit(\"()\")",
        "parenBit(\"res (ipsa) loquitor\")",
        "parenBit(\"hello(not really)there\")",
        "parenBit(\"ab(ab)ab\")",
    };

    static final String[] expectedResults = {
        "(abc)",
        "(hello)",
        "(xy)",
        "(possible)",
        "(abc)",
        "(abc)",
        "(abc)",
        "(x)",
        "()",
        "(ipsa)",
        "(not really)",
        "(ab)",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            ParenBit.parenBit("xyz(abc)123"),
            ParenBit.parenBit("x(hello)"),
            ParenBit.parenBit("(xy)1"),
            ParenBit.parenBit("not really (possible)"),
            ParenBit.parenBit("(abc)"),
            ParenBit.parenBit("(abc)xyz"),
            ParenBit.parenBit("(abc)x"),
            ParenBit.parenBit("(x)"),
            ParenBit.parenBit("()"),
            ParenBit.parenBit("res (ipsa) loquitor"),
            ParenBit.parenBit("hello(not really)there"),
            ParenBit.parenBit("ab(ab)ab"),
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
