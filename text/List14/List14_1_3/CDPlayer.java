package text.List14.List14_1_3;

public class CDPlayer implements Player {

    // 再生する
    @Override public void play() {
        System.out.println("**CD再生開始");
    }    

    // 停止する
    @Override public void stop() {
        System.out.println("**CD再生停止");
    }

    // クリーニング
    public void cleaning() {
        System.out.println("**ヘッドをクリーニングしました");
    }
}
