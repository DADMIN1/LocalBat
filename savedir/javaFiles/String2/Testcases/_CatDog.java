package String2.Testcases;
import String2.CatDog;

public class _CatDog
{
    static String[] testcaseStrings = {
        "catDog(\"catdog\")",
        "catDog(\"catcat\")",
        "catDog(\"1cat1cadodog\")",
        "catDog(\"catxxdogxxxdog\")",
        "catDog(\"catxdogxdogxcat\")",
        "catDog(\"catxdogxdogxca\")",
        "catDog(\"dogdogcat\")",
        "catDog(\"dogogcat\")",
        "catDog(\"dog\")",
        "catDog(\"cat\")",
        "catDog(\"ca\")",
        "catDog(\"c\")",
        "catDog(\"\")",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        true,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            CatDog.catDog("catdog"),
            CatDog.catDog("catcat"),
            CatDog.catDog("1cat1cadodog"),
            CatDog.catDog("catxxdogxxxdog"),
            CatDog.catDog("catxdogxdogxcat"),
            CatDog.catDog("catxdogxdogxca"),
            CatDog.catDog("dogdogcat"),
            CatDog.catDog("dogogcat"),
            CatDog.catDog("dog"),
            CatDog.catDog("cat"),
            CatDog.catDog("ca"),
            CatDog.catDog("c"),
            CatDog.catDog(""),
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
