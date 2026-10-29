import java.util.Random;

void main() {
    int score1, score2;

    Random random = new Random();

    System.out.print("Player 1: ");

    int roll11;
    roll11 = random.nextInt(6)+1;
    System.out.print (roll11 + " ");

    int roll12;
    roll12 = random.nextInt(6)+1;
    System.out.println(roll12 + " ");

    System.out.print("Player 2: ");

    int roll21;
    roll21 = random.nextInt(6)+1;
    System.out.print (roll21 + " ");

    int roll22;
    roll22 = random.nextInt(6)+1;
    System.out.println(roll22 + " ");

    score1 = roll11 + roll12;
    score2 = roll21 + roll22;

    System.out.println("Player 1 score: " + score1);
    System.out.println("Player 2 score: " + score2);

    if(score1 > score2) {
        System.out.println("Player 1 wins!");
    }
    else if(score1 < score2){
        System.out.println("Player 2 wins!");
    }
    else{
        System.out.println("Tie");
    }

}
