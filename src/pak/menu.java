package pak;

import pak.*;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class menu{

    public void go() throws IOException {
        Scanner ex = new Scanner(System.in);
        System.out.println("                                                        Youtuber Simulator");
        System.out.println(TXTclr.BLUE + "1 - ����������");
        System.out.println(TXTclr.RED + "2 - �����");
        int exit = ex.nextInt();
        if (exit == 2) {
            return;
        }
    }

        public static void walk() throws IOException, InterruptedException {
        Scanner got = new Scanner(System.in);
        Scanner gomag = new Scanner(System.in);
        System.out.println(TXTclr.RESET + "�������� ��������:");
        System.out.println(TXTclr.CYAN + "\n1 - ����� � �������" + TXTclr.GREEN + " | 2 - ����� ������ �����  | 3 - �����");
        int goti = got.nextInt();
        switch (goti) {
            case 1:
                Reader contChek = new FileReader("src/saves/ChannelTheme.txt");
                int data1 = contChek.read();

                if (data1 == 49) {
                    shop.shop1();
                } else if (data1 == 50) {
                    shop.shop2();
                }else {
                    System.out.println("����� 1 ��� 2");
                }
                    break;
            case 2:
                Reader contChek2 = new FileReader("src/saves/ChannelTheme.txt");
                int data2 = contChek2.read();

                if (data2 == 49) {
                    vid_game.rec();
                } else if (data2 == 50) {
                    vid_vlog.rec();
                }else {
                    System.out.println("����� 1 ��� 2");
                }
                break;
            case 3:
                return;
                }

        }


}
