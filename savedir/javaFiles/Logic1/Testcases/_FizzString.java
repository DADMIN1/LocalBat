package Logic1.Testcases;
import Logic1.FizzString;

public class _FizzString
{
    static String[] testcaseStrings = {
        "fizzString(\"fig\")",
        "fizzString(\"dib\")",
        "fizzString(\"fib\")",
    };

    static String[] expectedResults = {
        "Fizz",
        "Buzz",
        "FizzBuzz",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            FizzString.fizzString("fig"),
            FizzString.fizzString("dib"),
            FizzString.fizzString("fib"),
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
