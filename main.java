public class main {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my Array Program!\n");

        int[] myNumbers = new int[9];
        myNumbers[0] = 1;
        myNumbers[1] = 2;
        myNumbers[2] = 5;
        myNumbers[3] = 8;
        myNumbers[4] = 11;
        myNumbers[5] = 15;
        myNumbers[6] = 21;
        myNumbers[7] = 28;
        myNumbers[8] = 33;

        System.out.println("\n\n");

        for (int i = 0; i < 9; i++) {

            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }
        int myFiveContainer = 0;
        for (int i = 0; i < 8; i++) {

            myNumbers[i] = myFiveContainer += 5;
        }
        System.out.println("\n\n This arrays should be the fives: ");
        for (int i = 0; i < 8; i++) {
            System.out.println("myNumbers(" + 1 + ") is: " + myNumbers[i]);
        }
        int[][] numberGrid = {
                {5, 10, 15},
                {20, 25, 30},
                {35, 40, 45},
                {50}
        };
        System.out.println(numberGrid[1][2]);

        for (int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                System.out.print(numberGrid[i][j]);

            }
            System.out.println();
        }
        int[][] myNumberGrid = new int[4][3];

        System.out.println("\n\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myNumberGrid[i][j] + " ");
            }
            System.out.println("");
        }





    }
}
