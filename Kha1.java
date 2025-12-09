package btvn;

import java.util.Scanner;

public class Kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap kich thuoc cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arrInter = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("moi ban nhap gia tri thu %d: ", (i + 1));
            arrInter[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arrInter[j] < arrInter[j + 1]) {
                    int temp = arrInter[j];
                    arrInter[j] = arrInter[j + 1];
                    arrInter[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }


        for (int e = 0; e < n; e++) {
            System.out.print(" " + arrInter[e]);
        }
    }
}
