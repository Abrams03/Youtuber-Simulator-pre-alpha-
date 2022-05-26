import pak.*;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException, InterruptedException {
        menu choice = new menu();
        start prologue = new start();


        Reader read = new FileReader("src/saves/saveName.txt");
        int data = read.read();
        if(data > 0){
            choice.go();
            choice.walk();
        }else {

            read.close();

            Scanner m = new Scanner(System.in);
            System.out.println("                                                                  YouTuber Simulator" +
                    TXTclr.BLUE + "\n1-НАЧАТЬ НОВУЮ ИГРУ" + TXTclr.RED + "\n2-выйти \n");
            int mnum = m.nextInt();
            switch (mnum) {
                case 1:
                    prologue.name1();
                    prologue.ch_start();
                    prologue.ch_theme();
                    System.out.println("Вы успешно создали канал!");

                    choice.walk();
                    break;
                case 2:
                    return;
            }

        }

    }
}
