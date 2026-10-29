import java.util.Random;

void main() {

    Random random = new Random();
    int num = random.nextInt(6);

    switch (num){

        case 0:
            System.out.print(num + " is zero");
            break;

        case 1:
            System.out.print(num + " is one");
            break;

        case 2:
            System.out.print(num + " is two");
            break;

        case 3:
            System.out.print(num + " is three");
            break;

        case 4:
            System.out.print(num + " is four");
            break;

        case 5:
            System.out.print(num + " is five");
            break;

        default:
            System.out.println("Not applicable");
    }

}
