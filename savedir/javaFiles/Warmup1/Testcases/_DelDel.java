package Warmup1.Testcases;
import Warmup1.DelDel;

public class _DelDel
{
    static String[] testcaseStrings = {
        "delDel(\"adelbc\")",
        "delDel(\"adelHello\")",
        "delDel(\"adedbc\")",
        "delDel(\"abcdel\")",
        "delDel(\"add\")",
        "delDel(\"ad\")",
        "delDel(\"a\")",
        "delDel(\"\")",
        "delDel(\"del\")",
        "delDel(\"adel\")",
        "delDel(\"aadelbb\")",
    };

    static String[] expectedResults = {
        "abc",
        "aHello",
        "adedbc",
        "abcdel",
        "add",
        "ad",
        "a",
        "",
        "del",
        "a",
        "aadelbb",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            DelDel.delDel("adelbc"),
            DelDel.delDel("adelHello"),
            DelDel.delDel("adedbc"),
            DelDel.delDel("abcdel"),
            DelDel.delDel("add"),
            DelDel.delDel("ad"),
            DelDel.delDel("a"),
            DelDel.delDel(""),
            DelDel.delDel("del"),
            DelDel.delDel("adel"),
            DelDel.delDel("aadelbb"),
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
