package M13extend_more.M13_2;
import java.nio.charset.Charset;
import java.util.Scanner;

// 抽象クラス
abstract class BasicStudent{
    // privateで受け皿を定義
    private String name;
    private String no;
    private String schoolName;

    // コンストラクタを定義
    BasicStudent(String name, String no, String schoolName){
        this.name = name;
        this.no = no;
        this.schoolName = schoolName;
    }

    // 平均点を計算する抽象メソッドを定義
    abstract void average();

    // 入力させる項目を画面に表示させるメソッドを定義
    abstract void display();
}




// BookKeepingstudentクラス
class BookKeepingStudent extends BasicStudent{
    // privateで受け皿を定義
    private int accounting;
    private int business;

    // コンストラクタを定義
    BookKeepingStudent(String name, String no, String schoolName, int accounting, int business){
        super(name, no, schoolName);
        this.accounting = accounting;
        this.business = business;
    }
}

// ITStudentクラス
class ITStudent extends BasicStudent{
    // privateで受け皿を定義
    private int html;
    private int javaScript;
    private int java;

    // コンストラクタを定義
    ITStudent(String name, String no, String schoolName, int html, int javaScript, int java){
        super(name, no, schoolName);
        this.html = html;
        this.javaScript = javaScript;
        this.java = java;
    }

    // 抽象メソッドををオーバーライド(平均点を計算する)
    @Override void average(){
        double ave = (html + javaScript + java) / 3;
    }
}

// メインクラス
public class M13_2 {
    public static void main(String[] args) {
        // スキャナーのインスタンスを生成
        Scanner stdIn = new Scanner(System.in,Charset.forName("shift-JIS"));

        // 名前、学生番号、学校名を入力させる
        System.out.print("簿記学生の名前を入力してください：");
        String name = stdIn.nextLine();

        System.out.print(name + "さんの学生番号を入力してください：");
        String no = stdIn.nextLine();

        System.out.print(name + "さんの学校名を入力してください：");
        String schoolName = stdIn.nextLine();

        System.out.print(name + "さんの会計学の得点を入力してください：");
        int accounting = stdIn.nextInt();

        System.out.print(name + "さんのビジネスの得点を入力してください：");
        int business = stdIn.nextInt();

        // ーーーーーーーーーーーーーーー







        BookKeepingStudent boki = new BookKeepingStudent(String name,);
        System.out.println();
        
        
        
    }
}
