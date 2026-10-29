import java.util.Scanner;

void main() {

    //var declare
    int num1, num2;
    int ans = 0;
    String operator;
    char operand;

    //user input
    Scanner input = new Scanner(System.in);

    System.out.print("Enter two integer number: ");
    num1 = input.nextInt();
    num2 = input.nextInt();

    System.out.print("Enter the operand: ");
    operator = input.next();

    operand = operator.charAt(0);

    //if else
    if (operand == '+' ){
        ans = num1 + num2;
    }
    else if (operand == '-'){
        ans = num1 - num2;
    }
    else if (operand == '*'){
        ans = num1 * num2;
    }
    else if (operand == '/'){
        ans = num1 / num2;
    }
    else if (operand == '%'){
        ans = num1 % num2;
    }

    //output
    System.out.print(num1+ " " + operator + " " + num2 + " = " + ans );

}
