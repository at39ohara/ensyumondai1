package M13extend_more.M13_2;

class ITStudent13_2 extends BasicStudent13_2{
    // privateで受け皿を定義
    private int html;
    private int javaScript;
    private int java;

    // コンストラクタを定義
    ITStudent13_2(String name, String no, String schoolName, int html, int javaScript, int java){
        super(name, no, schoolName);
        this.html = html;
        this.javaScript = javaScript;
        this.java = java;
    }

    // 抽象メソッドををオーバーライド(平均点を計算する)
    @Override double calcAve() {
        double ave = (double)(html + javaScript + java) / 3;
        return Math.floor(ave * 10) / 10;
    }
}