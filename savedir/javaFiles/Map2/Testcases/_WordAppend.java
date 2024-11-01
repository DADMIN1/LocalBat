package Map2.Testcases;
import Map2.WordAppend;

public final class _WordAppend
{
    static final String[] testcaseStrings = {
        "wordAppend([\"a\", \"b\", \"a\"])",
        "wordAppend([\"a\", \"b\", \"a\", \"c\", \"a\", \"d\", \"a\"])",
        "wordAppend([\"a\", \"\", \"a\"])",
        "wordAppend([])",
        "wordAppend([\"a\", \"b\", \"b\", \"a\", \"a\"])",
        "wordAppend([\"a\", \"b\", \"b\", \"b\", \"a\", \"c\", \"a\", \"a\"])",
        "wordAppend([\"a\", \"b\", \"b\", \"b\", \"a\", \"c\", \"a\", \"a\", \"a\", \"b\", \"a\"])",
        "wordAppend([\"not\", \"and\", \"or\", \"and\", \"this\", \"and\", \"or\", \"that\", \"not\"])",
        "wordAppend([\"a\", \"b\", \"c\"])",
        "wordAppend([\"this\", \"or\", \"that\", \"and\", \"this\", \"and\", \"that\"])",
        "wordAppend([\"xx\", \"xx\", \"yy\", \"xx\", \"zz\", \"yy\", \"zz\", \"xx\"])",
    };

    static final String[] expectedResults = {
        "a",
        "aa",
        "a",
        "",
        "ba",
        "baa",
        "baaba",
        "andornot",
        "",
        "thisandthat",
        "xxyyzzxx",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] strings0 = {"a", "b", "a"}; 
        final String[] strings1 = {"a", "b", "a", "c", "a", "d", "a"}; 
        final String[] strings2 = {"a", "", "a"}; 
        final String[] strings3 = {}; 
        final String[] strings4 = {"a", "b", "b", "a", "a"}; 
        final String[] strings5 = {"a", "b", "b", "b", "a", "c", "a", "a"}; 
        final String[] strings6 = {"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"}; 
        final String[] strings7 = {"not", "and", "or", "and", "this", "and", "or", "that", "not"}; 
        final String[] strings8 = {"a", "b", "c"}; 
        final String[] strings9 = {"this", "or", "that", "and", "this", "and", "that"}; 
        final String[] strings10 = {"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"}; 

        final String[] resultsArray = {
            WordAppend.wordAppend(strings0),
            WordAppend.wordAppend(strings1),
            WordAppend.wordAppend(strings2),
            WordAppend.wordAppend(strings3),
            WordAppend.wordAppend(strings4),
            WordAppend.wordAppend(strings5),
            WordAppend.wordAppend(strings6),
            WordAppend.wordAppend(strings7),
            WordAppend.wordAppend(strings8),
            WordAppend.wordAppend(strings9),
            WordAppend.wordAppend(strings10),
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
