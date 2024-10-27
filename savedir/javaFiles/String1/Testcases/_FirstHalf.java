package String1.Testcases;
import String1.FirstHalf;

public final class _FirstHalf
{
    static final String[] testcaseStrings = {
        "firstHalf(\"WooHoo\")",
        "firstHalf(\"HelloThere\")",
        "firstHalf(\"abcdef\")",
        "firstHalf(\"ab\")",
        "firstHalf(\"\")",
        "firstHalf(\"0123456789\")",
        "firstHalf(\"kitten\")",
    };

    static final String[] expectedResults = {
        "Woo",
        "Hello",
        "abc",
        "a",
        "",
        "01234",
        "kit",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            FirstHalf.firstHalf("WooHoo"),
            FirstHalf.firstHalf("HelloThere"),
            FirstHalf.firstHalf("abcdef"),
            FirstHalf.firstHalf("ab"),
            FirstHalf.firstHalf(""),
            FirstHalf.firstHalf("0123456789"),
            FirstHalf.firstHalf("kitten"),
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
