package M13extend_more;

// 抽象クラスPerson
// 人の情報を管理する機能が使えることだけ定義
abstract class Person {
    // 受け皿を生成
    private String name;
    private String job;

    // 人の情報を受け取るためのコンストラクタ
    Person(String name, String job){
        this.name = name;
        this.job = job;
    }

    // 人の情報を出力する抽象メソッド
    abstract void introduce();

    // 名前の情報を取得するメソッドを定義
    public String getName(){
        return name;
    }

    // 職種の情報を取得するメソッドを定義
    public String getJob(){
        return job;
    }

}

// サブクラスTeacher
class AbTeacher extends Person {
    // privateで受け皿を定義
    private String subject;

    // コンストラクタ
    AbTeacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }

    // 抽象メソッドを定義
    @Override void introduce(){
        System.out.println("氏名：" + getName());
        System.out.println("職種：" + getJob());
        System.out.println("担当科目：" + subject);
    }
}

// サブクラスCook
class AbCook extends Person {
    // privateで受け皿を定義
    private String specialties;

    // コンストラクタを定義
    AbCook(String name, String job, String specialties) {
        super(name, job);
        this.specialties = specialties;
    }

    // 抽象メソッドを定義
    @Override void introduce(){
        System.out.println("氏名：" + getName());
        System.out.println("職種：" + getJob());
        System.out.println("得意料理：" + specialties);
    }

}

// メイン実行クラス
public class M13_1 {
    public static void main(String[] args) {
        AbTeacher takei = new AbTeacher("竹井一馬", "教員", "情報処理");
        AbCook ohara = new AbCook("大原太郎", "シェフ", "オムライス");

        takei.introduce();
        System.out.println();
        ohara.introduce();
    }
}
