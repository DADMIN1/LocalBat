package Recursion1.Testcases;
import Recursion1.ChangePi;

public class _ChangePi
{
    static String[] testcaseStrings = {
        "changePi(\"xpix\")",
        "changePi(\"pipi\")",
        "changePi(\"pip\")",
        "changePi(\"pi\")",
        "changePi(\"hip\")",
        "changePi(\"p\")",
        "changePi(\"x\")",
        "changePi(\"\")",
        "changePi(\"pixx\")",
        "changePi(\"xyzzy\")",
    };

    static String[] expectedResults = {
        "x3.14x",
        "3.143.14",
        "3.14p",
        "3.14",
        "hip",
        "p",
        "x",
        "",
        "3.14xx",
        "xyzzy",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            ChangePi.changePi("xpix"),
            ChangePi.changePi("pipi"),
            ChangePi.changePi("pip"),
            ChangePi.changePi("pi"),
            ChangePi.changePi("hip"),
            ChangePi.changePi("p"),
            ChangePi.changePi("x"),
            ChangePi.changePi(""),
            ChangePi.changePi("pixx"),
            ChangePi.changePi("xyzzy"),
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
