package Recursion1.Testcases;
import Recursion1.ParenBit;

public class _ParenBit
{
    static String[] testcaseStrings = {
        "parenBit(\"xyz(abc)123\")",
        "parenBit(\"x(hello)\")",
        "parenBit(\"(xy)1\")",
    };

    static String[] expectedResults = {
        "(abc)",
        "(hello)",
        "(xy)",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            ParenBit.parenBit("xyz(abc)123"),
            ParenBit.parenBit("x(hello)"),
            ParenBit.parenBit("(xy)1"),
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
