package String3.Testcases;
import String3.MaxBlock;

public final class _MaxBlock
{
    static final String[] testcaseStrings = {
        "maxBlock(\"hoopla\")",
        "maxBlock(\"abbCCCddBBBxx\")",
        "maxBlock(\"\")",
        "maxBlock(\"xyz\")",
        "maxBlock(\"xxyz\")",
        "maxBlock(\"xyzz\")",
        "maxBlock(\"abbbcbbbxbbbx\")",
        "maxBlock(\"XXBBBbbxx\")",
        "maxBlock(\"XXBBBBbbxx\")",
        "maxBlock(\"XXBBBbbxxXXXX\")",
        "maxBlock(\"XX2222BBBbbXX2222\")",
    };

    static final int[] expectedResults = {
        2,
        3,
        0,
        1,
        2,
        2,
        3,
        3,
        4,
        4,
        4,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            MaxBlock.maxBlock("hoopla"),
            MaxBlock.maxBlock("abbCCCddBBBxx"),
            MaxBlock.maxBlock(""),
            MaxBlock.maxBlock("xyz"),
            MaxBlock.maxBlock("xxyz"),
            MaxBlock.maxBlock("xyzz"),
            MaxBlock.maxBlock("abbbcbbbxbbbx"),
            MaxBlock.maxBlock("XXBBBbbxx"),
            MaxBlock.maxBlock("XXBBBBbbxx"),
            MaxBlock.maxBlock("XXBBBbbxxXXXX"),
            MaxBlock.maxBlock("XX2222BBBbbXX2222"),
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
