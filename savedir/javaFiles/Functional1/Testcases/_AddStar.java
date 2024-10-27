package Functional1.Testcases;
import Functional1.AddStar;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _AddStar
{
    static final String[] testcaseStrings = {
        "addStar([\"a\", \"bb\", \"ccc\"])",
        "addStar([\"hello\", \"there\"])",
        "addStar([\"*\"])",
        "addStar([])",
        "addStar([\"kittens\", \"and\", \"chocolate\", \"and\"])",
        "addStar([\"empty\", \"string\", \"\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("a*", "bb*", "ccc*"),
        Arrays.asList("hello*", "there*"),
        Arrays.asList("**"),
        Arrays.asList(),
        Arrays.asList("kittens*", "and*", "chocolate*", "and*"),
        Arrays.asList("empty*", "string*", "*"),
    };

    public static final void Validate(boolean printSuccess)
    {
        final List<?>[] resultsArray = {
            AddStar.addStar(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))),
            AddStar.addStar(new ArrayList<>(Arrays.asList("hello", "there"))),
            AddStar.addStar(new ArrayList<>(Arrays.asList("*"))),
            AddStar.addStar(new ArrayList<>(Arrays.asList())),
            AddStar.addStar(new ArrayList<>(Arrays.asList("kittens", "and", "chocolate", "and"))),
            AddStar.addStar(new ArrayList<>(Arrays.asList("empty", "string", ""))),
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
