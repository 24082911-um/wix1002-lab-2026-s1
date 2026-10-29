
import java.util.Scanner;
void main() {

    double r = 0.0;
    double x = 0.0;
    double y = 0.0;

    Scanner input = new Scanner (System.in);

    System.out.print("Enter radius: ");
    r = input.nextDouble();

    System.out.print("Enter coordinate point x: ");
    x = input.nextDouble();

    System.out.print("Enter coordinate point y: ");
    y = input.nextDouble();

    if ((x*x + y*y) < r*r){
        System.out.println("Point is inside the circle");
    }

    else if ((x*x + y*y) > r*r){
        System.out.println("Point is outside the circle");
    }

    else {
        System.out.println("Point is on the circle");
    }

}
