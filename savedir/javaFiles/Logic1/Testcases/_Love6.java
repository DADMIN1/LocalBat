package Logic1.Testcases;
import Logic1.Love6;

public class _Love6
{
    static String[] testcaseStrings = {
        "love6(6, 4)",
        "love6(4, 5)",
        "love6(1, 5)",
        "love6(1, 6)",
        "love6(1, 8)",
        "love6(1, 7)",
        "love6(7, 5)",
        "love6(8, 2)",
        "love6(6, 6)",
        "love6(-6, 2)",
        "love6(-4, -10)",
        "love6(-7, 1)",
        "love6(7, -1)",
        "love6(-6, 12)",
        "love6(-2, -4)",
        "love6(7, 1)",
        "love6(0, 9)",
        "love6(8, 3)",
        "love6(3, 3)",
        "love6(3, 4)",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
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
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            Love6.love6(6, 4),
            Love6.love6(4, 5),
            Love6.love6(1, 5),
            Love6.love6(1, 6),
            Love6.love6(1, 8),
            Love6.love6(1, 7),
            Love6.love6(7, 5),
            Love6.love6(8, 2),
            Love6.love6(6, 6),
            Love6.love6(-6, 2),
            Love6.love6(-4, -10),
            Love6.love6(-7, 1),
            Love6.love6(7, -1),
            Love6.love6(-6, 12),
            Love6.love6(-2, -4),
            Love6.love6(7, 1),
            Love6.love6(0, 9),
            Love6.love6(8, 3),
            Love6.love6(3, 3),
            Love6.love6(3, 4),
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
