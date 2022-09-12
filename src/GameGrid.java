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
        boolean exit;
        aiGrid[0][0] = 0;
        System.out.println("Move left or right");
        while (iUserRow < 9 || iUserCol< 9) {
            Scanner scanner = new Scanner(System.in);
            int ans = scanner.nextInt();

            if (ans == 1){
                iUserRow++;
            } else {
                iUserCol++;
            }



        }
    }

}
