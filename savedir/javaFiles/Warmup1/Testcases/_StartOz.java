package Warmup1.Testcases;
import Warmup1.StartOz;

public class _StartOz
{
    static String[] testcaseStrings = {
        "startOz(\"ozymandias\")",
        "startOz(\"bzoo\")",
        "startOz(\"oxx\")",
    };

    static String[] expectedResults = {
        "oz",
        "z",
        "o",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            StartOz.startOz("ozymandias"),
            StartOz.startOz("bzoo"),
            StartOz.startOz("oxx"),
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
