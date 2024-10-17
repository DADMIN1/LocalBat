package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p160543

/* Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, 
...6=Sat, and a boolean indicating if we are on vacation, 
return a string of the form "7:00" indicating when the alarm clock should ring. 
Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". 
Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off". */

class TestCases_AlarmClock
{
    // alarmClock(1, false) → "7:00"
    // alarmClock(5, false) → "7:00"
    // alarmClock(0, false) → "10:00"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "alarmClock(1, false)");
        testcaseMap.put(1, "alarmClock(5, false)");
        testcaseMap.put(2, "alarmClock(0, false)");
    }

    static String[] expectedResults = { "7:00", "7:00", "10:00", };
}

public class AlarmClock
{
    public static String alarmClock(int day, boolean vacation)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            alarmClock(1, false),
            alarmClock(5, false),
            alarmClock(0, false),
        };


        TestCases_AlarmClock.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_AlarmClock.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_AlarmClock.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_AlarmClock.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
