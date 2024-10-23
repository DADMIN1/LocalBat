package String2.Testcases;
import String2.WordEnds;

public class _WordEnds
{
    static String[] testcaseStrings = {
        "wordEnds(\"abcXY123XYijk\", \"XY\")",
        "wordEnds(\"XY123XY\", \"XY\")",
        "wordEnds(\"XY1XY\", \"XY\")",
    };

    static String[] expectedResults = {
        "c13i",
        "13",
        "11",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            WordEnds.wordEnds("abcXY123XYijk", "XY"),
            WordEnds.wordEnds("XY123XY", "XY"),
            WordEnds.wordEnds("XY1XY", "XY"),
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
