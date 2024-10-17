package Logic1.Testcases;
import Logic1.FizzString2;

public class _FizzString2
{
    static String[] testcaseStrings = {
        "fizzString2(1)",
        "fizzString2(2)",
        "fizzString2(3)",
    };

    static String[] expectedResults = { "1!", "2!", "Fizz!", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            FizzString2.fizzString2(1),
            FizzString2.fizzString2(2),
            FizzString2.fizzString2(3),
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
