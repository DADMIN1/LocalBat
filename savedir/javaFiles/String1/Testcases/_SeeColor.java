package String1.Testcases;
import String1.SeeColor;

public class _SeeColor
{
    static String[] testcaseStrings = {
        "seeColor(\"redxx\")",
        "seeColor(\"xxred\")",
        "seeColor(\"blueTimes\")",
        "seeColor(\"NoColor\")",
        "seeColor(\"red\")",
        "seeColor(\"re\")",
        "seeColor(\"blu\")",
        "seeColor(\"blue\")",
        "seeColor(\"a\")",
        "seeColor(\"\")",
        "seeColor(\"xyzred\")",
    };

    static String[] expectedResults = {
        "red",
        "",
        "blue",
        "",
        "red",
        "",
        "",
        "blue",
        "",
        "",
        "",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            SeeColor.seeColor("redxx"),
            SeeColor.seeColor("xxred"),
            SeeColor.seeColor("blueTimes"),
            SeeColor.seeColor("NoColor"),
            SeeColor.seeColor("red"),
            SeeColor.seeColor("re"),
            SeeColor.seeColor("blu"),
            SeeColor.seeColor("blue"),
            SeeColor.seeColor("a"),
            SeeColor.seeColor(""),
            SeeColor.seeColor("xyzred"),
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
