import java.security.SecureRandom;

public class Week3 {
    public static void main(String[] args) {
        SecureRandom oRand = new SecureRandom();
        oRand.setSeed(100);
        int iRandNum = oRand.nextInt(); //int range is roughly -2 billion to 2 billion
        System.out.println("rand num: " + iRandNum);
        int iRandNum2 = oRand.nextInt();
        System.out.println("rand num: " + iRandNum2);

        //this is how you call a non-static method
        // you generally want to avoid static, it's dangerous.
        Week3 oWeek3 = new Week3();
        //oWeek3.runTest1();
        oWeek3.runTest2();


    }

    /**
     * This is a test (hover cursor the method you're calling. Neat little trick)
     */
    public void runTest1() {

        int[][] aiGrid = new int[10][8]; //imagine ([y],[x])
        SecureRandom oRand = new SecureRandom();

        // Create nested loop to create game grid.
        for (int y = 0; y < aiGrid.length; y++) { //aiGrid.length = 10
            for (int x = 0; x < aiGrid[0].length; x++) {
                aiGrid[y][x] = oRand.nextInt(2);
                System.out.print(aiGrid[y][x] + "  ");
            }
            System.out.println(""); //prints empty line with or w/out quotes
        }
    }
    public void runTest2(){
        int[][] aiGrid = new int[10][8]; //imagine ([y],[x])
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
    }

}
