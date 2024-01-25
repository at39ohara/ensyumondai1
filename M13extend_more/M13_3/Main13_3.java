package M13extend_more.M13_3;

public class Main13_3 {
    public static void main(String[] args) {
        Teacher13_3 x = new Teacher13_3("竹井一馬", "教員", "情報処理");
        Cook13_3 y = new Cook13_3("大原太郎", "シェフ", "オムライス");

        x.introduce();
        System.out.println();
        y.introduce();
    }
}
