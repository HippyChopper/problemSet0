import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        String name;
        float length,breadth, area, toatalArea, cost,totalCost;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name");
        name = input.nextLine();

        System.out.println("Please enter your length");
        length = input.nextFloat();

        System.out.println("Please enter your breadth");
        breadth = input.nextFloat();

        System.out.println("Please enter the cost per square metre");
        cost = input.nextFloat();

        area = length * breadth;

        toatalArea = length * breadth;
        totalCost = cost * area;


        System.out.printf("Quoations for Joe Soap\n %-20s%.2f m.\n %-20s%.2f m.\n %-20s%.2f m.\n %-20s%.2f sq. m.\n %-20s%.2f euro\n" ,"length of room"
                ,length,"breadth of room",breadth,"total area of room", area,"Total area of the room", toatalArea,"total area of the room", toatalArea,
                "Cost per square metre of carpert",cost, "Total cost of carpert:",totalCost);


    }
}
