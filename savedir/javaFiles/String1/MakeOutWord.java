package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p184030

/* Given an "out" string length 4, such as "<<>>", and a word, 
return a new string where the word is in the middle of the out string, e.g. "<<word>>". 
Note: use str.substring(i, 
j) to extract the String starting at index i and going up to but not including index j. */

class TestCases_MakeOutWord
{
    // makeOutWord("<<>>", "Yay") → "<<Yay>>"
    // makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    // makeOutWord("[[]]", "word") → "[[word]]"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "makeOutWord(\"<<>>\", \"Yay\")");
        testcaseMap.put(1, "makeOutWord(\"<<>>\", \"WooHoo\")");
        testcaseMap.put(2, "makeOutWord(\"[[]]\", \"word\")");
    }

    static String[] expectedResults = { "<<Yay>>", "<<WooHoo>>", "[[word]]", };
}

public class MakeOutWord
{
    public static String makeOutWord(String out, String word)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            makeOutWord("<<>>", "Yay"),
            makeOutWord("<<>>", "WooHoo"),
            makeOutWord("[[]]", "word"),
        };


        TestCases_MakeOutWord.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MakeOutWord.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_MakeOutWord.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_MakeOutWord.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
