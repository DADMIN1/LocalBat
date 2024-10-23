package String3.Testcases;
import String3.MaxBlock;

public class _MaxBlock
{
    static String[] testcaseStrings = {
        "maxBlock(\"hoopla\")",
        "maxBlock(\"abbCCCddBBBxx\")",
        "maxBlock(\"\")",
    };

    static int[] expectedResults = {
        2,
        3,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            MaxBlock.maxBlock("hoopla"),
            MaxBlock.maxBlock("abbCCCddBBBxx"),
            MaxBlock.maxBlock(""),
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
