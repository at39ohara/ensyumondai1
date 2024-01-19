package M01inout;
import java.nio.charset.Charset;
import java.util.Scanner;

public class m1_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, Charset.forName("shift-JIS"));

        // 入力させる
        System.out.print("文字の入力：");
        String inputstring = in.nextLine();

        System.out.print("整数の入力：");
        int inputnum = in.nextInt();

        System.out.print("小数の入力：");
        double inputdouble = in.nextDouble();

        // 出力する
        System.out.println("入力された文字 = " + inputstring);

        System.out.println("入力された整数 = " + inputnum);

        System.out.println("入力された小数 = " + inputdouble);

    }
}
