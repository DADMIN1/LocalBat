package String1.Testcases;
import String1.StartWord;

public class _StartWord
{
    static String[] testcaseStrings = {
        "startWord(\"hippo\", \"hi\")",
        "startWord(\"hippo\", \"xip\")",
        "startWord(\"hippo\", \"i\")",
    };

    static String[] expectedResults = { "hi", "hip", "h", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            StartWord.startWord("hippo", "hi"),
            StartWord.startWord("hippo", "xip"),
            StartWord.startWord("hippo", "i"),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
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
