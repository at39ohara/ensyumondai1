package text.List4;
import java.util.Scanner;

class List4_8 {
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in); /**Scannerクラスの標準入力インスタンスを生成しているだけ */

        System.out.println("正の整数値を逆順に表示します。");
        int x;
        do {
            System.out.println("正の整数値：");
            x = stdIn.nextInt();/**ここでScannerのstdInインスタンスを呼び出してnextIntとして使用する */
        } while (x <= 0);
        
        System.out.print("逆から読むと");
        while (x > 0) {
            System.out.print(x % 10);
            x /= 10;           
        }
    System.out.println("です。");
    }
}