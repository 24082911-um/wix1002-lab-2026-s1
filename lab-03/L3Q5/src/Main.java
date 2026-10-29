import java.util.Scanner;

void main() {

    double a = 0.0;
    double b = 0.0;
    double c = 0.0;
    double d = 0.0;
    double e = 0.0;
    double f = 0.0;

    double x = 0.0;
    double y = 0.0;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter value for a: ");
    a = input.nextDouble();

    System.out.print("Enter value for b: ");
    b = input.nextDouble();

    System.out.print("Enter value for c: ");
    c = input.nextDouble();

    System.out.print("Enter value for d: ");
    d = input.nextDouble();

    System.out.print("Enter value for e: ");
    e = input.nextDouble();

    System.out.print("Enter value for f: ");
    f = input.nextDouble();

    if ((a*d-b*c) == 0) {
        System.out.println("The equation has no solution");
    }
    else{
        x = (e*d-b*f)/(a*d-b*c);
        y = (a*f-e*c)/(a*d-b*c);
        System.out.println("The solution is: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
