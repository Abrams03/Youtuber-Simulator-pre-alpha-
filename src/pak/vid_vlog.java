package pak;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class vid_vlog extends Rec{
    public static void rec() throws InterruptedException, IOException {
        Scanner vid = new Scanner(System.in);
        System.out.println(TXTclr.RESET + "����� �����? \n 1 - �� | 2 - ���(��������� � ����)");
        int vid1 = vid.nextInt();
        switch (vid1) {
            case 1 -> {
                System.out.println("����� ��������:");
                for (int i = 0; i < 40; i++) {
                    System.out.print("#");

                    Thread.sleep(600);
                }
                Random random = new Random();
                int x = random.nextInt(2000) + 50;
                int y = random.nextInt(10000) + 100;
                System.out.println("\n�� ���������� " + x + " ��������");
                System.out.println("�� ����� " + y + " ����������");
                String to = Integer.toString(x);

                File den = new File("src/saves/SaveMoney.txt");
                Writer fos3 = new FileWriter(den, true);
                fos3.write(to);
                fos3.close();


                menu.walk();
            }
            case 2 -> menu.walk();
        }

    }
}
