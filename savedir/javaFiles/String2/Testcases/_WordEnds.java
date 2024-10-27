package String2.Testcases;
import String2.WordEnds;

public final class _WordEnds
{
    static final String[] testcaseStrings = {
        "wordEnds(\"abcXY123XYijk\", \"XY\")",
        "wordEnds(\"XY123XY\", \"XY\")",
        "wordEnds(\"XY1XY\", \"XY\")",
        "wordEnds(\"XYXY\", \"XY\")",
        "wordEnds(\"XY\", \"XY\")",
        "wordEnds(\"Hi\", \"XY\")",
        "wordEnds(\"\", \"XY\")",
        "wordEnds(\"abc1xyz1i1j\", \"1\")",
        "wordEnds(\"abc1xyz1\", \"1\")",
        "wordEnds(\"abc1xyz11\", \"1\")",
        "wordEnds(\"abc1xyz1abc\", \"abc\")",
        "wordEnds(\"abc1xyz1abc\", \"b\")",
        "wordEnds(\"abc1abc1abc\", \"abc\")",
    };

    static final String[] expectedResults = {
        "c13i",
        "13",
        "11",
        "XY",
        "",
        "",
        "",
        "cxziij",
        "cxz",
        "cxz11",
        "11",
        "acac",
        "1111",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            WordEnds.wordEnds("abcXY123XYijk", "XY"),
            WordEnds.wordEnds("XY123XY", "XY"),
            WordEnds.wordEnds("XY1XY", "XY"),
            WordEnds.wordEnds("XYXY", "XY"),
            WordEnds.wordEnds("XY", "XY"),
            WordEnds.wordEnds("Hi", "XY"),
            WordEnds.wordEnds("", "XY"),
            WordEnds.wordEnds("abc1xyz1i1j", "1"),
            WordEnds.wordEnds("abc1xyz1", "1"),
            WordEnds.wordEnds("abc1xyz11", "1"),
            WordEnds.wordEnds("abc1xyz1abc", "abc"),
            WordEnds.wordEnds("abc1xyz1abc", "b"),
            WordEnds.wordEnds("abc1abc1abc", "abc"),
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
