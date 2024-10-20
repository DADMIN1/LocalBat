package Functional1.Testcases;
import Functional1.Copies3;
import java.util.List;
import java.util.Arrays;

public class _Copies3
{
    static String[] testcaseStrings = {
        "copies3([\"a\", \"bb\", \"ccc\"])",
        "copies3([\"24\", \"a\", \"\"])",
        "copies3([\"hello\", \"there\"])",
    };

    static List<String>[] expectedResults = { Arrays.asList("aaa", "bbbbbb", "ccccccccc"), Arrays.asList("242424", "aaa", ""), Arrays.asList("hellohellohello", "theretherethere"), };

    public static void Validate(boolean printSuccess)
    {
        List<String>[] resultsArray = {
            Copies3.copies3(["a", "bb", "ccc"]),
            Copies3.copies3(["24", "a", ""]),
            Copies3.copies3(["hello", "there"]),
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
