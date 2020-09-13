import java.util.*;

/**
 * Desmonstrates console input. 
 * @version 1.0
 * @author hanhiver
 */

public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // get first input 
        System.out.print("What is your name? ");
        String name = in.nextLine();

        // get second input. 
        System.out.print("How old are you? ");
        int age = in.nextInt();

        // Display output on console. 
        System.out.println("Hello " + name + ", next year you'll be " + (age + 1));
    }
}
