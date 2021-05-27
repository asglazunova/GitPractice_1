package SaimsTasks;

public class arraysPractice {
    // int [] [] test = new int [4] [3]
    // counting strochki a potom stolbiki
    //test [0] [0] = 11;
    //int [] t = new int [4];
    public static void main(String[] args) {


        int[][] test = new int[4][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {

                test[i][j] = (i + 1) * 10 + (j + 1);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();

        }

    }
}
