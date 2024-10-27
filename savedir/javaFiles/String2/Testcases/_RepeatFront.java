package String2.Testcases;
import String2.RepeatFront;

public final class _RepeatFront
{
    static final String[] testcaseStrings = {
        "repeatFront(\"Chocolate\", 4)",
        "repeatFront(\"Chocolate\", 3)",
        "repeatFront(\"Ice Cream\", 2)",
        "repeatFront(\"Ice Cream\", 1)",
        "repeatFront(\"Ice Cream\", 0)",
        "repeatFront(\"xyz\", 3)",
        "repeatFront(\"\", 0)",
        "repeatFront(\"Java\", 4)",
        "repeatFront(\"Java\", 1)",
    };

    static final String[] expectedResults = {
        "ChocChoChC",
        "ChoChC",
        "IcI",
        "I",
        "",
        "xyzxyx",
        "",
        "JavaJavJaJ",
        "J",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            RepeatFront.repeatFront("Chocolate", 4),
            RepeatFront.repeatFront("Chocolate", 3),
            RepeatFront.repeatFront("Ice Cream", 2),
            RepeatFront.repeatFront("Ice Cream", 1),
            RepeatFront.repeatFront("Ice Cream", 0),
            RepeatFront.repeatFront("xyz", 3),
            RepeatFront.repeatFront("", 0),
            RepeatFront.repeatFront("Java", 4),
            RepeatFront.repeatFront("Java", 1),
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
