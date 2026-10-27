import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        double fahrenheit = 0;
        double celsius = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter degree Fahrenheit: ");
        fahrenheit = input.nextDouble();

        celsius = (fahrenheit-32)/1.8;

        System.out.printf("Degree Celsius= %.2f",celsius);

        input.close();
    }
}

