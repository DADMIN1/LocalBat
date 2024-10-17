package Logic1.Testcases;
import Logic1.DateFashion;

public class _DateFashion
{
    static String[] testcaseStrings = {
        "dateFashion(5, 10)",
        "dateFashion(5, 2)",
        "dateFashion(5, 5)",
    };

    static int[] expectedResults = { 2, 0, 1, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            DateFashion.dateFashion(5, 10),
            DateFashion.dateFashion(5, 2),
            DateFashion.dateFashion(5, 5),
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
