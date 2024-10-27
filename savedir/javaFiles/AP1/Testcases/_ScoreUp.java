package AP1.Testcases;
import AP1.ScoreUp;

public final class _ScoreUp
{
    static final String[] testcaseStrings = {
        "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"c\", \"b\", \"c\"])",
        "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"c\"])",
        "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"b\"])",
        "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"?\", \"c\", \"b\", \"?\"])",
        "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"?\", \"c\", \"?\", \"?\"])",
        "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"c\", \"?\", \"b\", \"b\"])",
        "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"c\", \"?\", \"b\", \"?\"])",
        "scoreUp([\"a\", \"b\", \"c\"], [\"a\", \"c\", \"b\"])",
        "scoreUp([\"a\", \"a\", \"b\", \"b\", \"c\", \"c\"], [\"a\", \"c\", \"a\", \"c\", \"a\", \"c\"])",
        "scoreUp([\"a\", \"a\", \"b\", \"b\", \"c\", \"c\"], [\"a\", \"c\", \"?\", \"?\", \"a\", \"c\"])",
        "scoreUp([\"a\", \"a\", \"b\", \"b\", \"c\", \"c\"], [\"a\", \"c\", \"?\", \"?\", \"c\", \"c\"])",
        "scoreUp([\"a\", \"b\", \"c\"], [\"a\", \"b\", \"c\"])",
    };

    static final int[] expectedResults = {
        6,
        11,
        16,
        3,
        -1,
        7,
        3,
        2,
        4,
        6,
        11,
        12,
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] key0 = { "a", "a", "b", "b" }; final String[] answers0 = { "a", "c", "b", "c" }; 
        final String[] key1 = { "a", "a", "b", "b" }; final String[] answers1 = { "a", "a", "b", "c" }; 
        final String[] key2 = { "a", "a", "b", "b" }; final String[] answers2 = { "a", "a", "b", "b" }; 
        final String[] key3 = { "a", "a", "b", "b" }; final String[] answers3 = { "?", "c", "b", "?" }; 
        final String[] key4 = { "a", "a", "b", "b" }; final String[] answers4 = { "?", "c", "?", "?" }; 
        final String[] key5 = { "a", "a", "b", "b" }; final String[] answers5 = { "c", "?", "b", "b" }; 
        final String[] key6 = { "a", "a", "b", "b" }; final String[] answers6 = { "c", "?", "b", "?" }; 
        final String[] key7 = { "a", "b", "c" }; final String[] answers7 = { "a", "c", "b" }; 
        final String[] key8 = { "a", "a", "b", "b", "c", "c" }; final String[] answers8 = { "a", "c", "a", "c", "a", "c" }; 
        final String[] key9 = { "a", "a", "b", "b", "c", "c" }; final String[] answers9 = { "a", "c", "?", "?", "a", "c" }; 
        final String[] key10 = { "a", "a", "b", "b", "c", "c" }; final String[] answers10 = { "a", "c", "?", "?", "c", "c" }; 
        final String[] key11 = { "a", "b", "c" }; final String[] answers11 = { "a", "b", "c" }; 

        final int[] resultsArray = {
            ScoreUp.scoreUp(key0, answers0),
            ScoreUp.scoreUp(key1, answers1),
            ScoreUp.scoreUp(key2, answers2),
            ScoreUp.scoreUp(key3, answers3),
            ScoreUp.scoreUp(key4, answers4),
            ScoreUp.scoreUp(key5, answers5),
            ScoreUp.scoreUp(key6, answers6),
            ScoreUp.scoreUp(key7, answers7),
            ScoreUp.scoreUp(key8, answers8),
            ScoreUp.scoreUp(key9, answers9),
            ScoreUp.scoreUp(key10, answers10),
            ScoreUp.scoreUp(key11, answers11),
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
