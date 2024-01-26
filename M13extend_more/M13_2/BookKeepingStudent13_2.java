package M13extend_more.M13_2;

// BookKeepingstudentクラス
class BookKeepingStudent13_2 extends BasicStudent13_2 {
    // privateで受け皿を定義
    private int accounting;
    private int business;

    // コンストラクタを定義
    BookKeepingStudent13_2 (String name, String no, String schoolName, int accounting, int business){
        super(name, no, schoolName);
        this.accounting = accounting;
        this.business = business;
    }

    // 平均点を計算するメソッドを定義
    @Override double calcAve() {
        double ave = (double)(accounting + business) / 2;
        return Math.floor(ave * 10) / 10;
    }
}