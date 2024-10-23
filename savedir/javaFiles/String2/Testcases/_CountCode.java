package String2.Testcases;
import String2.CountCode;

public class _CountCode
{
    static String[] testcaseStrings = {
        "countCode(\"aaacodebbb\")",
        "countCode(\"codexxcode\")",
        "countCode(\"cozexxcope\")",
    };

    static int[] expectedResults = {
        1,
        2,
        2,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            CountCode.countCode("aaacodebbb"),
            CountCode.countCode("codexxcode"),
            CountCode.countCode("cozexxcope"),
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
