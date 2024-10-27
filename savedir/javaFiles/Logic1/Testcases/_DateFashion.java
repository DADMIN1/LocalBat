package Logic1.Testcases;
import Logic1.DateFashion;

public final class _DateFashion
{
    static final String[] testcaseStrings = {
        "dateFashion(5, 10)",
        "dateFashion(5, 2)",
        "dateFashion(5, 5)",
        "dateFashion(3, 3)",
        "dateFashion(10, 2)",
        "dateFashion(2, 9)",
        "dateFashion(9, 9)",
        "dateFashion(10, 5)",
        "dateFashion(2, 2)",
        "dateFashion(3, 7)",
        "dateFashion(2, 7)",
        "dateFashion(6, 2)",
    };

    static final int[] expectedResults = {
        2,
        0,
        1,
        1,
        0,
        0,
        2,
        2,
        0,
        1,
        0,
        0,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            DateFashion.dateFashion(5, 10),
            DateFashion.dateFashion(5, 2),
            DateFashion.dateFashion(5, 5),
            DateFashion.dateFashion(3, 3),
            DateFashion.dateFashion(10, 2),
            DateFashion.dateFashion(2, 9),
            DateFashion.dateFashion(9, 9),
            DateFashion.dateFashion(10, 5),
            DateFashion.dateFashion(2, 2),
            DateFashion.dateFashion(3, 7),
            DateFashion.dateFashion(2, 7),
            DateFashion.dateFashion(6, 2),
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
