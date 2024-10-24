package Functional2.Testcases;
import Functional2.NoZ;
import java.util.List;
import java.util.Arrays;

public class _NoZ
{
    static String[] testcaseStrings = {
        "noZ([\"aaa\", \"bbb\", \"aza\"])",
        "noZ([\"hziz\", \"hzello\", \"hi\"])",
        "noZ([\"hello\", \"howz\", \"are\", \"youz\"])",
        "noZ([])",
        "noZ([\"\"])",
        "noZ([\"x\", \"y\", \"z\"])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList("aaa", "bbb"),
        Arrays.asList("hi"),
        Arrays.asList("hello", "are"),
        Arrays.asList(),
        Arrays.asList(""),
        Arrays.asList("x", "y"),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            NoZ.noZ(Arrays.asList("aaa", "bbb", "aza")),
            NoZ.noZ(Arrays.asList("hziz", "hzello", "hi")),
            NoZ.noZ(Arrays.asList("hello", "howz", "are", "youz")),
            NoZ.noZ(Arrays.asList()),
            NoZ.noZ(Arrays.asList("")),
            NoZ.noZ(Arrays.asList("x", "y", "z")),
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
