import java.util.Scanner;
public class MinesGame {
    private boolean bomb = false;
    private int count = 1;
    private String numbers = "";
    public void runner() {
        Mines a = new Mines();
        Scanner mine = new Scanner(System.in);
        intro();
        System.out.println("Please choose how many mines you want.");
        int y = mine.nextInt();
        while (y > 24 || y < 1) {
            System.out.println("Please choose a number between 1-24!");
            y = mine.nextInt();
        }
        a.multiMines(y);
        System.out.println(a.getOriginalBoard());
        System.out.println("Please choose a space between 1-25! (The space you choose will show up as an x)");
        int x = mine.nextInt();
        while (x > 25 || x < 1) {
            System.out.println("Please choose a space between 1-25!");
            x = mine.nextInt();
        }
        numbers += "'" + String.valueOf(x) + "'";
        while (!bomb) {


            if (a.isBomb(x)) {
                bomb = true;
                System.out.println(a.bombBoard());
                System.out.println("You got the bomb :( " + "it was " + a.getMultiBombs());
                System.out.println("You were able to get " + a.getCount() + " spaces");
            }
            else if (count == 25-y) {
                System.out.println(a.editedBoard(x));
                System.out.println("You win congrats");
                System.out.println("The bomb was at " + a.getMultiBombs());
                break;
            } else {
                count++;
                numbers += "'" + String.valueOf(x) + "'";
                System.out.println(a.editedBoard(x));
                x = mine.nextInt();
                while (numbers.contains("'" + String.valueOf(x) + "'")) {
                    System.out.println("Please choose another space that you didnt already.");
                    x = mine.nextInt();
                }
                while (x > 25 || x < 1) {
                    System.out.println("Please choose a space between 1-25!");
                    x = mine.nextInt();
                }
            }
        }
    }
    private void intro() {
        System.out.println("Hello Welcome to the mines game!");
        System.out.println("There are 25 spaces for you to choose.");
        System.out.println("The goal is for you to get as many spaces without choosing a mine.");
        System.out.println("To choose a space enter the number of the space.");
        System.out.println("Good luck and have fun!");
    }
}
