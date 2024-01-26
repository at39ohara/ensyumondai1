package M13extend_more.M13_2;
import java.nio.charset.Charset;
import java.util.Scanner;

// メインクラス
public class Main13_2 {
    public static void main(String[] args) {
        // スキャナーのインスタンスを生成
        Scanner stdIn = new Scanner(System.in,Charset.forName("shift-JIS"));

        // 名前、学生番号、学校名を入力させる
        System.out.print("簿記学生の名前を入力してください：");
        String bo_name = stdIn.nextLine();

        System.out.print(bo_name + "さんの学生番号を入力してください：");
        String bo_no = stdIn.nextLine();

        System.out.print(bo_name + "さんの学校名を入力してください：");
        String bo_schoolName = stdIn.nextLine();

        System.out.print(bo_name + "さんの会計学の得点を入力してください：");
        int bo_accounting = stdIn.nextInt();

        System.out.print(bo_name + "さんのビジネスの得点を入力してください：");
        int bo_business = stdIn.nextInt();
        
        // ---------------------------------------------------
        stdIn.nextLine();
        System.out.println();
        // ---------------------------------------------------

        // 名前、学生番号、学校名を入力させる
        System.out.print("情報学生の名前を入力してください：");
        String itname = stdIn.nextLine();

        System.out.print(itname + "さんの学生番号を入力してください：");
        String itno = stdIn.nextLine();

        System.out.print(itname + "さんの学校名を入力してください：");
        String itschoolName = stdIn.nextLine();

        System.out.print(itname + "さんのhtmlの得点を入力してください：");
        int it_html = stdIn.nextInt();

        System.out.print(itname + "さんのJavaScriptの得点を入力してください：");
        int it_javaScript = stdIn.nextInt();

        System.out.print(itname + "さんのjavaの得点を入力してください：");
        int it_java = stdIn.nextInt();

        // ---------------------------------------------------
        stdIn.nextLine();
        System.out.println();
        // ---------------------------------------------------

        // BasicStudent13_2のインスタンスを生成
        BookKeepingStudent13_2 x = new BookKeepingStudent13_2(bo_name, bo_no, bo_schoolName, bo_accounting, bo_business);
        ITStudent13_2 y = new ITStudent13_2(itname, itno, itschoolName, it_html, it_javaScript, it_java);
        System.out.println(bo_schoolName + "の学生番号" + bo_no + bo_name + "さんの平均点は" + x.calcAve() + "点です。");
        System.out.println(itschoolName + "の学生番号" + itno + itname + "さんの平均点は" + y.calcAve() + "点です。");
    }
}
