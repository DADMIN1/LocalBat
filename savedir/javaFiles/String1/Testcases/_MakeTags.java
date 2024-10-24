package String1.Testcases;
import String1.MakeTags;

public class _MakeTags
{
    static String[] testcaseStrings = {
        "makeTags(\"i\", \"Yay\")",
        "makeTags(\"i\", \"Hello\")",
        "makeTags(\"cite\", \"Yay\")",
        "makeTags(\"address\", \"here\")",
        "makeTags(\"body\", \"Heart\")",
        "makeTags(\"i\", \"i\")",
        "makeTags(\"i\", \"\")",
    };

    static String[] expectedResults = {
        "<i>Yay</i>",
        "<i>Hello</i>",
        "<cite>Yay</cite>",
        "<address>here</address>",
        "<body>Heart</body>",
        "<i>i</i>",
        "<i></i>",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            MakeTags.makeTags("i", "Yay"),
            MakeTags.makeTags("i", "Hello"),
            MakeTags.makeTags("cite", "Yay"),
            MakeTags.makeTags("address", "here"),
            MakeTags.makeTags("body", "Heart"),
            MakeTags.makeTags("i", "i"),
            MakeTags.makeTags("i", ""),
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
