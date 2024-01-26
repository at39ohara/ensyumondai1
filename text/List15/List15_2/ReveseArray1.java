package text.List15.List15_2;
// 配列の要素に値を読み込んで並びを反転する（バグあり）

import java.util.InputMismatchException;
import java.util.Scanner;

class ReverseArray1 {

    // 配列の要素a[idx1]とa[idx2]を交換する
    static void swap(int[] a, int idx1, int idx2) {
        try{
            // 1をtに
            int t = a[idx1];
            // 2を1に
            a[idx1] = a[idx2];
            // tを2に
            a[idx2] = t;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("メソッドswap内で不正なインデックスを検出しました。");
            System.out.println("プログラムを終了します。");
            System.exit(1);
        }
    }

    // 配列aの要素の並びを反転（誤り）
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i);
    }

    // javaの基本　上にどれだけ処理があってもmain関数からプログラムが開始される
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);


        try {
            System.out.print("要素数");
            int num = stdIn.nextInt(); /**要素数 */

            int[] x = new int[num]; /**要素数numの配列 */

            for (int i = 0; i < num; i ++) {
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            }

            reverse(x);

                System.out.println("要素の並びを反転しました。");
                for (int i = 0; i < num; i++)
                    System.out.println("x[" + i + "] = " + x[i]);
            } catch (InputMismatchException e) {
            System.out.println("数値以外の文字を検出しました。");
            System.out.println("整数を入力してください");
            System.exit(1);
        }
    }
}