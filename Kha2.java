package btvn;

import java.util.Scanner;

public class Kha2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so hang: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap so cot: ");
        int col = Integer.parseInt(sc.nextLine());
        int[][] arr2D = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                System.out.printf("Moi ban nhap arr2D[%d]: \n",j);
                arr2D[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int sumC = 0;
        int sumL = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr2D[i][j] %2 ==0){
                    sumC+=arr2D[i][j];
                }else sumL+= arr2D[i][j];
            }

        }
        System.out.printf("TOng cac so chan: %d\n",sumC);
        System.out.printf("TOng cac so le: %d",sumL);
    }
}
