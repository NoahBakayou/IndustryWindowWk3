import java.security.SecureRandom;
import java.util.Scanner;

public class GameGrid {
//    public void runTest1() {
//
//        int[][] aiGrid = new int[10][8]; //imagine ([y],[x])
//        SecureRandom oRand = new SecureRandom();
//
//        // Create nested loop to create game grid.
//        for (int y = 0; y < aiGrid.length; y++) { //aiGrid.length = 10
//            for (int x = 0; x < aiGrid[0].length; x++) {
//                aiGrid[y][x] = oRand.nextInt(2);
//                System.out.print(aiGrid[y][x] + "  ");
//            }
//            System.out.println(""); //prints empty line with or w/out quotes
//        }
//    }
    public void run(){
        int[][] aiGrid = new int[10][10]; //imagine ([y],[x])
        SecureRandom oRand = new SecureRandom();
        int iWallChance = 30;
        int iTempNum;



        // Create nested loop to create game grid.
        for (int y = 0; y < aiGrid.length; y++) { //aiGrid.length = 10
            for (int x = 0; x < aiGrid[0].length; x++) {

                //Use wall chance to decide whether wall or path here.
                iTempNum = oRand.nextInt(100);
                if(iTempNum < iWallChance){
                    aiGrid[y][x] = 1;
                }
                else{
                    aiGrid[y][x] = 0;
                }
                //aiGrid[y][x] = oRand.nextInt(2);

                System.out.print(aiGrid[y][x] + "  ");

            }
            System.out.println(""); //prints empty line with or w/out quotes
        }
        int iUserRow = 0;
        int iUserCol = 0;
        boolean exit = false;
        aiGrid[0][0] = 0;
        System.out.println("Press 1 to move right or 2 to go down");
        Scanner scanner = new Scanner(System.in);
        while (iUserRow < 9 || iUserCol < 9) {

            int ans = scanner.nextInt();

            if (ans == 1) {
                iUserCol++;
            } else if (ans == 2) {
                iUserRow++;
            }
            if (aiGrid[iUserRow][iUserCol] == 1) {
                System.out.println("You lose");
                break;
            }
            if (iUserRow >= 9 || iUserCol >= 9) {
                System.out.println("You win!");
                break;
            }


        }
        for (int y = 0; y < aiGrid.length; y++) { //aiGrid.length = 10
            for (int x = 0; x < aiGrid[0].length; x++) {

                //Use wall chance to decide whether wall or path here.
               // iTempNum = oRand.nextInt(100);
                if(y == iUserRow && x == iUserCol){
                    System.out.print("X  ");;
                }
                else{
                    System.out.print(aiGrid[y][x] + "  ");
                }
                //aiGrid[y][x] = oRand.nextInt(2);

            }
            System.out.println(""); //prints empty line with or w/out quotes
        }
    }

}
