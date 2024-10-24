package String3.Testcases;
import String3.WithoutString;

public class _WithoutString
{
    static String[] testcaseStrings = {
        "withoutString(\"Hello there\", \"llo\")",
        "withoutString(\"Hello there\", \"e\")",
        "withoutString(\"Hello there\", \"x\")",
        "withoutString(\"This is a FISH\", \"IS\")",
        "withoutString(\"THIS is a FISH\", \"is\")",
        "withoutString(\"THIS is a FISH\", \"iS\")",
        "withoutString(\"abxxxxab\", \"xx\")",
        "withoutString(\"abxxxab\", \"xx\")",
        "withoutString(\"abxxxab\", \"x\")",
        "withoutString(\"xxx\", \"x\")",
        "withoutString(\"xxx\", \"xx\")",
        "withoutString(\"xyzzy\", \"Y\")",
        "withoutString(\"\", \"x\")",
        "withoutString(\"abcabc\", \"b\")",
        "withoutString(\"AA22bb\", \"2\")",
        "withoutString(\"1111\", \"1\")",
        "withoutString(\"1111\", \"11\")",
        "withoutString(\"MkjtMkx\", \"Mk\")",
        "withoutString(\"Hi HoHo\", \"Ho\")",
    };

    static String[] expectedResults = {
        "He there",
        "Hllo thr",
        "Hello there",
        "Th a FH",
        "TH a FH",
        "TH a FH",
        "abab",
        "abxab",
        "abab",
        "",
        "x",
        "xzz",
        "",
        "acac",
        "AAbb",
        "",
        "",
        "jtx",
        "Hi ",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            WithoutString.withoutString("Hello there", "llo"),
            WithoutString.withoutString("Hello there", "e"),
            WithoutString.withoutString("Hello there", "x"),
            WithoutString.withoutString("This is a FISH", "IS"),
            WithoutString.withoutString("THIS is a FISH", "is"),
            WithoutString.withoutString("THIS is a FISH", "iS"),
            WithoutString.withoutString("abxxxxab", "xx"),
            WithoutString.withoutString("abxxxab", "xx"),
            WithoutString.withoutString("abxxxab", "x"),
            WithoutString.withoutString("xxx", "x"),
            WithoutString.withoutString("xxx", "xx"),
            WithoutString.withoutString("xyzzy", "Y"),
            WithoutString.withoutString("", "x"),
            WithoutString.withoutString("abcabc", "b"),
            WithoutString.withoutString("AA22bb", "2"),
            WithoutString.withoutString("1111", "1"),
            WithoutString.withoutString("1111", "11"),
            WithoutString.withoutString("MkjtMkx", "Mk"),
            WithoutString.withoutString("Hi HoHo", "Ho"),
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
