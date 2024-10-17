package Warmup2.Testcases;
import Warmup2.StringTimes;

public class _StringTimes
{
    static String[] testcaseStrings = {
        "stringTimes(\"Hi\", 2)",
        "stringTimes(\"Hi\", 3)",
        "stringTimes(\"Hi\", 1)",
    };

    static String[] expectedResults = { "HiHi", "HiHiHi", "Hi", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            StringTimes.stringTimes("Hi", 2),
            StringTimes.stringTimes("Hi", 3),
            StringTimes.stringTimes("Hi", 1),
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
