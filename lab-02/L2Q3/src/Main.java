import java.util.Random;

void main() {

    int sum;
    double average;

    Random random = new Random();
    int num1;
    num1 =random.nextInt(41)+10;

    int num2;
    num2 =random.nextInt(41)+10;

    int num3;
    num3 =random.nextInt(41)+10;

    sum = num1 + num2 + num3;
    average = sum/3.0;

    System.out.println("The 3 random number generated is: " + num1 + ", " + num2 + " and " + num3);
    System.out.println("The sum of the numbers is: " + sum);
    System.out.printf("The average of the numbers is: %.2f" , average );
}
