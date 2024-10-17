package AP1.Testcases;
import AP1.UserCompare;

public class _UserCompare
{
    static String[] testcaseStrings = {
        "userCompare(\"bb\", 1, \"zz\", 2)",
        "userCompare(\"bb\", 1, \"aa\", 2)",
        "userCompare(\"bb\", 1, \"bb\", 1)",
    };

    static int[] expectedResults = { -1, 1, 0, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            UserCompare.userCompare("bb", 1, "zz", 2),
            UserCompare.userCompare("bb", 1, "aa", 2),
            UserCompare.userCompare("bb", 1, "bb", 1),
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
