package M12extends;

// スーパークラス
class Person {
    // コンストラクタがいるって書いてる
    String name;
    String job;

    Person(String name, String job){
        this.name = name;
        this.job = job;
    }

    // 自信の情報を画面に出力するメソッドを定義
    public void intoroduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
    }
}

// 教師の情報を管理するクラス
class Teacher extends Person {
    // コンストラクタがいるって書いてる
    String subject;

    Teacher(String name, String job, String subject){
        super(name, job);
        this.subject = subject;
    }
    // Personを継承したものを使用する
    // 自信の情報を画面に出力するメソッドを定義
    public void intoroduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
        System.out.println("担当科目：" + subject);
    }
}

// 教師の情報を管理するクラス
class Cook extends Person {
    // コンストラクタがいるって書いてる
    String specialities;

    Cook(String name, String job, String specialities){
        super(name, job);
        this.specialities = specialities;
    }
    // Personを継承したものを使用する
    // 自信の情報を画面に出力するメソッドを定義
    public void intoroduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
        System.out.println("得意料理：" + specialities);
    }
}

class M12_2{
    public static void main(String[] args) {
        // 教師のインスタンスを生成
        Teacher kondo = new Teacher("近藤勇", "教員", "Go言語");
        // 料理人のインスタンスを生成
        Cook okita = new Cook("沖田総司", "シェフ", "オムライス");

        kondo.intoroduce();
        System.out.println();
        okita.intoroduce();

    }
}