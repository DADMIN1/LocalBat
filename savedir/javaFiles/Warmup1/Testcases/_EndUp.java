package Warmup1.Testcases;
import Warmup1.EndUp;

public class _EndUp
{
    static String[] testcaseStrings = {
        "endUp(\"Hello\")",
        "endUp(\"hi there\")",
        "endUp(\"hi\")",
        "endUp(\"woo hoo\")",
        "endUp(\"xyz12\")",
        "endUp(\"x\")",
        "endUp(\"\")",
    };

    static String[] expectedResults = {
        "HeLLO",
        "hi thERE",
        "HI",
        "woo HOO",
        "xyZ12",
        "X",
        "",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            EndUp.endUp("Hello"),
            EndUp.endUp("hi there"),
            EndUp.endUp("hi"),
            EndUp.endUp("woo hoo"),
            EndUp.endUp("xyz12"),
            EndUp.endUp("x"),
            EndUp.endUp(""),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(expectedResults[i]))
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
