package String3.Testcases;
import String3.GHappy;

public class _GHappy
{
    static String[] testcaseStrings = {
        "gHappy(\"xxggxx\")",
        "gHappy(\"xxgxx\")",
        "gHappy(\"xxggyygxx\")",
    };

    static boolean[] expectedResults = { true, false, false, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            GHappy.gHappy("xxggxx"),
            GHappy.gHappy("xxgxx"),
            GHappy.gHappy("xxggyygxx"),
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
