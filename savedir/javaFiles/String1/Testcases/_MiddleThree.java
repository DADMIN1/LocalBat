package String1.Testcases;
import String1.MiddleThree;

public class _MiddleThree
{
    static String[] testcaseStrings = {
        "middleThree(\"Candy\")",
        "middleThree(\"and\")",
        "middleThree(\"solving\")",
    };

    static String[] expectedResults = {
        "and",
        "and",
        "lvi",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            MiddleThree.middleThree("Candy"),
            MiddleThree.middleThree("and"),
            MiddleThree.middleThree("solving"),
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
