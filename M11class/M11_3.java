package M11class;

public class M11_3 {
    public static void main(String[] args) {
        
        // 整数型変数に初期値をそれぞれ定義
        int x = 100;
        int y = 200;

        // 合計結果を取得するインスタンス変数を定義
        C11_3 sum = new C11_3(x, y);

        // 結果を表示する
        System.out.println("100 から 200までの合計値は" + sum.getSum() + "です。");
    }
    
}
