package M11class;

public class C11_2 {
    // main処理側からのxの値とyの値を格納するクラス変数
    // main処理でクラスに渡すための変数と
    // クラスファイル内の引数として使う変数の名前は一致してなくてよい
    static int x = 100;
    static int y = 200;

    // 合計を計算して返すメソッドを定義
    public int getSum() {
        int sum = 0;

        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
    
}

// クラスを定義する
// コンストラクタを作成する
// クラス内に合計値を計算して返すメソッドを定義する