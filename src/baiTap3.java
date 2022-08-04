import java.util.Scanner;
public class baiTap3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap USD");
        int rate=scanner.nextInt();
        int VND=rate*23000;
        System.out.println(VND+"VND");
    }
}
