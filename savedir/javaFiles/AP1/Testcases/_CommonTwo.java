package AP1.Testcases;
import AP1.CommonTwo;

public class _CommonTwo
{
    static String[] testcaseStrings = {
        "commonTwo([\"a\", \"c\", \"x\"], [\"b\", \"c\", \"d\", \"x\"])",
        "commonTwo([\"a\", \"c\", \"x\"], [\"a\", \"b\", \"c\", \"x\", \"z\"])",
        "commonTwo([\"a\", \"b\", \"c\"], [\"a\", \"b\", \"c\"])",
    };

    static int[] expectedResults = {
        2,
        3,
        3,
    };

    public static void Validate(boolean printSuccess)
    {
        String[] a0 = { "a", "c", "x" }; String[] b0 = { "b", "c", "d", "x" }; 
        String[] a1 = { "a", "c", "x" }; String[] b1 = { "a", "b", "c", "x", "z" }; 
        String[] a2 = { "a", "b", "c" }; String[] b2 = { "a", "b", "c" }; 

        int[] resultsArray = {
            CommonTwo.commonTwo(a0, b0),
            CommonTwo.commonTwo(a1, b1),
            CommonTwo.commonTwo(a2, b2),
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
