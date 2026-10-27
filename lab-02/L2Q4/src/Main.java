import java.util.Scanner;

void main() {

    int second;
    int minute;
    int hours;
    int second2;
    int second3;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of seconds: ");
    second = input.nextInt();

    hours = second / 3600;
    second2 = second % 3600;
    minute = second2 / 60;
    second3 = second2 % 60;

    System.out.println(second + " seconds is " + hours + " hours, " + minute + " minutes and " + second3 + " seconds");

    input.close();

}
