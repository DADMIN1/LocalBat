package String2.Testcases;
import String2.OneTwo;

public class _OneTwo
{
    static String[] testcaseStrings = {
        "oneTwo(\"abc\")",
        "oneTwo(\"tca\")",
        "oneTwo(\"tcagdo\")",
    };

    static String[] expectedResults = { "bca", "cat", "catdog", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            OneTwo.oneTwo("abc"),
            OneTwo.oneTwo("tca"),
            OneTwo.oneTwo("tcagdo"),
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
