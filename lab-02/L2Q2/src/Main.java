import java.util.Scanner;

void main() {

    double P = 0;
    double D = 0;
    double R = 0;
    double Y = 0;
    double M = 0;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the price of the car (RM): ");
    P = input.nextDouble();

    System.out.print("Enter the down payment: ");
    D = input.nextDouble();

    System.out.print("Enter the Interest Rate in %: ");
    R = input.nextDouble();

    System.out.print("Enter the Loan duration in Year: ");
    Y = input.nextDouble();

    M = (P - D) * (1 + R * Y / 100) / (Y * 12);

    System.out.println();
    System.out.printf("Your monthly payment is: %.2f", M);


    input.close();
}






