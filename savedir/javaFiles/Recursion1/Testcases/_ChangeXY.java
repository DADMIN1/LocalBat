package Recursion1.Testcases;
import Recursion1.ChangeXY;

public class _ChangeXY
{
    static String[] testcaseStrings = {
        "changeXY(\"codex\")",
        "changeXY(\"xxhixx\")",
        "changeXY(\"xhixhix\")",
        "changeXY(\"hiy\")",
        "changeXY(\"h\")",
        "changeXY(\"x\")",
        "changeXY(\"\")",
        "changeXY(\"xxx\")",
        "changeXY(\"yyhxyi\")",
        "changeXY(\"hihi\")",
    };

    static String[] expectedResults = {
        "codey",
        "yyhiyy",
        "yhiyhiy",
        "hiy",
        "h",
        "y",
        "",
        "yyy",
        "yyhyyi",
        "hihi",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            ChangeXY.changeXY("codex"),
            ChangeXY.changeXY("xxhixx"),
            ChangeXY.changeXY("xhixhix"),
            ChangeXY.changeXY("hiy"),
            ChangeXY.changeXY("h"),
            ChangeXY.changeXY("x"),
            ChangeXY.changeXY(""),
            ChangeXY.changeXY("xxx"),
            ChangeXY.changeXY("yyhxyi"),
            ChangeXY.changeXY("hihi"),
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
