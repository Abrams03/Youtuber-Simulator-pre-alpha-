import java.util.Scanner;

public class menu {

    public static void go(){
        Scanner got = new Scanner(System.in);
        Scanner gomag = new Scanner(System.in);
        System.out.println("�������� ��������:");
        System.out.println(TXTclr.CYAN + "\n1 - ����� � �������" +TXTclr.GREEN+ " | 2 - ����� ������ �����");
        int goti = got.nextInt();
        switch (goti) {
            case 1:
                System.out.println(TXTclr.RESET + "1 - ������� ����������� | 2 - ������� �����");
                int shopi = gomag.nextInt();
                if(shopi == 1){
                    shop.shop1();
                } else if (shopi == 2) {
                    shop.shop2();
                }


                /*if(goti == 1){
            */

        }

    }
}
