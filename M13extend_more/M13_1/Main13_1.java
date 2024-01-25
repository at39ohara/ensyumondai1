package M13extend_more.M13_1;

// メイン実行クラス
public class Main13_1 {
    public static void main(String[] args) {
        Teacher takei = new Teacher("竹井一馬", "教員", "情報処理");
        Cook ohara = new Cook("大原太郎", "シェフ", "オムライス");

        takei.introduce();
        System.out.println();
        ohara.introduce();
    }
}
