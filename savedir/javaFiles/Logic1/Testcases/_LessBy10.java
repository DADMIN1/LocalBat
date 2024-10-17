package Logic1.Testcases;
import Logic1.LessBy10;

public class _LessBy10
{
    static String[] testcaseStrings = {
        "lessBy10(1, 7, 11)",
        "lessBy10(1, 7, 10)",
        "lessBy10(11, 1, 7)",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            LessBy10.lessBy10(1, 7, 11),
            LessBy10.lessBy10(1, 7, 10),
            LessBy10.lessBy10(11, 1, 7),
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
