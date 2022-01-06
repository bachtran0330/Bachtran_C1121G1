package bai1_thuchanh;
import java.util.Scanner;
public class Sudungtoantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập width: ");
        width = scanner.nextFloat();// nhập width
        System.out.println("nhập height: ");
        height = scanner.nextFloat();// nhập height
        float area = width*height;
        System.out.println("area là :" + area);

    }
}
