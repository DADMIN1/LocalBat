package String3.Testcases;
import String3.SumNumbers;

public class _SumNumbers
{
    static String[] testcaseStrings = {
        "sumNumbers(\"abc123xyz\")",
        "sumNumbers(\"aa11b33\")",
        "sumNumbers(\"7 11\")",
    };

    static int[] expectedResults = {
        123,
        44,
        18,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            SumNumbers.sumNumbers("abc123xyz"),
            SumNumbers.sumNumbers("aa11b33"),
            SumNumbers.sumNumbers("7 11"),
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
