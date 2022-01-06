package bai1_baitap;
import java.util.Scanner ;
public class Quydoitien {
    public static void main(String[] args) {
    double vnd = 23000;
    double USD ;

    Scanner scanner = new Scanner(System.in);
    System.out.println(" nhập vào số tiền cần đổi sang vnd");
    USD = scanner.nextDouble();
    double quydoi = USD*23000;
    System.out.println(" số tiền VND là :" + quydoi);

}
}
