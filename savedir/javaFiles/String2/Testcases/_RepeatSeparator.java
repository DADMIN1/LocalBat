package String2.Testcases;
import String2.RepeatSeparator;

public final class _RepeatSeparator
{
    static final String[] testcaseStrings = {
        "repeatSeparator(\"Word\", \"X\", 3)",
        "repeatSeparator(\"This\", \"And\", 2)",
        "repeatSeparator(\"This\", \"And\", 1)",
        "repeatSeparator(\"Hi\", \"-n-\", 2)",
        "repeatSeparator(\"AAA\", \"\", 1)",
        "repeatSeparator(\"AAA\", \"\", 0)",
        "repeatSeparator(\"A\", \"B\", 5)",
        "repeatSeparator(\"abc\", \"XX\", 3)",
        "repeatSeparator(\"abc\", \"XX\", 2)",
        "repeatSeparator(\"abc\", \"XX\", 1)",
        "repeatSeparator(\"XYZ\", \"a\", 2)",
    };

    static final String[] expectedResults = {
        "WordXWordXWord",
        "ThisAndThis",
        "This",
        "Hi-n-Hi",
        "AAA",
        "",
        "ABABABABA",
        "abcXXabcXXabc",
        "abcXXabc",
        "abc",
        "XYZaXYZ",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            RepeatSeparator.repeatSeparator("Word", "X", 3),
            RepeatSeparator.repeatSeparator("This", "And", 2),
            RepeatSeparator.repeatSeparator("This", "And", 1),
            RepeatSeparator.repeatSeparator("Hi", "-n-", 2),
            RepeatSeparator.repeatSeparator("AAA", "", 1),
            RepeatSeparator.repeatSeparator("AAA", "", 0),
            RepeatSeparator.repeatSeparator("A", "B", 5),
            RepeatSeparator.repeatSeparator("abc", "XX", 3),
            RepeatSeparator.repeatSeparator("abc", "XX", 2),
            RepeatSeparator.repeatSeparator("abc", "XX", 1),
            RepeatSeparator.repeatSeparator("XYZ", "a", 2),
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
