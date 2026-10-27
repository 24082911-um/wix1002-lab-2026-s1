import java.util.Scanner;

void main() {
    int second;
    int minutes;
    int hours;
    int second2;

    Scanner input = new Scanner (System.in);

    System.out.print("Enter the number of seconds: ");
    second = input.nextInt();

    hours = second / 3600;
    minutes = (second % 3600) / 60;
    second2 = (second % 3600) % 60;

    System.out.println();
    System.out.print(second + " seconds is " + hours + " hours, " + minutes + " minutes and " + second2 + " seconds" );

}
