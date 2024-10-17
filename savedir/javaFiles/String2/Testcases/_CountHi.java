package String2.Testcases;
import String2.CountHi;

public class _CountHi
{
    static String[] testcaseStrings = {
        "countHi(\"abc hi ho\")",
        "countHi(\"ABChi hi\")",
        "countHi(\"hihi\")",
    };

    static int[] expectedResults = { 1, 2, 2, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            CountHi.countHi("abc hi ho"),
            CountHi.countHi("ABChi hi"),
            CountHi.countHi("hihi"),
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
