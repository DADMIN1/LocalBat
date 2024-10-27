package AP1.Testcases;
import AP1.CommonTwo;

public final class _CommonTwo
{
    static final String[] testcaseStrings = {
        "commonTwo([\"a\", \"c\", \"x\"], [\"b\", \"c\", \"d\", \"x\"])",
        "commonTwo([\"a\", \"c\", \"x\"], [\"a\", \"b\", \"c\", \"x\", \"z\"])",
        "commonTwo([\"a\", \"b\", \"c\"], [\"a\", \"b\", \"c\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"c\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"b\", \"b\", \"c\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"b\", \"c\", \"c\"])",
        "commonTwo([\"b\", \"b\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"b\", \"b\", \"c\"])",
        "commonTwo([\"a\", \"b\", \"c\", \"c\", \"d\"], [\"a\", \"b\", \"b\", \"c\", \"d\", \"d\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"b\", \"b\", \"b\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"c\", \"c\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"b\", \"b\", \"b\", \"x\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"b\", \"b\"])",
        "commonTwo([\"a\"], [\"a\", \"b\"])",
        "commonTwo([\"a\"], [\"b\"])",
        "commonTwo([\"a\", \"a\"], [\"b\", \"b\"])",
        "commonTwo([\"a\", \"b\"], [\"a\", \"b\"])",
    };

    static final int[] expectedResults = {
        2,
        3,
        3,
        3,
        3,
        3,
        2,
        4,
        1,
        1,
        1,
        1,
        1,
        0,
        0,
        2,
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] a0 = { "a", "c", "x" }; final String[] b0 = { "b", "c", "d", "x" }; 
        final String[] a1 = { "a", "c", "x" }; final String[] b1 = { "a", "b", "c", "x", "z" }; 
        final String[] a2 = { "a", "b", "c" }; final String[] b2 = { "a", "b", "c" }; 
        final String[] a3 = { "a", "a", "b", "b", "c" }; final String[] b3 = { "a", "b", "c" }; 
        final String[] a4 = { "a", "a", "b", "b", "c" }; final String[] b4 = { "a", "b", "b", "b", "c" }; 
        final String[] a5 = { "a", "a", "b", "b", "c" }; final String[] b5 = { "a", "b", "b", "c", "c" }; 
        final String[] a6 = { "b", "b", "b", "b", "c" }; final String[] b6 = { "a", "b", "b", "b", "c" }; 
        final String[] a7 = { "a", "b", "c", "c", "d" }; final String[] b7 = { "a", "b", "b", "c", "d", "d" }; 
        final String[] a8 = { "a", "a", "b", "b", "c" }; final String[] b8 = { "b", "b", "b" }; 
        final String[] a9 = { "a", "a", "b", "b", "c" }; final String[] b9 = { "c", "c" }; 
        final String[] a10 = { "a", "a", "b", "b", "c" }; final String[] b10 = { "b", "b", "b", "x" }; 
        final String[] a11 = { "a", "a", "b", "b", "c" }; final String[] b11 = { "b", "b" }; 
        final String[] a12 = { "a" }; final String[] b12 = { "a", "b" }; 
        final String[] a13 = { "a" }; final String[] b13 = { "b" }; 
        final String[] a14 = { "a", "a" }; final String[] b14 = { "b", "b" }; 
        final String[] a15 = { "a", "b" }; final String[] b15 = { "a", "b" }; 

        final int[] resultsArray = {
            CommonTwo.commonTwo(a0, b0),
            CommonTwo.commonTwo(a1, b1),
            CommonTwo.commonTwo(a2, b2),
            CommonTwo.commonTwo(a3, b3),
            CommonTwo.commonTwo(a4, b4),
            CommonTwo.commonTwo(a5, b5),
            CommonTwo.commonTwo(a6, b6),
            CommonTwo.commonTwo(a7, b7),
            CommonTwo.commonTwo(a8, b8),
            CommonTwo.commonTwo(a9, b9),
            CommonTwo.commonTwo(a10, b10),
            CommonTwo.commonTwo(a11, b11),
            CommonTwo.commonTwo(a12, b12),
            CommonTwo.commonTwo(a13, b13),
            CommonTwo.commonTwo(a14, b14),
            CommonTwo.commonTwo(a15, b15),
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
