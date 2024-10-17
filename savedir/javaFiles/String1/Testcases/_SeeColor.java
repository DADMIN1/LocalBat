package String1.Testcases;
import String1.SeeColor;

public class _SeeColor
{
    static String[] testcaseStrings = {
        "seeColor(\"redxx\")",
        "seeColor(\"xxred\")",
        "seeColor(\"blueTimes\")",
    };

    static String[] expectedResults = { "red", "", "blue", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            SeeColor.seeColor("redxx"),
            SeeColor.seeColor("xxred"),
            SeeColor.seeColor("blueTimes"),
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
