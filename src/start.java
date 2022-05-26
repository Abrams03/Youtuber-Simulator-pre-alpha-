import javax.imageio.IIOException;
import javax.lang.model.element.Name;
import java.io.*;
import java.util.Scanner;

public class start {






    public static void name1() throws IOException {
        Scanner k = new Scanner(System.in);
        System.out.println(TXTclr.RESET + "Как вас зовут?" );
        String num1 = k.nextLine();

        File inputName = new File("src/saves/saveName.txt");
        Writer fos = new FileWriter(inputName);
        fos.write(num1);
        fos.close();

        System.out.println("Приветствую тебя, " + num1);
        prologue(num1);
    }

    public static void prologue(String num1){

        System.out.println(" \nЭто была история о скучной жизни " + num1 + ", который проживал ее как по шаблону." +
                " Ему было уже 23, а он до сих пор сидел на шее у мамки." + "\n Но однажны он понял, что ему надоело" +
                " во всём слушаться маму, в свои-то 23, и он решил заработать на своё личное жилище, в котором он" +
                " сможет делать всё что сам захочет." + "\n Так ему и пришла идея стать Ютубером, ведь он с самого детства " +
                "смотрел ютуберов и вдохновлялся ими." + "\n Вот так и началась игра:" + TXTclr.PURPLE +
                "\n          СИМУЛЯТОР ЮТУБЕРА");
        }

    public static void ch_start() throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println(TXTclr.RESET + "\n=====================================================");
        System.out.println("Придумайте название канала:");
        String ch_name = s.nextLine();

        File inputch = new File("src/saves/SaveChannelName.txt");
        Writer fos1 = new FileWriter(inputch);
        fos1.write(ch_name);
        fos1.close();
    }
    public static void ch_theme() throws IOException {
        Scanner th = new Scanner(System.in);
        System.out.println("\nВыберите тематику канала:" + "\n1 - Видеоигры | 2 - Влоги");
        int ch_them = th.nextInt();

        File inputchTH = new File("src/saves/ChannelTheme.txt");
        Writer fos2 = new FileWriter(inputchTH);
        fos2.write(ch_them);
        fos2.close();


    }
}



