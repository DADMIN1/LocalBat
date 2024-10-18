package Map2.Testcases;
import Map2.Word0;

public class _Word0
{
    static String[] testcaseStrings = {
        "word0([\"a\", \"b\", \"a\", \"b\"])",
        "word0([\"a\", \"b\", \"a\", \"c\", \"b\"])",
        "word0([\"c\", \"b\", \"a\"])",
    };

    static Map<String, Integer>[] expectedResults = { {"a": 0, "b": 0}, {"a": 0, "b": 0, "c": 0}, {"a": 0, "b": 0, "c": 0}, };

    public static void Validate(boolean printSuccess)
    {
        String[] strings0 = { "a", "b", "a", "b" }; 
        String[] strings1 = { "a", "b", "a", "c", "b" }; 
        String[] strings2 = { "c", "b", "a" }; 

        Map<String, Integer>[] resultsArray = {
            Word0.word0(strings0),
            Word0.word0(strings1),
            Word0.word0(strings2),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
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
