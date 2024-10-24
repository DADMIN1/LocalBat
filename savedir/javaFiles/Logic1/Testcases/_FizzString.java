package Logic1.Testcases;
import Logic1.FizzString;

public class _FizzString
{
    static String[] testcaseStrings = {
        "fizzString(\"fig\")",
        "fizzString(\"dib\")",
        "fizzString(\"fib\")",
        "fizzString(\"abc\")",
        "fizzString(\"fooo\")",
        "fizzString(\"booo\")",
        "fizzString(\"ooob\")",
        "fizzString(\"fooob\")",
        "fizzString(\"f\")",
        "fizzString(\"b\")",
        "fizzString(\"abcb\")",
        "fizzString(\"Hello\")",
        "fizzString(\"Hellob\")",
        "fizzString(\"af\")",
        "fizzString(\"bf\")",
        "fizzString(\"fb\")",
    };

    static String[] expectedResults = {
        "Fizz",
        "Buzz",
        "FizzBuzz",
        "abc",
        "Fizz",
        "booo",
        "Buzz",
        "FizzBuzz",
        "Fizz",
        "Buzz",
        "Buzz",
        "Hello",
        "Buzz",
        "af",
        "bf",
        "FizzBuzz",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            FizzString.fizzString("fig"),
            FizzString.fizzString("dib"),
            FizzString.fizzString("fib"),
            FizzString.fizzString("abc"),
            FizzString.fizzString("fooo"),
            FizzString.fizzString("booo"),
            FizzString.fizzString("ooob"),
            FizzString.fizzString("fooob"),
            FizzString.fizzString("f"),
            FizzString.fizzString("b"),
            FizzString.fizzString("abcb"),
            FizzString.fizzString("Hello"),
            FizzString.fizzString("Hellob"),
            FizzString.fizzString("af"),
            FizzString.fizzString("bf"),
            FizzString.fizzString("fb"),
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
