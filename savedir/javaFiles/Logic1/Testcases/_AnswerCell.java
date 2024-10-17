package Logic1.Testcases;
import Logic1.AnswerCell;

public class _AnswerCell
{
    static String[] testcaseStrings = {
        "answerCell(false, false, false)",
        "answerCell(false, false, true)",
        "answerCell(true, false, false)",
    };

    static boolean[] expectedResults = { true, false, false, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            AnswerCell.answerCell(false, false, false),
            AnswerCell.answerCell(false, false, true),
            AnswerCell.answerCell(true, false, false),
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
