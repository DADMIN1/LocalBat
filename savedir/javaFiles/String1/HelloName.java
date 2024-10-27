package String1;
import String1.Testcases._HelloName;

// https://codingbat.com/prob/p171896
// Difficulty: 103.0

public final class HelloName
{
    /* Given a string name, e.g. "Bob", 
    return a greeting of the form "Hello Bob!". */

    /*__________________________________________
    |                 Testcases                 |
    |___________________________________________|
    | helloName("Bob")      → "Hello Bob!"      |
    | helloName("Alice")    → "Hello Alice!"    |
    | helloName("X")        → "Hello X!"        |
    | helloName("Dolly")    → "Hello Dolly!"    |
    | helloName("Alpha")    → "Hello Alpha!"    |
    | helloName("Omega")    → "Hello Omega!"    |
    | helloName("Goodbye")  → "Hello Goodbye!"  |
    | helloName("ho ho ho") → "Hello ho ho ho!" |
    | helloName("xyz!")     → "Hello xyz!!"     |
    | helloName("Hello")    → "Hello Hello!"    |
    |__________________________________________*/

    public static final String helloName(String name)
    {
        return "";
    }

    public static final void main(String[] args) {
        _HelloName.Validate(true);  // pass 'false' to print failed tests only.
    }
}
