package pak;

import java.io.*;
import java.util.Scanner;

public class start {

    public void name1() throws IOException {
        Scanner k = new Scanner(System.in);
        System.out.println(TXTclr.RESET + "��� ��� �����?" );
        String num1 = k.nextLine();

        File inputName = new File("src/saves/saveName.txt");
        Writer fos = new FileWriter(inputName);
        fos.write(num1);
        fos.close();

        System.out.println("����������� ����, " + num1);
        prologue(num1);
    }
    public void prologue(String num1){

        System.out.println(" \n��� ���� ������� � ������� ����� " + num1 + ", ������� �������� �� ��� �� �������." +
                " ��� ���� ��� 23, � �� �� ��� ��� ����� �� ��� � �����." + "\n �� ������� �� �����, ��� ��� �������" +
                " �� ��� ��������� ����, � ����-�� 23, � �� ����� ���������� �� ��� ������ ������, � ������� ��" +
                " ������ ������ �� ��� ��� �������." + "\n ��� ��� � ������ ���� ����� ��������, ���� �� � ������ ������� " +
                "������� �������� � ������������ ���." + "\n ��� ��� � �������� ����:" + TXTclr.PURPLE +
                "\n          ��������� �������");
        }

    public void ch_start() throws IOException, InterruptedException {
        Thread.sleep(5000);
        Scanner s = new Scanner(System.in);
        System.out.println(TXTclr.RESET + "\n=====================================================");
        System.out.println("���������� �������� ������:");
        String ch_name = s.nextLine();

        File inputch = new File("src/saves/SaveChannelName.txt");
        Writer fos1 = new FileWriter(inputch);
        fos1.write(ch_name);
        fos1.close();
    }
    public void ch_theme() throws IOException {
        Scanner th = new Scanner(System.in);
        System.out.println("\n�������� �������� ������:" + "\n1 - ��������� | 2 - �����");
        int ch_them = th.nextInt();
        String conv = Integer.toString(ch_them);

        File inputchTH = new File("src/saves/ChannelTheme.txt");
        Writer fos2 = new FileWriter(inputchTH);
        fos2.write(conv);
        fos2.close();
    }
}



