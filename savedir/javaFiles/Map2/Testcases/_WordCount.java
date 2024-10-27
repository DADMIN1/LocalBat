package Map2.Testcases;
import Map2.WordCount;
import java.util.Map;
import java.util.HashMap;

public final class _WordCount
{
    static final String[] testcaseStrings = {
        "wordCount([\"a\", \"b\", \"a\", \"c\", \"b\"])",
        "wordCount([\"c\", \"b\", \"a\"])",
        "wordCount([\"c\", \"c\", \"c\", \"c\"])",
        "wordCount([])",
        "wordCount([\"this\", \"and\", \"this\", \"\"])",
        "wordCount([\"x\", \"y\", \"x\", \"Y\", \"X\"])",
        "wordCount([\"123\", \"0\", \"123\", \"1\"])",
        "wordCount([\"d\", \"a\", \"e\", \"d\", \"a\", \"d\", \"b\", \"b\", \"z\", \"a\", \"a\", \"b\", \"z\", \"x\", \"b\", \"f\", \"x\", \"two\", \"b\", \"one\", \"two\"])",
        "wordCount([\"apple\", \"banana\", \"apple\", \"apple\", \"tea\", \"coffee\", \"banana\"])",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", 2, "b", 2, "c", 1),
        Map.of("a", 1, "b", 1, "c", 1),
        Map.of("c", 4),
        Map.of(),
        Map.of("", 1, "and", 1, "this", 2),
        Map.of("x", 2, "X", 1, "y", 1, "Y", 1),
        Map.of("0", 1, "1", 1, "123", 2),
        Map.of("a", 4, "b", 5, "d", 3, "e", 1, "f", 1, "one", 1, "x", 2, "z", 2, "two", 2),
        Map.of("banana", 2, "apple", 3, "tea", 1, "coffee", 1),
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] strings0 = { "a", "b", "a", "c", "b" }; 
        final String[] strings1 = { "c", "b", "a" }; 
        final String[] strings2 = { "c", "c", "c", "c" }; 
        final String[] strings3 = {  }; 
        final String[] strings4 = { "this", "and", "this", "" }; 
        final String[] strings5 = { "x", "y", "x", "Y", "X" }; 
        final String[] strings6 = { "123", "0", "123", "1" }; 
        final String[] strings7 = { "d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x", "two", "b", "one", "two" }; 
        final String[] strings8 = { "apple", "banana", "apple", "apple", "tea", "coffee", "banana" }; 

        final Map<?,?>[] resultsArray = {
            WordCount.wordCount(strings0),
            WordCount.wordCount(strings1),
            WordCount.wordCount(strings2),
            WordCount.wordCount(strings3),
            WordCount.wordCount(strings4),
            WordCount.wordCount(strings5),
            WordCount.wordCount(strings6),
            WordCount.wordCount(strings7),
            WordCount.wordCount(strings8),
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
