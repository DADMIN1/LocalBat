package Logic1.Testcases;
import Logic1.SumLimit;

public class _SumLimit
{
    static String[] testcaseStrings = {
        "sumLimit(2, 3)",
        "sumLimit(8, 3)",
        "sumLimit(8, 1)",
    };

    static int[] expectedResults = { 5, 8, 9, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            SumLimit.sumLimit(2, 3),
            SumLimit.sumLimit(8, 3),
            SumLimit.sumLimit(8, 1),
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
