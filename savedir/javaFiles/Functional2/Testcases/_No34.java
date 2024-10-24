package Functional2.Testcases;
import Functional2.No34;
import java.util.List;
import java.util.Arrays;

public class _No34
{
    static String[] testcaseStrings = {
        "no34([\"a\", \"bb\", \"ccc\"])",
        "no34([\"a\", \"bb\", \"ccc\", \"dddd\"])",
        "no34([\"ccc\", \"dddd\", \"apple\"])",
        "no34([\"this\", \"not\", \"too\", \"long\"])",
        "no34([\"a\", \"bbb\", \"cccc\", \"xx\"])",
        "no34([\"dddd\", \"ddd\", \"xxxxxxx\"])",
        "no34([])",
        "no34([\"\"])",
        "no34([\"empty\", \"\", \"empty\"])",
        "no34([\"a\"])",
        "no34([\"aaaa\", \"bbb\", \"*****\", \"333\"])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList("a", "bb"),
        Arrays.asList("a", "bb"),
        Arrays.asList("apple"),
        Arrays.asList(),
        Arrays.asList("a", "xx"),
        Arrays.asList("xxxxxxx"),
        Arrays.asList(),
        Arrays.asList(""),
        Arrays.asList("empty", "", "empty"),
        Arrays.asList("a"),
        Arrays.asList("*****"),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            No34.no34(Arrays.asList("a", "bb", "ccc")),
            No34.no34(Arrays.asList("a", "bb", "ccc", "dddd")),
            No34.no34(Arrays.asList("ccc", "dddd", "apple")),
            No34.no34(Arrays.asList("this", "not", "too", "long")),
            No34.no34(Arrays.asList("a", "bbb", "cccc", "xx")),
            No34.no34(Arrays.asList("dddd", "ddd", "xxxxxxx")),
            No34.no34(Arrays.asList()),
            No34.no34(Arrays.asList("")),
            No34.no34(Arrays.asList("empty", "", "empty")),
            No34.no34(Arrays.asList("a")),
            No34.no34(Arrays.asList("aaaa", "bbb", "*****", "333")),
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
