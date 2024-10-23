package Warmup2.Testcases;
import Warmup2.StringBits;

public class _StringBits
{
    static String[] testcaseStrings = {
        "stringBits(\"Hello\")",
        "stringBits(\"Hi\")",
        "stringBits(\"Heeololeo\")",
    };

    static String[] expectedResults = {
        "Hlo",
        "H",
        "Hello",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            StringBits.stringBits("Hello"),
            StringBits.stringBits("Hi"),
            StringBits.stringBits("Heeololeo"),
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
