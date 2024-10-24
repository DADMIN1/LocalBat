package String3.Testcases;
import String3.SumNumbers;

public class _SumNumbers
{
    static String[] testcaseStrings = {
        "sumNumbers(\"abc123xyz\")",
        "sumNumbers(\"aa11b33\")",
        "sumNumbers(\"7 11\")",
        "sumNumbers(\"Chocolate\")",
        "sumNumbers(\"5hoco1a1e\")",
        "sumNumbers(\"5$$1;;1!!\")",
        "sumNumbers(\"a1234bb11\")",
        "sumNumbers(\"\")",
        "sumNumbers(\"a22bbb3\")",
    };

    static int[] expectedResults = {
        123,
        44,
        18,
        0,
        7,
        7,
        1245,
        0,
        25,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            SumNumbers.sumNumbers("abc123xyz"),
            SumNumbers.sumNumbers("aa11b33"),
            SumNumbers.sumNumbers("7 11"),
            SumNumbers.sumNumbers("Chocolate"),
            SumNumbers.sumNumbers("5hoco1a1e"),
            SumNumbers.sumNumbers("5$$1;;1!!"),
            SumNumbers.sumNumbers("a1234bb11"),
            SumNumbers.sumNumbers(""),
            SumNumbers.sumNumbers("a22bbb3"),
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
