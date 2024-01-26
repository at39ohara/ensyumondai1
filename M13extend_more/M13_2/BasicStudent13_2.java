package M13extend_more.M13_2;

// 抽象クラス
abstract class BasicStudent13_2 {
    // privateで受け皿を定義
    private String name;
    private String no;
    private String schoolName;

    // コンストラクタを定義
    BasicStudent13_2(String name, String no, String schoolName) {
        this.name = name;
        this.no = no;
        this.schoolName = schoolName;
    }

    // 平均点を計算する抽象メソッドを定義
    abstract double calcAve();
}