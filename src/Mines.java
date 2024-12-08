public class Mines {
    private int mineLocation;
    private  String finalBoard = "| || || || || |" + "\n" + "| || || || || |" + "\n" + "| || || || || |" + "\n" + "| || || || || |" + "\n" + "| || || || || |";
    private String originalBoard = finalBoard;
    private String bombBoard = "";
    private String multiBombs = "";
    private  int count = 0;
    private boolean multimines = false;

    //This automatically gives the user an original mine
    public Mines () {
        mineLocation = (int)(Math.random()*25)+1;
    }
    //this allows the user to choose how many mines they have
    public void multiMines (int x) {
        if ( x == 1) {
            multiBombs += "'" + mineLocation + "'";
        } else {
            for (int y = 0; y < x; y++) {
                int current= (int)(Math.random()*25)+1;
                while (multiBombs.indexOf("'"+current+"'") != -1) {
                    current = (int)(Math.random()*25)+1;
                }
                multiBombs += "'" + current + "'";
            }
            multimines = true;
        }
    }
    //this creates the board will all the spots the mines where in for the user to see
    public String bombBoard () {
        int count = 1;
        for (int x = 0; x < 5; x++) {
            for (int y = 1; y <= 5; y++) {
                if (multiBombs.indexOf("'"+count+"'")!=-1) {
                    if ((count)%5==0) {
                        bombBoard+="|\uD83D\uDCA3|" + "\n";
                        count++;
                    } else {
                        bombBoard += "|\uD83D\uDCA3|";
                        count++;
                    }
                } else {
                    if ((y)%5==0) {
                        bombBoard+="|  |" + "\n";
                        count++;
                    } else {
                        bombBoard += "|  |";
                        count++;
                    }
                }
            }
        }
        return bombBoard;
    }
    //this counts how many spaces the user has chosen
    public int getCount() {
        return count;
    }
    //this gets all the mines on the board
    public String getMultiBombs(){
        return multiBombs;
    }
    //this prints the board before any edits
    public  String getOriginalBoard() {
        return originalBoard;
    }
    //this prints the board after the user has chosen a spot
    public String editedBoard(int x) {
        if (multimines) {
            if (multiBombs.indexOf("'"+x+"'")!=-1) {


                return "";
            }
        }
        if (x == mineLocation) {


            return "";
        }
        else {
            if (x == 1) {
                String firstHalf = finalBoard.substring(0,1);
                String secondHalf = finalBoard.substring(2);
                finalBoard = firstHalf + "x" + secondHalf;
                count++;
                return  finalBoard;
            } else {
                if (x == 2) {
                    String firstHalf = finalBoard.substring(0, 4);
                    String secondHalf = finalBoard.substring(5);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 3) {
                    String firstHalf = finalBoard.substring(0, 7);
                    String secondHalf = finalBoard.substring(8);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 4) {
                    String firstHalf = finalBoard.substring(0, 10);
                    String secondHalf = finalBoard.substring(11);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 5) {
                    String firstHalf = finalBoard.substring(0, 13 );
                    String secondHalf = finalBoard.substring(14);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 6) {
                    String firstHalf = finalBoard.substring(0, 17);
                    String secondHalf = finalBoard.substring(18);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 7) {
                    String firstHalf = finalBoard.substring(0, 20);
                    String secondHalf = finalBoard.substring(21);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 8) {
                    String firstHalf = finalBoard.substring(0, 23);
                    String secondHalf = finalBoard.substring(24);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 9) {
                    String firstHalf = finalBoard.substring(0, 26);
                    String secondHalf = finalBoard.substring(27);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 10) {
                    String firstHalf = finalBoard.substring(0, 29);
                    String secondHalf = finalBoard.substring(30);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 11) {
                    String firstHalf = finalBoard.substring(0, 33);
                    String secondHalf = finalBoard.substring(34);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 12) {
                    String firstHalf = finalBoard.substring(0, 36);
                    String secondHalf = finalBoard.substring(37);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 13) {
                    String firstHalf = finalBoard.substring(0, 39);
                    String secondHalf = finalBoard.substring(40);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 14) {
                    String firstHalf = finalBoard.substring(0,42);
                    String secondHalf = finalBoard.substring(43);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 15) {
                    String firstHalf = finalBoard.substring(0, 45);
                    String secondHalf = finalBoard.substring(46);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 16) {
                    String firstHalf = finalBoard.substring(0, 49);
                    String secondHalf = finalBoard.substring(50);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 17) {
                    String firstHalf = finalBoard.substring(0, 52);
                    String secondHalf = finalBoard.substring(53);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 18) {
                    String firstHalf = finalBoard.substring(0, 55);
                    String secondHalf = finalBoard.substring(56);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 19) {
                    String firstHalf = finalBoard.substring(0, 58);
                    String secondHalf = finalBoard.substring(59);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 20) {
                    String firstHalf = finalBoard.substring(0, 61);
                    String secondHalf = finalBoard.substring(62);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 21) {
                    String firstHalf = finalBoard.substring(0, 65);
                    String secondHalf = finalBoard.substring(66);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 22) {
                    String firstHalf = finalBoard.substring(0,68);
                    String secondHalf = finalBoard.substring(69);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 23) {
                    String firstHalf = finalBoard.substring(0,71);
                    String secondHalf = finalBoard.substring(72);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 24) {
                    String firstHalf = finalBoard.substring(0, 74);
                    String secondHalf = finalBoard.substring(75);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
                if (x == 25) {
                    String firstHalf = finalBoard.substring(0,77);
                    String secondHalf = finalBoard.substring(78);
                    finalBoard = firstHalf + "x" + secondHalf;
                    count++;
                    return finalBoard;
                }
            }
        }
        return finalBoard;
    }
    //this checks if the bomb was chosen
    public boolean isBomb (int x) {
        if (multiBombs.indexOf("'"+x+"'")!=-1) {
            return true;
        } else {
            return false;
        }
    }
}


