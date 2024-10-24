package AP1.Testcases;
import AP1.HasOne;

public class _HasOne
{
    static String[] testcaseStrings = {
        "hasOne(10)",
        "hasOne(22)",
        "hasOne(220)",
        "hasOne(212)",
        "hasOne(1)",
        "hasOne(9)",
        "hasOne(211112)",
        "hasOne(121121)",
        "hasOne(222222)",
        "hasOne(56156)",
        "hasOne(56556)",
    };

    static boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            HasOne.hasOne(10),
            HasOne.hasOne(22),
            HasOne.hasOne(220),
            HasOne.hasOne(212),
            HasOne.hasOne(1),
            HasOne.hasOne(9),
            HasOne.hasOne(211112),
            HasOne.hasOne(121121),
            HasOne.hasOne(222222),
            HasOne.hasOne(56156),
            HasOne.hasOne(56556),
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
