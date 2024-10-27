package AP1.Testcases;
import AP1.MergeTwo;
import java.util.Arrays;
import java.util.ArrayList;

public class _MergeTwo
{
    static String[] testcaseStrings = {
        "mergeTwo([\"a\", \"c\", \"z\"], [\"b\", \"f\", \"z\"], 3)",
        "mergeTwo([\"a\", \"c\", \"z\"], [\"c\", \"f\", \"z\"], 3)",
        "mergeTwo([\"f\", \"g\", \"z\"], [\"c\", \"f\", \"g\"], 3)",
        "mergeTwo([\"a\", \"c\", \"z\"], [\"a\", \"c\", \"z\"], 3)",
        "mergeTwo([\"a\", \"b\", \"c\", \"z\"], [\"a\", \"c\", \"z\"], 3)",
        "mergeTwo([\"a\", \"c\", \"z\"], [\"a\", \"b\", \"c\", \"z\"], 3)",
        "mergeTwo([\"a\", \"c\", \"z\"], [\"a\", \"c\", \"z\"], 2)",
        "mergeTwo([\"a\", \"c\", \"z\"], [\"a\", \"c\", \"y\", \"z\"], 3)",
        "mergeTwo([\"x\", \"y\", \"z\"], [\"a\", \"b\", \"z\"], 3)",
    };

    static String[][] expectedResults = {
        {"a", "b", "c"},
        {"a", "c", "f"},
        {"c", "f", "g"},
        {"a", "c", "z"},
        {"a", "b", "c"},
        {"a", "b", "c"},
        {"a", "c"},
        {"a", "c", "y"},
        {"a", "b", "x"},
    };

    public static String printArray(String[] array)
    {
        String result = "[";
        for (String a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        String[] a0 = { "a", "c", "z" }; String[] b0 = { "b", "f", "z" }; 
        String[] a1 = { "a", "c", "z" }; String[] b1 = { "c", "f", "z" }; 
        String[] a2 = { "f", "g", "z" }; String[] b2 = { "c", "f", "g" }; 
        String[] a3 = { "a", "c", "z" }; String[] b3 = { "a", "c", "z" }; 
        String[] a4 = { "a", "b", "c", "z" }; String[] b4 = { "a", "c", "z" }; 
        String[] a5 = { "a", "c", "z" }; String[] b5 = { "a", "b", "c", "z" }; 
        String[] a6 = { "a", "c", "z" }; String[] b6 = { "a", "c", "z" }; 
        String[] a7 = { "a", "c", "z" }; String[] b7 = { "a", "c", "y", "z" }; 
        String[] a8 = { "x", "y", "z" }; String[] b8 = { "a", "b", "z" }; 

        String[][] resultsArray = {
            MergeTwo.mergeTwo(a0, b0, 3),
            MergeTwo.mergeTwo(a1, b1, 3),
            MergeTwo.mergeTwo(a2, b2, 3),
            MergeTwo.mergeTwo(a3, b3, 3),
            MergeTwo.mergeTwo(a4, b4, 3),
            MergeTwo.mergeTwo(a5, b5, 3),
            MergeTwo.mergeTwo(a6, b6, 2),
            MergeTwo.mergeTwo(a7, b7, 3),
            MergeTwo.mergeTwo(a8, b8, 3),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!Arrays.equals(resultsArray[i], expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(expectedResults[i]));
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
