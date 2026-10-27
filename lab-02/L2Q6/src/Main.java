import java.util.Scanner;

void main() {

  double M = 0.0;
  double Q = 0.0;
  double intF = 0.0;
  double intC = 0.0;
  double finF = 0.0;
  double finC = 0.0;
  double gram = 0.0;

  Scanner input = new Scanner(System.in);

  System.out.print("Enter the amount of water in gram: ");
  gram = input.nextDouble();
  M = gram / 1000;

  System.out.print("Enter initial temperature in Fahrenheit: ");
  intF = input.nextDouble();
  intC = (intF - 32) * ((double) 5/9);

  System.out.print("Enter final temperature in Fahrenheit: ");
  finF = input.nextDouble();
  finC = (finF - 32) * ((double) 5/9);

  Q = M * (finC - intC) * 4184;

  System.out.printf("The energy needed is %e%n", Q);

  input.close();
}
