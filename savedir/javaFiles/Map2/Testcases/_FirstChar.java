package Map2.Testcases;
import Map2.FirstChar;
import java.util.Map;
import java.util.HashMap;

public final class _FirstChar
{
    static final String[] testcaseStrings = {
        "firstChar([\"salt\", \"tea\", \"soda\", \"toast\"])",
        "firstChar([\"aa\", \"bb\", \"cc\", \"aAA\", \"cCC\", \"d\"])",
        "firstChar([])",
        "firstChar([\"apple\", \"bells\", \"salt\", \"aardvark\", \"bells\", \"sun\", \"zen\", \"bells\"])",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("s", "saltsoda", "t", "teatoast"),
        Map.of("a", "aaaAA", "b", "bb", "c", "cccCC", "d", "d"),
        Map.of(),
        Map.of("a", "appleaardvark", "b", "bellsbellsbells", "s", "saltsun", "z", "zen"),
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] strings0 = {"salt", "tea", "soda", "toast"}; 
        final String[] strings1 = {"aa", "bb", "cc", "aAA", "cCC", "d"}; 
        final String[] strings2 = {}; 
        final String[] strings3 = {"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"}; 

        final Map<?,?>[] resultsArray = {
            FirstChar.firstChar(strings0),
            FirstChar.firstChar(strings1),
            FirstChar.firstChar(strings2),
            FirstChar.firstChar(strings3),
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
