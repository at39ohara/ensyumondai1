package M05switch;
import java.nio.charset.Charset;
import java.util.Scanner;

public class M5_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 最初の文章を出力
        System.out.print("A~Dの値を入力してください：");
        String rank = stdIn.nextLine();

        switch (rank) {
            case "A" : 
                System.out.println(("ランクAは評価「優」です"));
                break;
            case "B" :
                System.out.println(("ランクBは評価「良」です"));
                break;
            case "C" :
                System.out.println(("ランクCは評価「可」です"));
                break;
            case "D" :
                System.out.println(("ランクDは評価「不可」です"));
                break;
            default:
                System.out.println(("評価対象外です"));
                break;
        }
    }
}
