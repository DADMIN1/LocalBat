package Recursion1.Testcases;
import Recursion1.Triangle;

public final class _Triangle
{
    static final String[] testcaseStrings = {
        "triangle(0)",
        "triangle(1)",
        "triangle(2)",
        "triangle(3)",
        "triangle(4)",
        "triangle(5)",
        "triangle(6)",
        "triangle(7)",
    };

    static final int[] expectedResults = {
        0,
        1,
        3,
        6,
        10,
        15,
        21,
        28,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            Triangle.triangle(0),
            Triangle.triangle(1),
            Triangle.triangle(2),
            Triangle.triangle(3),
            Triangle.triangle(4),
            Triangle.triangle(5),
            Triangle.triangle(6),
            Triangle.triangle(7),
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
