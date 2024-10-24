package String1.Testcases;
import String1.MakeOutWord;

public class _MakeOutWord
{
    static String[] testcaseStrings = {
        "makeOutWord(\"<<>>\", \"Yay\")",
        "makeOutWord(\"<<>>\", \"WooHoo\")",
        "makeOutWord(\"[[]]\", \"word\")",
        "makeOutWord(\"HHoo\", \"Hello\")",
        "makeOutWord(\"abyz\", \"YAY\")",
    };

    static String[] expectedResults = {
        "<<Yay>>",
        "<<WooHoo>>",
        "[[word]]",
        "HHHellooo",
        "abYAYyz",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            MakeOutWord.makeOutWord("<<>>", "Yay"),
            MakeOutWord.makeOutWord("<<>>", "WooHoo"),
            MakeOutWord.makeOutWord("[[]]", "word"),
            MakeOutWord.makeOutWord("HHoo", "Hello"),
            MakeOutWord.makeOutWord("abyz", "YAY"),
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
