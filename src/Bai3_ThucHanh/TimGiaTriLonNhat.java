package Bai3_ThucHanh;
import java.util.Scanner;
import java.util.Arrays;
public class TimGiaTriLonNhat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập độ dài mảng");
        int size = input.nextInt();
        int[] array = new int[size];

        for(int i=0; i<array.length;i++){
            if(size > 10){
                System.out.println("nhập lại đi");
                break;
            } else {
                System.out.println("nhập phần tử mảng " + i);
                array[i] = input.nextInt();
            }

        }
        int max = array[0];
        for(int j=1;j<array.length;j++){
            if(array[j] > max){
                max = array[j];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("số lớn nhất là " + max);
    }
}
