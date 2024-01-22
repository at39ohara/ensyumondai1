package M11class;

public class M11_2 {
    public static void main(String[] args) {

        // 合計結果を取得するインスタンス変数を定義
        // 引数として送るものはないから空白でOK
        C11_2 sum = new C11_2();

        // 結果を表示する
        System.out.println(C11_2.x + "から" + C11_2.y + "までの合計値は" + sum.getSum() + "です。");
    }
    
}
