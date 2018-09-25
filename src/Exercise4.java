import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
         int length;
         char firstLetter;

        System.out.println("Please enter your name");
        name = input.nextLine();



        System.out.println(name.length());

        //Dispalys first letter
        firstLetter = name.charAt(0);

        System.out.println(firstLetter);
        //Displays name in uppercase
        System.out.println(name.toUpperCase());

        // Displays the surname
        System.out.println(name.substring(name.lastIndexOf(" ")));
        // finished

    }// main
}
