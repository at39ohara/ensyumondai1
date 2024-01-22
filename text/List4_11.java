// 左下側が直角の直角二等辺三角形を表示する

package text;
import java.util.Scanner;

class List4_11 {
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("左下直角の二等辺三角形を表示します。");
        System.out.print("段数は：");
        int n = stdIn.nextInt(); /**int型変数nに何段目まで出力するかを代入する */

        for (int i = 1; i <= n; i++) { /**i = 1がiの初期値を1に設定、i <= nがiがn段目になるまで繰り返す条件、i++が1ずつ増加する */
            for (int j = 1; j <= i; j++) /**j = 1がjの初期値を1に設定、j <= iが『*』を表示する数をiになるまで繰り返す、j++が1ずつ増加する */
                System.out.print('*'); /**上のループで必要なアスタリスクを出力するためのもの */
            System.out.println(); /**改行して次の行でアスタリスクを出力するための準備をしている */
        }
    }
}