import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
       int num, square;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        num = input.nextInt();

        square = cube(num);

        System.out.println(square);

        }

    //predefined method
    public static int cube(int n){
        int cubed;
        cubed = n*n*n;

        return cubed;
    }





    }
