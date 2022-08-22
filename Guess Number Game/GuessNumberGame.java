import java.util.Random;
import java.util.Scanner;

class GuessNumberGame {
    public int randmNum;
    public int num = 0;
    public boolean isMatching = true;
    public int userInput;

    GuessNumberGame() {
        Random rnd = new Random();
        this.randmNum = rnd.nextInt(10);

    }

    void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of your choice:--> ");
        userInput = sc.nextInt();
        
      

    }

    boolean isMatching() {
        num++;
        if (randmNum == userInput) {
            System.out.printf("Hurray!\nYour guess %d is correct at %dth attempt...", userInput, num);
            return true;
        } else if (randmNum < userInput) {
            System.out.printf(
                    "Your choose %d, which is bigger number\nPlease Try again.\n\n",
                    userInput, randmNum);
        } else if (randmNum > userInput) {
            System.out.printf(
                    "Your choose %d, which is smaller number\nPlease Try again.\n\n",
                    userInput, randmNum);

        }
        return false;

    }

    public static void main(String[] args) {

        GuessNumberGame play = new GuessNumberGame();

        boolean gameOver = false;
        while (!gameOver){
            play.userInput();
            gameOver = play.isMatching();
        }

    }

}
