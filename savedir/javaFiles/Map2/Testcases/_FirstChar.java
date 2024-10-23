package Map2.Testcases;
import Map2.FirstChar;
import java.util.Map;

public class _FirstChar
{
    static String[] testcaseStrings = {
        "firstChar([\"salt\", \"tea\", \"soda\", \"toast\"])",
        "firstChar([\"aa\", \"bb\", \"cc\", \"aAA\", \"cCC\", \"d\"])",
        "firstChar([])",
    };

    static Map<?,?>[] expectedResults = {
        Map.of("s", "saltsoda", "t", "teatoast"),
        Map.of("a", "aaaAA", "b", "bb", "c", "cccCC", "d", "d"),
        Map.of(),
    };

    public static void Validate(boolean printSuccess)
    {
        String[] strings0 = { "salt", "tea", "soda", "toast" }; 
        String[] strings1 = { "aa", "bb", "cc", "aAA", "cCC", "d" }; 
        String[] strings2 = {  }; 

        Map<?,?>[] resultsArray = {
            FirstChar.firstChar(strings0),
            FirstChar.firstChar(strings1),
            FirstChar.firstChar(strings2),
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
