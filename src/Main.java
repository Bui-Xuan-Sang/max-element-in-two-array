import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận: ");
        row = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        col = scanner.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}
