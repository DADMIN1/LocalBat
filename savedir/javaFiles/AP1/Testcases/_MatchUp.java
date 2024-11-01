package AP1.Testcases;
import AP1.MatchUp;

public final class _MatchUp
{
    static final String[] testcaseStrings = {
        "matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"xx\", \"bb\"])",
        "matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"b\", \"bb\"])",
        "matchUp([\"aa\", \"bb\", \"cc\"], [\"\", \"\", \"ccc\"])",
        "matchUp([\"\", \"\", \"ccc\"], [\"aa\", \"bb\", \"cc\"])",
        "matchUp([\"\", \"\", \"\"], [\"\", \"bb\", \"cc\"])",
        "matchUp([\"aa\", \"bb\", \"cc\"], [\"\", \"\", \"\"])",
        "matchUp([\"aa\", \"\", \"ccc\"], [\"\", \"bb\", \"cc\"])",
        "matchUp([\"x\", \"y\", \"z\"], [\"y\", \"z\", \"x\"])",
        "matchUp([\"\", \"y\", \"z\"], [\"\", \"y\", \"x\"])",
        "matchUp([\"x\", \"y\", \"z\"], [\"xx\", \"yyy\", \"zzz\"])",
        "matchUp([\"x\", \"y\", \"z\"], [\"xx\", \"yyy\", \"\"])",
        "matchUp([\"b\", \"x\", \"y\", \"z\"], [\"a\", \"xx\", \"yyy\", \"zzz\"])",
        "matchUp([\"aaa\", \"bb\", \"c\"], [\"aaa\", \"xx\", \"bb\"])",
    };

    static final int[] expectedResults = {
        1,
        2,
        1,
        1,
        0,
        0,
        1,
        0,
        1,
        3,
        2,
        3,
        1,
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] a0 = {"aa", "bb", "cc"}; final String[] b0 = {"aaa", "xx", "bb"}; 
        final String[] a1 = {"aa", "bb", "cc"}; final String[] b1 = {"aaa", "b", "bb"}; 
        final String[] a2 = {"aa", "bb", "cc"}; final String[] b2 = {"", "", "ccc"}; 
        final String[] a3 = {"", "", "ccc"}; final String[] b3 = {"aa", "bb", "cc"}; 
        final String[] a4 = {"", "", ""}; final String[] b4 = {"", "bb", "cc"}; 
        final String[] a5 = {"aa", "bb", "cc"}; final String[] b5 = {"", "", ""}; 
        final String[] a6 = {"aa", "", "ccc"}; final String[] b6 = {"", "bb", "cc"}; 
        final String[] a7 = {"x", "y", "z"}; final String[] b7 = {"y", "z", "x"}; 
        final String[] a8 = {"", "y", "z"}; final String[] b8 = {"", "y", "x"}; 
        final String[] a9 = {"x", "y", "z"}; final String[] b9 = {"xx", "yyy", "zzz"}; 
        final String[] a10 = {"x", "y", "z"}; final String[] b10 = {"xx", "yyy", ""}; 
        final String[] a11 = {"b", "x", "y", "z"}; final String[] b11 = {"a", "xx", "yyy", "zzz"}; 
        final String[] a12 = {"aaa", "bb", "c"}; final String[] b12 = {"aaa", "xx", "bb"}; 

        final int[] resultsArray = {
            MatchUp.matchUp(a0, b0),
            MatchUp.matchUp(a1, b1),
            MatchUp.matchUp(a2, b2),
            MatchUp.matchUp(a3, b3),
            MatchUp.matchUp(a4, b4),
            MatchUp.matchUp(a5, b5),
            MatchUp.matchUp(a6, b6),
            MatchUp.matchUp(a7, b7),
            MatchUp.matchUp(a8, b8),
            MatchUp.matchUp(a9, b9),
            MatchUp.matchUp(a10, b10),
            MatchUp.matchUp(a11, b11),
            MatchUp.matchUp(a12, b12),
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
