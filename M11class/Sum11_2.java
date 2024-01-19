package M11class;

public class Sum11_2 {
    // main処理側からのxの値とyの値を格納するクラス変数？
    // main処理でクラスに渡すための変数と
    // クラスファイル内の引数として使う変数の名前は一致してなくてよい
    private int x_class;
    private int y_class;

    // コンストラクタ
    Sum11_2 (int x, int y) {
        this.x_class = x;
        this.y_class = y;
    }

    // 合計を計算して返すメソッドを定義
    public int getSum() {
        int sum = 0;

        for (int i = x_class; i <= y_class; i++) {
            sum += i;
        }
        return sum;
    }
    
}

// クラスを定義する
// コンストラクタを作成する
// クラス内に合計値を計算して返すメソッドを定義する