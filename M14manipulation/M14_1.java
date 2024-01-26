package M14manipulation;

import java.nio.charset.Charset;
import java.util.Scanner;

// 文字列を出力するための枠組みのインターフェース宣言をする
public interface M14_1 {
    // 枠組みだけ組む
    void output();    
}

// 文字列を出力するための枠組みを実装するクラス
class InOut implements M14_1 {
    // このクラスで使う受け皿を定義
    private String x;

    // スキャナーインスタンスを生成
    Scanner stdIn = new Scanner(System.in,Charset.forName("shift-JIS"));

    // 出力するメソッドの実装
    @Override public void output() {
        System.out.print("文字列を入力：");
        x = stdIn.nextLine();
        System.out.println(x);
    }
}

// mainテスト実行クラス
class Tester {
    public static void main(String[] args) {
        // InOutのインスタンスを生成
        InOut y = new InOut();

        // メソッドを呼び出す
        y.output();
    }
}