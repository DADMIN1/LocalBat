package Map2.Testcases;
import Map2.WordLen;
import java.util.Map;
import java.util.HashMap;

public final class _WordLen
{
    static final String[] testcaseStrings = {
        "wordLen([\"a\", \"bb\", \"a\", \"bb\"])",
        "wordLen([\"this\", \"and\", \"that\", \"and\"])",
        "wordLen([\"code\", \"code\", \"code\", \"bug\"])",
        "wordLen([])",
        "wordLen([\"z\"])",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("bb", 2, "a", 1),
        Map.of("that", 4, "and", 3, "this", 4),
        Map.of("code", 4, "bug", 3),
        Map.of(),
        Map.of("z", 1),
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] strings0 = {"a", "bb", "a", "bb"}; 
        final String[] strings1 = {"this", "and", "that", "and"}; 
        final String[] strings2 = {"code", "code", "code", "bug"}; 
        final String[] strings3 = {}; 
        final String[] strings4 = {"z"}; 

        final Map<?,?>[] resultsArray = {
            WordLen.wordLen(strings0),
            WordLen.wordLen(strings1),
            WordLen.wordLen(strings2),
            WordLen.wordLen(strings3),
            WordLen.wordLen(strings4),
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
