package String2.Testcases;
import String2.GetSandwich;

public class _GetSandwich
{
    static String[] testcaseStrings = {
        "getSandwich(\"breadjambread\")",
        "getSandwich(\"xxbreadjambreadyy\")",
        "getSandwich(\"xxbreadyy\")",
    };

    static String[] expectedResults = {
        "jam",
        "jam",
        "",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            GetSandwich.getSandwich("breadjambread"),
            GetSandwich.getSandwich("xxbreadjambreadyy"),
            GetSandwich.getSandwich("xxbreadyy"),
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
