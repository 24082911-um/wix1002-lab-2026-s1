import java.util.Scanner;
void main() {

    int salesV;
    double commission = 0;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Sales Volume: ");
    salesV = input.nextInt();

    if (salesV <= 100) {
        commission = salesV * 0.05;
    }

    else if (salesV <= 500) {
        commission = salesV * 0.075;
    }

    else if (salesV <= 1000){
        commission = salesV * 0.1;
    }

    else {
        commission = salesV * 0.125;
    }

    System.out.printf("Commission: %.2f", commission);

}

