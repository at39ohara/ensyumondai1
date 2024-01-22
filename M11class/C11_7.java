package M11class;

public class C11_7 {

    // このクラスで受け取るための引数
    private String name;
    private int num;
    private int japanese;
    private int math;
    private int english;

    // コンストラクタ
    // 受け取った値をクラス変数に入れる役割？
    C11_7 (String name, int num, int japanese, int math, int english) {
        this.name = name;
        this.num = num;
        this.japanese = japanese;
        this.math = math;
        this.english = english;
    }

    // 3教科の平均点を算出するメソッドを定義
    double getAve() {
        double ave = Math.floor(((double)(japanese + math + english) / 3) * 100) / 100;
        return ave;
    }

    // 3教科の合計点を算出するメソッドを定義
    int getSum() {
        int sum = this.japanese + this.math + this.english;
        return sum;
    }

    // 学生番号を取得するメソッドを定義
    int getNum() {
        return num;
    }

    // 名前を取得するメソッドを定義
    String getName() {
        return name;
    }
}
