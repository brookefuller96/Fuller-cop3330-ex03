import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args)
    {
        System.out.println("What is a quote? ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();
        System.out.println("Who said it? ");
        Scanner input2 = new Scanner(System.in);
        String whoSaidIt = input2.nextLine();
        System.out.print(whoSaidIt + " says, \"" + quote + "\"" );

    }
}
