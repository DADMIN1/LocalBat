package String1.Testcases;
import String1.ComboString;

public final class _ComboString
{
    static final String[] testcaseStrings = {
        "comboString(\"Hello\", \"hi\")",
        "comboString(\"hi\", \"Hello\")",
        "comboString(\"aaa\", \"b\")",
        "comboString(\"b\", \"aaa\")",
        "comboString(\"aaa\", \"\")",
        "comboString(\"\", \"bb\")",
        "comboString(\"aaa\", \"1234\")",
        "comboString(\"aaa\", \"bb\")",
        "comboString(\"a\", \"bb\")",
        "comboString(\"bb\", \"a\")",
        "comboString(\"xyz\", \"ab\")",
    };

    static final String[] expectedResults = {
        "hiHellohi",
        "hiHellohi",
        "baaab",
        "baaab",
        "aaa",
        "bb",
        "aaa1234aaa",
        "bbaaabb",
        "abba",
        "abba",
        "abxyzab",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            ComboString.comboString("Hello", "hi"),
            ComboString.comboString("hi", "Hello"),
            ComboString.comboString("aaa", "b"),
            ComboString.comboString("b", "aaa"),
            ComboString.comboString("aaa", ""),
            ComboString.comboString("", "bb"),
            ComboString.comboString("aaa", "1234"),
            ComboString.comboString("aaa", "bb"),
            ComboString.comboString("a", "bb"),
            ComboString.comboString("bb", "a"),
            ComboString.comboString("xyz", "ab"),
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
