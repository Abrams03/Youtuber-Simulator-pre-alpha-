import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner m = new Scanner(System.in);
        System.out.println(TXTclr.BLUE + "\n1-ÍÀ×ÀÒÜ ÍÎÂÓŞ ÈÃĞÓ" + TXTclr.RED + "\n2-âûéòè \n");
        int mnum = m.nextInt();
        switch (mnum) {
            case 1:
                start.name1();
                start.ch_start();
                start.ch_theme();
                /*menu.go();*/
                Reader read = new FileReader("src/saves/saveName.txt");
                read.read();

                read.close();

                break;
            case 2:
                return;
        }



    }
}
