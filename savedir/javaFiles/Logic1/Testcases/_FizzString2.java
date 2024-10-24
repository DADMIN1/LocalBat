package Logic1.Testcases;
import Logic1.FizzString2;

public class _FizzString2
{
    static String[] testcaseStrings = {
        "fizzString2(1)",
        "fizzString2(2)",
        "fizzString2(3)",
        "fizzString2(4)",
        "fizzString2(5)",
        "fizzString2(6)",
        "fizzString2(7)",
        "fizzString2(8)",
        "fizzString2(9)",
        "fizzString2(15)",
        "fizzString2(16)",
        "fizzString2(18)",
        "fizzString2(19)",
        "fizzString2(21)",
        "fizzString2(44)",
        "fizzString2(45)",
        "fizzString2(100)",
    };

    static String[] expectedResults = {
        "1!",
        "2!",
        "Fizz!",
        "4!",
        "Buzz!",
        "Fizz!",
        "7!",
        "8!",
        "Fizz!",
        "FizzBuzz!",
        "16!",
        "Fizz!",
        "19!",
        "Fizz!",
        "44!",
        "FizzBuzz!",
        "Buzz!",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            FizzString2.fizzString2(1),
            FizzString2.fizzString2(2),
            FizzString2.fizzString2(3),
            FizzString2.fizzString2(4),
            FizzString2.fizzString2(5),
            FizzString2.fizzString2(6),
            FizzString2.fizzString2(7),
            FizzString2.fizzString2(8),
            FizzString2.fizzString2(9),
            FizzString2.fizzString2(15),
            FizzString2.fizzString2(16),
            FizzString2.fizzString2(18),
            FizzString2.fizzString2(19),
            FizzString2.fizzString2(21),
            FizzString2.fizzString2(44),
            FizzString2.fizzString2(45),
            FizzString2.fizzString2(100),
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
