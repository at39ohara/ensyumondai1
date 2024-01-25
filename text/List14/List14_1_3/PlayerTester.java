// 抽象クラスとインターフェースの違い
    // インターフェースや抽象クラスは、
    // メソッドの具体的な処理内容を記述しないことから、
    // 両者に違いはないように思えるかもしれませんが、
    // インターフェースはクラスで共通する仕様を定義するとき、
    // (例 CDプレイヤーもDVDプレイヤーも再生、停止という共通機能がある)
    // 抽象クラスは他のクラスの処理の骨組みを定義するときに利用されます。
    // (例 )


package text.List14.List14_1_3;

public class PlayerTester {
    public static void main(String[] args) {
        Player[] a = new Player[2];
        a[0] = new VideoPlayer();
        a[1] = new CDPlayer();

        for (Player p : a) {
            p.play();
            p.stop();
            System.out.println();
        }
    }    
}
