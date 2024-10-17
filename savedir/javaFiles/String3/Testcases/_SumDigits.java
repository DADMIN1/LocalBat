package String3.Testcases;
import String3.SumDigits;

public class _SumDigits
{
    static String[] testcaseStrings = {
        "sumDigits(\"aa1bc2d3\")",
        "sumDigits(\"aa11b33\")",
        "sumDigits(\"Chocolate\")",
    };

    static int[] expectedResults = { 6, 8, 0, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            SumDigits.sumDigits("aa1bc2d3"),
            SumDigits.sumDigits("aa11b33"),
            SumDigits.sumDigits("Chocolate"),
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
