import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        String name;
        float length,breadth, area;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name");
        name = input.nextLine();

        System.out.println("Please enter your length");
        length = input.nextFloat();

        System.out.println("Please enter your breadth");
        breadth = input.nextFloat();

        area = length * breadth;


        System.out.printf("%-20s%.2f m.\n" ,"length".length());


    }
}
