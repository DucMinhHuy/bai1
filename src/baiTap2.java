import java.util.Scanner;
public class baiTap2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("numbers is:");
        int number=scanner.nextInt();
        String letter="";
        if(number<=10) {
            switch (number) {
                case 1:
                    letter = "one";
                    break;
                case 2:
                    letter = "two";
                    break;
                case 3:
                    letter = "three";
                    break;
                case 4:
                    letter = "four";
                    break;
                case 5:
                    letter = "five";
                    break;
                case 6:
                    letter = "six";
                    break;
                case 7:
                    letter = "sever";
                    break;
                case 8:
                    letter = "eight";
                    break;
                case 9:
                    letter = "nine";
                    break;
                case 10:
                    letter = "ten";
                    break;
            }
            System.out.printf("the number %d is %s", number, letter);
        }else{
            System.out.printf(" %d out of ability",number);
        }

    }
}
