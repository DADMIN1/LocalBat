package Warmup2.Testcases;
import Warmup2.CountXX;

public final class _CountXX
{
    static final String[] testcaseStrings = {
        "countXX(\"abcxx\")",
        "countXX(\"xxx\")",
        "countXX(\"xxxx\")",
        "countXX(\"abc\")",
        "countXX(\"Hello there\")",
        "countXX(\"Hexxo thxxe\")",
        "countXX(\"\")",
        "countXX(\"Kittens\")",
        "countXX(\"Kittensxxx\")",
    };

    static final int[] expectedResults = {
        1,
        2,
        3,
        0,
        0,
        2,
        0,
        0,
        2,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            CountXX.countXX("abcxx"),
            CountXX.countXX("xxx"),
            CountXX.countXX("xxxx"),
            CountXX.countXX("abc"),
            CountXX.countXX("Hello there"),
            CountXX.countXX("Hexxo thxxe"),
            CountXX.countXX(""),
            CountXX.countXX("Kittens"),
            CountXX.countXX("Kittensxxx"),
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
