package Functional2.Testcases;
import Functional2.NoZ;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _NoZ
{
    static final String[] testcaseStrings = {
        "noZ([\"aaa\", \"bbb\", \"aza\"])",
        "noZ([\"hziz\", \"hzello\", \"hi\"])",
        "noZ([\"hello\", \"howz\", \"are\", \"youz\"])",
        "noZ([])",
        "noZ([\"\"])",
        "noZ([\"x\", \"y\", \"z\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("aaa", "bbb"),
        Arrays.asList("hi"),
        Arrays.asList("hello", "are"),
        Arrays.asList(),
        Arrays.asList(""),
        Arrays.asList("x", "y"),
    };

    public static final void Validate(boolean printSuccess)
    {
        final List<?>[] resultsArray = {
            NoZ.noZ(new ArrayList<>(Arrays.asList("aaa", "bbb", "aza"))),
            NoZ.noZ(new ArrayList<>(Arrays.asList("hziz", "hzello", "hi"))),
            NoZ.noZ(new ArrayList<>(Arrays.asList("hello", "howz", "are", "youz"))),
            NoZ.noZ(new ArrayList<>(Arrays.asList())),
            NoZ.noZ(new ArrayList<>(Arrays.asList(""))),
            NoZ.noZ(new ArrayList<>(Arrays.asList("x", "y", "z"))),
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
