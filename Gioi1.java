package btvn;

import java.util.Scanner;

public class Gioi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Khởi tạo mảng ---
        System.out.print("Nhập kích thước mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        // --- Sắp xếp giảm dần bằng Selection Sort ---
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Hoán đổi
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        // --- In mảng sau khi sắp xếp ---
        System.out.println("\nMảng sau khi sắp xếp giảm dần:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        // --- Tìm kiếm ---
        System.out.print("\nNhập số cần tìm: ");
        int target = scanner.nextInt();

        // 1. Linear Search
        int linearIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                linearIndex = i;
                break;
            }
        }

        // 2. Binary Search (do mảng đã được sắp giảm dần)
        int left = 0, right = n - 1;
        int binaryIndex = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                binaryIndex = mid;
                break;
            }

            // Vì mảng giảm dần nên thay điều kiện
            if (arr[mid] < target) {
                right = mid - 1; // target nằm bên trái
            } else {
                left = mid + 1; // target nằm bên phải
            }
        }

        // --- Xuất kết quả ---
        System.out.println("\nKết quả tìm kiếm:");

        if (linearIndex != -1) {
            System.out.println("Linear Search: Tìm thấy tại vị trí " + linearIndex);
        } else {
            System.out.println("Linear Search: Không tìm thấy");
        }

        if (binaryIndex != -1) {
            System.out.println("Binary Search: Tìm thấy tại vị trí " + binaryIndex);
        } else {
            System.out.println("Binary Search: Không tìm thấy");
        }

    }
}
