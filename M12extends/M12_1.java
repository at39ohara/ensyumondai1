package M12extends;
import java.util.Scanner;

// スーパークラス
class Calculator {

    // 合計値を計算するメソッドを定義
    public int CalcSum(int x, int y) {
        return x + y;
    }

    // 平均を計算するメソッドを定義
    public double CalcAve(int x, int y) {
        return (double)(x + y) / 2;
    }
}

// サブクラス
class MoreCalc extends Calculator {

    // 塁上を求めて返すメソッドを定義
    public double CalcPow(int x, int y) {
        return Math.pow(x, y);
    }
}

// メインクラス
class M12_1 {
    public static void main(String[] args) {
        // スキャナーの準備
        Scanner stdIn = new Scanner(System.in);

        // 整数を入力させる
        System.out.print("整数を入力してください；");
        int x = stdIn.nextInt();
        System.out.print("整数を入力してください；");
        int y = stdIn.nextInt();

        // 合計値を計算するクラスのインスタンスを生成と結果の表示
        Calculator a = new Calculator();
        int sum = a.CalcSum(x, y);
        System.out.println("Sum " + x + " and " + y + " = " + sum);

        // 平均値を計算するクラスのインスタンスを生成と結果の表示
        double ave = a.CalcAve(x, y);
        System.out.println("Average " + x + " and " + y + " = " + (int)ave);

        // 累乗を計算するクラスの院スタンを生成と結果の表示
        MoreCalc b = new MoreCalc();
        double pow = b.CalcPow(x, y);
        System.out.println("Power " + x + " of " + y + " = " + (int)pow);

    }
}