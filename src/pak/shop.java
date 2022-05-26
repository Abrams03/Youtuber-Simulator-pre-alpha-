package pak;

import pak.TXTclr;

import java.io.IOException;
import java.util.Scanner;

public class shop {

    public static void shop1() throws IOException, InterruptedException {


        Scanner buy1 = new Scanner(System.in);
        System.out.println(TXTclr.YELLOW + "                   МАГАЗИН КОМПЬЮТЕРОВ");

        System.out.println(TXTclr.PURPLE + "\nМощный компьютер");
        System.out.println(TXTclr.RESET + "1 - купить  |  2 - выйти");
        int kup = buy1.nextInt();
        if (kup == 1) {
            System.out.println("WIP");
            menu.walk();
        } else if (kup == 2){

        }
    }
    public static void shop2() throws IOException, InterruptedException {
        Scanner buy2 = new Scanner(System.in);
        System.out.println(TXTclr.YELLOW + "                    МАГАЗИН КАМЕР");

        System.out.println(TXTclr.PURPLE + "\n8к камера RED");
        System.out.println(TXTclr.RESET + "1 - купить  |  2 - выйти");
        int kup1 = buy2.nextInt();
        if (kup1 == 1) {
            System.out.println("WIP");
            menu.walk();
        } else if (kup1 == 2) {
            menu.walk();

        }
    }
}
