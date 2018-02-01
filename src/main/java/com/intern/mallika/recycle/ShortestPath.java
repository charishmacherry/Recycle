package com.intern.mallika.recycle;

import android.widget.Toast;

import java.util.InputMismatchException;
import java.util.Stack;

/**
 * Created by Mallika on 1/25/2018.
 */

public class ShortestPath {
    private int TotalTemples;
    private Stack<Integer> stack;
    public int[] fin = new int[20];//here array will be of size total number of check boxes checked
    int[][] Main_matrix ;

    public ShortestPath() {
        stack = new Stack<Integer>();
    }

    public int[] tsp(int Matrix[][]) {
        TotalTemples = Matrix[1].length - 1;
        int[] visited = new int[TotalTemples + 1];
        visited[1] = 1;
        stack.push(1);
        int current, desti = 0, i, k = 1;
        int min = Integer.MAX_VALUE;
        boolean minvalue = false;
        //System.out.print(1 + "\t");
        fin[0]=1;
        while (!stack.isEmpty()) {
            current = stack.peek();
            i = 1;
            min = Integer.MAX_VALUE;
            while (i <= TotalTemples) {
                if (Matrix[current][i] > 1 && visited[i] == 0) {
                    if (min > Matrix[current][i]) {
                        min = Matrix[current][i];
                        desti = i;
                        minvalue = true;
                    }
                }
                i++;
            }
            if (minvalue) {
                visited[desti] = 1;
                stack.push(desti);
                fin[k] =desti;
                k++;
                //System.out.print(desti + "\t");
                minvalue = false;
                continue;
            }
            stack.pop();
        }
       return fin;
    }

    public int[] path(int[] initial, int count) {
//        int number_of_Temples;
        int[][] distance = new int[20][20];

//1st place
        distance[0][0] = 0;
        distance[0][1] = 21;
        distance[0][2] = 11;
        distance[0][3] = 16;
        distance[0][4] = 5;
        distance[0][5] = 5;
        distance[0][6] = 1;
        distance[0][7] = 69;
        distance[0][8] = 122;
        distance[0][9] = 4;
        distance[0][10] = 37;
        distance[0][11] = 26;
        distance[0][12] = 63;
        distance[0][13] = 38;
        distance[0][14] = 41;
        distance[0][15] = 1;
        distance[0][16] = 78;
        distance[0][17] = 24;
        distance[0][18] = 26;
        distance[0][19] = 26;
//2nd place
        distance[1][0] = 21;
        distance[1][1] = 0;
        distance[1][2] = 29;
        distance[1][3] = 38;
        distance[1][4] = 26;
        distance[1][5] = 16;
        distance[1][6] = 21;
        distance[1][7] = 86;
        distance[1][8] = 139;
        distance[1][9] = 19;
        distance[1][10] = 60;
        distance[1][11] = 43;
        distance[1][12] = 86;
        distance[1][13] = 61;
        distance[1][14] = 64;
        distance[1][15] = 20;
        distance[1][16] = 96;
        distance[1][17] = 3;
        distance[1][18] = 6;
        distance[1][19] = 5;
//3rd place
        distance[2][0] = 11;
        distance[2][1] = 29;
        distance[2][2] = 0;
        distance[2][3] = 26;
        distance[2][4] = 14;
        distance[2][5] = 12;
        distance[2][6] = 10;
        distance[2][7] = 58;
        distance[2][8] = 111;
        distance[2][9] = 12;
        distance[2][10] = 50;
        distance[2][11] = 34;
        distance[2][12] = 73;
        distance[2][13] = 48;
        distance[2][14] = 57;
        distance[2][15] = 10;
        distance[2][16] = 67;
        distance[2][17] = 31;
        distance[2][18] = 34;
        distance[2][19] = 33;
//4th place
        distance[3][0] = 16;
        distance[3][1] = 38;
        distance[3][2] = 26;
        distance[3][3] = 0;
        distance[3][4] = 12;
        distance[3][5] = 18;
        distance[3][6] = 16;
        distance[3][7] = 70;
        distance[3][8] = 134;
        distance[3][9] = 18;
        distance[3][10] = 43;
        distance[3][11] = 16;
        distance[3][12] = 47;
        distance[3][13] = 26;
        distance[3][14] = 48;
        distance[3][15] = 39;
        distance[3][16] = 87;
        distance[3][17] = 62;
        distance[3][18] = 65;
        distance[3][19] = 65;
//5th place
        distance[4][0] = 5;
        distance[4][1] = 26;
        distance[4][2] = 14;
        distance[4][3] = 12;
        distance[4][4] = 0;
        distance[4][5] = 7;
        distance[4][6] = 5;
        distance[4][7] = 17;
        distance[4][8] = 123;
        distance[4][9] = 7;
        distance[4][10] = 36;
        distance[4][11] = 21;
        distance[4][12] = 59;
        distance[4][13] = 34;
        distance[4][14] = 40;
        distance[4][15] = 6;
        distance[4][16] = 79;
        distance[4][17] = 29;
        distance[4][18] = 32;
        distance[4][19] = 31;
//6th place
        distance[5][0] = 5;
        distance[5][1] = 16;
        distance[5][2] = 12;
        distance[5][3] = 18;
        distance[5][4] = 7;
        distance[5][5] = 0;
        distance[5][6] = 4;
        distance[5][7] = 70;
        distance[5][8] = 123;
        distance[5][9] = 1;
        distance[5][10] = 40;
        distance[5][11] = 28;
        distance[5][12] = 65;
        distance[5][13] = 40;
        distance[5][14] = 45;
        distance[5][15] = 4;
        distance[5][16] = 79;
        distance[5][17] = 22;
        distance[5][18] = 25;
        distance[5][19] = 25;
//7th place
        distance[6][0] = 1;
        distance[6][1] = 21;
        distance[6][2] = 10;
        distance[6][3] = 16;
        distance[6][4] = 5;
        distance[6][5] = 4;
        distance[6][6] = 0;
        distance[6][7] = 69;
        distance[6][8] = 122;
        distance[6][9] = 4;
        distance[6][10] = 37;
        distance[6][11] = 26;
        distance[6][12] = 64;
        distance[6][13] = 38;
        distance[6][14] = 42;
        distance[6][15] = 1;
        distance[6][16] = 78;
        distance[6][17] = 24;
        distance[6][18] = 27;
        distance[6][19] = 26;
//8th place
        distance[7][0] = 69;
        distance[7][1] = 86;
        distance[7][2] = 58;
        distance[7][3] = 70;
        distance[7][4] = 70;
        distance[7][5] = 70;
        distance[7][6] = 69;
        distance[7][7] = 0;
        distance[7][8] = 60;
        distance[7][9] = 69;
        distance[7][10] = 105;
        distance[7][11] = 86;
        distance[7][12] = 11;
        distance[7][13] = 81;
        distance[7][14] = 110;
        distance[7][15] = 69;
        distance[7][16] = 17;
        distance[7][17] = 89;
        distance[7][18] = 91;
        distance[7][19] = 91;
//9th place
        distance[8][0] = 122;
        distance[8][1] = 139;
        distance[8][2] = 111;
        distance[8][3] = 134;
        distance[8][4] = 123;
        distance[8][5] = 123;
        distance[8][6] = 122;
        distance[8][7] = 60;
        distance[8][8] = 0;
        distance[8][9] = 135;
        distance[8][10] = 171;
        distance[8][11] = 139;
        distance[8][12] = 141;
        distance[8][13] = 134;
        distance[8][14] = 163;
        distance[8][15] = 135;
        distance[8][16] = 90;
        distance[8][17] = 155;
        distance[8][18] = 157;
        distance[8][19] = 157;
//10th place
        distance[9][0] = 4;
        distance[9][1] = 19;
        distance[9][2] = 12;
        distance[9][3] = 18;
        distance[9][4] = 7;
        distance[9][5] = 1;
        distance[9][6] = 4;
        distance[9][7] = 69;
        distance[9][8] = 135;
        distance[9][9] = 0;
        distance[9][10] = 41;
        distance[9][11] = 28;
        distance[9][12] = 66;
        distance[9][13] = 41;
        distance[9][14] = 45;
        distance[9][15] = 2;
        distance[9][16] = 78;
        distance[9][17] = 22;
        distance[9][18] = 24;
        distance[9][19] = 24;
//11th place
        distance[10][0] = 37;
        distance[10][1] = 60;
        distance[10][2] = 50;
        distance[10][3] = 43;
        distance[10][4] = 36;
        distance[10][5] = 40;
        distance[10][6] = 37;
        distance[10][7] = 105;
        distance[10][8] = 171;
        distance[10][9] = 41;
        distance[10][10] = 0;
        distance[10][11] = 36;
        distance[10][12] = 55;
        distance[10][13] = 57;
        distance[10][14] = 4;
        distance[10][15] = 38;
        distance[10][16] = 114;
        distance[10][17] = 63;
        distance[10][18] = 65;
        distance[10][19] = 65;
//12th place
        distance[11][0] = 26;
        distance[11][1] = 43;
        distance[11][2] = 34;
        distance[11][3] = 16;
        distance[11][4] = 21;
        distance[11][5] = 28;
        distance[11][6] = 26;
        distance[11][7] = 86;
        distance[11][8] = 139;
        distance[11][9] = 28;
        distance[11][10] = 36;
        distance[11][11] = 0;
        distance[11][12] = 51;
        distance[11][13] = 26;
        distance[11][14] = 41;
        distance[11][15] = 27;
        distance[11][16] = 96;
        distance[11][17] = 46;
        distance[11][18] = 48;
        distance[11][19] = 48;
//13th place
        distance[12][0] = 63;
        distance[12][1] = 86;
        distance[12][2] = 73;
        distance[12][3] = 47;
        distance[12][4] = 59;
        distance[12][5] = 65;
        distance[12][6] = 64;
        distance[12][7] = 106;
        distance[12][8] = 141;
        distance[12][9] = 66;
        distance[12][10] = 51;
        distance[12][11] = 51;
        distance[12][12] = 0;
        distance[12][13] = 26;
        distance[12][14] = 56;
        distance[12][15] = 67;
        distance[12][16] = 138;
        distance[12][17] = 88;
        distance[12][18] = 90;
        distance[12][19] = 90;
//14th place
        distance[13][0] = 38;
        distance[13][1] = 61;
        distance[13][2] = 48;
        distance[13][3] = 26;
        distance[13][4] = 39;
        distance[13][5] = 40;
        distance[13][6] = 38;
        distance[13][7] = 81;
        distance[13][8] = 134;
        distance[13][9] = 41;
        distance[13][10] = 57;
        distance[13][11] = 26;
        distance[13][12] = 26;
        distance[13][13] = 0;
        distance[13][14] = 61;
        distance[13][15] = 42;
        distance[13][16] = 112;
        distance[13][17] = 63;
        distance[13][18] = 65;
        distance[13][19] = 65;
//15th place
        distance[14][0] = 41;
        distance[14][1] = 64;
        distance[14][2] = 57;
        distance[14][3] = 48;
        distance[14][4] = 40;
        distance[14][5] = 45;
        distance[14][6] = 42;
        distance[14][7] = 110;
        distance[14][8] = 163;
        distance[14][9] = 45;
        distance[14][10] = 4;
        distance[14][11] = 41;
        distance[14][12] = 56;
        distance[14][13] = 61;
        distance[14][14] = 0;
        distance[14][15] = 43;
        distance[14][16] = 119;
        distance[14][17] = 67;
        distance[14][18] = 70;
        distance[14][19] = 70;
//16th place
        distance[15][0] = 1;
        distance[15][1] = 20;
        distance[15][2] = 10;
        distance[15][3] = 39;
        distance[15][4] = 6;
        distance[15][5] = 4;
        distance[15][6] = 1;
        distance[15][7] = 69;
        distance[15][8] = 135;
        distance[15][9] = 2;
        distance[15][10] = 38;
        distance[15][11] = 27;
        distance[15][12] = 67;
        distance[15][13] = 42;
        distance[15][14] = 43;
        distance[15][15] = 0;
        distance[15][16] = 77;
        distance[15][17] = 24;
        distance[15][18] = 26;
        distance[15][19] = 26;
//17th place
        distance[16][0] = 78;
        distance[16][1] = 96;
        distance[16][2] = 67;
        distance[16][3] = 87;
        distance[16][4] = 79;
        distance[16][5] = 79;
        distance[16][6] = 78;
        distance[16][7] = 17;
        distance[16][8] = 90;
        distance[16][9] = 78;
        distance[16][10] = 114;
        distance[16][11] = 96;
        distance[16][12] = 138;
        distance[16][13] = 112;
        distance[16][14] = 119;
        distance[16][15] = 77;
        distance[16][16] = 0;
        distance[16][17] = 98;
        distance[16][18] = 100;
        distance[16][19] = 100;
//18th place
        distance[17][0] = 24;
        distance[17][1] = 3;
        distance[17][2] = 31;
        distance[17][3] = 62;
        distance[17][4] = 29;
        distance[17][5] = 22;
        distance[17][6] = 24;
        distance[17][7] = 89;
        distance[17][8] = 155;
        distance[17][9] = 22;
        distance[17][10] = 63;
        distance[17][11] = 46;
        distance[17][12] = 88;
        distance[17][13] = 63;
        distance[17][14] = 67;
        distance[17][15] = 24;
        distance[17][16] = 98;
        distance[17][17] = 0;
        distance[17][18] = 3;
        distance[17][19] = 6;
//19th place
        distance[18][0] = 26;
        distance[18][1] = 5;
        distance[18][2] = 34;
        distance[18][3] = 65;
        distance[18][4] = 32;
        distance[18][5] = 25;
        distance[18][6] = 27;
        distance[18][7] = 91;
        distance[18][8] = 157;
        distance[18][9] = 24;
        distance[18][10] = 65;
        distance[18][11] = 48;
        distance[18][12] = 90;
        distance[18][13] = 65;
        distance[18][14] = 70;
        distance[18][15] = 26;
        distance[18][16] = 100;
        distance[18][17] = 3;
        distance[18][18] = 0;
        distance[18][19] = 8;
//20th place
        distance[19][0] = 26;
        distance[19][1] = 5;
        distance[19][2] = 33;
        distance[19][3] = 63;
        distance[19][4] = 31;
        distance[19][5] = 25;
        distance[19][6] = 26;
        distance[19][7] = 91;
        distance[19][8] = 157;
        distance[19][9] = 24;
        distance[19][10] = 65;
        distance[19][11] = 48;
        distance[19][12] = 90;
        distance[19][13] = 65;
        distance[19][14] = 70;
        distance[19][15] = 26;
        distance[19][16] = 100;
        distance[19][17] = 6;
        distance[19][18] = 8;
        distance[19][19] = 0;

        // int count = 8;  //the array list length is assigned to count
        //int[] initial = new int[counter];            // The ids which are clicked comes into this array  ie the array list which we get from the card view activity
        // This is the main matrix for which we deal the shortest path
        Main_matrix=new int[count][count];
        for (int r = 0; r < count; r++)
            for (int rq = 0; rq < count; rq++)
                Main_matrix[r][rq] = distance[initial[r]][initial[rq]];
            //System.out.println();
            int[] result=tsp(Main_matrix);
            return result;
    }
}




