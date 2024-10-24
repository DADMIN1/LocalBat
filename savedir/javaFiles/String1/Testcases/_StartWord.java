package String1.Testcases;
import String1.StartWord;

public class _StartWord
{
    static String[] testcaseStrings = {
        "startWord(\"hippo\", \"hi\")",
        "startWord(\"hippo\", \"xip\")",
        "startWord(\"hippo\", \"i\")",
        "startWord(\"hippo\", \"ix\")",
        "startWord(\"h\", \"ix\")",
        "startWord(\"\", \"i\")",
        "startWord(\"hip\", \"zi\")",
        "startWord(\"hip\", \"zip\")",
        "startWord(\"hip\", \"zig\")",
        "startWord(\"h\", \"z\")",
        "startWord(\"hippo\", \"xippo\")",
        "startWord(\"hippo\", \"xyz\")",
        "startWord(\"hippo\", \"hip\")",
        "startWord(\"kitten\", \"cit\")",
        "startWord(\"kit\", \"cit\")",
    };

    static String[] expectedResults = {
        "hi",
        "hip",
        "h",
        "",
        "",
        "",
        "hi",
        "hip",
        "",
        "h",
        "hippo",
        "",
        "hip",
        "kit",
        "kit",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            StartWord.startWord("hippo", "hi"),
            StartWord.startWord("hippo", "xip"),
            StartWord.startWord("hippo", "i"),
            StartWord.startWord("hippo", "ix"),
            StartWord.startWord("h", "ix"),
            StartWord.startWord("", "i"),
            StartWord.startWord("hip", "zi"),
            StartWord.startWord("hip", "zip"),
            StartWord.startWord("hip", "zig"),
            StartWord.startWord("h", "z"),
            StartWord.startWord("hippo", "xippo"),
            StartWord.startWord("hippo", "xyz"),
            StartWord.startWord("hippo", "hip"),
            StartWord.startWord("kitten", "cit"),
            StartWord.startWord("kit", "cit"),
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
