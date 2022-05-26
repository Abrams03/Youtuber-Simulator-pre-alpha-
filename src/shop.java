import java.util.Scanner;

public class shop {

    public static void shop1(){
        Scanner buy1 = new Scanner(System.in);
        System.out.println(TXTclr.YELLOW + "                   МАГАЗИН КОМПЬЮТЕРОВ");

        System.out.println("\nМощный компьютер");
        System.out.println("купить");
        int kup = buy1.nextInt();
    }

    public static void shop2() {
        Scanner buy2 = new Scanner(System.in);
        System.out.println(TXTclr.YELLOW + "                    МАГАЗИН КАМЕР");

        System.out.println("\nМощный компьютер");
        System.out.println("купить");
        int kup1 = buy2.nextInt();

    }
}
