package M11class;

public class M11_2 {
    public static void main(String[] args) {
        
        // 整数型変数に初期値をそれぞれ定義
        int x = 100;
        int y = 200;

        // 合計結果を取得するインスタンス変数を定義
        Sum11_2 sum = new Sum11_2(x, y);

        // 結果を表示する
        System.out.println("100 から 200までの合計値は" + sum.getSum() + "です。");
    }
    
}
