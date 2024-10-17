package Logic1.Testcases;
import Logic1.TwoAsOne;

public class _TwoAsOne
{
    static String[] testcaseStrings = {
        "twoAsOne(1, 2, 3)",
        "twoAsOne(3, 1, 2)",
        "twoAsOne(3, 2, 2)",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            TwoAsOne.twoAsOne(1, 2, 3),
            TwoAsOne.twoAsOne(3, 1, 2),
            TwoAsOne.twoAsOne(3, 2, 2),
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
