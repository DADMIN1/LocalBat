package AP1.Testcases;
import AP1.UserCompare;

public final class _UserCompare
{
    static final String[] testcaseStrings = {
        "userCompare(\"bb\", 1, \"zz\", 2)",
        "userCompare(\"bb\", 1, \"aa\", 2)",
        "userCompare(\"bb\", 1, \"bb\", 1)",
        "userCompare(\"bb\", 5, \"bb\", 1)",
        "userCompare(\"bb\", 5, \"bb\", 10)",
        "userCompare(\"adam\", 1, \"bob\", 2)",
        "userCompare(\"bob\", 1, \"bob\", 2)",
        "userCompare(\"bzb\", 1, \"bob\", 2)",
    };

    static final int[] expectedResults = {
        -1,
        1,
        0,
        1,
        -1,
        -1,
        -1,
        1,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            UserCompare.userCompare("bb", 1, "zz", 2),
            UserCompare.userCompare("bb", 1, "aa", 2),
            UserCompare.userCompare("bb", 1, "bb", 1),
            UserCompare.userCompare("bb", 5, "bb", 1),
            UserCompare.userCompare("bb", 5, "bb", 10),
            UserCompare.userCompare("adam", 1, "bob", 2),
            UserCompare.userCompare("bob", 1, "bob", 2),
            UserCompare.userCompare("bzb", 1, "bob", 2),
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
