package Week7_Input;
import java.util.*;
import java.io.*;

/**
 * Created by Jami on 9/20/2015.
 */
public class MadLibs {

    private static final String path = "src/Week7_Input/";

    public static void main(String[] args)
            throws FileNotFoundException   {
        Scanner console = new Scanner(System.in);
        System.out.print("Input File Name");
        File f = new File(path + console.nextLine());
        while (!f.canRead())
        {
            System.out.println("File Not Found. Try Again.");
            System.out.println("Input File Name");
            f = new File(path + console.nextLine());
        }
        Scanner storyFile = new Scanner(f);
        story(storyFile).println();
    }

    public static PrintStream story(Scanner input)
            throws FileNotFoundException {
        PrintStream output = new PrintStream(new File(path + "story.txt"));
        while (input.hasNextLine())
        {
            String line = input.nextLine();
            Scanner text = new Scanner(line);
            if (text.hasNext())
            {
                output.print(playerWord(text.next()));
                while (text.hasNext())
                {
                    output.print(" " + playerWord(text.next()));
                }
            }
            output.println();
        }
        return output;
    }

    public static String playerWord(String input)
    {
        String word = input;
        if (word.charAt(0) == '<')
        {
            System.out.println("Please Enter a " + input + ":");
            Scanner console = new Scanner(System.in);
            word = console.nextLine();
        }
        return word;
    }
}
