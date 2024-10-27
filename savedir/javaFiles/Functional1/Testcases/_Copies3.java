package Functional1.Testcases;
import Functional1.Copies3;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Copies3
{
    static final String[] testcaseStrings = {
        "copies3([\"a\", \"bb\", \"ccc\"])",
        "copies3([\"24\", \"a\", \"\"])",
        "copies3([\"hello\", \"there\"])",
        "copies3([\"no\"])",
        "copies3([])",
        "copies3([\"this\", \"and\", \"that\", \"and\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("aaa", "bbbbbb", "ccccccccc"),
        Arrays.asList("242424", "aaa", ""),
        Arrays.asList("hellohellohello", "theretherethere"),
        Arrays.asList("nonono"),
        Arrays.asList(),
        Arrays.asList("thisthisthis", "andandand", "thatthatthat", "andandand"),
    };

    public static final void Validate(boolean printSuccess)
    {
        final List<?>[] resultsArray = {
            Copies3.copies3(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))),
            Copies3.copies3(new ArrayList<>(Arrays.asList("24", "a", ""))),
            Copies3.copies3(new ArrayList<>(Arrays.asList("hello", "there"))),
            Copies3.copies3(new ArrayList<>(Arrays.asList("no"))),
            Copies3.copies3(new ArrayList<>(Arrays.asList())),
            Copies3.copies3(new ArrayList<>(Arrays.asList("this", "and", "that", "and"))),
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
