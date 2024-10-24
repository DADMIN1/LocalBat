package Recursion1.Testcases;
import Recursion1.NestParen;

public class _NestParen
{
    static String[] testcaseStrings = {
        "nestParen(\"(())\")",
        "nestParen(\"((()))\")",
        "nestParen(\"(((x))\")",
        "nestParen(\"((())\")",
        "nestParen(\"((()()\")",
        "nestParen(\"()\")",
        "nestParen(\"\")",
        "nestParen(\"(yy)\")",
        "nestParen(\"(())\")",
        "nestParen(\"(((y))\")",
        "nestParen(\"((y)))\")",
        "nestParen(\"((()))\")",
        "nestParen(\"(())))\")",
        "nestParen(\"((yy())))\")",
        "nestParen(\"(((())))\")",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        false,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            NestParen.nestParen("(())"),
            NestParen.nestParen("((()))"),
            NestParen.nestParen("(((x))"),
            NestParen.nestParen("((())"),
            NestParen.nestParen("((()()"),
            NestParen.nestParen("()"),
            NestParen.nestParen(""),
            NestParen.nestParen("(yy)"),
            NestParen.nestParen("(())"),
            NestParen.nestParen("(((y))"),
            NestParen.nestParen("((y)))"),
            NestParen.nestParen("((()))"),
            NestParen.nestParen("(())))"),
            NestParen.nestParen("((yy())))"),
            NestParen.nestParen("(((())))"),
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
