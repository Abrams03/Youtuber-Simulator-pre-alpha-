import java.util.Scanner;

public class shop {

    public static void shop1(){
        Scanner buy1 = new Scanner(System.in);
        System.out.println(TXTclr.YELLOW + "                   ������� �����������");

        System.out.println("\n������ ���������");
        System.out.println("������");
        int kup = buy1.nextInt();
    }

    public static void shop2() {
        Scanner buy2 = new Scanner(System.in);
        System.out.println(TXTclr.YELLOW + "                    ������� �����");

        System.out.println("\n������ ���������");
        System.out.println("������");
        int kup1 = buy2.nextInt();

    }
}
