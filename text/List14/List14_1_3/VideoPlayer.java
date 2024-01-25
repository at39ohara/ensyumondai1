package text.List14.List14_1_3;

// ビデオプレイヤー
public class VideoPlayer implements Player {
    private int id;
    private static int count = 0;

    // コンストラクタを定義
    public VideoPlayer() {
        id = ++count;
    }

    // 再生する
    @Override public void play() {
        System.out.println("++ビデオ再生開始");
    }

    // 停止する
    @Override public void stop() {
        System.out.println("++ビデオ再生停止");
    }

    // 製造番号を表示
    public void printInfo() {
        System.out.println("++本気の製造番号は[" + id + "]です。");
    }
}
