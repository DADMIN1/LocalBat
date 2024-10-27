package String1.Testcases;
import String1.MiddleTwo;

public final class _MiddleTwo
{
    static final String[] testcaseStrings = {
        "middleTwo(\"string\")",
        "middleTwo(\"code\")",
        "middleTwo(\"Practice\")",
        "middleTwo(\"ab\")",
        "middleTwo(\"0123456789\")",
    };

    static final String[] expectedResults = {
        "ri",
        "od",
        "ct",
        "ab",
        "45",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            MiddleTwo.middleTwo("string"),
            MiddleTwo.middleTwo("code"),
            MiddleTwo.middleTwo("Practice"),
            MiddleTwo.middleTwo("ab"),
            MiddleTwo.middleTwo("0123456789"),
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
