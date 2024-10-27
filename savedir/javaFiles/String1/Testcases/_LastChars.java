package String1.Testcases;
import String1.LastChars;

public final class _LastChars
{
    static final String[] testcaseStrings = {
        "lastChars(\"last\", \"chars\")",
        "lastChars(\"yo\", \"java\")",
        "lastChars(\"hi\", \"\")",
        "lastChars(\"\", \"hello\")",
        "lastChars(\"\", \"\")",
        "lastChars(\"kitten\", \"hi\")",
        "lastChars(\"k\", \"zip\")",
        "lastChars(\"kitten\", \"\")",
        "lastChars(\"kitten\", \"zip\")",
    };

    static final String[] expectedResults = {
        "ls",
        "ya",
        "h@",
        "@o",
        "@@",
        "ki",
        "kp",
        "k@",
        "kp",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            LastChars.lastChars("last", "chars"),
            LastChars.lastChars("yo", "java"),
            LastChars.lastChars("hi", ""),
            LastChars.lastChars("", "hello"),
            LastChars.lastChars("", ""),
            LastChars.lastChars("kitten", "hi"),
            LastChars.lastChars("k", "zip"),
            LastChars.lastChars("kitten", ""),
            LastChars.lastChars("kitten", "zip"),
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
