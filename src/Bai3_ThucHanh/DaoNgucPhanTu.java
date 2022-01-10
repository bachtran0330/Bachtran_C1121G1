package Bai3_ThucHanh;
import java.util.Scanner;
import java.util.Arrays;
public class DaoNgucPhanTu {
    public static void main(String[] args){
        int size;
        int[] array ;
        Scanner input = new Scanner(System.in);

        System.out.println("nhap do dai mang ");
        size = input.nextInt();
        array = new int[size];

        for(int i=0;i<size;i++){
            if(size > 10){
                System.out.println("chieu dai mang khong qua 10");
                break;
            } else {
                System.out.println("Nhap phan tu " + i);
                array[i] = input.nextInt() ;
            }
        }
        System.out.println("Truoc khi dao  : " + Arrays.toString(array));

        int begin = 0;
        int last = array.length - 1 ;
        while(begin < last){
            int temp;
            temp = array[begin];
            array[begin] = array[last];
            array[last] = temp;
            begin++;
            last--;
        }

        System.out.println("sau khi dao : " + Arrays.toString(array) );

    }
}
