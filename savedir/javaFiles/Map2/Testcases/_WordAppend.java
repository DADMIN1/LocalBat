package Map2.Testcases;
import Map2.WordAppend;

public class _WordAppend
{
    static String[] testcaseStrings = {
        "wordAppend([\"a\", \"b\", \"a\"])",
        "wordAppend([\"a\", \"b\", \"a\", \"c\", \"a\", \"d\", \"a\"])",
        "wordAppend([\"a\", \"\", \"a\"])",
    };

    static String[] expectedResults = {
        "a",
        "aa",
        "a",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] strings0 = { "a", "b", "a" }; 
        String[] strings1 = { "a", "b", "a", "c", "a", "d", "a" }; 
        String[] strings2 = { "a", "", "a" }; 

        String[] resultsArray = {
            WordAppend.wordAppend(strings0),
            WordAppend.wordAppend(strings1),
            WordAppend.wordAppend(strings2),
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
