package Logic1.Testcases;
import Logic1.InOrder;

public class _InOrder
{
    static String[] testcaseStrings = {
        "inOrder(1, 2, 4, false)",
        "inOrder(1, 2, 1, false)",
        "inOrder(1, 1, 2, true)",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            InOrder.inOrder(1, 2, 4, false),
            InOrder.inOrder(1, 2, 1, false),
            InOrder.inOrder(1, 1, 2, true),
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
