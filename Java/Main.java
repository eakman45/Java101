import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A right triangle
        //defining edge and getting lengths with input
        int edge1,edge2;
        double u,edge3,area;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lenght of first edge = ");
        edge1 = input.nextInt();
        System.out.println("Please enter the lenght of second edge = ");
        edge2 = input.nextInt();

        //The calculation of hypotenuse
        edge3 = Math.sqrt((edge1*edge1)+(edge2*edge2));
        System.out.println("The lenght of hypotenuse edge is = "+edge3);

        //perimeter and area calculations
        u = ((edge1+edge2+edge3)/2);
        area = Math.sqrt(u*(u-edge1)*(u-edge2)*(u-edge3));
        System.out.println("The area of our right triangle is = "+area);
        System.out.println("The perimeter of our right triangle is = "+(u*2));

    }
}