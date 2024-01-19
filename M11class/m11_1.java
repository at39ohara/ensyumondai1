package M11class;
import java.util.Scanner;

public class M11_1 {
    public static void main(String[] args) {
        // ScannerインスタンスをstdInに代入する
        Scanner stdIn = new Scanner(System.in);

        // 半径を入力させて変数に格納する
        System.out.print("半径を整数値で入力：");
        int radius1 = stdIn.nextInt();

        // 円周を取得するインスタンス変数を定義
        Circle11_1 length = new Circle11_1(radius1);

        // 面積を取得するインスタンス変数を定義
        Circle11_1 area = new Circle11_1(radius1);

        // 円周の結果を表示
        System.out.printf("円周の長さは %.3f です。%n", length.getLength());
        // 面積の結果を表示
        System.out.printf("円の面積は %.3f です。%n", area.getArea());
    }
}
