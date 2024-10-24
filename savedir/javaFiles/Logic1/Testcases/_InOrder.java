package Logic1.Testcases;
import Logic1.InOrder;

public class _InOrder
{
    static String[] testcaseStrings = {
        "inOrder(1, 2, 4, false)",
        "inOrder(1, 2, 1, false)",
        "inOrder(1, 1, 2, true)",
        "inOrder(3, 2, 4, false)",
        "inOrder(2, 3, 4, false)",
        "inOrder(3, 2, 4, true)",
        "inOrder(4, 2, 2, true)",
        "inOrder(4, 5, 2, true)",
        "inOrder(2, 4, 6, true)",
        "inOrder(7, 9, 10, false)",
        "inOrder(7, 5, 6, true)",
        "inOrder(7, 5, 4, true)",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        false,
        true,
        true,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            InOrder.inOrder(1, 2, 4, false),
            InOrder.inOrder(1, 2, 1, false),
            InOrder.inOrder(1, 1, 2, true),
            InOrder.inOrder(3, 2, 4, false),
            InOrder.inOrder(2, 3, 4, false),
            InOrder.inOrder(3, 2, 4, true),
            InOrder.inOrder(4, 2, 2, true),
            InOrder.inOrder(4, 5, 2, true),
            InOrder.inOrder(2, 4, 6, true),
            InOrder.inOrder(7, 9, 10, false),
            InOrder.inOrder(7, 5, 6, true),
            InOrder.inOrder(7, 5, 4, true),
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
