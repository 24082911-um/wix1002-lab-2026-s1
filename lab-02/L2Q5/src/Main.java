
void main() {

    Random random = new Random();

    int num;
    int num1;
    int digit;
    int sum = 0;

    num1 =random.nextInt(10001);
    num = num1;

    while (num1 > 0) {
        digit = num1 % 10;
        sum = sum + digit;
        num1 = num1 / 10;
    }

    System.out.println("The random number is: " + num);
    System.out.println("The sum af all digits in the number is: " + sum);

}
