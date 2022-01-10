package Bai3_baitap;
import java.util.Scanner;
public class ThemPhanTuVaoMang {
    public static void main(String[] args){
        int n, i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập vào độ dài mảng : ");
            n = scanner.nextInt();
        }while (n<= 0);

        int Arr[] = new int[n];
        System.out.println("Nhập phần tử cả mảng : ");
        for (i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ  " + i + " : ");
            Arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập số nguyên x : ");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí muốn chèn vào index ");
        int index = scanner.nextInt();
    }
}
