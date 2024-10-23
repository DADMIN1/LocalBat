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
    };

    static List<String>[] expectedResults = {
        Arrays.asList("aaa", "bbb"),
        Arrays.asList("hi"),
        Arrays.asList("hello", "are"),
    };

    public static void Validate(boolean printSuccess)
    {
        List<String>[] resultsArray = {
            NoZ.noZ(["aaa", "bbb", "aza"]),
            NoZ.noZ(["hziz", "hzello", "hi"]),
            NoZ.noZ(["hello", "howz", "are", "youz"]),
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
